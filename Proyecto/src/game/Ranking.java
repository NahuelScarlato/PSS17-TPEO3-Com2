package game;

import java.awt.Color;
import java.awt.Font;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * Class Entrada 
 * Almacena 2 tipos de datos, de una manera parecida a un mapeo.
 */

public class Ranking {

	private Entrada[] arr;

	// Constructor
	/**
	 * Crea un nuevo ranking y carga el archivo en el arreglo de entradas
	 */
	public Ranking() {
		arr = new Entrada[10];
		cargarArchivo();
	}

	/**
	 * Crea un nuevo JFrame que muestra el estado actual de la tabla de puntajes.
	 * @return frame JFrame.
	 * @wbp.parser.entryPoint
	 */
	public JFrame mostrar() {

		JFrame frame = new JFrame("HIGH SCORES");
		frame.setBackground(Color.BLACK);
		frame.setSize(632, 563);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setResizable(false);
		
		JPanel panelSecundario = new JPanel();
		panelSecundario.setBackground(Color.BLACK);
		panelSecundario.setBounds(0, 0, 500, 500);
		
		frame.getContentPane().add(panelSecundario);
		
		
		JLabel label1 = new JLabel("1 : "+arr[0].getValue() + "      "
				+ arr[0].getDate());
		label1.setBackground(Color.BLACK);
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(0, 0, 600, 95);
		label1.setForeground(Color.RED);
		label1.setFont(new Font("Dialog", Font.BOLD, 30));

		JLabel label2 = new JLabel("2 : "+ arr[1].getValue() + "      "
						+ arr[1].getDate());
		label2.setBackground(Color.BLACK);
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setBounds(0, 50, 600, 95);
		label2.setForeground(Color.RED);
		label2.setFont(new Font("Dialog", Font.BOLD, 30));

		JLabel label3 = new JLabel( "3 : "+arr[2].getValue()  + "      "
						+ arr[2].getDate());
		label3.setBackground(Color.BLACK);
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setBounds(0, 100, 600, 95);
		label3.setForeground(Color.RED);
		label3.setFont(new Font("Dialog", Font.BOLD, 30));

		JLabel label4 = new JLabel( "4 : "+
				+ arr[3].getValue()  + "      "
						+ arr[3].getDate());
		label4.setBackground(Color.BLACK);
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setBounds(0, 150, 600, 95);
		label4.setForeground(Color.RED);
		label4.setFont(new Font("Dialog", Font.BOLD, 30));
		
		JLabel label5 = new JLabel( "5 : "+
				+ arr[4].getValue()  + "      "
						+ arr[4].getDate());
		label5.setBackground(Color.BLACK);
		label5.setHorizontalAlignment(SwingConstants.CENTER);
		label5.setBounds(0, 200, 600, 95);
		label5.setForeground(Color.RED);
		label5.setFont(new Font("Dialog", Font.BOLD, 30));
		panelSecundario.setLayout(null);
		
		
		JLabel label6 = new JLabel( "6 : "+
				+ arr[5].getValue()  + "      "
						+ arr[5].getDate());
		label6.setBackground(Color.BLACK);
		label6.setHorizontalAlignment(SwingConstants.CENTER);
		label6.setBounds(0, 250, 600, 95);
		label6.setForeground(Color.RED);
		label6.setFont(new Font("Dialog", Font.BOLD, 30));
		panelSecundario.setLayout(null);
		
		JLabel label7 = new JLabel( "7 : "+
				+ arr[6].getValue()  + "      "
						+ arr[6].getDate());
		label7.setBackground(Color.BLACK);
		label7.setHorizontalAlignment(SwingConstants.CENTER);
		label7.setBounds(0, 300, 600, 95);
		label7.setForeground(Color.RED);
		label7.setFont(new Font("Dialog", Font.BOLD, 30));
		panelSecundario.setLayout(null);
		
		JLabel label8 = new JLabel( "8 : "+
				+ arr[7].getValue()  + "      "
						+ arr[7].getDate());
		label8.setBackground(Color.BLACK);
		label8.setHorizontalAlignment(SwingConstants.CENTER);
		label8.setBounds(0, 350, 600, 95);
		label8.setForeground(Color.RED);
		label8.setFont(new Font("Dialog", Font.BOLD, 30));
		panelSecundario.setLayout(null);
		
		JLabel label9 = new JLabel( "9 : "+
				+ arr[8].getValue()  + "      "
						+ arr[8].getDate());
		label9.setBackground(Color.BLACK);
		label9.setHorizontalAlignment(SwingConstants.CENTER);
		label9.setBounds(0, 400, 600, 95);
		label9.setForeground(Color.RED);
		label9.setFont(new Font("Dialog", Font.BOLD, 30));
		panelSecundario.setLayout(null);
		
		
		JLabel label10 = new JLabel( "10 : "+
				+ arr[9].getValue()  + "      "
						+ arr[9].getDate());
		label10.setBackground(Color.BLACK);
		label10.setHorizontalAlignment(SwingConstants.CENTER);
		label10.setBounds(0, 450, 600, 95);
		label10.setForeground(Color.RED);
		label10.setFont(new Font("Dialog", Font.BOLD, 30));
		panelSecundario.setLayout(null);
		
		panelSecundario.add(label1);
		panelSecundario.add(label2);
		panelSecundario.add(label3);		
		panelSecundario.add(label4);		
		panelSecundario.add(label5);		
		panelSecundario.add(label6);
		panelSecundario.add(label7);
		panelSecundario.add(label8);		
		panelSecundario.add(label9);		
		panelSecundario.add(label10);		
		

		
		frame.setVisible(true);

		return frame;
	}

	/**
	 * Ordena el arreglo de entradas de mayor a menor segun la cantidad de
	 * puntos de cada entrada.
	 */
		private void ordenar() {
			for (int i = 0; i < (arr.length - 1); i++) {
				for (int j = i + 1; j < arr.length; j++) {
					
						if ( arr[i].getValue() < arr[j].getValue()) {
							Entrada variableauxiliar = arr[i];
							arr[i] = arr[j];
							arr[j] = variableauxiliar;
						}					
				}
			}
		}

	/**
	 * Sobreescribe el archivos con el contenido del arreglo de entradas
	 */
	private void sobreEscribir() {
		PrintWriter writer;
		try {
			writer = new PrintWriter("rank.txt", "UTF-8");
			
			for(int i=0;i<arr.length;i++){
				writer.println(   arr[i].getKey() + " "
						+ arr[i].getValue()+ " "+arr[i].getDate());
			}			
			writer.close();

		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Carga el archivo en el arreglo de entradas
	 */
	private void cargarArchivo() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("rank.txt"));
			String line;
			int i = 0;
			while ((line = br.readLine()) != null) {
				String[] str = line.split(" ");
				Entrada e = new Entrada(str[0],Integer.parseInt(str[1]),str[2]);
				arr[i++] = e;
			}
			br.close();

		} catch (IOException e) {
			PrintWriter writer;
			try {
				writer = new PrintWriter("rank.txt", "UTF-8");
				writer.println("Lori 9 20:10:20-03/11/2017");
				writer.println("nabui 8 05:30:20-03/11/2017");
				writer.println("justPecke 7 01:10:20-03/11/2017");
				writer.println("Zvean 7 03:10:20-03/11/2017");
				writer.println("juan 6 20:10:20-03/11/2017");
				writer.println("pedro 5 15:10:20-03/11/2017");
				writer.println("manu 4 10:10:20-03/11/2017");
				writer.println("jero 3 05:10:20-03/11/2017");
				writer.println("paolo 2 07:10:20-03/11/2017");
				writer.println("guerrero 1 15:10:20-03/11/2017");
				writer.close();
				cargarArchivo();
			} catch (FileNotFoundException | UnsupportedEncodingException ex) {
				System.out.println("nope2");
			}
		}
		ordenar();
	}

	/**
	 * Verifica si el puntaje es mayor a alguno de las entradas existentes y lo
	 * inserta.
	 * @param u String. Nombre.
	 * @param puntos int.
	 * @param tiempo String.
	 * 
	 * @return true si inserto o false en caso contrario.
	 */
	public boolean agregarEntrada(String u, int puntos, String date) {
		int indice = -1;
		boolean accion = false;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (!accion && (arr[i].getValue() < puntos) ){
				indice = i;
				accion = true;
				
			}
		}

		if (indice != -1) {
			Entrada e = new Entrada(u, puntos,date);
			arr[indice] = e;
			ordenar();
		}

		if (accion)
			sobreEscribir();

		return accion;
	}
}