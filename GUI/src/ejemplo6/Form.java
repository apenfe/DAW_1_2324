package ejemplo6;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Form extends JFrame implements ActionListener{
	
	private Container contenedor;
	private JLabel titulo, labelBusqueda, labelOrdenar, labelInfo;
	private JTextField campoBusqueda;
	private JComboBox selectorOrdenar;
	private JButton enviar, limpiar;
	private JTable resultados;
	private JScrollPane tableScroll;
	private String[] columnas = {"Nombre","Dorsal","Fecha Nacimeinto","Nacionalidad","Equipo"};
	
	public Form() {
		
		this.setTitle("ejemplo 6");
		this.setBounds(300,100,700,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.contenedor=this.getContentPane();
		this.contenedor.setLayout(null);
		this.contenedor.setBackground(Color.LIGHT_GRAY);
	
		this.titulo();
		this.labels();
		this.combo();
		this.botones();
		this.tabla();
		
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
		this.enviar.setBounds(100,260,95,20);
		this.enviar.addActionListener(this);
		this.contenedor.add(this.enviar);
		
		this.limpiar=new JButton("Limpiar");
		this.limpiar.setFont(new Font("Arial", Font.PLAIN, 15));
		this.limpiar.setBounds(205,260,95,20);
		this.limpiar.addActionListener(this);
		this.contenedor.add(this.limpiar);	
		
	}
	
	private void combo() {
		
		this.selectorOrdenar=new JComboBox();
		this.selectorOrdenar.setFont(new Font("Arial", Font.PLAIN, 15));
		this.selectorOrdenar.setBounds(100, 215, 200, 25);
		
		this.selectorOrdenar.addItem("Nombre");
		this.selectorOrdenar.addItem("Dorsal");
		this.selectorOrdenar.addItem("Fecha Nacimiento");
		this.selectorOrdenar.addItem("Gentilicio");
		this.selectorOrdenar.addItem("Nombre Equipo");

		this.contenedor.add(this.selectorOrdenar);
		
	}
	
	private void tabla() {
		
		this.resultados = new JTable(new String[0][0],this.columnas);
		this.tableScroll=new JScrollPane(this.resultados);
		this.tableScroll.setBounds(30,300,630,220);
		this.contenedor.add(this.tableScroll);
		
	}
	
	private void titulo() {
		
		this.titulo= new JLabel("Ejemplo 6 - BUSCAR JUGADORES");
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
		this.campoBusqueda.addActionListener(this);
		this.contenedor.add(this.campoBusqueda);
		
		this.labelOrdenar = new JLabel("Ordenar por");
		this.labelOrdenar.setFont(new Font("Arial", Font.PLAIN, 25));
		this.labelOrdenar.setBounds(100, 185, 150, 25);
		this.contenedor.add(this.labelOrdenar);
		
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
		String ordenar = this.selectorOrdenar.getSelectedItem().toString();
		
		ordenar=cambiar(ordenar);
		
		DAO db = new DAO();
		ArrayList<Jugador> lista = db.buscarJugadores(texto,ordenar);
		
		if(lista.size()==0) {
			
			this.labelInfo.setText("No se han encontrado resultados");
			this.resultados.setModel(new DefaultTableModel(new String[0][0],this.columnas));
			
		}else {
			
			this.labelInfo.setText("Se han encontrado "+lista.size()+" resultados!");
			this.rellenarTabla(lista);
			
		}

	}
	
	private String cambiar(String texto) {
		
		String salida = "";
		
		if(texto.equals("Nombre")) {
			salida+="nombre";
		}else if(texto.equals("Dorsal")) {
			salida+="dorsal";
		}else if(texto.equals("Fecha Nacimiento")) {
			salida+="fechaNac";
		}else if(texto.equals("Gentilicio")) {
			salida+="gentilicio";
		}else if(texto.equals("Nombre Equipo")) {
			salida+="nombreEquipo";
		}
	
		return salida;

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