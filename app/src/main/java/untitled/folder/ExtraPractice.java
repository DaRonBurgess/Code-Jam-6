package untitled.folder;

public class ExtraPractice {

    public String fizzbuzz(int i) {
        if(i % 3 == 0) {
            return"fizz";
        }
        return "";
    }

    public String buzzTest(int i) {
        if(i % 5 == 0) {
            return "buzz";
        }
        return "";
    }

    public String fizzBuzzTest(int i) {
        if(i % 3 == 0 && i % 5 == 0) {
            return "fizzbuzz";
        }
        return "";
    }

    public ValidationStatus passwordCharCount(String i) {
        return new ValidationStatus(true, "");
    //     String  new String 
    //     String pw = "password";
    //     return pw.length();
    // }
    }
    
}
