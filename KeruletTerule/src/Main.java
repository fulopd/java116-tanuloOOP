
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Kör kerület / terület: " + Sikidomok.korKerulet(3) +" / "+ Sikidomok.korTerulet(3));
		System.out.println("Négyzet kerület / terület: " + Sikidomok.negyzetKerulet(3) +" / "+ Sikidomok.negyzetTerulet(3));
		System.out.println("Téglalap kerület / terület: " + Sikidomok.teglalapKerulet(2, 2) +" / "+ Sikidomok.teglalapTerulet(2, 2));
		System.out.println("Háromszög kerület / terület: " + Sikidomok.haromszogKerulet(2, 2, 2) +" / "+ Sikidomok.haromszogTerulet(3, 3, 3));
		System.out.println("Paralelogamma kerület / terület: " + Sikidomok.paralelogammaKerulet(2, 2) +" / "+ Sikidomok.paralalogammaTerulet(3, 4));
		System.out.println("Deltoid kerület / terület: " + Sikidomok.deltoidKerulet(3, 3) +" / "+ Sikidomok.deltoidTerulet(3, 3));
		
	}

}
