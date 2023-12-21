package exept;

public class Notifier {
    public Notifier() {
    }

    public void notifyOnStart() {
        System.out.println("Введите данные: Ф, И, О, Дата рождения (12.10.93), номер телефона (89033011017), пол (f или m)");
    }

    public void notifyOnFinish() {
        System.out.println("Запись успешно сделана");
    }
}
