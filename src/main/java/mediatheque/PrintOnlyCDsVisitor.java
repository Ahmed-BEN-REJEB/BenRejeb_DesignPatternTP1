package mediatheque;

public class PrintOnlyCDsVisitor implements Visitor {
    @Override
    public void visitBook(Book book) {
        // ne rien faire
    }

    @Override
    public void visitCD(CD cd) {
        System.out.println(cd);
    }
}
