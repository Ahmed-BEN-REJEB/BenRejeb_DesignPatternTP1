package mediatheque;

public class PrintOnlyBooksVisitor implements Visitor {
    @Override
    public void visitBook(Book book) {
        System.out.println(book);
    }

    @Override
    public void visitCD(CD cd) {
        // ne rien faire
    }
}
