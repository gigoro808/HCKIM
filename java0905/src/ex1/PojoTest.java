package ex1;
/**
 *
 * @author kosta
 * Document : PojoTest Created on : ����ö 2014. 9. 5, ���� 11:47:46
 */
// POJO (������ ������ ������ ��ü)
// ��ӵ� ��𿡵� �ͼӵ��� �ʴ� Ŭ����
// �⺻�����ڷ� �����Ǵ� Ŭ����
// ����ʵ�� ����ȭ �ǰ�, ������ setter/getter�� ĸ��ȭ ��Ų Ŭ����
public class PojoTest {
    private int num;
    private String name;
    private boolean flag;
    // boolean�� getter�� isXX������ ***
    public boolean isFlag() {
        return flag;
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
     

}
