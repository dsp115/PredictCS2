public class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }
}

//Throwing the exception
throw new MyException("The message");