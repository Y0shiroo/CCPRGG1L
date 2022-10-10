import java.util.Scanner;
public class App {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        studentNumber();
        Digits();
        length();
        UPPERCASE();
        vowel();
        own();
        letter();
        condition();
        strand();
        email();
        //ATM();
    }
        // ==============================================================================    
    // 1. Create a method and think of a formula to get the last 6 digits of your student number
        static void studentNumber() {
        System.out.println("1. Last six digits");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();
        int lastsixdigits = studentNumber%1000000;
        System.out.println("Last 6 digits of student number is: "+lastsixdigits);
        }
        // ==============================================================================
        // 2. Create a method that will:
        // print "ODD" if the last two digits of your student number is an odd number
        // print "EVEN" if the last two digits of your student number is an even number.
        static void Digits() {
        System.out.println("2. ODD or EVEN numbers");
        System.out.print("Enter the last two digits of your student number: ");
        int lastTwoDigits = scan.nextInt();
        if(lastTwoDigits % 2 == 0)
             System.out.println("EVEN");
        else
             System.out.println("ODD");
        }
        // ==============================================================================
        // 3. Create a method that will return the total character length of your
        // firstname and your surname.
        static void length() {
        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        int stringSize= firstName.length();
        System.out.println("The number of character for firstname is: " + stringSize);
        System.out.print("Enter your surname: ");
        String surName = scan.next();
        int Stringsize= surName.length();
        System.out.println("The number of character for surname is: " + Stringsize);
        }
        // ==============================================================================
        // 4. Create a method to that will return true if your firstname in BOTH UPPERCASE and lowercase are EQUAL.
        // Otherwise, return false.
        static void UPPERCASE() {
        System.out.println("4. Type your first name in LOWERCASE and UPPERCASE");
        System.out.print("Enter your first name in lowercase: ");
        String firstNameInLowerCase = scan.next();
        System.out.print("Enter your first name in UPPERCASE: ");
        String firstNameInUpperCase = scan.next();
        if (firstNameInLowerCase.equals("marc") && firstNameInUpperCase.equals("MARC"))
            System.out.println("true");
            else
            System.out.println("false ");
        }
        // ==============================================================================
        // 5. Create a method that will return true if your name starts with a vowel 'A','E','I','O','U'.
        // Otherwise, return false.
        static void vowel(){
        System.out.println("5. Vowel or Consonant");
        System.out.print("Enter the first character of your first name: ");
        char firstChar = scan.next().charAt(0);
        if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u'
        || firstChar == 'A' || firstChar == 'E' || firstChar == 'I' || firstChar == 'O' || firstChar == 'U')
             System.out.println(true);
             else 
             System.out.println(false);
        }
        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student number.
        static void own(){
        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        int StudentNumber = scan.nextInt();
        if (StudentNumber==2022104836)
        System.out.println("valid");
        else
        System.out.println("invalid");
        }
        // ==============================================================================
        // 7. Create a condition to check if your firstname is in UPPERCASE and your lastname is in lowercase.
        static void letter() {
        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        String firstName = scan.next();
        System.out.print("Enter your surname in lowercase: ");
        String surName = scan.next();
        if (firstName == firstName.toUpperCase() && surName == surName.toLowerCase())
        System.out.println("valid");
        else
        System.out.println("invalid");
    }
        // ==============================================================================
        // 8. Create a nested condition that will ask the specialization of the student is taking depending if the student is a BSIT or BSCS student.
        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.
        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.
        static void condition(){
            System.out.println("8. Nested conditions");
            System.out.print("Enter your enrolled course (BSIT or BSCS): ");
            String course = scan.next();
            // If BSIT
            switch (course){
                case "BSIT":
            System.out.print("Enter your specialization (MWA or MAA): ");
            String specialization1 = scan.next();
            switch (specialization1){
                case "MWA":
                System.out.print("you are taking BSIT-MWA ");
                break;
                case "MAA":
                System.out.println("You are taking BSIT-MAA ");
                break;
            }
            break;
            // If BSCS
            case "BSCS":
            System.out.print("Enter your specialization (DF or ML): ");
            String specialization2 = scan.next();
            switch (specialization2){
                case "ML":
                System.out.println("You are taking BSCS-ML");
                break;
                case "DF":
                System.out.println("You are taking BSCS-DF");
                break;
            }
        }
}
        // ==============================================================================
        // 9. Create a condition to check if the answer belongs to one of the possible answers.
        // STEM ICT ABM HUMSS HOME ECONOMICS ARTS AND DESIGN TVL MARITIME
        static void strand(){
        System.out.println("");
        System.out.println("9. Selection");
        System.out.println("STEM");
        System.out.println("ICT");
        System.out.println("HUMSS");
        System.out.println("HOME ECONOMICS");
        System.out.println("ARTS AND DESIGN");
        System.out.println("TVL MARITIME");
        System.out.print("Enter your SHS strand: ");
        String strand = scan.next();
        switch (strand) {
           case "STEM":
           System.out.println("valid");
           break;
           case "ICT":
           System.out.println("valid");
           break;
           case "HUMSS":
           System.out.println("valid");
           break;
           case "HOME ECONOMICS":
           System.out.println("valid");
           break;
           case "ARTS AND DESIGN":
           System.out.println("valid");
           break;
           case "TVL MARITIME":
           System.out.println("valid");
           break;
           default:
           System.out.println("invalid");
           break;
        }
    }
        // ==============================================================================
        // 10. Create a condition to check if your student email address contains your surname.
        static void email(){
        System.out.println("10. Validate student email address ");
        System.out.println("Enter your Email Address:");
        String email = scan.next();
        if (email.contains("cadiz")) {
        System.out.println("valid");
        } else {
        System.out.println("invalid");
        }
    }
}
