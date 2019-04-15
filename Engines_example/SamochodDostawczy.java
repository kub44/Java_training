package lab9_dziedziczenie;

public class SamochodDostawczy extends Samochod implements SilnikSpalinowy {

	private int masaLadunku;
	
	public SamochodDostawczy(String nazwa, int liczbaMiejsc, int pojemnoscBagaznika)
	{
		super(nazwa, liczbaMiejsc, pojemnoscBagaznika);	}
	
	public void zaladuj(int ladunek) {};
	
	public void uruchomSilnik()
	{
		System.out.println("Uruchamiam silnik");
	}
	public void wylaczSilnik()
	{
		System.out.println("Wy³¹czam silnik");
	}
	public int liczbaCylindrow()
	{
		return 10;
	}
	public int liczbaZaworow()
	{
		return 10;
	}
	public void hamuj()
	{
		System.out.println("Hamuje");
	}
	public void zmienKierunek(String kierunek)
	{
		System.out.println("Zmieniam kierunek na " + kierunek);
	}
	public void jedz()
	{
		System.out.println("Jade");
	}

	@Override
	public void otworzDrzwi() {
		System.out.println("Otwieram drzwi");
		// TODO Auto-generated method stub
		
	}
	
	
}
