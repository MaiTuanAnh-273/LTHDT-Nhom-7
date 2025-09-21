import java.util.ArrayList;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Nhập số phần tử ban đầu: ");
        int n = sc.nextInt();
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Danh sách ban đầu: " + list);
        System.out.print("Nhập vị trí cần thêm: ");
        int addIndex = sc.nextInt();
        System.out.print("Nhập giá trị cần thêm: ");
        int valueAdd = sc.nextInt();
        if (addIndex >= 0 && addIndex <= list.size()) {
            list.add(addIndex, valueAdd);
            System.out.println("Danh sách sau khi thêm: " + list);
        } else {
            System.out.println("Vị trí thêm không hợp lệ!");
        }
        System.out.print("Nhập vị trí cần xóa: ");
        int removeIndex = sc.nextInt();
        if (removeIndex >= 0 && removeIndex < list.size()) {
            list.remove(removeIndex);
            System.out.println("Danh sách sau khi xóa: " + list);
        } else {
            System.out.println("Vị trí xóa không hợp lệ!");
        }
        sc.close();
    }
}
