package ex2;
// ����߿�  if, else if, for, while, break ����
// �н��� �� ������ ������ ���� �� �ֵ��� �⺻ ������ 
// �����ϴ� ����� �����Ѵ�.

/**
 *
 * @author kosta Document : Ex_If Created on : 2014. 9. 3, ���� 11:16:45
 */
public class Ex6_If {

    public static void main(String[] args) {
        // if(����) : ������ true �϶��� ���� �ϰڴ�.
        int su = 10;
        String msg;
//        if (su > 5) {
//            System.out.println("����!"+msg);
//        }
        System.out.println("���� if���� ������ �ǰ� �;��!");
        
        //���ǰ� �������� �����ϰڴ�.
        if (su > 5) {
            msg = "ũ��.";
        } else {
            msg = "�۴�."; // if else�� ���, ���������� �ʱ�ȭ��ų�� �ִ�.
        }
        System.out.println("��� :"+msg);    
      
    }

}
