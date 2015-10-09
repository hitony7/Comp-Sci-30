import java.awt.Graphics;
import java.awt.Rectangle;


public class SpawnRoom extends Room {

	public static Rectangle[] rects;
	public static Rectangle back = new Rectangle();
	
	public static Rectangle wallT = new Rectangle (0,0,510,100);
	public static Rectangle wallT2 = new Rectangle(0,0,510,100);
	public static Rectangle wallR = new Rectangle (0,0,100,200);
	public static Rectangle wallR2 = new Rectangle(0,0,100,200);
	public static Rectangle wallL = new Rectangle (0,0,100,200);
	public static Rectangle wallL2 = new Rectangle(0,0,100,200);
	public static Rectangle wallD = new Rectangle (0,0,510,100);
	public static Rectangle wallD2 = new Rectangle(0,0,510,100);
	
	public static void init() {
		back = new Rectangle(0,0,Frame.size.width,Frame.size.height);
		
		wallT = new Rectangle(0,0,wallT.width,wallT.height);
		wallT2 = new Rectangle(Frame.size.width - wallT2.width,0,wallT2.width,wallT2.height);
		
		wallD = new Rectangle(0,Frame.size.height- wallD.height,wallD.width,wallD.height);
		wallD2 = new Rectangle(Frame.size.width - wallD2.width,Frame.size.height- wallD2.height,wallD2.width,wallD2.height);

		
		wallR = new Rectangle(Frame.size.width-wallR.width,wallT.height,wallR.width,wallR.height);
		wallR2 = new Rectangle(Frame.size.width-wallR2.width,Frame.size.height - wallD2.height - wallL.height,100,200);
		
		wallL = new Rectangle(0,100,100,200);
		wallL2 = new Rectangle(0,Frame.size.height - wallD.height - wallL2.height,100,200);
	
		rects = new Rectangle[] {wallT, wallT2, wallR, wallR2, wallL, wallL2, wallD, wallD2};
	}
	
	public static void draw(Graphics g){
		g.drawImage(Screen.background, back.x, back.y, back.width, back.height, null);
		g.drawImage(Screen.wall, wallT.x, wallT.y, wallT.width, wallT.height, null);
		g.drawImage(Screen.wall, wallT2.x, wallT2.y, wallT2.width, wallT2.height, null);
		g.drawImage(Screen.wall, wallD.x, wallD.y, wallD.width, wallD.height, null);
		g.drawImage(Screen.wall, wallD2.x, wallD2.y, wallD2.width, wallD2.height, null);
		g.drawImage(Screen.wall, wallR.x, wallR.y, wallR.width, wallR.height, null);
		g.drawImage(Screen.wall, wallR2.x, wallR2.y, wallR2.width, wallR2.height, null);
		g.drawImage(Screen.wall, wallL.x, wallL.y, wallL.width, wallL.height, null);
		g.drawImage(Screen.wall, wallL2.x, wallL2.y, wallL2.width, wallL2.height,null);
	}
	
	public static boolean collision(Player player) {
		for (Rectangle r : rects) {
			if (r.intersects(player)) {
				return true;
			}
		}
		return false;
	}
	
	
}
