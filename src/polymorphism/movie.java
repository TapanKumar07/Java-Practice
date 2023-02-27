package polymorphism;

public class movie {
    private String title;

    public movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    //factory Method - returns new instance based on inputs
    public static movie getMovie(String type, String title) {
        return switch(type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new movie(title);
        };
    }


}

class Adventure extends movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Pleasant Scene" ,
                "Scary Music",
                "Nice spirits");
    }
}

class Comedy extends movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Funny" ,
                "Funnier",
                "Funniest");
    }
}

class ScienceFiction extends movie {
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Einsteinn" ,
                "Newton",
                "Scrodinger");
    }
}