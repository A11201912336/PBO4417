import java.util.Stack;

class Library {
    Stack<String> book = new Stack<String>();

    public Library() {

    }
    public Stack<String> getBook() {
        return book;
    }
    public void setBook(Stack<String> book) {
        this.book = book;
    }
}

class book extends Library {

    public book() {

    }
    public void addBook(String book) {
        super.getBook().add(book);
    }
    public String deathBook(int index) {
        return super.getBook().remove(index);
    }
    public void exchangeBook(int index, String book) {
        super.getBook().set(index, book);
    }
    public Stack<String> collectionBook() {
        return super.getBook();
    }
}

public class Pewarisan_Stack {
    public static void main(String[] args) {
        book buku = new book();
        System.out.println(buku.collectionBook());

        buku.addBook("Novel");
        buku.addBook("Cerpen");
        buku.addBook("Legenda");
        buku.addBook("Modul");
        System.out.println(buku.collectionBook());

        buku.deathBook(1);
        System.out.println(buku.collectionBook());

        buku.exchangeBook(0, "Komik");
        System.out.println(buku.collectionBook());
    }
}