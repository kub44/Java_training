package lab9_dziedziczenie;

public abstract class Samochod implements Pojazd {

	protected int liczbaMiejsc;
	protected int pojemnoscBagaznika;
	protected String nazwa;
	
	public Samochod(String nazwa, int liczbaMiejsc, int pojemnoscBagaznika)
	{
		this.nazwa=nazwa;
		this.liczbaMiejsc=liczbaMiejsc;
		this.nazwa=nazwa;	}
	
	public abstract void otworzDrzwi();
	public void zamknijDrzwi()
	{
		System.out.println("Zamykam d¿wi");
	}
}
