class TestCircle {
	public static void main(String[] args) {
		
	
	circle cahya = new circle();
	circle ardi = new circle(40);
	circle akbar = new circle(86,"white");

	System.out.println("Radius = "+ cahya.getRadius()+" Color = "+ cahya.getColor() + " Luasnya = " + cahya.getArea());
	System.out.println("Radius = "+ ardi.getRadius()+" Color = "+ ardi.getColor() + " Luasnya = " + ardi.getArea());
	System.out.println("Radius = "+ akbar.getRadius()+" Color = "+ akbar.getColor() + " Luasnya = " + akbar.getArea());
	}

}
