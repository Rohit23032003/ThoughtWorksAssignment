package AuthorBookPart2;

class Test {
    public static void main(String[] args) {
        Book book = new Book("Introduction to Astrophysics", new Author[]{
            new Author("Dr. Jane Doe", "jane.doe@astrophysics.org", 'f'),
            new Author("Prof. John Smith", "john.smith@astrophysics.org", 'm')
        }, 499.99, 50);

        System.out.println("Author Names: ");
        System.out.println(book.getAuthorNames());
        System.out.println("Book Details: ");
        System.out.println(book);
    }
}
