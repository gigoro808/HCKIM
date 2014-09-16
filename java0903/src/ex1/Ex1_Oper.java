package ex1;

import java.util.Scanner;

/**
 *
 * @author kosta
 * Document : Ex1_Oper Created on : 2014. 9. 3, 오전 10:15:19
 */
public class Ex1_Oper {
    //비교연산자 - 변수나 상수값을 비교 할 때 쓰이는 연산자. 결과는 
    //항상 boolean (true/false)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("수1 :");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("수2 :");
        int b = Integer.parseInt(sc.nextLine());
        boolean c = a < b;//변수 a가 변수 b보다 작다.
        System.out.println("a = "+a+"  "+"b= "+b);
        System.out.println("a < b :"+c);
        c = a > b;//변수 a가 변수 b보다 크다.
        System.out.println("a > b :"+c);
        c = a >= b;//변수 a가 변수 b보다 크거나 같다.
        System.out.println("a >= b :"+c);
        c = a <= b;//변수 a가 변수 b보다 작거나 같다.
        System.out.println("a <= b :"+c);
        c = a == b;//변수 a와 변수 b가 서로 같다.
        System.out.println("a == b :"+c);
        c = a != b; //변수 a와 b가 서로 같지 않다.
        System.out.println("a != b :"+c);
        
    }

}
