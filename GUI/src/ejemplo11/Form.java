package ejemplo11;

import java.awt.Container;

import javax.swing.*;


public class Form extends JFrame{
	
	private Container contenedor;
	private JLabel[][] imagenes;
	private char[][] caracteres= {{' ',' ',' ',' ',' ',' ','#'},
			{' ',' ',' ',' ',' ',' ','#'},
			{' ',' ',' ',' ',' ',' ','#'},
			{' ',' ','#',' ',' ',' ','#'},
			{' ',' ',' ',' ',' ',' ','#'},
			{' ',' ',' ',' ',' ',' ','#'},
			{' ',' ',' ','#',' ',' ','#'}};

	public Form() {
		
		this.setTitle("ejemplo 11 imagenes");
		this.setBounds(300,100,500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.contenedor=this.getContentPane();
		this.contenedor.setLayout(null);
		
		this.establecerImagenes();
		
		this.setVisible(true);

	}
	
	public void establecerImagenes() {
		
		this.imagenes = new JLabel[this.caracteres.length][this.caracteres[0].length];
		int x = 100;
		int y = 100;
		
		for (int i = 0; i < caracteres.length; i++) {
			
			for (int j = 0; j < caracteres[i].length; j++) {
				
				this.imagenes[i][j] = new JLabel();
				this.imagenes[i][j].setBounds(x, y, 20, 20);
				
				String imageFile = caracteres[i][j] == '#' ? "pared.png":"azul.png";
				
				ImageIcon imagen = new ImageIcon("assets\\"+imageFile);
				this.imagenes[i][j].setIcon(imagen);
				this.contenedor.add(this.imagenes[i][j]);
				x+=20;
			}
			x=100;
			y+=20;
		}
		
	}

}