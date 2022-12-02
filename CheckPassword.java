public class CheckPassword {
    public static boolean longEnough(String password) {
        if(password.length() == 12){
            return true;
        }
        else{
            return false;
        }
    }
//
    public static boolean atLeastTwoDigits(String password) {
        int count = 0;
        char[] characters = password.toCharArray();
        for(char c: characters){
            if(Character.isDigit(c)){
                count += 1;
            }
        }

        if(count >= 2){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        if (args.length == 0){
            System.err.print("Usage: java CheckPassword <password>");
            System.exit(1);
        }

        else if (longEnough(args[0]) == true && atLeastTwoDigits(args[0]) == true){
            System.out.print("Password is valid");
        }
        else{
            System.out.print("Password is not valid");
            System.exit(1);

        }


    }
}
