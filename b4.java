import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

      
        System.out.print("Nhap so nguyen n: ");
        int n = sc.nextInt();

        // Tập ký tự hợp lệ
        String characters =
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "abcdefghijklmnopqrstuvwxyz" +
                "0123456789";

        
        StringBuilder result = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }


        System.out.println(result.toString());
    }
}
