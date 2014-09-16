package ex1;

/**
 *
 * @author kosta Document : Ex1_Exception Created on : 김현철 2014. 9. 16, 오전
 * 9:29:21
 */
/*
 Exception : 가벼운 오류이며 프로그램적으로 처리한다.
 - 일반적인 예외 : 컴파일할 때 발생하는 오류
 예) I/O(입출력)시 파일을 읽고자 하는데 대상 파일이 없다면 ...
 - 실행 시 예외 : 
 예) 0으로 나누는 프로그램등, 문자형 숫자에 문자를 넣는다는 등
 컴파일 시에는 절대 알 수 없는 예외
 Error : 치명적인 오류이며 JVM에 의존하여 처리한다.
 예외 처리)
 try{
 예외가 발생 가능한 문장들;
 실행문: 예외가 발생되면 수행이 안됨 *****
 }catch(예외객체 변수명){
 예외 수행 문장들;
 }
 */
public class Ex1_Exception {

    public static void main(String[] args) {
        // 배열의 선언과 생성과 초기화를 한번에 한 문장.(따로 못씀)
        int[] var = {10, 200, 30};
        for (int i = 0; i <= 3; i++) {
            //ArrayIndexOutOfBoundsException: 3
            //예외발생지점 배열의 인덱스가 3을 찾을때 - 3은 없슴
            //예외처리
            try {
                System.out.println(var[i]); // i==3일때 오류가 발생해서
            } catch (Exception e) { //예외처리로 넘어간다.
                System.out.println("배열의 범위를 넘었습니다.");
            }
        }
        System.out.println("프로그램의 끝");
    }
}
