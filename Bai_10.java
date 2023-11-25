import java.util.Scanner;

public class Bai_10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập lương cơ bản của bạn: ");
        int basicWage = sc.nextInt();
        System.out.println("Nhập số ngày công của bạn: ");
        int day = sc.nextInt();
        final int WORKDAY = 26;
        int wage = basicWage * (day/WORKDAY);
        if (day > WORKDAY){
            int extraDay = day - WORKDAY;
            int extraWage = (wage/extraDay *150/100) + wage;
            System.out.println("Lương " +day+ " ngày của bạn là: " +extraWage);
        }else {
            System.out.println("Lương " +day+ " ngày của bạn là: " +wage);
        }
    }
}
