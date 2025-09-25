public class Book {
    public String title;
    public int releaseYear;
    public int pages;
    public Author author;

    public Book (String title, int releaseYear, int pages, Author author){
        this.title = title;
        this.releaseYear = releaseYear;
        this.pages = pages;
        this.author = author;
    }

    public boolean isBig (){
        return (pages > 500);
    }

    public boolean matches(String word){
        return title.contains(word) || author.name.contains(word) || author.surname.contains(word);
    }

    public int estimatePrice(){
        return Math.max(pages * 3 * (int)Math.floor(Math.sqrt(author.rating)), 250);
    }

    public String toString() {
        return String.format("%s (г.в. %d; %d страниц; большая - %s;цена - %d) ",
                title,
                releaseYear,
                pages,
                (isBig())? "Да": "Нет",
                estimatePrice()
        );
    }
}
