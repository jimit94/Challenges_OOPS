public class Book {
    // create a book class for library system
    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }
    {
        totalBooks++;
    }
Book(String title,String author,String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
}
Book(String isbn){
        this("unknown","unknown",isbn);
}
static int getTotalBooks(){
        return totalBooks;
}
void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }
        else {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
}
void returnBook(){
        this.isBorrowed = false;
    System.out.println("Hope you enjoyed");
}

    public static void main(String[] args) {
        Book designOfThings = new Book("design","Author","100");
        Book mybook = new Book("101");
        System.out.println(Book.getTotalBooks());
        designOfThings.borrowBook();
        mybook.borrowBook();
        mybook.borrowBook();
        mybook.returnBook();
        designOfThings.returnBook();
    }

}