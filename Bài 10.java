import java.util.ArrayList;
import java.util.Scanner;

public class DanhSach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== CHƯƠNG TRÌNH QUẢN LÝ DANH SÁCH =====");

        // Khởi tạo danh sách rỗng
        ArrayList<Integer> danhSach = new ArrayList<>();

        // Nhập số phần tử ban đầu
        System.out.print("Nhập số phần tử ban đầu: ");
        int n = sc.nextInt();

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            int x = sc.nextInt();
            danhSach.add(x);
        }

        // In danh sách ban đầu
        System.out.println("\nDanh sách ban đầu: " + danhSach);

        // Thêm phần tử
        System.out.print("\nNhập giá trị cần thêm: ");
        int giaTriThem = sc.nextInt();
        System.out.print("Nhập vị trí cần thêm (0 -> " + danhSach.size() + "): ");
        int viTriThem = sc.nextInt();

        if (viTriThem >= 0 && viTriThem <= danhSach.size()) {
            danhSach.add(viTriThem, giaTriThem);
            System.out.println("✅ Đã thêm " + giaTriThem + " tại vị trí " + viTriThem);
        } else {
            System.out.println("❌ Vị trí thêm không hợp lệ!");
        }

        System.out.println("Danh sách sau khi thêm: " + danhSach);

        // Xóa phần tử
        System.out.print("\nNhập vị trí cần xóa (0 -> " + (danhSach.size() - 1) + "): ");
        int viTriXoa = sc.nextInt();

        if (viTriXoa >= 0 && viTriXoa < danhSach.size()) {
            int giaTriXoa = danhSach.remove(viTriXoa);
            System.out.println("✅ Đã xóa phần tử " + giaTriXoa + " tại vị trí " + viTriXoa);
        } else {
            System.out.println("❌ Vị trí xóa không hợp lệ!");
        }

        // In danh sách cuối cùng
        System.out.println("Danh sách cuối cùng: " + danhSach);

        sc.close();
    }
}
