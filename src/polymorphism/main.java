package polymorphism;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {


      //by providing this get movie the user doesnot really need to know about
        // sub classes of movie class
      Scanner sc = new Scanner(System.in);
      while(true) {
          System.out.print("Enter Type (A for adventure, C for Comedy, " + "S for Science, Q to quit): ");
          String type = sc.nextLine();
          if("qQ".contains(type)) break;
          System.out.println("Enter Title : ");
          String title = sc.nextLine();
          //---------------------------- Polymorphism in action
          // polymorphoism executes diffrent behaviours for diffrent types
          // here movie is compile time type that allows us to extend to four runtime types
           movie m = movie.getMovie(type, title);
          m.watchMovie();
      }

    }
}


