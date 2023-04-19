import java.util.*;
import java.util.stream.*;
public class ManageHeight{

	private int[][] gradeHeights = new int[5][];

	public static void main(String...args){
		final var manageHeight = new ManageHeight();
		manageHeight.setData();

		manageHeight.printHeight();
		manageHeight.printAverage();
	}

	public void setData(){
		this.insert(1, new int[]{170,180,173,175,177});
		this.insert(2, new int[]{160,165,167,186 });
		this.insert(3, new int[]{158,177,187,176});
		this.insert(4, new int[]{173, 182,181});
		this.insert(5, new int[]{170,180,165,177,172});
	}
	private void insert(int grade, int[] heights){
		this.gradeHeights[grade - 1] = heights;
	}

	public void printHeight(){
		System.out.println("결과");
		IntStream.range(0, gradeHeights.length).forEach(this::printHeight);
	}

	public void printHeight(int classNo){
		var grade = gradeHeights[classNo];
		var sb = new StringBuilder();

		sb.append(String.format("Class No.:%d", classNo+1 ))
		  .append("\n")
		  .append(Arrays.stream(grade).mapToObj(String::valueOf).collect(Collectors.joining("\n")))  
		  .append("\n");

		System.out.print(sb);
	}

	public void printAverage(){
		System.out.println("결과");
		IntStream.range(0, gradeHeights.length).forEach(this::printAverage);
	}

	public void printAverage(int classNo){
		final var sb = new StringBuilder();
		var grade = gradeHeights[classNo];

		sb.append(String.format("Class No.:%d", classNo+1 )).append("\n")
		  .append("Height average:")
		  .append(Arrays.stream(grade).average().getAsDouble())
		  .append("\n");

		System.out.print(sb);

	}

}
