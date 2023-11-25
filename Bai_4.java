import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhấp số nguyên: ");
        int number = sc.nextInt();
        if (number%3==0 && number % 5==0){
            System.out.println("So ban nhập vừa chia hết cho 3 và 5");
        } else if (number%3==0) {
            System.out.println("So ban nhập chia hết cho 3");
        } else if (number%5==0) {
            System.out.println("Số bạn nhập chia hết cho 5");
        }else {
            System.out.println("Số bạn nhấp không chia hết cho 3 và 5");
        }
    }
}
