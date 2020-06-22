
public class getMetal extends hero{
	
	int Metal;
	int MetalLV = 0;
	
	public void ObtainMetal() {
		this.Metal = 0;
		System.out.println("Obtained a piece of metal!");
		this.MetalLV += 1;
	}
	
	public void upMetal () {
		this.Metal += 5;
		System.out.println("Metal Upgraded! Bronze sword created from Metal.");
		this.Attack = Attack + Metal;
		this.MetalLV += 1;
	}
	
	public void upBronze () {
		this.Metal += 5;
		System.out.println("Metal Upgraded! Silver sword created from Metal.");
		this.MetalLV += 1;
	}
	
	public void upSilver () {
		this.Metal += 5;
		System.out.println("Metal Upgraded! Diamond sword created from Metal.");
		this.MetalLV += 1;
	}
}