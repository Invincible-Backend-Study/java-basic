package C07;

public class ManageHeight {
    private int[][] student;

    public void setData() {
        student = new int[][]{
                {170, 180, 173, 175, 177},
                {160, 165, 167, 186},
                {158, 177, 187, 176},
                {173, 182, 181},
                {170, 180, 165, 177, 172}
        };
    }

    public void printHeight(int classNo) {
        System.out.println("Class No.:" + classNo);
        for(int student : student[classNo]) {
            System.out.println(student);
        }
    }

    public void printAverage(int classNo) {
        System.out.println("Class No.:" + classNo);

        int i = 0;
        int studentHeightTotal = 0;
        for(int student : student[classNo]) {
            i++;
            studentHeightTotal += student;
        }
        System.out.println("Height average:" + (double) studentHeightTotal / i);
    }

}
