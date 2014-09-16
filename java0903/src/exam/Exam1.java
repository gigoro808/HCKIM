package exam;

import java.util.Scanner;

/**
 *
 * @author kosta
 * Document : Exam1 Created on : 2014. 9. 3, 오전 11:35:44
 */
public class Exam1 {
    public static void main(String[] args) {
        // Scanner로 부터 수를 입력받은 후 
        // 그 수가 홀수인지 짝수인지를 출력하세요.
        // ex) 수 입력 : 1 <Enter>
        // 입력한 수 [1]은 홀수 입니다.
        // [도구] : Scanner, if else, 연산
        Scanner sc = new Scanner(System.in);
        System.out.print("수 입력 : ");   
        // 사용자로부터 수를 받기 위한 변수 선언과 메서드 호출
        int a = Integer.parseInt(sc.nextLine());
        String msg="";
        if (a%2 == 0) {
            msg ="짝수";
            // System.out.println("입력한 수 ["+a+"]은 짝수 입니다.");
        } else {
            msg ="홀수";
           // System.out.println("입력한 수 ["+a+"]은 홀수 입니다."); 
        }
        System.out.println("입력한 수 ["+a+"]은 "+msg+"입니다.");
    }
    

}
