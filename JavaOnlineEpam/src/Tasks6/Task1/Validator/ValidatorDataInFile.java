package Tasks6.Task1.Validator;

import ProgrammingWithClasses.Block2.Task5.VoucherException;
import Tasks6.Task1.PublicationException;

public class ValidatorDataInFile {
    public void validate(String line) throws PublicationException {
        int count = 1;
        String[] words = line.split("\\|");

        if (words[1].equalsIgnoreCase("book")) {
            String kindOfBook = words[0].toLowerCase();
            switch (kindOfBook) {
                case "electronic":
                case "paper":
                    break;
                default:
                    throw new PublicationException("Wrong data in the file! Wrong kindOfBook");
            }
            String author = words[2];
            if (author.matches("\\s+")) {
                throw new PublicationException("Wrong data in the file! Wrong author");
            }
            String title = words[3];
            if (title.matches("\\s+")) {
                throw new PublicationException("Wrong data in the file!");
            }
            String pages = words[4];
            if (!pages.matches("[+]?\\d+")) {
                throw new PublicationException("Wrong data in the file! Wrong pages");
            }
            String category = words[5].toLowerCase();
            switch (category) {
                case "novel":
                case "shortstory":
                case "play":
                case "story":
                    break;
                default:
                    throw new PublicationException("Wrong data in the file! Wrong category");
            }
            String year = words[6];
            if (!year.matches("[+]?\\d+")) {
                throw new PublicationException("Wrong data in the file! Wrong year");
            }
            String copies = words[7];
            if (!copies.matches("[+]?\\d+")) {
                throw new PublicationException("Wrong data in the file! Wrong copies");
            }
        }

        if (words[1].equalsIgnoreCase("atlasmap")) {
            String kindOfBook = words[0].toLowerCase();
            switch (kindOfBook) {
                case "electronic":
                case "paper":
                    break;
                default:
                    throw new PublicationException("Wrong data in the file! Wrong kindOfBook");
            }

            String title = words[2];
            if (title.matches("\\s+")) {
                throw new PublicationException("Wrong data in the file! Wrong title");
            }
            String pages = words[5];
            if (!pages.matches("[+]?\\d+")) {
                throw new PublicationException("Wrong data in the file! Wrong pages");
            }
            String category = words[4].toUpperCase();
            switch (category) {
                case "HISTORY":
                case "POLITICAL":
                case "TOURISTS":
                case "EARTH":
                case "ECOLOGIC":
                case "SPACE":
                    break;
                default:
                    throw new PublicationException("Wrong data in the file! Wrong category");
            }
            String year = words[3];
            if (!year.matches("[+]?\\d+")) {
                throw new PublicationException("Wrong data in the file! Wrong year");
            }
        }


        if (words[1].equalsIgnoreCase("journal")) {
            String kindOfBook = words[0].toLowerCase();
            switch (kindOfBook) {
                case "electronic":
                case "paper":
                    break;
                default:
                    throw new PublicationException("Wrong data in the file! Wrong kindOfBook");
            }

            String title = words[2];
            if (title.matches("\\s+")) {
                throw new PublicationException("Wrong data in the file! Wrong title");
            }

            String pages = words[4];
            if (!pages.matches("[+]?\\d+")) {
                throw new PublicationException("Wrong data in the file! Wrong pages");
            }

            String category = words[3].toUpperCase();
            switch (category) {
                case "CHILDREN":
                case "HOBBIES":
                case "ADULT":
                case "WOMEN":
                case "HOME":
                case "MEN":
                case "AMATEUR":
                case "HISTORY":
                    break;
                default:
                    throw new PublicationException("Wrong data in the file! Wrong category");
            }
            String year = words[6];
            if (!year.matches("[+]?\\d+")) {
                throw new PublicationException("Wrong data in the file! Wrong year");
            }
            String number = words[5];
            if (!number.matches("[+]?\\d+")) {
                throw new PublicationException("Wrong data in the file! Wrong number");
            }
        }

        if (words[1].equalsIgnoreCase("newspaper")) {
            String kindOfBook = words[0].toLowerCase();
            switch (kindOfBook) {
                case "electronic":
                case "paper":
                    break;
                default:
                    throw new PublicationException("Wrong data in the file! Wrong kindOfBook");
            }

            String title = words[2];
            if (title.matches("\\s+")) {
                throw new PublicationException("Wrong data in the file!Wrong title");
            }

            String pages = words[6];
            if (!pages.matches("[+]?\\d+")) {
                throw new PublicationException("Wrong data in the file! Wrong pages");
            }

            String category = words[5].toUpperCase();
            switch (category) {
                case "NEWS":
                case "POLITICAL":
                    break;
                default:
                    throw new PublicationException("Wrong data in the file! Wrong category");
            }
            String year = words[4];
            if (!year.matches("[+]?\\d+")) {
                throw new PublicationException("Wrong data in the file! Wrong year");
            }
            String number = words[3];
            if (!number.matches("[+]?\\d+")) {
                throw new PublicationException("Wrong data in the file! Wrong number");
            }
        }
    }
}


