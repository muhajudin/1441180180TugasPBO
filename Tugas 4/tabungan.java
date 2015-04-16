class tabungan {
		
		private int simpanan;
		private String pemrek;
		private int norek;
		private int bunga;

		public tabungan()
		{
			simpanan = 2500000;
			pemrek = "Muhajudin";
			norek = 1441180180;
			bunga = 5000;
		}

		public tabungan(int simpananInput, String pemrekInput)
		{
			simpanan = simpananInput;
			pemrek = pemrekInput;
			norek = 1441180180;
			bunga = 5000;
		}

		public tabungan(int simpananInput, String pemrekInput, int norekInput)
		{
			simpanan = simpananInput;
			pemrek = pemrekInput;
			norek = norekInput;
		}

		public tabungan(int simpananInput, String pemrekInput, int norekInput, int bungaInput)
		{
			simpanan = simpananInput;
			pemrek = pemrekInput;
			norek = norekInput;
			bunga = bungaInput;
		}

		public void menabung()
		{
			System.out.println("Anda Menabung Uang Sebesar = "+500000);
		}
		public void mengambil()
		{
			System.out.println("Anda Mengambil Uang Sebesar = "+200000);
		}
		public void transfer()
		{
			System.out.println("Anda Mentransfer Uang Sebesar = "+100000);
		}
		public void menerimatransfer()
		{
			System.out.println("Anda menerimatransfer Uang Sebesar ="+400000);
		}

		public void ceksaldo()
		{
			System.out.println("Saldo Anda Sebesar = "+simpanan);
		}
	public int getSimpanan()
	{
		return simpanan;
	}
	public int setSimpanan(int s)
	{
		return simpanan = s;
	}

	public String getPemrek()
	{
		return pemrek;
	}
	public String setPemrek(String p)
	{
		return pemrek = p;
	}

	public int getNorek()
	{
		return norek;
	}
	public int setNorek(int n)
	{
		return norek = n;
	}

	public int getBunga()
	{
		return bunga;
	}
	public int setBunga(int b)
	{
		return bunga*simpanan;
	}

}