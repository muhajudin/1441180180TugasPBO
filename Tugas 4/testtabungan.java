class testtabungan{
	public static void main(String[] args) {
		
		tabungan ayah = new tabungan();
		tabungan ibu = new tabungan(1500000,"Rola");
		tabungan adik = new tabungan(1000000,"Thomas",1441180111);

		System.out.println("Simpanan = "+ayah.getSimpanan()+ " Pemilik Rekening = "+ayah.getPemrek()+ " No Rekening = "+ayah.getNorek()+ " Bunga Tabungan = "+ayah.getBunga());
		System.out.println("Simpanan = "+ibu.getSimpanan()+ " Pemilik Rekening = "+ibu.getPemrek()+ " No Rekening = "+ibu.getNorek()+ " Bunga Tabungan = "+ibu.getBunga());
		System.out.println("Simpanan = "+adik.getSimpanan()+ " Pemilik Rekening = "+adik.getPemrek()+ " No Rekening = "+adik.getNorek()+ " Bunga Tabungan = "+adik.getBunga());
	}
}