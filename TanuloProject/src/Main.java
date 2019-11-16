import java.util.Scanner;

public class Main {

	static Scanner beolvas = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Tanulók száma: ");
		Tanulo[] tanulok = new Tanulo[Integer.parseInt(beolvas.nextLine())];

		for (int i = 0; i < tanulok.length; i++) {
			System.out.print("Kérem a tanulo nevét: ");
			String nev = beolvas.nextLine();
			System.out.print("Kérem a tanulo születési évét: ");
			int szulev = beolvas.nextInt();
			System.out.print("Kérem a tanulo évfolyamát: ");
			int evfo = beolvas.nextInt();
			System.out.print("Kérem a tanulo osztály: ");
			String osztaly = beolvas.next();
			System.out.println();
			int[] angolJegy = new int[3];
			for (int j = 0; j < angolJegy.length; j++) {
				System.out.print(j + 1 + ". jegye:");
				angolJegy[j] = beolvas.nextInt();
			}

			tanulok[i] = new Tanulo(nev, szulev, evfo, osztaly);
			tanulok[i].setAngolJegyek(angolJegy);

			int sum = angolJegy[0] + angolJegy[1] + angolJegy[2];
			double atlag = (double) sum / angolJegy.length;

			int feleviAngol = 1;

			if (atlag >= 4.5) {
				feleviAngol = 5;
			} else if (atlag > 3.6) {
				feleviAngol = 4;
			} else if (atlag > 2.7) {
				feleviAngol = 3;
			} else if (atlag > 1.8) {
				feleviAngol = 2;
			} else {
				feleviAngol = 1;
			}

			tanulok[i].setFeleviAngol(feleviAngol);
		}

		for (int i = 0; i < tanulok.length; i++) {
			tanulok[i].toStringNevAngolFelevi();
		}
	}

}
