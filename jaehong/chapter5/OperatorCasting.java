
public class OperatorCasting{
	public static void main(String ...args){
		var operator = new OperatorCasting();
		operator.casting();
	}
	
	public void casting(){

		byte byteValue = 127;
		short shortValue = byteValue; 
		
		shortValue++;
		System.out.println(shortValue);
		
		byteValue=(byte)shortValue;
		
		System.out.println(byteValue);

		byte s1 = (byte)((int) 9);
		byte s2 = (byte)((int) 10);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(((byte) Long.MAX_VALUE));
		
		
	}
}
