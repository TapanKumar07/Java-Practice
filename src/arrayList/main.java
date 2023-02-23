package arrayList;

public class main {
    public static void main(String[] args) {
        int []marks = {10, 20, 1};
        Student s = new Student("Rohan", marks);

        System.out.println(s.getNumberOfMarks());
        System.out.println(s.getTotalSumOfMarks());
        System.out.println(s.getMaximumMarks());
        System.out.println(s.getMinimumMarks());
        System.out.println(s.getAverageMarks());
    }
}
