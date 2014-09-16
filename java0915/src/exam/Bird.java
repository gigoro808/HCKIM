package exam;
/**
 *
 * @author kosta
 * Document : Bird Created on : 김현철 2014. 9. 15, 오후 1:08:32
 */
// 하나의 클래스는 상속을 받을 수 있으면 여러개의 인터페이스를 구현!
public class Bird extends Animal2 implements Animal{

    @Override
    public void cry() {
        System.out.println("짹짹");
    }

    @Override
    public String col() {
        return "노란색 참새";
    }
    
}
