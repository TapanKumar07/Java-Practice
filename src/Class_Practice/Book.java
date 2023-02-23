public class Book {
    String name;
    private int age;
    void greetings() {
        System.out.println("Greetings from System! ");
    }

    void printName(String in) {
        System.out.println(in);
    }

    //getters and setters
    void setAge(int age) {
        System.out.println(this.age);
        this.age = age;
        System.out.println(age);

    }

     int getAge() {
        return this.age;
    }

}
