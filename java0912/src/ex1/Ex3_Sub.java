package ex1;
/**
 *
 * @author kosta
 * Document : Ex3_Sub Created on : ����ö 2014. 9. 12, ���� 10:44:51
 */
public class Ex3_Sub extends Ex3_Super {
    private String age; // ����

    public Ex3_Sub(String age, int num, String msg) {
        super(num, msg); // super�� �׻� �������� ȣ��Ǿ�� ��.
        this.age = age;
    }
    public void subMethod() {
        System.out.println("����� �ڽ��� �޼����Դϴ�.");
    }

    //������̼� : ���� ������ �ּ� / ���⼭�� JVM�� Override��� �ν��ϴ� Ű����
    @Override
    public void superCar() {
        System.out.println("������ �ڵ���!!!!");
    }
    
}
