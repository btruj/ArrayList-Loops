String Methods
Review

Congratulations! 🙌

We have learned some of the string methods that come with the String class:

    length()
    concat()
    indexOf()
    charAt()
    equals() / equalsIgnoreCase()
    substring()
    toUpperCase() / toLowerCase()

public class StringExamples {
    public static void main(String[] args) {
        // Declare and initialize a String variable
        String example = "Hello, World!";

        // length(): returns the length of the string
        int length = example.length();
        System.out.println("Length: " + length);

        // concat(): concatenates the specified string to the end of this string
        String concatenated = example.concat(" Welcome!");
        System.out.println("Concatenated: " + concatenated);

        // indexOf(): returns the index of the first occurrence of the specified character
        int index = example.indexOf('W');
        System.out.println("Index of 'W': " + index);

        // charAt(): returns the character at the specified index
        char character = example.charAt(7);
        System.out.println("Character at index 7: " + character);

        // equals(): compares two strings for equality (case-sensitive)
        // equalsIgnoreCase(): compares two strings for equality (ignores case)
        String example2 = "HELLO, WORLD!";
        System.out.println("Equals: " + example.equals(example2));
        System.out.println("Equals Ignore Case: " + example.equalsIgnoreCase(example2));

        // substring(): extracts a portion of the string
        String sub = example.substring(7, 12);
        System.out.println("Substring: " + sub);

        // toUpperCase(): converts the string to uppercase
        // toLowerCase(): converts the string to lowercase
        System.out.println("Uppercase: " + example.toUpperCase());
        System.out.println("Lowercase: " + example.toLowerCase());
    }
}
