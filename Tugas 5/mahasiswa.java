class mahasiswa{
	
	private String nama;
	private int umur;

	public mahasiswa()
	{
		nama = "Ridwan Rismanto";
		umur = 20;
	}
	public mahasiswa(String namaInput)
	{
		nama = namaInput;
		umur = 20;
	}
	public mahasiswa(String namaInput, int umurInput)
	{
		nama = namaInput;
		umur = umurInput;
	}

	public String getNama()
	{
		return nama;
	}
	public int getUmur()
	{
		return umur;
	}

	public String setNama(String n)
	{
		return nama = n;
	}
	public int setUmur(int u)
	{
		return umur = u;
	}

	public void tampilkanBiodata()
	{
		System.out.println("::: BIODATA :::");
		System.out.println("Nama:  "+nama);
		System.out.println("Umur:  "+umur);
	}

}