package Lecture2;

public class StringBuilderExample {
    public static void main(String[] args) {
        String line = "I am a Happy person!";
        StringBuilder sb = new StringBuilder(line);
        System.out.println(sb);
        sb.append(" from India");
        System.out.println(sb);

        System.out.println(toUpperCase("my name is Rishi"));

        System.out.println(toUpperCaseOpt("Hi there I am Rishi and I will use StringBuilder Here."));

        System.out.println(removeVowels("I am here to remove vowels"));

        System.out.println(removeVowelsOpt("data"));

    }
    //Resource Intensive method
    public static  String toUpperCase(String input){
        String result = "";
        for (int i = 0; i <input.length() ; i++) {
            char ch = input.charAt(i);
            if(ch>='a' && ch<='z'){
                ch =(char) ('A' + (ch -'a'));
            }
            result = result + ch;
        }
        return result;
    }

    //optimal method
    public static String toUpperCaseOpt(String input){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((ch>='a') && (ch<='z')){
                ch = (char)('A' + (ch - 'a'));
            }
            result.append(ch);
        }
        return result.toString();
    }
    //Remove all the vowels from the sting
    public static String removeVowels(String input){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length() ; i++) {
            char ch = input.charAt(i);
            if ((ch != 'a') && (ch != 'e') && (ch != 'i') && (ch != 'o') && (ch != 'u') && (ch != 'A') && (ch != 'E') && (ch != 'I') && (ch != 'O') && (ch != 'U')) {
                result.append(ch);
            }
        }
        return result.toString();
    }
    //optimized method
    public static String removeVowelsOpt(String input){
        StringBuilder result  = new StringBuilder();
        String vowels = "AaEeIiOoUu";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!vowels.contains(""+ch)){
                result.append(ch);
            }
        }
        return result.toString();
    }
}
