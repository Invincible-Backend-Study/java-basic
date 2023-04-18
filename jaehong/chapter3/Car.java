public class Car{ 
	private int speed;
	private int distance;
	private String color;


	public void speedUp(){
		this.speed += 5;
		// 
	}

	public void breakDown(){
		this.speed -= 10;

	}
	
	public int getCurrentSpeed(){
		return speed;
	}
	@Override public String toString(){
		return "hello";
	}

}
