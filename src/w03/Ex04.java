package w03;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        int a = 3, b = 5;

        System.out.println("두 수의 차는 "+((a > b) ? (a - b) : (b - a)));
        // 결과 :  두 수의 차는 2

        //--------두 수를 입력받아 차를 출력하도록 위의 코드 수정------------------
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 개의 정수를 입력하세요.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("두 수의 차는 " +((a > b) ? (a-b) : (b-a)));

        scanner.close();
    }
}