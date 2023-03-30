package studio7;

public class Fraction {
	private int n;
	private int d;
	
	public Fraction(int n, int d) {
		this.n = n;
		this.d = d;
	}
	
	public int getNum() {
		return n;
	}
	
	public int getDenom() {
		return d;
	}
	
	public String print() {
		String out = this.n + "/" + this.d;
		return out;
	}
	
	public Fraction multi(Fraction in) {
		Fraction out = new Fraction(this.n, this.d);
		out.n = this.n * in.n;
		out.d = this.d * in.d;
		return out;
	}
	
	public Fraction sum(Fraction in) {
		Fraction out = new Fraction(this.n, this.d);
		out.n = this.n * in.d + this.d * in.n;
		out.d = this.d * in.d;		
		return out;
	}
	
	public Fraction simp() {
		Fraction out = new Fraction(this.n, this.d);
		int com = findCom(out.n, out.d);
		out.n = out.n/com;
		out.d = out.d/com;
		return out;
	}
	
	private int findCom(int a, int b) {
		int out = 1;
		if (a == 0) {
			out = b;
		} else if(b == 0) {
			out = a;
		} else if (a>b){
			out = findCom(a%b, b);
		} else {
			out = findCom(b%a, a);
		}
		return out;
	}
	
	public Fraction rec() {
		Fraction out = new Fraction(this.d, this.n);
		return out;
	}
	
	public static void main(String[] args) {
		Fraction a = new Fraction(4,6);
		Fraction b = new Fraction(5,3);
	
		System.out.println(a.getNum());
		System.out.println(b.getDenom());
		System.out.println(a.multi(b).print());
		System.out.println(a.sum(b).print());
		System.out.println(a.simp().print());
		System.out.println(b.rec().print());
	}

}
