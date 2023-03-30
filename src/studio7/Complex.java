package studio7;

public class Complex {
	private double r;
	private double i;

	public Complex(double r, double i) {
		this.r = r;
		this.i = i;
	}

	public String print() {
		String out = "";
		if (this.i >= 0) {
			out = this.r + " +" + this.i + "i";
		} else if (this.i < 0) {
			out = this.r  + "" + this.i + "i";
		} 
		return out;
	}
	
	public double beReal() {
		return this.r;
	}
	
	public double beImaginary(){
		return this.i;
	}
	
	public Complex sum(Complex in) {
		Complex out = new Complex(this.r, this.i);
		out.r = this.r + in.r;
		out.i = this.i + in.i;
		return out;
	}
	
	public Complex multi(Complex in) {
		Complex out = new Complex(this.r, this.i);
		out.r = this.r * in.r - this.i * in.i;
		out.i = this.r * in.i + this.i * in.r;
		return out;
	}
	
	public static void main(String[] args) {
		Complex a = new Complex(3,4);
		Complex b = new Complex(-2, -5);
		System.out.println(a.print());
		System.out.println(b.beReal());
		System.out.println(a.sum(b).print());
		System.out.println(b.multi(a).print());
		System.out.println(a.multi(b).print());
	}

}
