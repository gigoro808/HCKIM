package ex1;
/**
 *
 * @author kosta
 * Document : Ex3_Main Created on : 김현철 2014. 9. 12, 오전 10:51:37
 */
public class Ex3_Main {
    public static void main(String[] args) {
        //자식을 참조해서 객체를 생성하는 경우
        Ex3_Sub ref1 = new Ex3_Sub("30세",3000, "김길동");
        ref1.subMethod();
        System.out.println(ref1.superMethod());
        ref1.superCar();// 자식의 superCar() : 호출이 됨
        System.out.println("================================================");
        //부모을 참조해서 객체를 생성하는 경우
        Ex3_Super ref2 = new Ex3_Sub("31세", 3100, "김길동");
        // 부모의 superCar()가 호출되지만 오버라이딩되어 자식의 superCar()가 실행        
        ref2.superCar();
    }
}
