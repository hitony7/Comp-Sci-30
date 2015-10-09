import java.awt.Graphics;


public class Room {
	
	public static RoomName currentRoom;
	
	public enum RoomName {
		SPAWN, GEN, MON, BOSS, PUZZLE
	}
	
	public static void roomDetails(Graphics g) {
		switch(currentRoom){
		case SPAWN:
			SpawnRoom.draw(g);
			break;
		case GEN:
			GenRoom.draw(g);
			break;
		case MON:
			System.out.println("MON");
			break;
		case BOSS:
			System.out.println("BOSS");
			break;
		case PUZZLE:
			System.out.println("PUZZLE");
			break;
		default:
			System.out.println("EYYY");
			break;
		}
	}
	
	public static boolean collides(Player player) {
		switch (currentRoom) {
		case BOSS:
			break;
		case GEN:
			break;
		case MON:
			break;
		case PUZZLE:
			break;
		case SPAWN:
			return SpawnRoom.collision(player);
		}
		return false;
	}
}