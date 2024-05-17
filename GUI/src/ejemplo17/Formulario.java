package ejemplo17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
	
	private Container contenedor;
	private JLabel titulo, labelNombre, labelUserName, labelInfo, labelPassword, labelConfirma;
	private JTextField campoNombre, campoUserName;
	private JButton limpiar, enviar;
	private JPasswordField passwordField1, passwordField2;
	
	public Formulario() {
		
		this.setTitle("ejemplo 17 - Formulario");
		this.setBounds(100,100,700,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.contenedor=this.getContentPane();
		this.contenedor.setLayout(null);
		
		titulo();
		labels();
		botones();
		password();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==this.enviar) {
			
			this.enviar();
			
		}else if(e.getSource()==this.limpiar) {
			
			this.limpiarFormulario(true);

		}
		
	}
	
	private void titulo() {
		
		this.titulo= new JLabel("<html>ejemplo 17 - Formulario</html>");
		this.titulo.setFont(new Font("Arial",Font.PLAIN,24));
		this.titulo.setBounds(50, 50, 500, 40);
		this.contenedor.add(this.titulo);
		
	}
	
	private void password() {
		
		this.passwordField1 = new JPasswordField();
		this.passwordField1.setBounds(294, 288, 200, 31);
		this.contenedor.add(passwordField1);
		
		this.passwordField2 = new JPasswordField();
		this.passwordField2.setBounds(50, 288, 200, 31);
		this.contenedor.add(passwordField2);
		
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

		this.labelUserName = new JLabel("userName:");
		this.labelUserName.setFont(new Font("Arial", Font.PLAIN, 18));
		this.labelUserName.setBounds(50, 190, 200, 30);
		this.contenedor.add(this.labelUserName);

		// campo telefono

		this.campoUserName = new JTextField();
		this.campoUserName.setFont(new Font("Arial", Font.PLAIN, 16));
		this.campoUserName.setBounds(50, 220, 200, 30);
		this.contenedor.add(this.campoUserName);

		// email

		this.labelPassword = new JLabel("Contraseña:");
		this.labelPassword.setFont(new Font("Arial", Font.PLAIN, 18));
		this.labelPassword.setBounds(294, 250, 200, 30);
		this.contenedor.add(this.labelPassword);
		
		this.labelConfirma = new JLabel("Confirma Contraseña:");
		this.labelConfirma.setFont(new Font("Arial", Font.PLAIN, 18));
		this.labelConfirma.setBounds(50, 250, 200, 30);
		this.contenedor.add(this.labelConfirma);

		// label info

		this.labelInfo = new JLabel("");
		this.labelInfo.setFont(new Font("Arial", Font.BOLD, 20));
		this.labelInfo.setBounds(274, 150, 400, 100);
		this.contenedor.add(this.labelInfo);

	}

	private void limpiarFormulario(boolean todo) {
		
		if(todo) {
			
			this.campoUserName.setText("");
			this.passwordField1.setText("");
			this.passwordField2.setText("");
			this.campoNombre.setText("");
			this.labelInfo.setText("");
			
		}else {
			this.campoUserName.setText("");
			this.passwordField1.setText("");
			this.passwordField2.setText("");
			this.campoNombre.setText("");
		}

	}
	
	private void enviar() {
		
		String username = this.campoUserName.getText().trim();
		String password = this.passwordField1.getText();
		String password2 = this.passwordField2.getText();
		String nombre = this.campoNombre.getText().trim();
		
		if(!password.equals(password2)) {
			System.out.println("Todos los campos son obligatorios");
			this.labelInfo.setText("Las contraseñas no son las mismas");
			this.labelInfo.setForeground(Color.RED);
			return;
		}
		
		if(username.length()==0||password.length()==0||nombre.length()==0) {
			System.out.println("Todos los campos son obligatorios");
			this.labelInfo.setText("Todos los campos son obligatorios");
			this.labelInfo.setForeground(Color.RED);
			return;
		}
		
		Usuario nuevo = new Usuario(username,password,nombre);
		System.out.println("nombre: "+nombre);
		System.out.println("nombre usuario: "+username);
		
		DAO db = new DAO();
		
		if(db.insertar(nuevo)) {
			
			this.labelInfo.setText("Contacto insertado con exito en BBDD");
			this.labelInfo.setForeground(Color.GREEN);
			//this.labelInfo.setText("");
			limpiarFormulario(false);
			
		}else {
			
			this.labelInfo.setText("No se ha podido insertar en BBDD");
			this.labelInfo.setForeground(Color.RED);
			//this.labelInfo.setText("");
			limpiarFormulario(false);

		}
		
	}
}