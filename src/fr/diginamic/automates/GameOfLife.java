package fr.diginamic.automates;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GameOfLife {
	static int WIDTH = 500;
	static int HEIGHT = 500;

	public GameOfLife() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Game of life");
		frame.setVisible(true);
		frame.setResizable(false);
 		
		
		Grid grid = new Grid(WIDTH, HEIGHT);
		Dimension dim = new Dimension(WIDTH,HEIGHT);
		Dimension slot = new Dimension(5, 5);
		FrameCanvas canvas = new FrameCanvas(dim, slot, grid);
		frame.add(canvas);
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
