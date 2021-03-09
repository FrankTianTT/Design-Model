public class Main {
    public static void main(String Args[]){
        BookShelf bookShelf = new BookShelf(100);
        bookShelf.appendBook(new Book("A"));
        bookShelf.appendBook(new Book("B"));
        bookShelf.appendBook(new Book("C"));
        bookShelf.appendBook(new Book("D"));
        bookShelf.appendBook(new Book("E"));
        bookShelf.appendBook(new Book("F"));

        Iterator it = new BookShelfIterator(bookShelf);
        Iterator it1 = new BookShelfIterator(bookShelf);
        Book book = (Book)it1.next();
        System.out.println(book.getName());
        while(it.hasNext()){
            book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
