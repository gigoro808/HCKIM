package ex1;
/**
 *
 * @author kosta
 * Document : Ex3_Super Created on : ����ö 2014. 9. 12, ���� 10:40:47
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
    
    // �θ��� �޼���� ...
    public String superMethod() {
        return msg +"  :  "+num;
    }
    public void superCar() {
        System.out.println("�̰��� �θ��� �ڵ��� �Դϴ�.");
    }
}
