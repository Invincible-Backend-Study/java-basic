public class Sample{

	public static void main(String...args){
		System.out.println(ifStatement(Direction.TOP));
		System.out.println(ifStatement(Direction.BOTTOM));
		System.out.println(ifStatement(Direction.LEFT));
		System.out.println(ifStatement(Direction.RIGHT));
	}

	public static int ifStatement(Direction dr){
		if(dr == Direction.TOP){
			return 1;
		}
		if(dr == Direction.BOTTOM){
			return 2;
		}
		if(dr == Direction.LEFT){
			return 3;
		}
		if(dr == Direction.RIGHT){
			return 4;
		}
		return 0;
	}

	public static int switchStatement(Direction dr){
		return switch(dr){
			case TOP -> 1;
			case BOTTOM -> 2;
			case LEFT -> 3;
			case RIGHT -> 4;
		};
	}
}


enum Direction{
	TOP,
	BOTTOM,
	LEFT,
	RIGHT;
}
