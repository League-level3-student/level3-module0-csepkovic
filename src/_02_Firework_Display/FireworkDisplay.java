package _02_Firework_Display;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class FireworkDisplay extends JPanel implements ActionListener {
	public static int WIDTH = 720;
	public static int HEIGHT = 480;
	int f = 0;
	private JFrame window;
	private JPanel buttonPanel;
	private JButton squirtButton;
	private Timer timer;
	Firework[] fireworks = new Firework[10];
	Firework firework = new Firework();
	
	public static void main(String[] args) {
		new FireworkDisplay().start();
	}
	
	public void start() {
		window = new JFrame();
		window.setLayout(new BorderLayout());
		window.add(this, BorderLayout.CENTER);
		for (int i = 0; i < fireworks.length; i++) {
			fireworks[i] = firework;
		}
		WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
		HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		buttonPanel = new JPanel();
		squirtButton = new JButton("FIRE");
		squirtButton.addActionListener((e)->{
			fire();
		});
		
		buttonPanel.add(squirtButton);
		window.add(buttonPanel, BorderLayout.SOUTH);
		
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		timer = new Timer(1000 / 60, this);
	}
	
	private void fire() {
		fireworks[f] = new Firework();
		fireworks[f].launch();
		timer.start();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(new Color(10, 30, 70));
		g.fillRect(0, 0, WIDTH, HEIGHT);
		for (int i = 0; i < (f%10); i++) {
			fireworks[i].drawSparks(g);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < (f%10); i++) {
			fireworks[i].updateSparks();
		}
		repaint();
		if(!fireworks[f].dead) {
			f++;
			if (f > fireworks.length-1) {
				f = 0;
			}
		} 
	}
}
