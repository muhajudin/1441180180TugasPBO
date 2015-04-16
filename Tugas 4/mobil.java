class  mobil {

	private int kecepatan;
	private String merk;
	private String mesin;
	private String posisi;
	private String warna;
	private String plat;

	public mobil()
	{
		kecepatan = 80;
		merk = "bugatti";
		mesin = "aspira";
		posisi = "jerman";
		warna = "merah";
		plat = "TIE20";
	}

	public mobil(int kecepatanInput, String merkIput)
	{
		kecepatan = kecepatanInput;
		merk = merkIput;
		mesin = "aspira";
		posisi = "jerman";
		warna = "merah";
		plat = "TIE20";
	}

	public mobil(int kecepatanInput, String merkIput, String mesinInput)
	{
		kecepatan = kecepatanInput;
		merk = merkIput;
		mesin = mesinInput;
		posisi = "jerman";
		warna = "merah";
		plat = "TIE20";
	}

	public mobil(int kecepatanInput, String merkIput, String mesinInput, String posisiInput)
	{
		kecepatan = kecepatanInput;
		merk = mesinInput;
		mesin = mesinInput;
		posisi = posisiInput;
		warna = "merah";
		plat = "TIE20";
	}

	public mobil(int kecepatanInput, String merkIput, String mesinInput, String posisiInput, String warnaInput)
	{
		kecepatan = kecepatanInput;
		merk = mesinInput;
		mesin = mesinInput;
		posisi = posisiInput;
		warna = warnaInput;
		plat = "TIE20";
	}

	public mobil(int kecepatanInput, String merkIput, String mesinInput, String posisiInput, String warnaInput, String platInput)
	{
		kecepatan = kecepatanInput;
		merk = mesinInput;
		mesin = mesinInput;
		posisi = posisiInput;
		warna = warnaInput;
		plat = platInput;
	}

	public void maju()
	{
		System.out.println("Mobil Bergerak Maju Dengan Kecepatan = "+50+"Km/h");
	}
	public void mundur()
	{
		System.out.println("Mobil Bergerak Mundur Dengan Kecepatan = "+20+"Mph");
	}
	public void belok()
	{
		System.out.println("Mobil Belok Ke Arah Kanan");
	}
	public void melaju()
	{
		System.out.println("Mobil Melaju Dengan Kecepatan = "+kecepatan+"Km/h");
	}
	public void ngerem()
	{
		System.out.println("Mobil Berhenti Di Lampu Merah");
	}

	public int getKecepatan()
	{
		return kecepatan;
	}
	public int setMerk(int k)
	{
		return kecepatan = k;
	}

	public String getMerk()
	{
		return merk;
	}
	public String setMerk(String m)
	{
		return merk = m;
	}

	public String getMesin()
	{
		return mesin;
	}
	public String setMesin(String e)
	{
		return mesin = e;
	}

	public String getPosisi()
	{
		return posisi;
	}
	public String setPosisi(String p)
	{
		return posisi = p;
	}
	public String getWarna()
	{
		return warna;
	}
	public String setWarna(String w)
	{
		return warna = w;
	}
	public String getPlat()
	{
		return plat;
	}
	public String setPlat(String l)
	{
		return plat = l;
	}
	

}