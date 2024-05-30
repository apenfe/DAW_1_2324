package ejemplo3;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	
	public Ventana() {
		
		this.setTitle("ejemplo 3");
		this.setSize(400,200);
		
		Container cp = this.getContentPane();
		
		JPanel panel = new JPanel();
		
		cp.add(panel);
		panel.setBackground(Color.black);
		
		// añadir controlador al listener del raton
		this.addMouseListener(new ControladorRaton());
		
		// listener de evento cierre de ventana que finaliza el programa
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("cerrando programa");
				System.exit(0);
			}
			
		});
		
		this.setVisible(true);		
	}
	
}

class ControladorRaton extends MouseAdapter{
	
	public void mousePressed(MouseEvent e) {
		
		System.out.println("clic del raton");
		
	}
	
}