package ex2;
/**
 *
 * @author kosta
 * Document : Ex1_AbstractMain Created on : ����ö 2014. 9. 12, ���� 12:04:37
 */
// �߻�Ŭ������ �߻�޼��尡 �ִٸ� �ݵ�� ������ �ؼ� ����ؾ� 
// ��ӹ޾Ƽ� �߻�Ŭ������ ������ �ִ� �ٸ� �ڿ�(���⼭�� 1000��)�� ����� �� �ִ�.
// ��, �߻��� �䱸������ ������ �ȴ�.
public class Ex1_AbstractMain extends Ex1_Abstract{

    @Override
    public void moveMount() {
        System.out.println("���� �Ű���"+getMoney()+"�޾��� ����");
    }
    public static void main(String[] args) {
        //�θ� �����ؼ� ��ü�� ������ ���
        Ex1_Abstract ref = new Ex1_AbstractMain();
        //�θ��� �޼��带 ȣ�������� �����ǵ� �ڽ� �޼��尡 ȣ���� ��
        // (����) �߻� Ŭ������ ���������� new�� �����ڷ� �����Ǿ
        // ���� �� ���� ������ �̿ϼ��� �߻�޼���� ���� �صθ�
        // �����ǵ� �ڽĿ� ���ؼ� �ϼ��� �Ǿ ����� �� 
        ref.moveMount();
        //�ڽ��� �����ؼ� ��ü�� ������ ���
        
    }
}
