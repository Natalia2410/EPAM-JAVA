package Validator;


public class ValidatorInputData {
    public void validateInputData(String cardNumber) throws CardException {
        if(!cardNumber.matches("\\d{4}-\\d{4}-\\d{4}-\\d{4}")){
                throw new CardException("not a valid card number");
        }
    }
}
