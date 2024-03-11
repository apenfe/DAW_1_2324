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

class Dron {
	
    	public void detectAndDisplay(Mat frame, CascadeClassifier dronCascade) {
    		
        Mat frameGray = new Mat();
        Imgproc.cvtColor(frame, frameGray, Imgproc.COLOR_BGR2GRAY);
        Imgproc.equalizeHist(frameGray, frameGray);

        // Detectar drones
        MatOfRect drones = new MatOfRect();
        dronCascade.detectMultiScale(frameGray, drones);

        List<Rect> listOfDrones = drones.toList();
        
        for (Rect dron : listOfDrones) {
        	
            Point center = new Point(dron.x + dron.width / 2, dron.y + dron.height / 2);
            Imgproc.ellipse(frame, center, new Size(dron.width / 2, dron.height / 2), 0, 0, 360,new Scalar(0, 255, 255));
          
         // Definir el texto a escribir en la imagen
            String text = "X: "+center.x+", Y: "+center.y;
            Point org = new Point(50, 50);
            int fontFace = Imgproc.FONT_HERSHEY_PLAIN;
            double fontScale = 2.0;
            Scalar color = new Scalar(0, 255, 0); // Color en formato BGR (azul, verde, rojo)

            // Escribir el texto en la imagen
            Imgproc.putText(frame, text, org, fontFace, fontScale, color);

        }

        HighGui.imshow("Deteccion de drones", frame );
    }

    public void run(String[] args) {
    	
    	String filenameDronCascade = args.length > 2 ? args[0] : "C:\\Users\\adria\\Desktop\\haarcascade_drone_20.xml";
        int cameraDevice = args.length > 2 ? Integer.parseInt(args[2]) : 0;

        CascadeClassifier dronCascade = new CascadeClassifier();

        if (!dronCascade.load(filenameDronCascade)) {
            System.err.println("Error al cargar el procesador en cascada" + filenameDronCascade);
            System.exit(0);
        }

        VideoCapture capture = new VideoCapture(cameraDevice);
        
        if (!capture.isOpened()) {
            System.err.println("Error al abrir la camara");
            System.exit(0);
        }

        Mat frame = new Mat();
        
        while (capture.read(frame)) {
        	
            if (frame.empty()) {
                System.err.println("Error al leer el frame");
                break;
            }

            detectAndDisplay(frame, dronCascade);

            if (HighGui.waitKey(10) == 27) { // esc
                break;
            }
        }

        System.exit(0);
    }



    public static void main(String[] args) {
        // Load the native OpenCV library
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        new Dron().run(args);
    }
}
