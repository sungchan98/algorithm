import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] str = s.trim().split("\\s+");

        if (s.trim().isEmpty()) { 
            System.out.print(0);
        } else {
            System.out.print(str.length);
        }
    }
}