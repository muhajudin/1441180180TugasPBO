public class Lingkaran{
	
	int jejari;
	double phi = 3.14;

	public void cetakKelayarr()
	{
		System.out.println("Jejari: "+ jejari);
	}
	public void ubahPropertyy(int jejariInput)
	{
		jejari = jejariInput;
	}
	public double hitungLuas()
	{
		double luas;
		luas = phi*jejari*jejari;
		return luas;
	}
	public double hitungKeliling()
	{
		double keliling;
		keliling = 2*phi*jejari;
		return keliling;
	}
}