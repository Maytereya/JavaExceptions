package exept;

public class InsufficientDataExeption extends Throwable {
    public InsufficientDataExeption(int length) {
        super("Данные введены не полностью, обнаружено " + length + " слов вместо 6");
    }
}
