package w03;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        System.out.println("이름을 입력하시오. ");		//두 번에 걸쳐서 입력
        Scanner scan = new Scanner(System.in);		//키보드 변수명 scan
        String name = scan.next();
        System.out.println("나이를 입력하시오. ");
        int age = scan.nextInt();
        System.out.println("이름 = "+name+", "+"나이 = "+age);
        //-----------------------------------------------------
        System.out.println("이름과 나이를 한 칸 띄어서 입력하시오. ");		//한 번에 입력
        name = scan.next();
        age = scan.nextInt();
        System.out.println("이름 = "+name+", "+"나이 = "+age);

        scan.close();
        //-----------------------------------------------------
        //이름 입력 시 띄어쓰기 불가 --> 에러남.
    }
}