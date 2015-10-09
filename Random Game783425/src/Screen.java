import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Screen extends JPanel implements Runnable {

	private static final long serialVersionUID = 1L;

	public static boolean runGame = true;

	public static Frame frame;
	public Player player = null;
	
	public KeyMove keymove = new KeyMove();;
	public Thread thread = new Thread(this);
	public static int myWidth, myHeight;
	
	public static boolean first = true;
	
	public static Image[] bod = new Image[10];
	public static Image wall;
	public static Image background;
	
	public static boolean pUP;
	public static boolean pDOWN;
	public static boolean pRIGHT;
	public static boolean pLEFT;
	
	public static boolean full = false;

	


	public Screen(Frame frame) {
		this.frame = frame;
		frame.setBackground(Color.BLACK);
		frame.addKeyListener(new KeyMove());
		frame.setSize(new Dimension(frame.getWidth(), frame.getHeight()));
		myWidth = this.getWidth();
		myHeight = this.getHeight();
		thread.start();

		SpawnRoom.init();
	}

	public void paintComponent(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());//Clears
		Room.roomDetails(g);
		player.draw(g);
	}

	public void define() {
		Room.currentRoom = Room.RoomName.SPAWN;
		
		player = new Player();
		
		player.currentRoomId = 1;
		
		background = new ImageIcon("C:\\Users\\398256004\\brown.jpg").getImage();

		wall = new ImageIcon("C:\\Users\\398256004\\Brick_white_wall.jpg").getImage();

		for (int i = 0; i < 10; i++) {
			bod[i] = new ImageIcon("C:\\Users\\398256004\\turtle.png").getImage();

		}
	}
	
	public void currentRoom(){
		
	}

	public void run() {
		// Runs game loop
		while (true) {
			if (first) {
				define();
				first = false;
				System.out.println("false");
			}
			if (runGame) {
				player.physic();
			}
			repaint();
			try {
				Thread.sleep(1000/60);// 1000/60 = 60fps
			} catch (Exception e) {
			}

		}

	}

}
