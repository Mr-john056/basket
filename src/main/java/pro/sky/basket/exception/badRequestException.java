package pro.sky.basket.exception;

public class badRequestException extends Throwable {
    public badRequestException(){
        super("Неверный запрос! Ошибка 400");
    }
}
