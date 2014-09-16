package ex1;

import java.util.Scanner;

/**
 *
 * @author kosta
 * Document : Ex6_oper Created on : 2014. 9. 2, 오후 1:59:54
 */
public class Ex6_operator {
    public static void main(String[] args) {
        // Scanner 클래스를 사용해서 사용자로 부터 입력처리
        // Scanner sc 선언 하면서 생성
        // Scanner sc = new Scanner(System.in);
        // 정정 - 클래스를 사용하기 위해서는 Ctrl + space로 불러서 사용
        Scanner sc = new Scanner(System.in);
        
        // UI 글자를 입력하세요.
        System.out.println("메세지 입력 :");
        
        //사용자로 부터 문자열을 입력 받은 후  String msg에 저장하기
        //sc.nextLine()란 메서드가 호출이 되면 String으로 반환되기때문에
        //아래와 같이 같은 타입의 변수에 저장해서 사용될 수 있다.
        //메서드 분석) 입력받은 문자열을 ?루 단위로 읽어서 String으로 반환한다. 
        String msg = sc.nextLine(); //blocking 메서드
        
        System.out.println("메세지 입력2 :");
        String msg2 = sc.nextLine();
        
        System.out.println("=================================================");
        System.out.println("입력값1 :"+msg);
        System.out.println("입력값2 :"+msg2);
        System.out.println("msg/msg2 주소값을 비교 :"+(msg==msg2)); // false
        // String 클래스 : 문자열값을 가지는 객체
        System.out.println("msg/msg2 내용을 비교 :"+(msg.equals(msg2))); // true
        // 증명
        String svc1 = new String("MyTest");
        String svc2 = new String("MyTest");
        System.out.println("svc1/svc2 내용을 비교 :"+(svc1.equals(svc2))); //true

//        // 일반자료형 :  값 비교
//        int a = 10;
//        int b = 20;
//        System.out.println("a와b 비교 : "+(a==b));
//        // 참조자료형 : 주소값 비교
//        String str1 = new String("T");
//        String str2 = new String("T");
//        System.out.println("str1과str2 비교 : "+(str1==str2));
//        
//        String str3 = "T";
//        String str4 = "T";
//        System.out.println("str3과str4 비교 : "+(str3==str4));
//        
    }

}
