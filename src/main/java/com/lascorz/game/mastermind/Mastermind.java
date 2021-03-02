package com.lascorz.game.mastermind;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.ScrollPane;
import java.awt.Panel;
import javax.swing.JTextPane;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JTable;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.DropMode;
import javax.swing.JSplitPane;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mastermind extends JFrame {

	private JPanel contentPane;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private static JTextField textField_6;
	private static JTextField textField_7;
	private static JTextField textField_8;
	private static JTextField textField_9;
	private static JTextField textField_10;
	private static JTextField textField_11;
	static Color[] colores = new Color[4];
	static int count = 0;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mastermind frame = new Mastermind();
					colors();
					addEventos();
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
	public Mastermind() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 858, 472);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Colores Disponibles");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(586, 31, 116, 14);
		contentPane.add(lblNewLabel);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		layeredPane.setForeground(Color.LIGHT_GRAY);
		layeredPane.setBounds(586, 50, 219, 62);
		contentPane.add(layeredPane);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(10, 11, 42, 38);
		layeredPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(62, 11, 42, 38);
		layeredPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(114, 11, 42, 38);
		layeredPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(166, 11, 42, 38);
		layeredPane.add(textField_3);

		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setForeground(Color.LIGHT_GRAY);
		layeredPane_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		layeredPane_1.setBounds(586, 164, 219, 62);
		contentPane.add(layeredPane_1);

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(10, 11, 42, 38);
		layeredPane_1.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(62, 11, 42, 38);
		layeredPane_1.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(114, 11, 42, 38);
		layeredPane_1.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(166, 11, 42, 38);
		layeredPane_1.add(textField_7);

		JLabel lblColoresSecretos = new JLabel("Colores Secretos");
		lblColoresSecretos.setToolTipText("");
		lblColoresSecretos.setBounds(586, 145, 116, 14);
		contentPane.add(lblColoresSecretos);

		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(36, 61, 42, 38);
		contentPane.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(88, 61, 42, 38);
		contentPane.add(textField_9);

		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(140, 61, 42, 38);
		contentPane.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(192, 61, 42, 38);
		contentPane.add(textField_11);

		JButton btnNewButton = new JButton("Comp");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(251, 69, 76, 23);
		contentPane.add(btnNewButton);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(350, 61, 42, 38);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(402, 61, 42, 38);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(454, 61, 42, 38);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(506, 61, 42, 38);
		contentPane.add(textField_15);
		
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(textField_8.getBackground().equals(textField_4.getBackground())) {
            		textField_12.setBackground(Color.black);
            	}else {
            		textField_12.setBackground(Color.white);
            	}
            	if(textField_9.getBackground().equals(textField_5.getBackground())) {
            		textField_13.setBackground(Color.black);
            	}else {
            		textField_13.setBackground(Color.white);
            	}
            	if(textField_10.getBackground().equals(textField_6.getBackground())) {
            		textField_14.setBackground(Color.black);
            	}else {
            		textField_14.setBackground(Color.white);
            	}
            	if(textField_11.getBackground().equals(textField_7.getBackground())) {
            		textField_15.setBackground(Color.black);
            	}else {
            		textField_15.setBackground(Color.white);
            	}
            	
            	if(textField_12.getBackground().equals(Color.black) && textField_13.getBackground().equals(Color.black) && textField_14.getBackground().equals(Color.black) && textField_15.getBackground().equals(Color.black)) {
            		System.out.print("ok");
            	}
            	
            }

		});
		
		
		
		
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	private static void colors() {
		for (int i = 0; i < 4; i++) {
			colores[i] = new Color((int) (Math.random() * 0x1000000));
		}
		textField.setBackground(colores[0]);
		textField_1.setBackground(colores[1]);
		textField_2.setBackground(colores[2]);
		textField_3.setBackground(colores[3]);

		Random r = new Random();
		textField_4.setBackground(colores[r.nextInt(4)]);
		textField_5.setBackground(colores[r.nextInt(4)]);
		textField_6.setBackground(colores[r.nextInt(4)]);
		textField_7.setBackground(colores[r.nextInt(4)]);
	}

	public static void addEventos() {
		textField_8.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_8.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_8.setBackground(colores[count]);
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
		textField_9.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_9.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_9.setBackground(colores[count]);
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
		textField_10.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_10.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_10.setBackground(colores[count]);
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
		textField_11.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count < 4) {
					textField_11.setBackground(colores[count]);
					count++;
				} else {
					count = 0;
					textField_11.setBackground(colores[count]);
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
	

}
