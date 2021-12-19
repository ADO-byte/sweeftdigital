import java.util.Scanner;

public class Main {
    public static String isPalindrome() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder nstr = new StringBuilder();
        char ch;
        for (int i = 0; i < text.length(); i++) {
            ch = text.charAt(i);
            nstr.insert(0, ch);
        }
        System.out.println(nstr);
        if (text.equals(nstr.toString())) {
            return "პალინდრომია";
        } else return "არ არის პალინდრომი";
    }

    public static void main(String[] args) {
            System.out.println("შეიტანეთ სიტყვა: ");
            System.out.println(isPalindrome());
    }
}
