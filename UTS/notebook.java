public class notebook extends komputer {
	int prosesor;
	int baterai;

	komputer not = new komputer();

	public notebook (int prosesorInput, int memoriInput, int storageInput, int bateraiInput)
	{
	prosesor = prosesorInput;
	memori = memoriInput;
	storage = storageInput;
	baterai = bateraiInput;		
	}

	public void CetakSpesifikasi(){
	System.out.println("Kecepatan Prosesor Komputer :"+not.komputer());
	System.out.println("Kecepatan Prosesor Notebook :"+prosesor);
	System.out.println("Kapasitas Memori :"+memori);
	System.out.println("Kapasitas Storage :"+storage);
	System.out.println("Kapasitas Baterai :"+baterai);
	System.out.println();
	}
	public void Overclock(int kec)
	{
		System.out.println("Notebook dioverclock dengan kecepatan prosesor :"+kec);
	}
}


