package ex2;
/**
 *
 * @author kosta
 * Document : ex8_For Created on : 2014. 9. 3, 오후 2:10:25
 */
public class Ex8_For {
    public static void main(String[] args) {
        loopFor();
    }

    private static void loopFor() {
        // 초기식, 초기화 등 => 일생동안 딱 한번의 의미
        // for(초기식; 조건식; 증감식){
        // 실행문;
        //}
        for(int i=0; i<10; i++){
            System.out.println(i+"");
    }
        // System.out.println(i); i는 지역변수 for문에서 초기화
        // for문이 종료되면 i는 소멸됨 
        // 다시 사용하기 위해서는 초기화가 필요
        
        //연습문제
        //수를 입력하세요. 8
        // 범위를 입력하세요. 3
        // [Result]
        // 0 1 2
        // 3 4 5
        // 6 7 8
        // 수를 입력하세요. 9
        // 범위를 입력하세요. 5
        // [Result]
        // 0 1 2 3 4 
        // 5 6 7 8 9
    }
}

