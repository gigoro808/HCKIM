package ex3;
/**
 *
 * @author kosta
 * Document : Ex3_Constructor Created on : 김현철 2014. 9. 11, 오후 3:47:41
 */
public class Ex3_Constructor {
    // 컴파일단계 -> JVM실행
    // 개발자가 생성자를 따로 정의 해두지 않으면 컴파일러가 
    // 기본생성자를 정의 해둔다.
    // 생성자는 클래스명과 같고 반환형이 없다.
    // 목적 :  현재 클래스를 초기화 시키는 것이 목적이다.
    // 기본생성자 
//    public Ex3_Constructor(){
//    
//    }
    private String msg;
    // 멤버의 자원을 초기화 하는 목적 !!!!!
    // 인자값이 있는 생성자
    // 개발자가 만들어둔 생성자가 있으면 컴파일러가 기본 생성자를 
    // 만들지 않는다.
    
    // 현재 클래스에 값을 주입할 수 있느 방법: 메서드(setter), 생성자 뿐!!
    public Ex3_Constructor(String msg){
    this.msg = msg;
    }
    public static void main(String[] args) {
        //클래스를 객체로 생성
        Ex3_Constructor ref = new Ex3_Constructor("하이");  // 생성
        ref.test();      
    }
private void test() {
    System.out.println("테스트!!");
}
}
