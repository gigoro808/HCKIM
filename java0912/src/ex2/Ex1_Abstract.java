package ex2;
/**
 *
 * @author kosta
 * Document : Ex1_Abstract Created on : ����ö 2014. 9. 12, ���� 12:00:57
 */
// �߻�޼��带 ���� Ŭ������ �ݵ�� �߻�Ŭ�������� �Ѵ�.
public abstract class Ex1_Abstract {
    private String money;

    public Ex1_Abstract() {
        money = "1000���";
    }
    //�߻� �޼��� : ���� �Űܶ�.
    abstract public void moveMount();

    //�Ϲ� �޼���
    public String getMoney() {
        return money;
    }
    
}
