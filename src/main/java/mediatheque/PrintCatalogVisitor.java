package mediatheque;

public class PrintCatalogVisitor implements Visitor {
    @Override
    public void visitBook(Book book) {
        System.out.println(book);
    }

    @Override
    public void visitCD(CD cd) {
        System.out.println(cd);
    }
}
