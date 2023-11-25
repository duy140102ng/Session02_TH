import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chỉ số điện cũ: ");
        int dienCu = sc.nextInt();
        System.out.println("Nhập chỉ số điện mới: ");
        int dienMoi = sc.nextInt();
        int soDien = dienMoi - dienCu;
        int tienDien = 0;
        if (0<=soDien && soDien <50){
            tienDien = soDien * 10000;
        } else if (50 <=soDien && soDien <100) {
            tienDien = 50 * 10000 + (soDien-50)* 15000;
        } else if (100 <=soDien && soDien <150) {
            tienDien = 50 *10000 + 50* 15000 + (soDien - 100)*20000;
        } else if (150<=soDien && soDien<200) {
            tienDien = 50 * 10000 + 50 * 15000 + 50 * 20000 + (soDien - 150) * 25000;
        }else {
            tienDien = 50 * 10000 + 50 * 15000 + 50 * 20000 + 50 * 25000 + (soDien - 200) * 30000;
        }
        System.out.println("Bạn hết số tiền điện là: " +tienDien);
    }
}
