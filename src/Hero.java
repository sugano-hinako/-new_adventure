
public class Hero extends Character{
	public void attack(Enemy e) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10のダメージをあたえた！");
		e.hp -= 10;
	}

}
