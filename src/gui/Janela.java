package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class Janela {
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblPlanilha;
	private JLabel lblPlanilha_1;
	private JLabel lblLocalDeSada;
	private JLabel lblNewLabel;
	
	public Janela() {
		
		JFrame frame = new JFrame("Unifier 3000");
		frame.setMinimumSize(new Dimension(450, 300));
	
		frame.getContentPane().setLayout(new MigLayout("", "[25px:n][69.00][grow][25px:n]", "[25px:n][][][][][][][][15px:n][]"));
		
		lblNewLabel = new JLabel("UNIFIER 3000");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel, "cell 1 0 2 1,alignx center");
		
		lblPlanilha = new JLabel("Planilha 1");
		frame.getContentPane().add(lblPlanilha, "cell 2 2");
		
		btnNewButton_3 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_3, "cell 1 3,growx");
		
		textField = new JTextField();
		frame.getContentPane().add(textField, "cell 2 3,grow");
		textField.setColumns(10);
		
		lblPlanilha_1 = new JLabel("Planilha 2");
		frame.getContentPane().add(lblPlanilha_1, "cell 2 4");
		
		btnNewButton_2 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_2, "cell 1 5,growx");
		
		textField_1 = new JTextField();
		frame.getContentPane().add(textField_1, "cell 2 5,grow");
		textField_1.setColumns(10);
		
		lblLocalDeSada = new JLabel("Local de sa\u00EDda");
		frame.getContentPane().add(lblLocalDeSada, "cell 2 6");
		
		btnNewButton_1 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_1, "cell 1 7,growx");
		
		textField_2 = new JTextField();
		frame.getContentPane().add(textField_2, "cell 2 7,grow");
		textField_2.setColumns(10);
		
		btnNewButton = new JButton("New button");
		frame.getContentPane().add(btnNewButton, "cell 1 9 2 1,alignx center");
		
		frame.setVisible(true);
		
		frame.addWindowListener( new WindowAdapter() {
		    public void windowOpened( WindowEvent e ){
		        textField.requestFocus();
		    }
		}); 

		
		
	
		
	}

}
