import java.util.Scanner;

public class bai9tuan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu cua danh sach: ");
        int n = sc.nextInt();
        int[] ds = new int[n];

        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            ds[i] = sc.nextInt();
        }

        System.out.print("Danh sach cac so nguyen la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ds[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

