import java.util.Scanner;

public class UCLN_BCNN {
    // Hàm tìm UCLN bằng thuật toán Euclid
    public static int timUCLN(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // Hàm tìm BCNN dựa vào UCLN
    public static int timBCNN(int a, int b) {
        return Math.abs(a * b) / timUCLN(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== CHƯƠNG TRÌNH TÌM UCLN VÀ BCNN =====");

        // Nhập dữ liệu
        System.out.print("Nhập số nguyên thứ nhất: ");
        int so1 = sc.nextInt();

        System.out.print("Nhập số nguyên thứ hai: ");
        int so2 = sc.nextInt();

        // Xử lý
        int ucln = timUCLN(so1, so2);
        int bcnn = timBCNN(so1, so2);

        // Xuất kết quả
        System.out.println("\n===== KẾT QUẢ =====");
        System.out.println("Số thứ nhất: " + so1);
        System.out.println("Số thứ hai: " + so2);
        System.out.println("Ước chung lớn nhất (UCLN): " + ucln);
        System.out.println("Bội chung nhỏ nhất (BCNN): " + bcnn);
        System.out.println("===============================");

        sc.close();
    }
}
