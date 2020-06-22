
public class getFans {
	
	int Fans;
	int FansLV;
	
	public getFans() {
		this.FansLV = 0;
	}
	
	public void ObtainFans() {
		this.Fans = 5;
		System.out.println("You got popular! You now have 50 Fans!");
		this.FansLV += 1;
	}
	
	public void upFans1() {
		this.Fans += 5;
		System.out.println("Fans Upgrade! You became more popular! You now have 100 Fans!");
		this.FansLV += 1;
	}
	
	public void upFans2() {
		this.Fans += 10;
		System.out.println("Fans Upgrade! You became more popular! You now have 500 Fans!");
		this.FansLV += 1;
	}
}
