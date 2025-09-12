package mediatheque;

public class Movie extends Item {
    private int year;
    private String director;

    public Movie(String director, int year, String title) {
        super(title);
        this.director = director;
        this.year = year;
    }

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }	

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public void accept(Visitor v) {
        v.visitMovie(this);
    }

    @Override
    public String toString() {
        return "Film : " + super.toString() + " de " + director + " (" + year + ")";
    }
    
}
