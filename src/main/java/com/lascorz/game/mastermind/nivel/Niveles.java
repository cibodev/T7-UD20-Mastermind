package com.lascorz.game.mastermind.nivel;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLayeredPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;

import com.lascorz.game.mastermind.avanzado.Avanzado;
import com.lascorz.game.mastermind.principiante.Principiante;

public class Niveles extends JFrame {

	private JPanel contentPane;
	private static Niveles level;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					level = new Niveles();
					level.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Niveles() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 319);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		layeredPane.setBounds(79, 34, 189, 155);
		contentPane.add(layeredPane);
		
		final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Intermedio");
		rdbtnNewRadioButton_1.setBounds(54, 59, 109, 23);
		layeredPane.add(rdbtnNewRadioButton_1);
		
		final JRadioButton rdbtnNewRadioButton = new JRadioButton("Principiante");
		rdbtnNewRadioButton.setBounds(54, 23, 109, 23);
		layeredPane.add(rdbtnNewRadioButton);
		
		final JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Avanzado");
		rdbtnNewRadioButton_2.setBounds(54, 97, 109, 23);
		layeredPane.add(rdbtnNewRadioButton_2);
		
	    ButtonGroup group= new ButtonGroup();

		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);

		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(79, 220, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(179, 220, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(rdbtnNewRadioButton.isSelected()) {
                	Principiante.main(null);
            	}
            	if(rdbtnNewRadioButton_1.isSelected()) {
                	//Intermedio.main(null);
            	}
            	if(rdbtnNewRadioButton_2.isSelected()) {
                	Avanzado.main(null);
            	}
            	Avanzado.main(null);
            	level.dispose();
            }
        });
	}
}
