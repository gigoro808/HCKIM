package ex1;
/**
 *
 * @author kosta
 * Document : Ex3_Super Created on : 김현철 2014. 9. 12, 오전 10:40:47
 */
public class Ex3_Super {
    private int num;
    private String msg;
    public Ex3_Super(){
        
    }

    public Ex3_Super(int num, String msg) {
        this.num = num;
        this.msg = msg;
    }
    
    // 부모의 메서드들 ...
    public String superMethod() {
        return msg +"  :  "+num;
    }
    public void superCar() {
        System.out.println("이것은 부모의 자동차 입니다.");
    }
}
