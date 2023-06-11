public class IllegalStateException extends RuntimeException {
    public IllegalStateException() {
        super("Не хватает обязательных параметров. Нужно указать имя и фамилию");
    }
}
