package ejemplo5;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Form extends JFrame implements ActionListener{
	
	private Container contenedor;
	private JLabel titulo, labelBusqueda, labelInfo;
	private JTextField campoBusqueda;
	private JButton enviar, limpiar;
	private JTable resultados;
	private JScrollPane tableScroll;
	private String[] columnas = {"Nombre","Email","Teléfono"};
	
	public Form() {
		
		this.setTitle("ejemplo 5 - Buscar Contactos");
		this.setBounds(300,100,700,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.contenedor=this.getContentPane();
		this.contenedor.setLayout(null);
	
		titulo();
		labels();
		botones();
		tabla();
		
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==this.enviar) {
			
			this.enviar();
			
		}else if(e.getSource()==this.limpiar) {
			
			this.limpiarFormulario();

		}
		
	}
	
	private void botones() {
		
		this.enviar=new JButton("Enviar");
		this.enviar.setFont(new Font("Arial", Font.PLAIN, 15));
		this.enviar.setBounds(100,200,95,25);
		this.enviar.addActionListener(this);
		this.contenedor.add(this.enviar);
		
		this.limpiar=new JButton("Limpiar");
		this.limpiar.setFont(new Font("Arial", Font.PLAIN, 15));
		this.limpiar.setBounds(205,200,95,25);
		this.limpiar.addActionListener(this);
		this.contenedor.add(this.limpiar);	
		
	}
	
	private void tabla() {
		
		this.resultados = new JTable(new String[0][0],this.columnas);
		this.tableScroll=new JScrollPane(this.resultados);
		this.tableScroll.setBounds(100,290,500,250);
		this.contenedor.add(this.tableScroll);
		
	}
	
	private void titulo() {
		
		this.titulo= new JLabel("<html>ejemplo 5 - BUSCAR</html>");
		this.titulo.setFont(new Font("Arial",Font.PLAIN,30));
		this.titulo.setBounds(100, 50, 300, 30);
		this.contenedor.add(this.titulo);
		
	}
	
	private void labels() {

		// busqueda

		this.labelBusqueda = new JLabel("Busqueda:");
		this.labelBusqueda.setFont(new Font("Arial", Font.PLAIN, 20));
		this.labelBusqueda.setBounds(100, 130, 200, 20);
		this.contenedor.add(this.labelBusqueda);

		// campo busqueda

		this.campoBusqueda = new JTextField("");
		this.campoBusqueda.setFont(new Font("Arial", Font.PLAIN, 15));
		this.campoBusqueda.setBounds(100, 160, 200, 25);
		this.contenedor.add(this.campoBusqueda);
		
		// info

		this.labelInfo = new JLabel("aas");
		this.labelInfo.setFont(new Font("Arial", Font.PLAIN, 25));
		this.labelInfo.setBounds(100, 240, 450, 30);
		this.contenedor.add(this.labelInfo);

	}

	private void limpiarFormulario() {
		
		this.campoBusqueda.setText("");
		this.labelInfo.setText("");
		this.resultados.setModel(new DefaultTableModel(new String[0][0],this.columnas));

	}	
	
	private void enviar() {
		
		String texto = this.campoBusqueda.getText();
		DAO db = new DAO();
		ArrayList<Contacto> contactos = db.buscar(texto);
		
		if(contactos.size()==0) {
			
			this.labelInfo.setText("No se han encontrado resultados");
			this.resultados.setModel(new DefaultTableModel(new String[0][0],this.columnas));
			
		}else {
			
			this.labelInfo.setText("Se han encontrado "+contactos.size()+" resultados!");
			this.rellenarTabla(contactos);
			
		}

	}
	
	private void rellenarTabla(ArrayList<Contacto> contactos) {
		
		int filas = contactos.size();
		int columnas = this.columnas.length;
		
		String[][] datosTabla = new String[filas][columnas];
		
		for (int i = 0; i < contactos.size(); i++) {
			
			Contacto actual = contactos.get(i);
			datosTabla[i][0] = actual.nombre;
			datosTabla[i][1] = actual.email;
			datosTabla[i][2] = actual.telefono;
			
		}
		
		this.resultados.setModel(new DefaultTableModel(datosTabla,this.columnas));
		
	}

}