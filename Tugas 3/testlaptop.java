class  testlaptop {
	public static void main(String[] args) {
		
		laptop acer = new laptop();
		laptop dell = new laptop("toshiba","Merah");
		laptop lenovo = new laptop("toshiba","hijau","Terhubung");

	System.out.println("Merk = "+ acer.getMerk()+" Warna = "+ acer.getWarna() + " Wifi = " + acer.getWifi() + "baterai = " + acer.getBaterai());
	System.out.println("Merk = "+ dell.getMerk()+" Warna = "+ dell.getWarna() + " Wifi = " + dell.getWifi() + "baterai = " + dell.getBaterai());
	System.out.println("Merk = "+ lenovo.getMerk()+" Warna = "+ lenovo.getWarna() + " Wifi = " + lenovo.getWifi() + "baterai = " + lenovo.getBaterai());
	
	}
}