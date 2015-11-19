package tank;

public class Tiger extends Tank {
	final int armor = 2;

	public Tiger(ActionField af, BattleField bf) {
		super(af, bf);
	}

	public int getArmor() {
		return armor;
	}

}
