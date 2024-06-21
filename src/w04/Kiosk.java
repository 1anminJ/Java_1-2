package w04;

import java.util.Scanner;

public class Kiosk {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        System.out.println("======메뉴판======");
        System.out.println("1. 엄마는 외계인 3000원");
        System.out.println("2. 민트초코 3000원");
        System.out.println("3. 누가바 1000원");
        System.out.println("4. 블랙소르베 3000원");
        System.out.println("5. 체리쥬빌레 3500원");
        System.out.println("================");
        System.out.println("0 입력 시 주문 종료 됩니다.");


        while(true) {
            System.out.println("메뉴와 갯수를 입력하시오.");
            int menu = scan.nextInt();
            if (menu == 0) {
                System.out.println("종료");
                break;		//while문 종료
            }
            int count = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("엄마는 외계인 "+count+"개 "+count*3000+"원");
                    sum += 3000 * count;
                    break;
                case 2:
                    System.out.println("민트초코 "+count+"개 "+count*3000+"원");
                    sum += 3000 * count;
                    break;
                case 3:
                    System.out.println("누가바 "+count+"개 "+count*1000+"원");
                    sum += 1000 * count;
                    break;
                case 4:
                    System.out.println("블랙소르베 "+count+"개 "+count*3000+"원");
                    sum += 3000 * count;
                    break;
                case 5:
                    System.out.println("체리쥬빌레 "+count+"개 "+count*3500+"원");
                    sum += 3500 * count;
                    break;
                default:
                    System.out.println("번호 다시 입력");

            }//switch

        }
        System.out.println("총 합계는 " +sum+ "원 입니다.");
        scan.close();
    }

}