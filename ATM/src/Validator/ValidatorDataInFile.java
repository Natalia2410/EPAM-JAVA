package Validator;

public class ValidatorDataInFile {
    public void validateCardNumber(String cardNumber) throws CardException {
        if(!cardNumber.matches("\\d{4}-\\d{4}-\\d{4}-\\d{4}")){
            throw new CardException("not a valid card number ");
        }
    }

    public void validatePasswort(String password) throws CardException {
        if(!password.matches("\\d{4}")){
            throw new CardException("not a valid password ");
        }
    }

    public void validateBalance(String balance)throws CardException{
        if(!balance.matches("\\d+\\.\\d+")){
            throw new CardException("not a valid balance ");
        }
    }

    public void validateBalanceATM(String balance)throws CardException{
        if(!balance.matches("\\d+\\.\\d+")){
            throw new CardException("not a valid balance ATM ");
        }
    }
}
