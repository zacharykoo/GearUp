
public class getArmor extends hero{
	int Armor = 0;
	int ArmorLV = 0;
	
	public void ObtainArmor () {
		this.Armor += 10;
		System.out.println("Obtained platnum armor!");
		this.ArmorLV ++;
	}
	
	public void upArmor () {
		this.Armor += 10;
		System.out.println("Armor Upgraded! Armor now have a cape.");
		this.ArmorLV ++;
	}
}
