import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm HTML: ");
        double HTMLPoint = sc.nextDouble();
        System.out.println("Nhập điểm CSS: ");
        double CSSPoint = sc.nextDouble();
        System.out.println("Nhập điểm JS: ");
        double JSPoint = sc.nextDouble();
        double averagePoint = (HTMLPoint + CSSPoint + JSPoint)/3;
        System.out.println("Điểm trung bình của bạn là: " +averagePoint);
        if (0<=averagePoint && averagePoint <5){
            System.out.println("Bạn xếp loại yếu");
        } else if (5<=averagePoint && averagePoint<7) {
            System.out.println("Bạn xếp loại trung bình");
        } else if (7<=averagePoint && averagePoint<8) {
            System.out.println("Bạn xếp loại khá");
        } else if (8<=averagePoint && averagePoint<9) {
            System.out.println("Bạn xép loại giỏi");
        }else {
            System.out.println("Bạn xếp loại xuất sắc");
        }
    }
}
