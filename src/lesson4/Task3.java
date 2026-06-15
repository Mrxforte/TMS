package lesson4;

public class Task3 {
    static void main(String[] args) {
        String str1 = "Java ";
        String str2 = "is ";
        String str3 = "fun  ";
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder();
        stringBuilder.append(str1);
        stringBuilder.append(str2);
        stringBuilder.append(str3);
        System.out.println(stringBuilder);
    }
}
