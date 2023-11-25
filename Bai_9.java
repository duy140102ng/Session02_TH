import java.util.Scanner;

public class Bai_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int number1 = sc.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int number2 = sc.nextInt();
        System.out.println("Nhập số thứ ba: ");
        int number3 = sc.nextInt();
        System.out.println("Nhập số thứ tư: ");
        int number4 = sc.nextInt();
        if (number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        if (number2 < number3){
            int temp = number2;
            number2 = number3;
            number3 = temp;
        }
        if (number3 < number4){
            int temp = number3;
            number3 = number4;
            number4 = temp;
        }
        if (number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        if (number2 < number3){
            int temp = number2;
            number2 = number3;
            number3 = temp;
        }
        if (number1 < number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.println("Thứ tự sắp xếp giảm dần như sau: " + number1 + number2 + number3 + number4);
    }
}
