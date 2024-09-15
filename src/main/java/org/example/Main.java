package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Лев Толстой", "tolstoy@mail.ru");
        Author author2 = new Author("Федор Достоевский", "dostoevsky@mail.ru");
        Author author3 = new Author("Антон Чехов", "chekhov@mail.ru");
        Author author4 = new Author("Александр Пушкин", "pushkin@mail.ru");
        Author author5 = new Author("Михаил Булгаков", "bulgakov@mail.ru");

        // Создаем книги
        Book book1 = new Book("Война и мир", new Author[] { author1 }, 500);
        Book book2 = new Book("Преступление и наказание", new Author[] { author2 }, 400);
        Book book3 = new Book("Чайка", new Author[] { author3 }, 300);
        Book book4 = new Book("Евгений Онегин", new Author[] { author4 }, 250);
        Book book5 = new Book("Мастер и Маргарита", new Author[] { author5 }, 450);

        Book[] books =  {book1, book2, book3, book4, book5};

        //book inf
        for(Book book : books){
            System.out.println(book);

        }
    }
}