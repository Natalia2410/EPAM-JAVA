import Validator.CardException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("log");
        logger.addHandler(fh);
        User user = new User();
        String answer = "";
        int sum = 0;
        try {
            user.setCard(user.userAuthenticate());
            while (true) {
                System.out.println("to check the balance - 1, to withdraw money - 2, deposit account - 3, to return the card - 4");
                answer = reader.readLine();
                if (answer.equals("1")) {
                    System.out.println("Balance " + user.checkBalance());
                    System.out.println("continue? 1 - Yes, 2 - No");
                    answer = reader.readLine();
                    if (!answer.equals("1")) {
                        break;
                    }
                } else if (answer.equals("2")) {
                    System.out.println("Enter the amount");
                    sum = Integer.parseInt(reader.readLine());
                    user.withdrawMoney(sum);
                    System.out.println("continue? 1 - Yes, 2 - No");
                    answer = reader.readLine();
                    if (!answer.equals("1")) {
                        break;
                    }
                } else if (answer.equals("3")) {
                    System.out.println("Enter the amount");
                    sum = Integer.parseInt(reader.readLine());
                    user.depositAccount(sum);
                } else if (answer.equals("4")) {
                    break;
                } else {
                    System.out.println("choose again");
                }
            }
        } catch (CardException e) {
            System.out.println(e.getMessage());
            logger.log(Level.WARNING, e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("no data entered");
            logger.log(Level.WARNING, e.getMessage());
        }
    }
}

