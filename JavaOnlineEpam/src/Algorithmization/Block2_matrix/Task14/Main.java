package Algorithmization.Block2_matrix.Task14;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("log",true);
        logger.addHandler(fh);
        Matrix matrix = new Matrix();
        try {
            matrix.initialize(new int[4][5]);
            System.out.println("Original matrix:");
            matrix.print();
        } catch (MyException e) {
            logger.log(Level.INFO, e.getMessage());
        }
    }
}
