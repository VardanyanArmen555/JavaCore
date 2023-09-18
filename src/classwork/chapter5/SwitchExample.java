package classwork.chapter5;

public class SwitchExample {
    public static void main(String[] args) {
        String lang = "ARM";

        switch (lang) {
            case "ARM":
                System.out.println("Բարև");
                break;
            case "RU":
                System.out.println("Привет");
                break;
            case "ENG":
                System.out.println("Hello");
                break;
            default:
                System.out.println("language is not supported!");


        }
        for (int i = 0; i < 6; i++)
            switch (i) {
                case 0:
                    System.out.println("i is zero");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is two");
                    break;
                case 3:
                    System.out.println("i is three");
                    break;
                default:
                    System.out.println("i is greather than 3.");

            }

        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i is less than 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i is less than 10");
                    break;
                default:
                    System.out.println("i is 10 or more");
            }
        }

        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "autumn";
                break;
            default:
                season = "bogus month";
        }
        System.out.println("april is in the " + season + ".");
    }
}
