package  java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int phanTuMax = a[0];
        int soLanMax = 1;

        for (int i = 0; i < n; i++) {
            int dem = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[j] == a[i]) {
                    dem++;
                }
            }
            if (dem > soLanMax) {
                soLanMax = dem;
                phanTuMax = a[i];
            }
        }

        System.out.println("Phan tu xuat hien nhieu nhat la: " 
                           + phanTuMax + " voi so lan: " + soLanMax);

        sc.close();
    }
}
