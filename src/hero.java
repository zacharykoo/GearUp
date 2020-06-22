
public class hero implements baseStatus {
	int Defense;
	int Attack;
	int HP = 10;
	int Fans;
	int EnergyDrink;
	int Armor;
	int Metal;
	int TrainATT;
	int TrainHP;
	
	public void updateHero(int EnergyDrink, int Armor, int Fans, int Metal, int TrainATT, int TrainHP) {
		this.Attack = EnergyDrink + Metal + TrainATT + Fans;
		this.Defense = Armor;
		this.HP = TrainHP;
		this.Fans = Fans;
		this.EnergyDrink = EnergyDrink;
		this.Armor = Armor;
		this.Metal = Metal;
		this.TrainATT = TrainATT;
		this.TrainHP = TrainHP;
	}
}
