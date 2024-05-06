package ejemplo4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
	
	// TODOS LOS ELEMENTOS Graficos los establecemos como atributos de la clase
	
	private Container contenedor;
	private JLabel titulo, labelNombre, labelEmail, labelTelefono, labelInfo;
	private JTextField campoNombre, campoEmail, campoTelefono;
	private JButton limpiar, enviar;
	
	public Formulario() {
		
		this.setTitle("ejemplo 4 - Formulario");
		this.setBounds(100,100,700,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// ALWAYS
		this.contenedor=this.getContentPane();
		this.contenedor.setLayout(null);
		
		// AQUI EMPIEZAN LOS ELEMENTOS GRAFICOS
		
		// titulo
		this.titulo= new JLabel("<html>ejemplo 4 - Formulario</html>");
		this.titulo.setFont(new Font("Arial",Font.PLAIN,24));
		this.titulo.setBounds(50, 50, 500, 40);
		this.contenedor.add(this.titulo);
		
		// ---------------------  LABELS ----------------------------
		labels();
			
		// ---------------------  BOTONES ----------------------------
		botones();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==this.enviar) {
			
			System.out.println("enviar pulsado");
			this.enviar();
			
		}else if(e.getSource()==this.limpiar) {
			
			System.out.println("limpiar pulsado");
			this.limpiarFormulario();

		}
		
	}
	
	private void botones() {
		
		this.enviar=new JButton("enviar");
		this.enviar.setFont(new Font("Arial", Font.PLAIN, 16));
		this.enviar.setBounds(50,330,95,25);
		this.enviar.addActionListener(this);
		this.contenedor.add(this.enviar);
		
		this.limpiar=new JButton("limpiar");
		this.limpiar.setFont(new Font("Arial", Font.PLAIN, 16));
		this.limpiar.setBounds(150,330,95,25);
		this.limpiar.addActionListener(this);
		this.contenedor.add(this.limpiar);	
		
	}
	
	private void labels() {

		// nombre
		this.labelNombre = new JLabel("Nombre:");
		this.labelNombre.setFont(new Font("Arial", Font.PLAIN, 18));
		this.labelNombre.setBounds(50, 130, 200, 30);
		this.contenedor.add(this.labelNombre);

		// campo nombre

		this.campoNombre = new JTextField();
		this.campoNombre.setFont(new Font("Arial", Font.PLAIN, 16));
		this.campoNombre.setBounds(50, 160, 200, 30);
		this.contenedor.add(this.campoNombre);

		// telefono

		this.labelTelefono = new JLabel("Telefono:");
		this.labelTelefono.setFont(new Font("Arial", Font.PLAIN, 18));
		this.labelTelefono.setBounds(50, 190, 200, 30);
		this.contenedor.add(this.labelTelefono);

		// campo telefono

		this.campoTelefono = new JTextField();
		this.campoTelefono.setFont(new Font("Arial", Font.PLAIN, 16));
		this.campoTelefono.setBounds(50, 220, 200, 30);
		this.contenedor.add(this.campoTelefono);

		// email

		this.labelEmail = new JLabel("Email:");
		this.labelEmail.setFont(new Font("Arial", Font.PLAIN, 18));
		this.labelEmail.setBounds(50, 250, 200, 30);
		this.contenedor.add(this.labelEmail);

		// campo email

		this.campoEmail = new JTextField();
		this.campoEmail.setFont(new Font("Arial", Font.PLAIN, 16));
		this.campoEmail.setBounds(50, 280, 200, 30);
		this.contenedor.add(this.campoEmail);

		// label info

		this.labelInfo = new JLabel("");
		this.labelInfo.setFont(new Font("Arial", Font.BOLD, 20));
		this.labelInfo.setBounds(300, 150, 400, 100);
		this.contenedor.add(this.labelInfo);

	}

	private void limpiarFormulario() {
		
		this.campoNombre.setText("");
		this.campoEmail.setText("");
		this.campoTelefono.setText("");
		//this.labelInfo.setText("");

	}
	
	private void enviar() {
		
		String nombre = this.campoNombre.getText().trim();
		String email = this.campoEmail.getText().trim();
		String telefono = this.campoTelefono.getText().trim();
		
		if(nombre.length()==0||email.length()==0||telefono.length()==0) {
			System.out.println("Todos los campos son obligatorios");
			this.labelInfo.setText("Todos los campos son obligatorios");
			this.labelInfo.setForeground(Color.RED);
			return;
		}
		
		Contacto nuevo = new Contacto(nombre,email,telefono);
		System.out.println("nombre: "+nombre);
		System.out.println("email: "+email);
		System.out.println("telefono: "+telefono);
		DAO db = new DAO();
		
		if(db.insertar(nuevo)) {
			
			this.labelInfo.setText("Contacto insertado con exito en BBDD");
			this.labelInfo.setForeground(Color.GREEN);
			//this.labelInfo.setText("");
			limpiarFormulario();
			
		}else {
			
			this.labelInfo.setText("No se ha podido insertar en BBDD");
			this.labelInfo.setForeground(Color.RED);
			//this.labelInfo.setText("");
			limpiarFormulario();

		}
		
	}

}