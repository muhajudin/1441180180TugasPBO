class laptop {
	
	private String merk;
	private String warna;
	private String wifi;
	private int baterai;

	public laptop()
	{
		merk = "asus";
		warna = "putih";
		wifi = "terhubung";
		baterai = 96;
	}

	public laptop(String merkInput, String warnaInput)
	{
		merk = merkInput;
		warna = warnaInput;
		wifi = "terhubung";
		baterai = 80;
	}

	public laptop(String merkInput, String warnaInput, String wifiInput)
	{
		merk = merkInput;
		warna = warnaInput;
		wifi = wifiInput;
	}

	public laptop(String merkInput, String warnaInput, String wifiInput, int bateraiInput)
	{
		merk = merkInput;
		warna = warnaInput;
		wifi = wifiInput;
		baterai = bateraiInput;
	}

	public void menyala()
	{
		System.out.println("Welcome to Laptop");
	}
	public void mematikan()
	{
		System.out.println("Thankyou have a nice day");
	}
	public void indikatorwifi()
	{
		System.out.println("Wifinya" +wifi);
	}
	public void indikatorbaterai()
	{
		System.out.println("Baterainya Tinggal : "+baterai+"%");
	}
	

	public String getMerk()
	{
		return merk;
	}
	public String setMerk(String m)
	{
		return merk = m;
	}

	public String getWarna()
	{
		return warna;
	}
	public String setWarna(String w)
	{
		return warna = w;
	}

	public String getWifi()
	{
		return wifi;
	}
	public String setWifi(String w)
	{
		return wifi = w;
	}

	public int getBaterai()
	{
		return baterai;
	}
	public int setBaterai(int b)
	{
		return baterai = b;
	}
}