package id.ac.uns.vokasi.d3ti.jdbc;
//TI D - M3119085 - Tri Wulandari
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import id.ac.uns.vokasi.d3ti.jdbc.MahasiswaData;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class FormInputJadwal extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private ButtonGroup bp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormInputMahasiswa frame = new FormInputMahasiswa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormInputMahasiswa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("nim");
		lblNewLabel.setBounds(32, 26, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nama");
		lblNewLabel_1.setBounds(32, 51, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Jenis Kelamin");
		lblNewLabel_2.setBounds(32, 76, 77, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tempat Lahir");
		lblNewLabel_3.setBounds(32, 115, 77, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tanggal Lahir");
		lblNewLabel_4.setBounds(32, 140, 77, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Alamat");
		lblNewLabel_5.setBounds(32, 170, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 23, 137, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(137, 48, 137, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(137, 112, 137, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(137, 137, 137, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(137, 165, 137, 92);
		contentPane.add(textArea);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Laki-Laki");
		rdbtnNewRadioButton.setBounds(137, 72, 77, 23);
		
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Perempuan");
		rdbtnNewRadioButton_1.setBounds(216, 72, 79, 23);
		
		
		bp = new ButtonGroup();
		bp.add(rdbtnNewRadioButton);
		bp.add(rdbtnNewRadioButton_1);
		contentPane.add(rdbtnNewRadioButton);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton = new JButton("Simpan");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nama=textField.getText();
				String nim=textField_1.getText();
				String jk="";
				if(rdbtnNewRadioButton.isSelected()){
					jk="Laki-laki";
				}else {
					jk="Perempuan";
				}
//				System.out.println(jk);
				String tmp_lahir=textField_2.getText();
				String tgl_lahir=textField_3.getText();
				String alamat=textArea.getText();
				MahasiswaData mahasiswaData = new MahasiswaData();
				mahasiswaData.insertMahasiswa(nim,nama,jk,tmp_lahir,tgl_lahir,alamat);
				
			}
		});
		btnNewButton.setBounds(185, 268, 89, 23);
		contentPane.add(btnNewButton);
	}
}
