package com.dynamic.project.javaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.dynamic.project.selenium.YoutubeAutomate;

public class GUI implements ActionListener {
	public static String song;
	private static JFrame frame;
	private static JPanel panel;
	private static JLabel label;
	private static JTextField songText;
	private static JButton play;

	public static void main(String[] args) {
		searchSong();
	}

	public static void searchSong() {
		frame = new JFrame();
		frame.setSize(350, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		frame.add(panel);
		panel.setLayout(null);
		label = new JLabel("Type Song Name");
		label.setBounds(10, 20, 100, 25);
		panel.add(label);

		songText = new JTextField(20);
		songText.setBounds(130, 20, 165, 25);
		panel.add(songText);

		play = new JButton("Play");
		play.setBounds(160, 55, 100, 25);
		panel.add(play);
		frame.setVisible(true);

		play.addActionListener(new GUI());
	}

	public void actionPerformed(ActionEvent e) {

		song = songText.getText();
		try {
			YoutubeAutomate.main(null);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

	}

}
