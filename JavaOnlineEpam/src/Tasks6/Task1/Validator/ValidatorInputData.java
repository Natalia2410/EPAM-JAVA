package Tasks6.Task1.Validator;

import Tasks6.Task1.PublicationException;
import Tasks6.Task1.PublicationType;

public class ValidatorInputData {
    public void validateInputPublicationType(String type) throws PublicationException {
        PublicationType publicationType = null;
        switch (type.toLowerCase()) {
            case "book":
            case "newspaper":
            case "journal":
            case "atlasmap":
                break;
            default:
                throw new PublicationException("The data entered is not correct");
        }
    }
}
