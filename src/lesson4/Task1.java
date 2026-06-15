package lesson4;

public class Task1 {
    static void main(String[] args) {
//      name to uppercase without using static method
        String name = "azamat";
        char[] chars = name.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 32);
            }
        }
        String result = new String(chars);

        System.out.println("Original name: " + name);
        System.out.println("Uppercased name: " + result);

    }
}



