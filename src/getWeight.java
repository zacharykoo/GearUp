
public class getWeight {
	int TrainATT;
	int TrainHP;
	int WeightLV = 0;
	
	public void ObtainWeight() {
		this.TrainATT = 1;
		this.TrainHP = 10;
		this.WeightLV ++;
		System.out.println("Obtained Weights, you can now train with 5kg weights.");
	}
	public void upWeight5() {
		this.TrainATT += 2;
		this.TrainHP += 10;
		this.WeightLV ++;
		System.out.println("Weights Upgrade! You can now train with 10kg weights.");
	}
	public void upWeight10() {
		this.TrainATT += 2;
		this.TrainHP += 10;
		this.WeightLV ++;
		System.out.println("Weights Upgrade! You can now train with 50kg weights.");
	}
	public void upWeight50() {
		this.TrainATT += 5;
		this.TrainHP += 20;
		this.WeightLV ++;
		System.out.println("Weights Upgrade! You can now train with 100kg weights.");
	}
	public void upWeight100() {
		this.TrainATT += 10;
		this.TrainHP += 50;
		this.WeightLV ++;
		System.out.println("Weights Upgrade! You can now train with 999kg weights.");
	}
}
