import java.awt.event.KeyEvent;
import java.util.List;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.highgui.HighGui;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;

class EjemploCoordenadasPelota {
	
    public void detectAndDisplay(Mat frame, CascadeClassifier faceCascade, CascadeClassifier eyesCascade) {
    	
        Mat frameGray = new Mat();
        Imgproc.cvtColor(frame, frameGray, Imgproc.COLOR_BGR2GRAY);
        Imgproc.equalizeHist(frameGray, frameGray);

        // -- Detect faces
        MatOfRect faces = new MatOfRect();
        faceCascade.detectMultiScale(frameGray, faces);

        List<Rect> listOfFaces = faces.toList();
        for (Rect face : listOfFaces) {
            Point center = new Point(face.x + face.width / 2, face.y + face.height / 2);
            Imgproc.ellipse(frame, center, new Size(face.width / 2, face.height / 2), 0, 0, 360,new Scalar(0, 255, 255));
            
            // Definir el texto a escribir en la imagen
            String text = "X: "+center.x+", Y: "+center.y;
            Point org = new Point(50, 50);
            int fontFace = Imgproc.FONT_HERSHEY_PLAIN;
            double fontScale = 2.0;
            Scalar color = new Scalar(0, 255, 0); // Color en formato BGR (azul, verde, rojo)

            // Escribir el texto en la imagen
            Imgproc.putText(frame, text, org, fontFace, fontScale, color);

            Mat faceROI = frameGray.submat(face);

            // -- In each face, detect eyes
           MatOfRect eyes = new MatOfRect();
            eyesCascade.detectMultiScale(faceROI, eyes);

            List<Rect> listOfEyes = eyes.toList();
            for (Rect eye : listOfEyes) {
                Point eyeCenter = new Point(face.x + eye.x + eye.width / 2, face.y + eye.y + eye.height / 2);
                int radius = (int) Math.round((eye.width + eye.height) * 0.25);
                Imgproc.circle(frame, eyeCenter, radius, new Scalar(255, 0, 255), 4);
            }
        }

        HighGui.imshow("Deteccion cara y ojos", frame );
    }

    public void run(String[] args) {
        String filenameFaceCascade = args.length > 2 ? args[0] : "C:\\opencv\\sources\\samples\\winrt_universal\\VideoCaptureXAML\\video_capture_xaml\\video_capture_xaml.Windows\\Assets\\haarcascade_frontalface_alt.xml";
        String filenameEyesCascade = args.length > 2 ? args[1] : "C:\\opencv\\sources\\data\\haarcascades_cuda\\haarcascade_eye_tree_eyeglasses.xml";
       
        int cameraDevice = args.length > 2 ? Integer.parseInt(args[2]) : 0;

        CascadeClassifier faceCascade = new CascadeClassifier();
        CascadeClassifier eyesCascade = new CascadeClassifier();

        if (!faceCascade.load(filenameFaceCascade)) {
            System.err.println("--(!)Error loading face cascade: " + filenameFaceCascade);
            System.exit(0);
        }
        if (!eyesCascade.load(filenameEyesCascade)) {
            System.err.println("--(!)Error loading eyes cascade: " + filenameEyesCascade);
            System.exit(0);
        }

        VideoCapture capture = new VideoCapture(cameraDevice); //1
        if (!capture.isOpened()) {
            System.err.println("--(!)Error opening video capture");
            System.exit(0);
        }

        Mat frame = new Mat();
        while (capture.read(frame)) {
            if (frame.empty()) {
                System.err.println("--(!) No captured frame -- Break!");
                break;
            }

            //-- 3. Apply the classifier to the frame
          //  detectAndDisplay(frame, faceCascade);
            detectAndDisplay(frame, faceCascade, eyesCascade);

          //  if (HighGui.waitKey(10) == 27) {
            //    break;// escape
          //  }
            
            int key = HighGui.waitKey(10);

            // Comprobar si la tecla presionada es una de las teclas de flecha
            switch (key) {
                case KeyEvent.VK_UP:
                    System.out.println("Tecla Arriba presionada");
                    break;
                case KeyEvent.VK_DOWN:
                    System.out.println("Tecla Abajo presionada");
                    break;
                case KeyEvent.VK_LEFT:
                    System.out.println("Tecla Izquierda presionada");
                    break;
                case KeyEvent.VK_RIGHT:
                    System.out.println("Tecla Derecha presionada");
                    break;
                case 27: // Tecla Escape
                    System.out.println("Tecla Escape presionada. Saliendo del programa...");
                    System.exit(0);
            }
        }

        System.exit(0);
    }



    public static void main(String[] args) {
        // Load the native OpenCV library
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        new EjemploCoordenadasPelota().run(args);
    }
}
