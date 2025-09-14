import java.util.Scanner;

public class TinhToanHaiSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên thứ hai: ");
        int b = scanner.nextInt();


        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        int thuong = (b != 0) ? a / b : 0;
        int phanDu = (b != 0) ? a % b : 0;

       
        System.out.println("Tổng: " + tong);
        System.out.println("Hiệu: " + hieu);
        System.out.println("Tích: " + tich);
        if (b != 0) {
            System.out.println("Thương: " + thuong);
            System.out.println("Phần dư: " + phanDu);
        } else {
            System.out.println("Không thể chia cho 0.");
        }

        scanner.close();
    }
}
