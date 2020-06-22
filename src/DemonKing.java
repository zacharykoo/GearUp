
public class DemonKing {
	int Attack = 53;
	int Defense = 25;
	int HP = 120;
	
	public void UpdateDemonKingHP (int heroAttack) {
		this.HP = (HP - heroAttack);
	}
}
