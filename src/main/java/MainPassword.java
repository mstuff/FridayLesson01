import java.util.Scanner;

public class MainPassword {
    public static void main(String[] args) {

        boolean passwordNotValid = true;

        while (passwordNotValid) {

            String userPromptPassword = "gib ein neues Passwort ein";
            System.out.println(userPromptPassword);
            String userInputPassword = readUserInput();

            int actualPasswordLength = getLength(userInputPassword);
            int allowedPasswordLength = 6;

            boolean passwordIsTooShort = checkIfPasswordIsTooShort(actualPasswordLength, allowedPasswordLength);
            boolean numberIsMissing = checkIfNumberIsMissing(userInputPassword);


            if (passwordIsTooShort) {
                System.out.println("Das Passwort sollte mindestens " + allowedPasswordLength + " Zeichen lang sein.");
            } else if (numberIsMissing) {
                System.out.println("Das Passwort sollte mindestens eine Ziffer enthalten.");
            } else {
                System.out.println("Das Passwort ist gültig.");
                passwordNotValid = false;
            }
        }



    }





    public static boolean checkIfPasswordIsTooShort (int passwordLength, int minimumPasswordLength){
        if (passwordLength < minimumPasswordLength){
            return true;
        } else return false;
    }

    public static boolean checkIfNumberIsMissing(String userInput){
        if (userInput.matches(".*\\d.*")) {
            return false;
        } else return true;
    }


    public static boolean trueWhenUppercaseIsContained(boolean containsUppercase){
        //TODO
        return true;
    }

    public static boolean trueWhenLowercaseIsContained(boolean containsLowercase) {
        //TODO
        return true;
    }

    public static boolean trueWhenNotOnBlacklist(boolean notOnBlacklist) {
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
