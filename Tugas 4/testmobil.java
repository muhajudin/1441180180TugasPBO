class  testmobil {
	public static void main(String[] args) {
		
		mobil ferarri = new mobil();
		mobil audi = new mobil(100,"audi");
		mobil porsche = new mobil(120,"porsche","yamaha");
		mobil bmw = new mobil(110,"bmw","honda","inggris");
		mobil toyota = new mobil (90,"toyota","suzuki","perancis","biru");

	System.out.println("Kecepatan Mobil = "+ferarri.getKecepatan() + "Merk Mobil = "+ferarri.getMerk()+"Mesin Mobil = "+ferarri.getMesin()+"Posisi Mobil = "+ferarri.getPosisi()+"Warna Mobil = "+ferarri.getWarna()+"Plat Nomor Mobil = "+ferarri.getPlat());
	System.out.println("Kecepatan Mobil = "+audi.getKecepatan()+"Merk Mobil = "+audi.getMerk()+"Mesin Mobil = "+audi.getMesin()+"Posisi Mobil = "+audi.getPosisi()+"Warna Mobil = "+audi.getWarna()+"Plat Nomor Mobil = "+audi.getPlat());
	System.out.println("Kecepatan Mobil = "+porsche.getKecepatan()+"Merk Mobil = "+porsche.getMerk()+"Mesin Mobil = "+porsche.getMesin()+"Posisi Mobil = "+porsche.getPosisi()+"Warna Mobil = "+porsche.getWarna()+"Plat Nomor Mobil = "+porsche.getPlat());
	System.out.println("Kecepatan Mobil = "+bmw.getKecepatan()+"Merk Mobil = "+bmw.getMerk()+"Mesin Mobil = "+bmw.getMesin()+"Posisi Mobil = "+bmw.getPosisi()+"Warna Mobil = "+bmw.getWarna()+"Plat Nomor Mobil = "+bmw.getPlat());
	System.out.println("Kecepatan Mobil = "+toyota.getKecepatan()+"Merk Mobil = "+toyota.getMerk()+"Mesin Mobil = "+toyota.getMesin()+"Posisi Mobil = "+toyota.getPosisi()+"Warna Mobil = "+toyota.getWarna()+"Plat Nomor Mobil = "+toyota.getPlat());
	}
}