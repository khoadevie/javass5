import java.util.Scanner;
import java.util.regex.Pattern;

public class KiemTraEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập email
        System.out.print("Nhap dia chi email: ");
        String email = sc.nextLine();

        // Loại bỏ khoảng trắng thừa
        email = email.trim();

        // Biểu thức chính quy kiểm tra email
        String regex = "^[A-Za-z0-9._]+@[A-Za-z0-9.]+\\.[A-Za-z]{2,6}$";

        // Kiểm tra hợp lệ
        if (Pattern.matches(regex, email)) {
            System.out.println("Email hop le");
        } else {
            System.out.println("Email khong hop le");
        }
    }
}
