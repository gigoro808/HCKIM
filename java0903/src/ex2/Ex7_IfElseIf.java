package ex2;

import java.util.Scanner;

/**
 *
 * @author kosta
 * Document : Ex7_IfElse Created on : 2014. 9. 3, 오후 1:51:09
 */
public class Ex7_IfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("좋아하는 색상 입력 (red,blue,green...):");
        String msg = sc.nextLine();
        //red
        //사용자가 만약에 Red,RED : 대소문자 구분없이 String클래스의 
        // 문자열의 값을 비교 해준다.
        if(msg.equalsIgnoreCase("red")) {
            System.out.println("빨간색 이군요.");
        }else if (msg.equalsIgnoreCase("blue")) {
            System.out.println("파란색입니다.");
        }else if (msg.equalsIgnoreCase("green")) {
            System.out.println("초록색입니다.");
        }else{
            System.out.println("모르겠습니다.");
        }
    }

}
