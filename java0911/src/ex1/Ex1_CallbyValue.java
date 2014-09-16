package ex1;

/**
 *
 * @author kosta Document : Ex1_CallbyValue Created on : 김현철 2014. 9. 11, 오전
 * 9:31:20
 */
public class Ex1_CallbyValue {

    public void test(int n) {
        n = n + 10;
        // n의 값을 call했을시 위 연산이 수행되어 n1: 20 
        System.out.println("n1: " + n);
    }

    public static void main(String[] args) {
        // // static이 아닌 메소드를 사용하기 위해서는 객체를 생성한 후 호출
        Ex1_CallbyValue a = new Ex1_CallbyValue();
        int n = 10; // 원본 지역변수 n값이 10으로 초기화
        a.test(n);
        //여기의 n은 test메서드 내에서만 유효한 지역변수로
        // 메서드의 실행이 종료되면 stack에서 소멸한다.
        //  n2 : 10
        System.out.println("n2: " + n);
    }
}
