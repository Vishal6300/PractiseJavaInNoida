public class recursiveFunction {
    public static void main(String[] args) {
        // Question:
        // 1. Write a recursive function to compute the count of vowels and consonants
        // in a string

        String str = "Priyanshu";
        String str1 = str.toLowerCase();
        int vowelCount = 0;
        int consonantsCount = 0;
        // vowelAndConsoCount(str, n, vowelCount, consonantsCount);

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' ||
                    str1.charAt(i) == 'o' || str1.charAt(i) == 'u') {
                vowelCount++;
            } else {
                consonantsCount++;
            }
        }
        System.out.println("The vowel count in the string is " + vowelCount);
        System.out.println("The consonant count in the string is " + consonantsCount);

    }

    // public static void vowelAndConsoCount(String str, int n, int vowelCount, int
    // consonantsCount) {
    // if (n == 0 || n == 1) {
    // return;
    // } else {
    // if (str.charAt(n) == 'a' || str.charAt(n) == 'e' || str.charAt(n) == 'i' ||
    // str.charAt(n) == 'o'
    // || str.charAt(n) == 'u') {
    // vowelCount++;
    // } else {
    // consonantsCount++;
    // }
    // vowelAndConsoCount(str, n - 1, vowelCount, consonantsCount);
    // }
    // }
}
