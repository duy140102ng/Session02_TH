import java.util.Scanner;

public class Bai_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày: ");
        int day = sc.nextInt();
        System.out.println("Nhập tháng: ");
        int month = sc.nextInt();
        System.out.println("Nhập năm: ");
        int year = sc.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (0 < day && day <= 31) {
                    System.out.println(+day + "/" + month + "/" + year);
                } else {
                    System.out.println("Bạn nhập sai ngày!");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (0 < day && day <= 30) {
                    System.out.println(+day + "/" + month + "/" + year);
                } else {
                    System.out.println("Bạn nhập sai ngày!");
                }
                break;
            case 2:
                if (year % 4 == 0 && year != 100 && 0 < day && day <= 29) {
                    System.out.println(+day + "/" + month + "/" + year);
                } else if (year % 4 !=0 && 0 <day && day <=28) {
                    System.out.println(+day + "/" + month + "/" + year);
                } else {
                    System.out.println("Bạn nhập sai ngày!");
                }
                break;
        }
    }
}
