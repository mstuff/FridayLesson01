import java.util.Scanner;

public class MainPassword {
    public static void main(String[] args) {
        boolean validPassword = setPassword();
        System.out.println("was able to set a valid password: " + validPassword);
    }

    public static boolean setPassword(){
        boolean passwordIsSet = false;
        boolean passwordNotValid = true;

        while (passwordNotValid) {

            String userPromptPassword = "Please enter a new password: ";
            String userPromptToContinue = "Want to try again? [y / n]";
            String userInputPassword = returnStringFromUserPrompt(userPromptPassword);

            int actualPasswordLength = getLength(userInputPassword);
            int allowedPasswordLength = 6;

            boolean passwordIsTooShort = checkIfPasswordIsTooShort(actualPasswordLength, allowedPasswordLength);
            boolean numberIsMissing = checkIfNumberIsMissing(userInputPassword);
            boolean uppercaseIsMissing = checkIfUppercaseIsMissing(userInputPassword);
            boolean lowercaseIsMissing = checkIfLowercaseIsMissing(userInputPassword);

            if (passwordIsTooShort) {
                System.out.println("Your password should have a length of" +
                        " at least " + allowedPasswordLength + " characters.");
                passwordNotValid = continueWhenUserEntersY(userPromptToContinue);
            } else if (numberIsMissing) {
                System.out.println("Your password should contain at least one numeral.");
                passwordNotValid =continueWhenUserEntersY(userPromptToContinue);
            } else if (uppercaseIsMissing) {
                System.out.println("Your password should contain at least one uppercase letter.");
                passwordNotValid =continueWhenUserEntersY(userPromptToContinue);
            } else if (lowercaseIsMissing) {
                System.out.println("Your password should contain at least one lowercase letter.");
                passwordNotValid =continueWhenUserEntersY(userPromptToContinue);

            } else {
                System.out.println("The password is valid.");
                passwordIsSet = true;
                passwordNotValid = false;
            }
        }
        return passwordIsSet;

    }

    public static boolean continueWhenUserEntersY(String userPrompt){
        String userInput = returnStringFromUserPrompt(userPrompt);
        if (userInput.equals("y")){
            return true;
        } else {
            System.out.println("could not set a valid password!");
            return false;
        }
    }

    public static boolean checkIfPasswordIsTooShort (int passwordLength, int minimumPasswordLength){
        if (passwordLength < minimumPasswordLength){
            return true;
        } else return false;
    }

    public static boolean checkIfNumberIsMissing(String userInput){
        if (userInput.matches(".*[0-9].*")) {
            return false;
        } else return true;
    }

    public static boolean checkIfUppercaseIsMissing(String userInput){
        if (userInput.matches(".*[A-Z].*")) {
            return false;
        } else return true;
    }

    public static boolean checkIfLowercaseIsMissing(String userInput){
        if (userInput.matches(".*[a-z].*")) {
            return false;
        } else return true;
    }

    public static boolean isOnBlacklist(String userInput){
        //TODO
        return true;
    }

    public static String readUserInput(){
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static String returnStringFromUserPrompt(String userPrompt){
        System.out.println(userPrompt);
        return readUserInput();
    }

    public static int getLength(String userInput){
        return (userInput.length());
    }

}
