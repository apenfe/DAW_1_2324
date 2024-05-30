package ejemplo18;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Form extends JFrame implements ActionListener{
	
	private Container contenedor;
	private JLabel titulo, labelBusqueda, labelInfo, labelTipoBusqueda;
	private JTextField campoBusqueda;
	private JButton enviar, limpiar, anteriores, siguientes;
	private JRadioButton and, or;
	private JCheckBox terminos;
	private JTable resultados;
	private JScrollPane tableScroll;
	private String[] columnas = {"Nombre","Dorsal","Posicion","Fecha Nacimeinto","Nacionalidad","Equipo"};
	private int offset;
	
	public Form() {
		
		this.setTitle("ejemplo 18");
		this.setBounds(300,100,700,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.contenedor=this.getContentPane();
		this.contenedor.setLayout(null);
		this.contenedor.setBackground(Color.LIGHT_GRAY);
		
		this.offset=0;
		
		this.titulo();
		this.labels();
		this.botones();
		this.tabla();
		this.checkBox();
		this.radioBotones();
		
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==this.enviar||this.campoBusqueda==e.getSource()) {
			
			this.siguientes.setVisible(false);
			this.anteriores.setVisible(false);
			this.enviar(0);
		
			
		}else if(e.getSource()==this.limpiar) {
			
			this.limpiar();
			this.siguientes.setVisible(false);
			this.anteriores.setVisible(false);

		}else if(e.getSource()==this.siguientes) {
			
			offset+=10;
			this.enviar(offset);
			this.anteriores.setVisible(true);

		}else if(e.getSource()==this.anteriores) {
			
			offset-=10;
			this.enviar(offset);
			if(offset<=0) {
				
				this.anteriores.setVisible(false);
				
			}

		}
		
	}
	
	private void radioBotones() {
		
		this.and=new JRadioButton("AND");
		this.and.setFont(new Font("Arial", Font.PLAIN, 15));
		this.and.setBounds(253, 88, 120, 25);
		this.and.setSelected(true);
		
		this.or=new JRadioButton("OR");
		this.or.setFont(new Font("Arial", Font.PLAIN, 15));
		this.or.setBounds(253, 122, 120, 25);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(and);
		grupo.add(or);
		
		this.contenedor.add(this.and);
		this.contenedor.add(this.or);
		
	}
	
	private void botones() {
		
		this.enviar=new JButton("Enviar");
		this.enviar.setFont(new Font("Arial", Font.PLAIN, 15));
		this.enviar.setBounds(30,124,95,20);
		this.enviar.addActionListener(this);
		this.contenedor.add(this.enviar);
		
		this.limpiar=new JButton("Limpiar");
		this.limpiar.setFont(new Font("Arial", Font.PLAIN, 15));
		this.limpiar.setBounds(135,124,95,20);
		this.limpiar.addActionListener(this);
		this.contenedor.add(this.limpiar);	
		
		this.siguientes=new JButton("Siguientes 10");
		this.siguientes.setFont(new Font("Arial", Font.PLAIN, 15));
		this.siguientes.setBounds(513,164,147,20);
		this.siguientes.addActionListener(this);
		this.contenedor.add(this.siguientes);
		this.siguientes.setVisible(false);
		
		this.anteriores=new JButton("Anteriores 10");
		this.anteriores.setFont(new Font("Arial", Font.PLAIN, 15));
		this.anteriores.setBounds(383,164,120,20);
		this.anteriores.addActionListener(this);
		this.contenedor.add(this.anteriores);
		this.anteriores.setVisible(false);
		
	}
	
	private void tabla() {
		
		this.resultados = new JTable(new String[0][0],this.columnas);
		this.tableScroll=new JScrollPane(this.resultados);
		this.tableScroll.setBounds(30,195,630,242);
		this.contenedor.add(this.tableScroll);
		
	}
	
	private void titulo() {
		
		this.titulo= new JLabel("Ejemplo 18 - PAGINACION");
		this.titulo.setFont(new Font("Arial",Font.PLAIN,30));
		this.titulo.setBounds(30, 11, 500, 30);
		this.contenedor.add(this.titulo);
		
	}
	
	private void checkBox() {
		
		this.terminos=new JCheckBox("Maraca la X a favor de la iglesia");
		this.terminos.setBounds(30,151,200,20);
		this.terminos.addActionListener(this);
		this.contenedor.add(this.terminos);
		
	}
	
	private void labels() {

		// busqueda

		this.labelBusqueda = new JLabel("Busqueda:");
		this.labelBusqueda.setFont(new Font("Arial", Font.PLAIN, 20));
		this.labelBusqueda.setBounds(30, 52, 150, 25);
		this.contenedor.add(this.labelBusqueda);

		// campo busqueda

		this.campoBusqueda = new JTextField();
		this.campoBusqueda.setFont(new Font("Arial", Font.PLAIN, 15));
		this.campoBusqueda.setBounds(30, 88, 200, 25);
		this.campoBusqueda.addActionListener(this);
		this.contenedor.add(this.campoBusqueda);
		
		// info

		this.labelInfo = new JLabel("");
		this.labelInfo.setFont(new Font("Arial", Font.PLAIN, 15));
		this.labelInfo.setBounds(355, 88, 305, 30);
		this.contenedor.add(this.labelInfo);
		
		this.labelTipoBusqueda = new JLabel("Tipo de Busqueda:");
		this.labelTipoBusqueda.setFont(new Font("Arial", Font.PLAIN, 20));
		this.labelTipoBusqueda.setBounds(253, 52, 200, 25);
		this.contenedor.add(this.labelTipoBusqueda);

	}

	private void limpiar() {
		
		this.campoBusqueda.setText("");
		this.labelInfo.setText("");
		this.terminos.setSelected(false);
		this.resultados.setModel(new DefaultTableModel(new String[0][0],this.columnas));

	}	
	
	private void enviar(int offset) {
		
		String texto = this.campoBusqueda.getText().trim();
		boolean check = true;
		boolean acepto = false;
	
		
		if(this.terminos.isSelected()) {
			acepto=true;
		}
		
		if(this.or.isSelected()) {
			
			check = false;
			
		}

		DAO db = new DAO();
		ArrayList<Jugador> lista = db.buscarJugadores(texto,check, offset);
		
		if(lista.size()==0 ||!acepto) {
			
			this.labelInfo.setText("No se han encontrado resultados");
			this.resultados.setModel(new DefaultTableModel(new String[0][0],this.columnas));
			
		}else {
			
			this.labelInfo.setText("Se han encontrado "+lista.size()+" resultados!");
			this.rellenarTabla(lista);
			
			if(lista.size()<10||db.buscarJugadores(texto,check, offset+10).size()==0) {
				
				this.siguientes.setVisible(false);
				
			}else {
				
				this.siguientes.setVisible(true);
			}
			
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