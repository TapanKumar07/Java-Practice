package arrayList;

public class Student {
    private String name;
    private int[] Marks;
    Student(String name, int [] marks) {
        this.name = name;
        this.Marks = marks;
    }

    int getTotalSumOfMarks() {
        int sum = 0;
        for(int mark : Marks) {
            sum += mark;
        }

        return sum;
    }
    int getNumberOfMarks() {
        return Marks.length;
    }

    int getMaximumMarks() {
        int mx = 0;
        for(int mark : Marks) {
            if(mark > mx) mx = mark;
        }
        return mx;
    }

    int getMinimumMarks() {
        int mn = Integer.MAX_VALUE;
        for(int mark : Marks) {
            if(mark < mn) mn = mark;
        }
        return mn;
    }

    double getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int len = getNumberOfMarks();

        double ans = (double)sum / len;

        return ans;
    }


}
