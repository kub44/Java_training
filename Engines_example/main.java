package lab9_dziedziczenie;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamochodOsobowy sam=new SamochodOsobowy(null, 0, 0);
		SamochodDostawczy dost=new SamochodDostawczy(null, 0, 0);
		Pojazd pojazd=new SamochodDostawczy(null, 0, 0);
		Samochod samochod=new SamochodDostawczy(null, 0, 0);
		Silnik silnik=new SamochodDostawczy(null, 0, 0);
		
		samochod.otworzDrzwi();
		silnik.uruchomSilnik();
		samochod.zamknijDrzwi();
		pojazd.jedz();
		pojazd.zmienKierunek("prawo");
		sam.hamuj();
		dost.wylaczSilnik();
		
		Pojazd pojazd2=new SamochodOsobowy(null, 0, 0);
		Samochod samochod2=new SamochodOsobowy(null, 0, 0);
		SilnikElektryczny silnikElektryczny=new SamochodOsobowy(null, 0, 0);
		SilnikSpalinowy silnikSpalinowy=new SamochodOsobowy(null, 0, 0);
		
		samochod2.otworzDrzwi();
		silnikElektryczny.uruchomSilnik();
		silnikSpalinowy.uruchomSilnik();
		sam.zamknijDrzwi();
		
		pojazd2.jedz();
		sam.zmienKierunek("lewo");
		sam.hamuj();
		silnikElektryczny.wylaczSilnik();
		silnikSpalinowy.wylaczSilnik();
		
		
	}

}
