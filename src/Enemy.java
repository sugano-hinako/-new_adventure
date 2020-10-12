
public class Enemy {
	String name;
	int hp;
	final int LEVEL = 10;
	char suffix;

	public Enemy(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	public void run() {
	    System.out.println(this.name + "は逃げ出した！");
	  }

}
