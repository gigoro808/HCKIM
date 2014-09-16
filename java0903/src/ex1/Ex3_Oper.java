package ex1;
/**
 *
 * @author kosta
 * Document : Ex3_Oper Created on : 2014. 9. 3, 오전 11:02:04
 */
public class Ex3_Oper {
    // 1씩 증가,감소하는 연산자, ++,--가 변수 앞에 있느냐, 뒤에 있느냐 
    // 가 중요한 연산자
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++); // 후치 10 이 출력되고 1이 증가 
        System.out.println(++a); // 전치 11에서 다시 1이 증가되어 12출력
    }

}
