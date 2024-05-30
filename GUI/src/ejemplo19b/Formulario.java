package ejemplo19b;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
	
	private Container contenedor;
	private JLabel titulo, labelBusqueda, labelInfo;
	private JTextField campoBusqueda;
	private JButton enviar, limpiar;
	
	public Formulario() {
		
		this.setTitle("ejemplo 19B");
		this.setBounds(300,100,700,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.contenedor=this.getContentPane();
		this.contenedor.setLayout(null);
		this.contenedor.setBackground(Color.LIGHT_GRAY);
	
		this.titulo();
		this.labels();
		this.botones();
		
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==this.enviar||e.getSource()==this.campoBusqueda) {
			
			this.enviar();
			
		}else if(e.getSource()==this.limpiar) {
			
			this.limpiar();

		}
		
	}
	
	private void botones() {
		
		this.enviar=new JButton("Enviar");
		this.enviar.setFont(new Font("Arial", Font.PLAIN, 15));
		this.enviar.setBounds(100,147,95,20);
		this.enviar.addActionListener(this);
		this.contenedor.add(this.enviar);
		
		this.limpiar=new JButton("Limpiar");
		this.limpiar.setFont(new Font("Arial", Font.PLAIN, 15));
		this.limpiar.setBounds(205,147,95,20);
		this.limpiar.addActionListener(this);
		this.contenedor.add(this.limpiar);	
		
	}
	
	private void titulo() {
		
		this.titulo= new JLabel("Ejemplo 19B - API del tiempo");
		this.titulo.setFont(new Font("Arial",Font.PLAIN,30));
		this.titulo.setBounds(100, 24, 500, 30);
		this.contenedor.add(this.titulo);
		
	}
	
	private void labels() {

		// busqueda

		this.labelBusqueda = new JLabel("Busqueda:");
		this.labelBusqueda.setFont(new Font("Arial", Font.PLAIN, 20));
		this.labelBusqueda.setBounds(100, 65, 150, 25);
		this.contenedor.add(this.labelBusqueda);

		// campo busqueda

		this.campoBusqueda = new JTextField();
		this.campoBusqueda.setFont(new Font("Arial", Font.PLAIN, 15));
		this.campoBusqueda.setBounds(100, 101, 200, 25);
		this.campoBusqueda.addActionListener(this);
		this.contenedor.add(this.campoBusqueda);
		
		// info

		this.labelInfo = new JLabel("");
		this.labelInfo.setFont(new Font("Arial", Font.PLAIN, 15));
		this.labelInfo.setBounds(309, 154, 305, 30);
		this.contenedor.add(this.labelInfo);

	}

	private void limpiar() {
		
		this.campoBusqueda.setText("");
		this.labelInfo.setText("");

	}	
	
	private void enviar() {
		
		DAO api = new DAO();
		
		Weather info = api.peticion(campoBusqueda.getText());
		
		if(info!=null) {
			this.labelInfo.setText(info.toString());
		}else {
			this.labelInfo.setText("ERROR");
		}

	}

}