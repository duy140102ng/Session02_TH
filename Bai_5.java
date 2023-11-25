import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập cạnh thứ nhất: ");
        int canh1 = sc.nextInt();
        System.out.println("Mời bạn nhập cạnh thứ hai: ");
        int canh2 = sc.nextInt();
        System.out.println("Mời bạn nhập cạnh thứ ba: ");
        int canh3 = sc.nextInt();
        if (canh1 + canh2 > canh3 || canh1 + canh3 > canh2 || canh2 + canh3 > canh1){
            if (canh1 == canh2 && canh2 == canh3 && canh1 == canh3){
                if (canh1 == canh2 || canh1 == canh3 || canh2 == canh3){
                    if (canh1 * canh1 + canh2 * canh2 == canh3 * canh3 ||
                            canh1 * canh1 + canh3 * canh3 == canh2 * canh2 ||
                            canh3 * canh3 + canh2 * canh2 == canh1 * canh1){
                        if (canh1 * canh1 + canh2 * canh2 == canh3 * canh3 && canh1 == canh2||
                                canh1 * canh1 + canh3 * canh3 == canh2 * canh2 && canh1 == canh3||
                                canh3 * canh3 + canh2 * canh2 == canh1 * canh1 && canh2 == canh3){
                            System.out.println("Ba cạnh của tam giác là tam giác vuông cân");
                            return;
                        }
                        System.out.println("Ba cạnh của tam giác là tam giác vuông");
                        return;
                    }
                    System.out.println("Ba cạnh của tam giác là tam giác cân");
                    return;
                }
                System.out.println("Ba cạnh của tam giác là tam giác đều");
                return;
            }
            System.out.println("Ba cạnh của tam giác là tam giác thường");
            return;
        }else {
            System.out.println("Ba cạnh không phải là một tam giác");
            return;
        }
    }
}
