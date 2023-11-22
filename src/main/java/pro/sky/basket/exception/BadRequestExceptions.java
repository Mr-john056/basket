package pro.sky.basket.exception;

public class BadRequestExceptions extends Throwable {
    public BadRequestExceptions(){
        super("Неверный запрос! Ошибка 400");
    }
}
