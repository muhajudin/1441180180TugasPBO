class circle {
	
	double radius;
	String color;

	public circle(){

		radius = 1.0;
		color = "blue";

	}

	public circle(double a){

		radius = a;
		color = "blue";

	}

	public circle(double a, String b){

		radius = a;
		color = b;
	}

	public double getRadius(){

		return radius;
	}

	public String getColor(){

		return color;

	}

	public double getArea(){

		return radius*radius*Math.PI;
	}
}
