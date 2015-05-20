public class Segitiga{
	
	int alas;
	int tinggi;

	public void cetakKelayar()
	{
		System.out.println("Alas: "+ alas);
		System.out.println("Tinggi: "+ tinggi);
	}
	public void ubahProperty(int alasInput, int tinggiInput)
	{
		alas = alasInput;
		tinggi = tinggiInput;
	}

	public int hitungLuas()
	{
		int luas;
		luas = alas*tinggi/2;
		return luas;
	}

	public int hitungKeliling()
	{
		int keliling;
		keliling = alas*3;
		return keliling;
	}
}