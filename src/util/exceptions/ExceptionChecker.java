package util.exceptions;

public class ExceptionChecker {

    public static void intergerChecker(String num) throws NumberMissmatchException, NumberOverflowException {
        if(!num.matches("[0-9]+")){
            throw new NumberMissmatchException();
        }
        else if(num.length() >=9){
            throw new NumberOverflowException();
        }
    }
}
