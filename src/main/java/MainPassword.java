import java.util.Scanner;

public class MainPassword {
    public static void main(String[] args) {
       /* String forPrintout = "gib ein Passwort ein";
        printText(forPrintout);
        String userInput = readUserInput();
        int passwordLength = getLength(userInput);


        */






    }

    public static boolean validatePassword(String userInput){
        //TODO
        return true;
    }

    public static boolean clearWhenPasswordIsLongEnough(int passwordLength, int minimumPasswordLength){
        if (passwordLength > minimumPasswordLength){
            return true;
        } else return false;
    }

    public static boolean clearWhenNumberIsContained(boolean containsNumber){
        if (containsNumber){
            return true;
        } else return false;

    }

    public static boolean clearWhenUppercaseIsContained(boolean containsUppercase){
        //TODO
        return true;
    }

    public static boolean clearWhenLowercaseIsContained(boolean containsLowercase) {
        //TODO
        return true;
    }

    public static boolean clearWhenNotOnBlacklist(boolean notOnBlacklist) {
        //TODO
        return true;
    }

    public static void printText (String textForPrinting){
        System.out.println(textForPrinting);
    }

    public static String readUserInput(){
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static int getLength(String userInput){
        return (userInput.length());
    }

    public static boolean stringHasNumber(String userInput){
        if (userInput.matches(".*\\d.*")) {
            return true;
        } else return false;
    }

    public static boolean stringHasUppercase(String userInput){
        //TODO
        return true;
    }

    public static boolean stringHasLowercase(String userInput){
        //TODO
        return true;
    }

    public static boolean isOnBlacklist(String userInput){
        //TODO
        return true;
    }











}
