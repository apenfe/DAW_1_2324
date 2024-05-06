package ejemplo4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame{
	
	// TODOS LOS ELEMENTOS Graficos los establecemos como atributos de la clase
	
	private Container contenedor;
	private JLabel titulo, labelNombre, labelEmail, labelTelefono;
	private JTextField campoNombre, campoEmail, campoTelefono;
	
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
		
		// nombre
		this.labelNombre= new JLabel("Nombre:");
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

	}

}