import java.util.Scanner;

public class MayTinhCoBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== CHƯƠNG TRÌNH MÁY TÍNH CƠ BẢN =====");

        // Nhập dữ liệu
        System.out.print("Nhập số thứ nhất: ");
        double so1 = sc.nextDouble();

        System.out.print("Nhập số thứ hai: ");
        double so2 = sc.nextDouble();

        System.out.print("Chọn phép tính (+, -, *, /): ");
        char phepTinh = sc.next().charAt(0);

        // Xử lý
        double ketQua = 0;
        boolean hopLe = true;

        switch (phepTinh) {
            case '+':
                ketQua = so1 + so2;
                break;
            case '-':
                ketQua = so1 - so2;
                break;
            case '*':
                ketQua = so1 * so2;
                break;
            case '/':
                if (so2 != 0) {
                    ketQua = so1 / so2;
                } else {
                    System.out.println("Lỗi: Không thể chia cho 0!");
                    hopLe = false;
                }
                break;
            default:
                System.out.println("Phép tính không hợp lệ!");
                hopLe = false;
        }

        // Xuất kết quả
        if (hopLe) {
            System.out.println("\n===== KẾT QUẢ =====");
            System.out.printf("%f %c %f = %.2f%n", so1, phepTinh, so2, ketQua);
        }

        sc.close();
    }
}
