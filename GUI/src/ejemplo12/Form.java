package ejemplo12;

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
	private String[] columnas = {"Nombre","Dorsal","Posicion","Fecha Nacimeinto","Nacionalidad","Equipo"};
	
	public Form() {
		
		this.setTitle("ejemplo 12");
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
			
			this.limpiar();

		}
		
	}
	
	private void botones() {
		
		this.enviar=new JButton("Enviar");
		this.enviar.setFont(new Font("Arial", Font.PLAIN, 15));
		this.enviar.setBounds(100,260,95,20);
		this.enviar.addActionListener(this);
		this.contenedor.add(this.enviar);
		
		this.limpiar=new JButton("Limpiar");
		this.limpiar.setFont(new Font("Arial", Font.PLAIN, 15));
		this.limpiar.setBounds(205,260,95,20);
		this.limpiar.addActionListener(this);
		this.contenedor.add(this.limpiar);	
		
	}
	
	private void tabla() {
		
		this.resultados = new JTable(new String[0][0],this.columnas);
		this.tableScroll=new JScrollPane(this.resultados);
		this.tableScroll.setBounds(30,300,630,220);
		this.contenedor.add(this.tableScroll);
		
	}
	
	private void titulo() {
		
		this.titulo= new JLabel("Ejemplo 12 - BUSCAR JUGADORES");
		this.titulo.setFont(new Font("Arial",Font.PLAIN,30));
		this.titulo.setBounds(100, 50, 500, 30);
		this.contenedor.add(this.titulo);
		
	}
	
	private void labels() {

		// busqueda

		this.labelBusqueda = new JLabel("Busqueda:");
		this.labelBusqueda.setFont(new Font("Arial", Font.PLAIN, 20));
		this.labelBusqueda.setBounds(100, 120, 150, 25);
		this.contenedor.add(this.labelBusqueda);

		// campo busqueda

		this.campoBusqueda = new JTextField();
		this.campoBusqueda.setFont(new Font("Arial", Font.PLAIN, 15));
		this.campoBusqueda.setBounds(100, 150, 200, 25);
		this.contenedor.add(this.campoBusqueda);
		
		// info

		this.labelInfo = new JLabel("");
		this.labelInfo.setFont(new Font("Arial", Font.PLAIN, 15));
		this.labelInfo.setBounds(100, 275, 460, 30);
		this.contenedor.add(this.labelInfo);

	}

	private void limpiar() {
		
		this.campoBusqueda.setText("");
		this.labelInfo.setText("");
		this.resultados.setModel(new DefaultTableModel(new String[0][0],this.columnas));

	}	
	
	private void enviar() {
		
		String texto = this.campoBusqueda.getText().trim();

		DAO db = new DAO();
		ArrayList<Jugador> lista = db.buscarJugadores(texto);
		
		if(lista.size()==0) {
			
			this.labelInfo.setText("No se han encontrado resultados");
			this.resultados.setModel(new DefaultTableModel(new String[0][0],this.columnas));
			
		}else {
			
			this.labelInfo.setText("Se han encontrado "+lista.size()+" resultados!");
			this.rellenarTabla(lista);
			
		}

	}
	
	private void rellenarTabla(ArrayList<Jugador> contactos) {
		
		int filas = contactos.size();
		int columnas = this.columnas.length;
		
		String[][] datosTabla = new String[filas][columnas];
		
		for (int i = 0; i < contactos.size(); i++) {
			
			Jugador actual = contactos.get(i);
			datosTabla[i][0] = actual.nombre;
			datosTabla[i][1] = actual.dorsal;
			datosTabla[i][2] = actual.posicion;
			datosTabla[i][3] = actual.fechaNacimiento;
			datosTabla[i][4] = actual.nacionalidad;
			datosTabla[i][5] = actual.equipo;
			
		}
		
		this.resultados.setModel(new DefaultTableModel(datosTabla,this.columnas));
		
	}

}