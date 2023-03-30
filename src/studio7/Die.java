package studio7;

public class Die {
	private int n;
	
	public Die(int n) {
		this.n = n;
	}
	
	public int roll() {
		return (int)(Math.random()*n)+1;
	}
	
	public static void main(String[] args) {
		Die side3 = new Die(3);
		System.out.println(side3.roll());
	}

}
