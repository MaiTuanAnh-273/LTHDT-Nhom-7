import java.util.Scanner;

public class Bai1tuan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap mot so nguyen: ");
        int so = sc.nextInt();

        if (so > 0) {
            System.out.println(so + " la so duong.");
        } else if (so < 0) {
            System.out.println(so + " la so am.");
        } else {
            System.out.println("So ban nhap bang 0.");
        }

        sc.close();
    }
}

