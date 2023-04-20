package fr.diginamic.automates;
import java.awt.Dimension;
import javax.swing.JFrame;

public class GameOfLife {
	static int WIDTH = 50;
	static int HEIGHT = 50;
	public static void main(String[] args) {
		JFrame frame = new JFrame("Game of life");
		frame.setSize(5 * WIDTH, 5 * HEIGHT);
		frame.setVisible(true);
		frame.setResizable(true);
		
		Grid grid = new Grid(WIDTH, HEIGHT);
		Dimension dim = new Dimension(10 * WIDTH,10 * HEIGHT);
		Dimension slot = new Dimension(10, 10);
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
