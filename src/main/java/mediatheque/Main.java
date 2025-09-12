package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();
        mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem( new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem( new CD(12, "Sergeant Peppers"));
        // Ajout d'un nouvel item : movie
        mediatheque.addItem( new Movie("Steven Spielberg", 1993, "La liste de Schindler"));
        
        System.out.println("=== Catalogue complet ===");
        mediatheque.applyVisitor(new PrintCatalogVisitor());

        System.out.println("\n=== Livres uniquement ===");
        mediatheque.applyVisitor(new PrintOnlyBooksVisitor());

        System.out.println("\n=== CDs uniquement ===");
        mediatheque.applyVisitor(new PrintOnlyCDsVisitor());

        System.out.println("\n=== Films uniquement ===");
        mediatheque.applyVisitor(new PrintOnlyMoviesVisitor());
    }
}
