package ex1;
/**
 *
 * @author kosta
 * Document : Ex3_Main Created on : ����ö 2014. 9. 12, ���� 10:51:37
 */
public class Ex3_Main {
    public static void main(String[] args) {
        //�ڽ��� �����ؼ� ��ü�� �����ϴ� ���
        Ex3_Sub ref1 = new Ex3_Sub("30��",3000, "��浿");
        ref1.subMethod();
        System.out.println(ref1.superMethod());
        ref1.superCar();// �ڽ��� superCar() : ȣ���� ��
        System.out.println("================================================");
        //�θ��� �����ؼ� ��ü�� �����ϴ� ���
        Ex3_Super ref2 = new Ex3_Sub("31��", 3100, "��浿");
        // �θ��� superCar()�� ȣ������� �������̵��Ǿ� �ڽ��� superCar()�� ����        
        ref2.superCar();
    }
}
