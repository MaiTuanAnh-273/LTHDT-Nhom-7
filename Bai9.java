import java.util.ArrayList;
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tạo danh sách số nguyên
        ArrayList<Integer> ds = new ArrayList<>();

        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();

        // Nhập các phần tử
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            int x = sc.nextInt();
            ds.add(x); // thêm vào danh sách
        }

        // In danh sách
        System.out.println("Các phần tử trong danh sách là:");
        for (int so : ds) {
            System.out.print(so + " ");
        }

        sc.close();
    }
}
