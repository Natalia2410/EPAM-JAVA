package Tasks6.Task1.BookModel;

import Tasks6.Task1.Main;
import Tasks6.Task1.PublicationException;
import Tasks6.Task1.PublicationFactory;
import Tasks6.Task1.PublicationType;
import Tasks6.Task1.Validator.ValidatorDataInFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Catalog {
    private ArrayList<Publication> publications;

    public ArrayList<Publication> getPublications() {
        return publications;
    }

    public void setPublications(ArrayList<Publication> publications) {
        this.publications = publications;
    }

    public ArrayList<Publication> createCatalog() throws IOException {
        PublicationFactory publicationFactory = new PublicationFactory();
        ArrayList<Publication> publications = new ArrayList<>();
        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("LogFileBooks");
        logger.addHandler(fh);
        BufferedReader reader = new BufferedReader(new FileReader("books"));
        String line;
        String[] words;
        Publication publication = null;
        int count = 1;
        while ((line = reader.readLine()) != null) {
            ValidatorDataInFile validator = new ValidatorDataInFile();
            try {
                validator.validate(line);
                words = line.split("\\|");
                if (publicationFactory.getPublicationType(words[1]).equals(PublicationType.book)) {
                    publication = publicationFactory.createPublication(publicationFactory.getPublicationType(words[1].toLowerCase()), words[3], Integer.parseInt(words[4]), words[5], Integer.parseInt(words[6]), words[0], words[2], Integer.parseInt(words[7]));
                    publications.add(publication);
                } else if (publicationFactory.getPublicationType(words[1]).equals(PublicationType.journal)) {
                    publication = publicationFactory.createPublication(publicationFactory.getPublicationType(words[1].toLowerCase()), words[2], Integer.parseInt(words[4]), words[3], Integer.parseInt(words[6]), words[0], Integer.parseInt(words[5]));
                    publications.add(publication);
                } else if (publicationFactory.getPublicationType(words[1]).equals(PublicationType.newspaper)) {
                    publication = publicationFactory.createPublication(publicationFactory.getPublicationType(words[1].toLowerCase()), words[2], Integer.parseInt(words[6]), words[5], Integer.parseInt(words[4]), words[0], Integer.parseInt(words[3]));
                    publications.add(publication);
                } else {
                    publication = publicationFactory.createPublication(publicationFactory.getPublicationType(words[1].toLowerCase()), words[2], Integer.parseInt(words[5]), words[4], Integer.parseInt(words[3]), words[0]);
                    publications.add(publication);
                }
            } catch (PublicationException e) {
                System.out.println(e.getMessage() + "in string " + count);
                logger.log(Level.WARNING, e.getMessage());
            }
            count++;
        }
        return publications;
    }

    public void printAll() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int k = 5;
        int j = 0;
        int page = 1;
        System.out.println("Еhe catalog has " + (publications.size() / k) + " pages");
        while (i < publications.size()) {
            System.out.println("Page № " + page);
            while (j < k) {
                System.out.println(publications.get(i));
                j++;
                if (i == publications.size() - 1) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == publications.size() - 1) {
                break;
            }
            System.out.println("Do you want to see the next page? Yes - 1, No - 2");
            String answear = reader.readLine();
            if (answear.equals("1")) {
                j = 0;
                page++;
            } else {
                break;
            }

        }
    }

//    public Flower getFlowerForClient(FlowerType type, Color color, int count) throws Exception {
//        Flower flower = null;
//        FlowerFactory flowerFactory = new FlowerFactory();
//        for (int i = 0; i < flowers.size(); i++) {
//            if (!type.equals(null)) {
//                if (!color.equals(null)) {
//                    if (count != 0) {
//                        if (flowers.get(i).getType().equals(type) && flowers.get(i).getColor().equals(color)) {
//                            if (flowers.get(i).getCount() >= count) {
//                                flower = flowerFactory.createFlower(flowers.get(i).getType(), flowers.get(i).getColor(), count, flowers.get(i).getPrice());
//                                flowers.get(i).setCount(flowers.get(i).getCount() - count);
//                                break;
//                            } else {
//                                System.out.println("There are " + flowers.get(i).getCount() + " flowers of this type in the store");
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        return flower;
//    }


//    public static void printForClient(ArrayList<Flower> list) {
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//    }
}
