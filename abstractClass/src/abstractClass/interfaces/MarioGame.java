package abstractClass.interfaces;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("jump");
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("jump into hole");
		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("move forward");
		
	}
	public static void main(String[] args) {
		MarioGame game = new MarioGame();
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
