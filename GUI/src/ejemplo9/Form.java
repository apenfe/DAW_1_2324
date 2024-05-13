package ejemplo9;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Form extends JFrame implements ActionListener{
	
	private Container contenedor;
	private JLabel titulo, labelBusqueda, labelInfo;
	private JTextField campoBusqueda;
	private JButton botonBuscar, botonLimpiar;
	private JTable resultados;
	private JScrollPane tableScroll;
	private String[] columnas = {"Nombre","Dorsal","Fecha Nacimeinto","Nacionalidad","Equipo"};
	private int x = 0, y = 0;
	
	public Form() {
		
		this.setTitle("ejemplo 9");
		this.setBounds(300,100,700,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.contenedor=this.getContentPane();
		this.contenedor.setLayout(null);
		this.x=100;
		this.y=50;
	
		titulo();
		labels();
		botones();
		tabla();
		
		this.setVisible(true);

	}
	
	private void titulo() {
		
		this.titulo= new JLabel("Ejemplo 9 - Campions League");
		this.titulo.setFont(new Font("Arial",Font.PLAIN,30));
		this.titulo.setBounds(x, y, 450, 30);
		this.contenedor.add(this.titulo);
		
		this.y += 60;
		
	}
	
	private void labels() {

		// busqueda
		this.labelBusqueda = new JLabel("Busqueda:");
		this.labelBusqueda.setFont(new Font("Arial", Font.PLAIN, 20));
		this.labelBusqueda.setBounds(x, y, 150, 20);
		this.contenedor.add(this.labelBusqueda);
		this.y += 30;

		// campo busqueda
		this.campoBusqueda = new JTextField();
		this.campoBusqueda.setFont(new Font("Arial", Font.PLAIN, 15));
		this.campoBusqueda.setBounds(x, y, 200, 25);
		this.contenedor.add(this.campoBusqueda);
		
		this.y += 30;
		
		// info
		this.labelInfo = new JLabel("e");
		this.labelInfo.setFont(new Font("Arial", Font.PLAIN, 15));
		this.labelInfo.setBounds(x, y, 460, 30);
		this.contenedor.add(this.labelInfo);
		
		this.y += 40;

	}
	
	private void botones() {
		
		this.botonBuscar=new JButton("Buscar");
		this.botonBuscar.setFont(new Font("Arial", Font.PLAIN, 15));
		this.botonBuscar.setBounds(x,y,95,20);
		this.botonBuscar.addActionListener(this);
		this.contenedor.add(this.botonBuscar);
		
		this.botonLimpiar=new JButton("Limpiar");
		this.botonLimpiar.setFont(new Font("Arial", Font.PLAIN, 15));
		this.botonLimpiar.setBounds(x+100,y,95,20);
		this.botonLimpiar.addActionListener(this);
		this.contenedor.add(this.botonLimpiar);	
		
		this.y += 50;
		
	}
	
	private void tabla() {
		
		this.resultados = new JTable(new String[0][0],this.columnas);
		this.tableScroll=new JScrollPane(this.resultados);
		this.tableScroll.setBounds(x-70,y,630,220);
		this.contenedor.add(this.tableScroll);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==this.botonBuscar) {
			
			this.enviar();
			
		}else if(e.getSource()==this.botonLimpiar) {
			
			this.limpiar();

		}
		
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
			datosTabla[i][2] = actual.fechaNacimiento;
			datosTabla[i][3] = actual.nacionalidad;
			datosTabla[i][4] = actual.equipo;
			
		}
		
		this.resultados.setModel(new DefaultTableModel(datosTabla,this.columnas));
		
	}

}