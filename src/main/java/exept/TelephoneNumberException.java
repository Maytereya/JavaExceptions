package exept;

public class TelephoneNumberException extends Throwable {
    public TelephoneNumberException() {
        super("Неверный формат телефонного номера");
    }
}
