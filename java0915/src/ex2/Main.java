package ex2;
/**
 *
 * @author kosta
 Document : Main Created on : ����ö 2014. 9. 15, ���� 10:22:19
 */
public class Main {
    public static void main(String[] args) {
        // �߻� Ŭ������ new�� ��ü�� ������ �� ����.
        // ����Ŭ����
        Super su = new Super() {

            @Override
            public void draw(String msg) {
                System.out.println("�� :");
            }
        };
        su.draw("Test");
        
        Super[] ar = new Super[2];
        ar[0] = new A();
        ar[1] = new B();
        String[] msg = {"�簢��","������"};
        int i = 0;
        for(Super e : ar){
            e.draw(msg[i]);
            i++;
        }
    }
}
