public class Book extends LibraryItem {
    private int numberOfPages;
    private String genreOfBook;


    public Book(String title, String author,int publicationYear, int numberOfPages,String genreOfBook){
        super(title,author,publicationYear);
        this.numberOfPages = numberOfPages;
        this.genreOfBook = genreOfBook;
    }

    public int getNumberOfPages(){return numberOfPages;}
    public String getGenreOfBook(){return genreOfBook;}

    public void setNumberOfPages(int numberOfPages){this.numberOfPages = numberOfPages;}
    public void setGenreOfBook(String genreOfBook){this.genreOfBook = genreOfBook;}

    public String toString(){
        return "Title of Book is "+getTitle()+" which having "+getNumberOfPages()+" pages. Author of book is "+getAuthor()+" and genre of this book is "+getGenreOfBook()+".";
    }

}
