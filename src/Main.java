public class Main {
    public static void main(String[] args) {

        Author authorD = new Author("Джек", "Лондон", 5);
        Author authorG = new Author("Герберт", "Уэлс", 5);
        Author authorP = new Author("Петр", "Иванов", 1);

        Book bookD = new Book ("Джек Лондон. Морской волк.", 1900, 300, authorD);
        Book bookG = new Book ("Герберт Уэлс. Война миров.", 1901, 600, authorG);
        Book bookP = new Book ("Книжулечка", 2025, 50, authorP);

        System.out.println(bookD);
        System.out.println(bookG);
        System.out.println(bookP);
        String word = "Джек";
        System.out.println(String.format("Книга '%s' содержит автора %s - %s", bookD.title, word, (bookD.matches(word))? "Да": "Нет"));
        word = "Уэлс";
        System.out.println(String.format("Книга '%s' содержит автора %s - %s", bookD.title, word, (bookD.matches(word))? "Да": "Нет"));

        word = "Герберт";
        System.out.println(String.format("Книга '%s' содержит автора %s - %s", bookG.title, word, (bookG.matches(word))? "Да": "Нет"));
        word = "Иванов";
        System.out.println(String.format("Книга '%s' содержит автора %s - %s", bookG.title, word, (bookG.matches(word))? "Да": "Нет"));

        word = "Петр";
        System.out.println(String.format("Книга '%s' содержит автора %s - %s", bookP.title, word, (bookP.matches(word))? "Да": "Нет"));
        word = "Иванов";
        System.out.println(String.format("Книга '%s' содержит автора %s - %s", bookP.title, word, (bookP.matches(word))? "Да": "Нет"));
    }
}