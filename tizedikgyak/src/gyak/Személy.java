package gyak;

public class Személy {
	private String nev;
	private int kor;

	public Személy(String nev, int kor) {
		this.nev = nev;
		this.kor = kor;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	@Override
	public String toString() {
		return "Személy [nev=" + nev + ", kor=" + kor + "]";
	}

}
