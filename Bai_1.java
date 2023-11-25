import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên: ");
        int number = sc.nextInt();
        if (number%2==0){
            System.out.println("Số nguyên bạn vừa nhập là số chẵn!");
        }else {
            System.out.println("Số nguyên bạn vừa nhập là số lẻ!");
        }
    }
}
