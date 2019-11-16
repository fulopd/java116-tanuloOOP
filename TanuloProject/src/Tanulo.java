import java.util.Arrays;

public class Tanulo {

	private String nev;
	private int szuletesiEv;
	private int evfolyam;
	private String osztaly;
	private int[] angolJegyek = new int[3];
	private int feleviAngol;

	public Tanulo(String nev, int szuletesiEv) {
		this.nev = nev;
		this.szuletesiEv = szuletesiEv;
	}

	public Tanulo(String nev, int szuletesiEv, int evfolyam, String osztaly) {
		this.nev = nev;
		this.szuletesiEv = szuletesiEv;
		this.evfolyam = evfolyam;
		this.osztaly = osztaly;
	}

	public String getNev() {
		return nev;
	}

	public int getSzuletesiEv() {
		return szuletesiEv;
	}

	public int getEvfolyam() {
		return evfolyam;
	}

	public void setEvfolyam(int evfolyam) {
		this.evfolyam = evfolyam;
	}

	public String getOsztaly() {
		return osztaly;
	}

	public void setOsztaly(String osztaly) {
		this.osztaly = osztaly;
	}

	public int[] getAngolJegyek() {
		return angolJegyek;
	}

	public void setAngolJegyek(int[] angolJegyek) {
		this.angolJegyek = angolJegyek;
	}

	public int getFeleviAngol() {
		return feleviAngol;
	}

	public void setFeleviAngol(int feleviAngol) {
		this.feleviAngol = feleviAngol;
	}

	@Override
	public String toString() {
		return "Tanulo [nev=" + nev + ", szuletesiEv=" + szuletesiEv + ", evfolyam=" + evfolyam + ", osztaly=" + osztaly
				+ ", angolJegyek=" + Arrays.toString(angolJegyek) + ", feleviAngol=" + feleviAngol + "]";
	}

	public void toStringNevAngolFelevi() {
		System.out.println("Név: " + this.nev);
		System.out.println("felevi angol: : " + this.feleviAngol);
	}

	
}
