package ex1;

/**
 *
 * @author kosta Document : MyThread Created on : ����ö 2014. 9. 16, ���� 11:37:54
 */
public class MyThread {

    public MyThread() {
        for (int i = 0; i < 10; i++) {
            try {
                //�Ϲ����� ���ܴ� �ݵ�� �����ϴܰ迡�� ������!
                //sleep�� ������ �߻��ϴ°��� üũ?
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
