package classwork_11;

public class Book {
    // 1. Поля класса
    private String title;
    private String author;
    private int year;

    // 2. Приватное поле (статус доступности)
    private boolean isAvailable = true;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // 3. Метод borrow() — выдать книгу
    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Вы взяли книгу: " + title);
        } else {
            System.out.println("Ошибка: Книга '" + title + "' уже занята.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Книга '" + title + "' успешно возвращена.");
    }

    public String getInfo() {
        String status = isAvailable ? "Доступна" : "Выдана";
        return String.format("Книга: %s | Автор: %s | Год: %d | Статус: %s",
                title, author, year, status);
    }
}
