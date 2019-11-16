
public class Sikidomok {

	private static final double pi = Math.PI;

	public static double negyzetKerulet(double a) {
		return 4 * a;
	}

	public static double negyzetTerulet(double a) {
		return a * a;
	}

	public static double teglalapKerulet(double a, double b) {
		return 2 * (a + b);
	}

	public static double teglalapTerulet(double a, double b) {
		return a * b;
	}

	public static double haromszogKerulet(double a, double b, double c) {
		return a + b + c;
	}

	public static double haromszogTerulet(double a, double b, double c) {
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	public static double korKerulet(double r) {
		return 2 * pi * r;
	}

	public static double korTerulet(double r) {
		return pi * (r * r);
	}

	public static double paralelogammaKerulet(double a, double b) {
		return (a * b) * 2;
	}

	public static double paralalogammaTerulet(double a, double ma) {
		return a * ma;
	}
	
	public static double deltoidKerulet(double a, double b) {
		return (a+b)*2;
	}
	
	public static double deltoidTerulet(double e, double f) {
		return (e*f)/2;
	}
}
