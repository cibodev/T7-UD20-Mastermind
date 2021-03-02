package com.lascorz.game.mastermind;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class Colors extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static Color[]	rgb = new Color[13];
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	static int count = 0;
    Window window = null;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Colors ventana = new Colors();
					SelecColor();
					addEventos();
					ventana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Colors() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 265);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(50, 48, 40, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(112, 48, 40, 36);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(177, 48, 40, 36);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(242, 48, 40, 36);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mastermind.colores[0]=textField.getBackground();
				Mastermind.colores[1]=textField_1.getBackground();
				Mastermind.colores[2]=textField_2.getBackground();
				Mastermind.colores[3]=textField_3.getBackground();
				Mastermind.randomColors();
	            window.dispatchEvent(new WindowEvent(window, WindowEvent.WINDOW_CLOSING));

			}
		});
		btnNewButton.setBounds(63, 139, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(177, 139, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setBackground(getBackground());
				textField_1.setBackground(getBackground());
				textField_2.setBackground(getBackground());
				textField_3.setBackground(getBackground());
			}
		});
	}
	
	public static void addEventos() {
		textField.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 13) {
					textField.setBackground(rgb[count]);
					count++;
				} else {
					count = 0;
					textField.setBackground(rgb[count]);
					count++;
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

		});
		textField_1.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 13) {
					textField_1.setBackground(rgb[count]);
					count++;
				} else {
					count = 0;
					textField_1.setBackground(rgb[count]);
					count++;
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

		});
		textField_2.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 13) {
					textField_2.setBackground(rgb[count]);
					count++;
				} else {
					count = 0;
					textField_2.setBackground(rgb[count]);
					count++;
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

		});
		textField_3.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 13) {
					textField_3.setBackground(rgb[count]);
					count++;
				} else {
					count = 0;
					textField_3.setBackground(rgb[count]);
					count++;
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

		});
		
	}
	
	public static void SelecColor() {
		rgb[0] = Color.white;
		rgb[1] = Color.lightGray;
		rgb[2] = Color.gray;
		rgb[3] = Color.darkGray;
		rgb[4] = Color.black;
		rgb[5] = Color.red;
		rgb[6] = Color.pink;
		rgb[7] = Color.orange;
		rgb[8] = Color.yellow;
		rgb[9] = Color.green;
		rgb[10] = Color.magenta;
		rgb[11] = Color.cyan;
		rgb[12] = Color.blue;

	}
}
