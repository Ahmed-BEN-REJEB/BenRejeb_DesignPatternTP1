package mediatheque;

public class PrintOnlyMoviesVisitor implements Visitor {

    @Override
    public void visitBook(Book book) {
        // Ne rien faire pour les livres
    }

    @Override
    public void visitCD(CD cd) {
        // Ne rien faire pour les CDs
    }

    @Override
    public void visitMovie(Movie movie) {
        movie.print();
    }
}
