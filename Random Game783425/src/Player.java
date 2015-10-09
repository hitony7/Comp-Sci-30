import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends Rectangle {
	int speed = 10;
	int currentRoomId;
	
	public Player() {
		x = 300;
		y = 300;
		height = 100;
		width = 100;
	}

	

	public void physic() {
		int oldx = x, oldy = y;
		if (Screen.pUP) {
			y = y -= speed;
		}
		if (Screen.pDOWN) {
			y = y += speed;
		}
		if (Screen.pLEFT) {
			x = x -= speed;
		}
		if (Screen.pRIGHT) {
			x = x += speed;
		}
		if (Room.collides(this)) {
			x = oldx;
			y = oldy;
		}
		if (x > Frame.size.width){
			switchRoom();
		}
	}

	private void switchRoom() {
		System.out.println(x);
		System.out.println(Frame.size.width);
		Room.currentRoom = Room.RoomName.GEN;
		x = 0;
		
	}



	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			g.drawImage(Screen.bod[i], x, y, height, width, null, null);

		}

	}

}
