package ejemplo10;

import java.awt.Color;
import java.awt.Container;

import javax.swing.*;


public class Form extends JFrame{
	
	private Container contenedor;
	private JLabel labelImagen;

	public Form() {
		
		this.setTitle("ejemplo 10 imagenes");
		this.setBounds(300,100,1300,800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.contenedor=this.getContentPane();
		this.contenedor.setLayout(null);
		this.contenedor.setBackground(Color.blue);
	
		ImageIcon imagen = new ImageIcon("assets\\index.png");
		this.labelImagen = new JLabel();
		this.labelImagen.setBounds(0, 0, 1300, 800);
		this.labelImagen.setIcon(imagen);
		this.contenedor.add(this.labelImagen);
		
		this.setVisible(true);

	}

}