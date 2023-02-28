package Class_Practice;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Book perm = new Book();
        Book gift = new Book();

        //calling general method
        perm.greetings();
        gift.greetings();

        //setter
        perm.setAge(25);

        //getter
        System.out.println(perm.getAge());

        //calling parametrized function
        perm.printName("Param");
        gift.printName("gurkirattt");

        String p = "abcda";
        System.out.println(p.replace("a", "xytz"));

        Book b = new bookone();
        if(b instanceof bookone baljeet)
            baljeet.greetings(5);
    }
}