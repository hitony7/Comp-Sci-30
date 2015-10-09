import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyMove implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			Screen.pUP = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			Screen.pDOWN = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Screen.pRIGHT = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			Screen.pLEFT = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_F11) {
			System.out.println("f11");
			Screen.frame.dispose();
			Screen.frame.setUndecorated((Screen.full = !Screen.full));
			Screen.frame.setVisible(true);
		}
	}

	public void keyPressed1(KeyEvent g) {

	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			Screen.pUP = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			Screen.pDOWN = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Screen.pRIGHT = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			Screen.pLEFT = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}