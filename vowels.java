public class vowels {
    public static void main(String[] args) {
        String input = "AABHBHB";
        String vowels = "aeiouAEIOU";

        System.out.println("Vowels in the string are:");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (vowels.indexOf(ch) != -1) { // Check if the character is a vowel
                System.out.print(ch + " ");
            }
        }
    }
}
