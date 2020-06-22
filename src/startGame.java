import java.util.Scanner;

public class startGame {
	
	public static void printStats (int EnergyDrink, int Armor, int Fans, int Metal, int TrainATT, int TrainHP) {
		System.out.println(EnergyDrink + " , " + Armor + " , " + Fans + " , " + Metal + " , " + TrainATT + " , " + TrainHP);
	}
	
	public static void printADHP (int Attack, int Defense, int HP) {
		System.out.println("\nYour Current Stats after preparing: \nAttack - " + Attack + "\nDefense - " + Defense + "\nHP - " + HP);
	}
	
	public static void printLV (int tempEnergyDrinkLV, int tempArmorLV, int tempFansLV, int tempMetalLV, int tempTrainLV) {
		
		System.out.println("\nFinal items Levels: ");
		
		if (tempFansLV == 3) {
			String FansMAX = "MAX";
			System.out.println("Fans - " + FansMAX);
		}
		else {
			System.out.println("Fans - " + tempFansLV);
		}
		
		if (tempMetalLV == 4) {
			String MetalMAX = "MAX";
			System.out.println("Metal - " + MetalMAX);
		}
		else {
			System.out.println("Metal - " + tempMetalLV);
		}
		
		if (tempArmorLV == 2) {
			String ArmorMAX = "MAX";
			System.out.println("Armor - " + ArmorMAX);
		}
		else {
			System.out.println("Armor - " + tempArmorLV);
		}
		
		if (tempEnergyDrinkLV == 1) {
			String EnergyDrinkMAX = "MAX";
			System.out.println("EnergyDrink - " + EnergyDrinkMAX);
		}
		else {
			System.out.println("EnergyDrink - " + tempEnergyDrinkLV);
		}
		
		if (tempTrainLV == 5) {
			String TrainMAX = "MAX";
			System.out.println("Weights - " + TrainMAX);
		}
		else {
			System.out.println("Weights - " + tempTrainLV);
		}
				
//		System.out.println("\nCurrent Items Levels: \nFans - " + FansLV + "\nMetal - " + MetalLV + "\nArmor - " + ArmorLV + "\nEnergyDrink - " + EnergyDrinkLV + "\nWeights - " + TrainLV); 
	}
	
	public static void UpdateAll (getFans Fans, getMetal Metal, getArmor Armor, getEnergyDrink EnergyDrink, getWeight Weight, int choseItem) {
		Scanner scan = new Scanner(System.in);
		UpdateFans(Fans, choseItem);
		UpdateMetal(Metal, choseItem);
		UpdateArmor(Armor, choseItem);
		UpdateEnegyDrink(EnergyDrink, choseItem);
		UpdateWeight(Weight, choseItem);
		System.out.println("(Enter)");
		scan.nextLine();
	}
	
	public static void UpdateFans(getFans Fans, int choseItem) {
		if (Fans.FansLV == 0 && choseItem == 1) {
			Fans.ObtainFans();
		}
		else if (Fans.FansLV == 1) {
			Fans.upFans1();
		}
		else if (Fans.FansLV ==2) {
			Fans.upFans2();
		}
		
	}
	
	public static void UpdateMetal(getMetal Metal, int choseItem) {
		if (Metal.MetalLV == 0 && choseItem == 2) {
			Metal.ObtainMetal();
		}
		else if (Metal.MetalLV == 1) {
			Metal.upMetal();
		}
		else if (Metal.MetalLV == 2) {
			Metal.upBronze();
		}
		else if (Metal.MetalLV == 3) {
			Metal.upSilver();
		}
	}
	
	public static void UpdateArmor (getArmor Armor, int choseItem) {
		if (Armor.ArmorLV == 0 && choseItem == 3) {
			Armor.ObtainArmor();
		}
		else if (Armor.ArmorLV == 1) {
			Armor.upArmor();
		}
	}
	
	public static void UpdateEnegyDrink(getEnergyDrink EnergyDrink, int choseItem) {
		if (EnergyDrink.EnergyDrinkLV == 0 && choseItem == 4) {
			EnergyDrink.ObtainEnergyDrink();
		}
	}
	
	public static void UpdateWeight (getWeight Weight, int choseItem) {
		if (Weight.WeightLV == 0 && choseItem == 5) {
			Weight.ObtainWeight();
		}
		else if (Weight.WeightLV == 1) {
			Weight.upWeight5();
		}
		else if (Weight.WeightLV == 2) {
			Weight.upWeight10();
		}
		else if (Weight.WeightLV == 3) {
			Weight.upWeight50();
		}
		else if (Weight.WeightLV == 4) {
			Weight.upWeight100();
		}
	}
	
	public static void Battle (hero hero, DemonKing DKing) {
		int DKingDamageDeal = (DKing.Attack - hero.Defense);
		int nowHeroHP = (hero.HP - DKingDamageDeal);
		int HeroDamageDeal = (hero.Attack - DKing.Defense);
		int nowDKingHP = (DKing.HP - HeroDamageDeal);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nDemon King attacked you by surprise, dealing " + DKingDamageDeal + " damage. \nYou now have " + nowHeroHP + " HP left. (Enter)");
		scan.nextLine();
		if (nowHeroHP > 0) {
			System.out.println("\nYou strikes back with all your might, dealing " + HeroDamageDeal + " damage. \nYou are not sure how much HP the Demon King have, but it seems like your attack worked. (Enter)");
			scan.nextLine();
		}
		while (nowHeroHP > 0 && nowDKingHP > 0) {
			nowHeroHP -= DKingDamageDeal;
			System.out.println("\nDemon King attacks again, dealing " + DKingDamageDeal + " damage. \nYou now have " + nowHeroHP + " HP left. (Enter)");
			scan.nextLine();
			
			if (nowHeroHP > 0) {
				nowDKingHP -= HeroDamageDeal;
				System.out.println("\nYou strikes back with all your might, dealing " + HeroDamageDeal + " damage. (Enter)");
				scan.nextLine();
			}
		}
		
		if (nowHeroHP <= 0) {
			System.out.println("\nThe Demon King crushes you.");
			System.out.println("\nDemon King is too strong, you failed to beat him. GAME OVER");
			System.out.println("\n(Try obtaining the items in different order.)");
		}
		else {
			System.out.println("\nYou notice the Demon King is now very weak. You unleashed your last power; EXCALIBUR");
			System.out.println("The Demon King let out his final breathe and dropped.");
			System.out.println("\nYou have defeated the Demon King! You brought peace to the Kingdom. CONGRATULATION!!!");
		}
		
	}

	public static void main(String[] args) {
//		Create Objects for the Game
		hero hero = new hero();
		DemonKing DKing = new DemonKing();
		getFans Fans = new getFans();
		getEnergyDrink EnergyDrink = new getEnergyDrink();
		getArmor Armor = new getArmor();
		getMetal Metal = new getMetal();
		getWeight Weight = new getWeight();

//		Setting and Explain game
		Scanner input = new Scanner(System.in);
		System.out.println("Enter player's name: ");
		String name = input.nextLine();
		System.out.println("King: Hero "+ name + ", please save us! The Demon King will attack us in 6 days. \nKing: Please gather up some materials, upgrade them and prepare for the battle! (Enter)");
		input.nextLine();
		System.out.println("You can obtain 1 thing/item a day, those items will level up everyday until MAX level is reached. MAX all items to beat Demon King.");
		System.out.println("\nItems: \n1.Fans \n2.Metal \n3.Armor \n4.EnergyDrink \n5.Weights \n");
		System.out.println("Type the number to get the item you want.");
		int itemChoose = input.nextInt();
		
		int daysPassed = 0;
		while (daysPassed != 5) {
			
			UpdateAll(Fans, Metal, Armor, EnergyDrink, Weight, itemChoose);
			
			hero.updateHero(EnergyDrink.EnergyDrink, Armor.Armor, Fans.Fans, Metal.Metal, Weight.TrainATT, Weight.TrainHP);
			
//			printStats(hero.EnergyDrink, hero.Armor, hero.Fans, hero.Metal, hero.TrainATT, hero.TrainHP);
			
			daysPassed++;
			System.out.println("\nDay " + (daysPassed + 1)+ ": ");
			if (daysPassed != 5) {
				System.out.println("\nPick another item to Obtain, do not choose the same item, because I am too lazy to program that atm.");
				System.out.println("\nItems: \n1.Fans \n2.Metal \n3.Armor \n4.EnergyDrink \n5.Weights \n");
				itemChoose = input.nextInt();
			}
		}
		printLV(EnergyDrink.EnergyDrinkLV, Armor.ArmorLV, Fans.FansLV, Metal.MetalLV, Weight.WeightLV);
		System.out.println("(Enter)");
		input.nextLine();
		System.out.println("\nThe time has come! The Demon King shows up, and it is time to fight.");
		printADHP(hero.Attack, hero.Defense, hero.HP);
		System.out.println("(Enter)");
		input.nextLine();
		Battle(hero, DKing);
		input.close();
	}
}