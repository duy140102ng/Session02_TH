import java.util.Scanner;

public class Bai_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm: ");
        int year = sc.nextInt();
        System.out.println("Nhập tháng: ");
        int month = sc.nextInt();
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Tháng " + month+ " có 31 ngày");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Tháng " + month+ " có 30 ngày");
                break;
            case 2:
                if (year%4==0 &&year!=100){
                    System.out.println("Tháng " + month+ " có 29 ngày");
                }else {
                    System.out.println("Tháng " + month+ " có 28 ngày");
                }
                break;
        }
    }
}
