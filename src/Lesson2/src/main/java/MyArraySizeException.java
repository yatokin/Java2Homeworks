public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(String message){
        super("Некорректные данные" + message);
    }
}
