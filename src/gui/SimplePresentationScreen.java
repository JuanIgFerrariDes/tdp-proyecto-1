package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.time.LocalDateTime;

import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;

	public SimplePresentationScreen(Student studentData) {
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));

		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 300));
		setResizable(false);
		setContentPane(contentPane);
		setVisible(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		
		init();
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		
		LocalDateTime fecha = LocalDateTime.now();
		int año = fecha.getYear();
		int mes = fecha.getMonthValue();
		int dia = fecha.getDayOfMonth();
		int hora = fecha.getHour();
		int minutos = fecha.getMinute();
		int segundos = fecha.getSecond();
		String usuario = System.getProperty("user.name");
		
		ImageIcon foto = new ImageIcon(SimplePresentationScreen.class.getResource(studentData.getPathPhoto()));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 250));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		contentPane.add(tabbedPane, BorderLayout.WEST);
		tabInformation.setLayout(null);
		
		JLabel lblLU = new JLabel("LU");
		lblLU.setFont(new Font("Arial", Font.BOLD, 15));
		lblLU.setBounds(10, 5, 166, 25);
		tabInformation.add(lblLU);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Arial", Font.BOLD, 15));
		lblApellido.setBounds(10, 37, 166, 25);
		tabInformation.add(lblApellido);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.BOLD, 15));
		lblNombre.setBounds(10, 72, 166, 25);
		tabInformation.add(lblNombre);
		
		JLabel lblEMail = new JLabel("E-Mail");
		lblEMail.setFont(new Font("Arial", Font.BOLD, 15));
		lblEMail.setBounds(10, 109, 166, 25);
		tabInformation.add(lblEMail);
		
		JLabel lblGITUrl = new JLabel("Github URL");
		lblGITUrl.setFont(new Font("Arial", Font.BOLD, 15));
		lblGITUrl.setBounds(10, 145, 166, 25);
		tabInformation.add(lblGITUrl);
		
		JTextField textFieldLU = new JTextField();
		textFieldLU.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldLU.setBounds(135, 5, 260, 20);
		tabInformation.add(textFieldLU);
		textFieldLU.setColumns(10);
		textFieldLU.setText(studentData.getId()+"");
		
		JTextField textFieldApellido = new JTextField();
		textFieldApellido.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldApellido.setColumns(10);
		textFieldApellido.setBounds(135, 37, 260, 20);
		tabInformation.add(textFieldApellido);
		textFieldApellido.setText(studentData.getFirstName());
		
		JTextField textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(135, 73, 260, 20);
		tabInformation.add(textFieldNombre);
		textFieldNombre.setText(studentData.getLastName());
		
		JTextField textFieldEMail = new JTextField();
		textFieldEMail.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldEMail.setColumns(10);
		textFieldEMail.setBounds(135, 109, 260, 20);
		tabInformation.add(textFieldEMail);
		textFieldEMail.setText(studentData.getMail());
		
		JTextField textFieldGithubURL = new JTextField();
		textFieldGithubURL.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldGithubURL.setColumns(10);
		textFieldGithubURL.setBounds(135, 145, 260, 20);
		tabInformation.add(textFieldGithubURL);
		textFieldGithubURL.setText(studentData.getGithubURL());
		
		JLabel lblFoto = new JLabel("");
		lblFoto.setBounds(650, 35, 575, 190);
		contentPane.add(lblFoto);
		lblFoto.setIcon(foto);
		
		JLabel lblFecha = new JLabel("Esta ventana fue generada el "+dia+"/"+mes+"/"+año+" a las "+hora+":"+minutos+":"+segundos+" por "+usuario);
		lblFecha.setFont(new Font("Arial", Font.BOLD, 14));
		lblFoto.setBounds(10, 10, 575, 190);
		contentPane.add(lblFecha, BorderLayout.SOUTH);
	}
}
