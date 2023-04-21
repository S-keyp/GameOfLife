package fr.diginamic.automates;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameOfLife {
	static int WIDTH = 100;
	static int HEIGHT = 100;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Game of life");
		frame.setVisible(true);
		frame.setResizable(true);
		
		Grid grid = new Grid(WIDTH, HEIGHT);
		Dimension dim = new Dimension(5 * WIDTH, 5 * HEIGHT);
		Dimension slot = new Dimension(5, 5);
		FrameCanvas canvas = new FrameCanvas(dim, slot, grid);
	
		JPanel menu = new JPanel();
		menu.setPreferredSize(new Dimension(150, 300));
		menu.setBackground(Color.RED);

		JButton startStop = new JButton("Start / Stop");
		startStop.setBackground(Color.GREEN);
		menu.add(startStop,BorderLayout.CENTER);
		
		
		// test new branch
		// JButton tchoin = new JButton("tchoin");
		// tchoin.setBackground(Color.GREEN);
		// menu.add(tchoin,BorderLayout.CENTER);


		frame.add(menu, BorderLayout.EAST);
		frame.add(canvas, BorderLayout.WEST);
		frame.pack();

		for(;;){
			canvas.play();
			try{
				Thread.sleep(60);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}

}
