package chapter7.String;

public class StringExample {

    public static void main(String[] args) {
        String fullName = "Poxos Poxosyan Poxosi";

        String[] fullNameArray = fullName.split(" ");

        if (fullNameArray.length == 3) {
            String name = fullNameArray[0];
            String surname = fullNameArray[1];
            String middleName = fullNameArray[2];

            System.out.println(name);
            System.out.println(surname);
            System.out.println(middleName);
        }

//        String name1 = "POXOS";
//        String nameLower = name.toLowerCase();
//        String nameUpper = name.toUpperCase();
//
//        System.out.println(nameLower);
//        System.out.println(nameUpper);
//
//        boolean ab = name.startsWith("Ab");
//        if (name.isEmpty()){
//            System.out.println("name is blank");
//        }
//
//        String replacedName = name.replace(" ", "-");
//        System.out.println(replacedName);


    }

}
