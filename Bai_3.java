import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số chia: ");
        int number1 = Integer.parseInt((sc.nextLine()));
        System.out.println("Nhập số bị chia: ");
        int number2 = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào phép tính: ");
        char calculation = sc.nextLine().charAt(0);
        switch (calculation){
            case '+':
                System.out.printf("%d + %d = "+(number1+number2) , number1, number2);
                break;
            case'-':
                System.out.printf("%d - %d = "+(number1-number2) , number1, number2);
                break;
            case '*':
                System.out.printf("%d * %d = "+(number1*number2) , number1, number2);
                break;
            default:
                if (number2 == 0){
                    System.out.println("Bạn nhập sos bị chia phải khác 0");
                }else {
                    System.out.printf("%d / %d = "+(number1/number2) , number1, number2);
                }
        }
    }
}
