package ejemplo10;

import java.awt.Container;

import javax.swing.*;


public class Form extends JFrame{
	
	private Container contenedor;
	private JLabel labelImagen;

	public Form() {
		
		this.setTitle("ejemplo 10 imagenes");
		this.setBounds(300,100,500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.contenedor=this.getContentPane();
		this.contenedor.setLayout(null);
	
		ImageIcon imagen = new ImageIcon("assets\\eltoro.jpg");
		this.labelImagen = new JLabel();
		this.labelImagen.setBounds(0, 0, 486, 414);
		this.labelImagen.setIcon(imagen);
		this.contenedor.add(this.labelImagen);
		
		this.setVisible(true);

	}

}