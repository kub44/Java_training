package lab9_dziedziczenie;

public class SamochodOsobowy extends Samochod implements SilnikElektryczny,SilnikSpalinowy {
	
	public SamochodOsobowy(String nazwa, int liczbaMiejsc, int pojemnoscBagaznika)
	{
		super(nazwa, liczbaMiejsc, pojemnoscBagaznika);	}

	@Override
	public void uruchomSilnik() {
		System.out.println("Uruchamiam silnik");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wylaczSilnik() {
		System.out.println("Wylaczam Silnik");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jedz() {
		System.out.println("Jade");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hamuj() {
		System.out.println("Hamuje");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void zmienKierunek(String kierunek) {
		System.out.println("Zmieniam kierunek na " + kierunek);
		// TODO Auto-generated method stub
		
	}

	@Override
	public int liczbaCylindrow() {
		
		// TODO Auto-generated method stub
		return 150;
	}

	@Override
	public int liczbaZaworow() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int moc() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public float poziomEnergii() {
		// TODO Auto-generated method stub
		return 25;
	}

	@Override
	public void otworzDrzwi() {
		// TODO Auto-generated method stub
		System.out.println("Otwieram drzwi");
	}
}
