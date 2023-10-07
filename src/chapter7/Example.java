package chapter7;

public class Example {

    public static void main(String[] args) {
        if (args.length >= 1){
            String language = args[0];
            switch (language){
                case "HY":
                    System.out.println("բարև");
                    break;
                case "RU":
                    System.out.println("привет");
                    break;
                case "ENG":
                    System.out.println("Hello");
                    break;
                default:
                    System.out.println("Language does not support");

            }
        }else {
            System.out.println("Language argument is required");
        }
    }

}
