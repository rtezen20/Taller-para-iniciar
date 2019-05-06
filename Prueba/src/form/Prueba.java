package form;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prueba extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextArea textArea;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba frame = new Prueba();
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
	public Prueba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(27, 30, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(101, 27, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(27, 72, 298, 143);
		contentPane.add(textArea);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(197, 26, 89, 23);
		contentPane.add(btnNewButton);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(arg0);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent arg0) {
		int cant=Integer.parseInt(textField.getText());
		
		
		
	}
}
