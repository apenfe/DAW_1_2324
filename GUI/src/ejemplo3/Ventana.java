package ejemplo3;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	
	public Ventana() {
		
		this.setTitle("ejemplo 3");
		this.setSize(400,200);
		
		Container cp = this.getContentPane();
		
		JPanel panel = new JPanel();
		
		cp.add(panel);
		panel.setBackground(Color.blue);
		
	}
	
}