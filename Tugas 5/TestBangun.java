public class TestBangun{
	
	public static void main(String[] args) 
	{
		Segitiga bangun1 = new Segitiga();
		Lingkaran bangun2 = new Lingkaran();

		bangun1.alas   = 17;
		bangun1.tinggi = 14;

		bangun2.jejari = 14;
		bangun2.phi = 3.14;

		System.out.println("::: LUAS & KELILING SEGITIGA :::");
		bangun1.cetakKelayar();

		System.out.println("Luas Segitiga     : "+ bangun1.hitungLuas());
		System.out.println("Keliling Segitiga : "+ bangun1.hitungKeliling());
		System.out.println();
		System.out.println();

		bangun1.ubahProperty(12, 18);

		System.out.println("::: LUAS & KELILING SEGITIGA BARU :::");
		bangun1.cetakKelayar();

		System.out.println("Luas Segitiga     : "+ bangun1.hitungLuas());
		System.out.println("Keliling Segitiga : "+ bangun1.hitungKeliling());
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("::: LUAS & KELILING LINGKARAN :::");
		bangun2.cetakKelayarr();

		System.out.println("Luas Lingkaran    : "+ bangun2.hitungLuas());
		System.out.println("Luas Lingkaran    : "+ bangun2.hitungKeliling());
		System.out.println();
		System.out.println();

		bangun2.ubahPropertyy(20);

		System.out.println("::: LUAS & KELILING LINGKARAN BARU :::");
		bangun2.cetakKelayarr();

		System.out.println("Luas Segitiga     : "+ bangun2.hitungLuas());
		System.out.println("Keliling Segitiga : "+ bangun2.hitungKeliling());
	}
	
}