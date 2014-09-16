package ex3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author kosta Document : Ex3_Generic Created on : ����ö 2014. 9. 16, ���� 3:32:20
 */
//jdk 5���� ��ü���� ĳ���� ������ �ذ��ϱ� ���ؼ�
//�����÷����� ����
public class Ex3_Generic {

    public static void main(String[] args) {
        //Vector �� ArrayList ���̴� ����ȭ ���� ����!
        //Vector �� ����ȭ�� �����ϴ� ���! ������ �ٸ� �κ����� ��ü����!
        //Generic - String�� ���� �� �ִ� ArrayList
        //jdk 7���� ����� ��� 6���ϴ� ����
        ArrayList<String> str = new ArrayList<>();
        
        str.add("ok");
        str.add(String.valueOf(10));
        str.add(String.valueOf(3.14f));
        System.out.println(str.size());
        for (String e : str) {
            System.out.println(e);
        }
        System.out.println("literator--------------------------");
        Iterator<String> it = str.iterator();
        while (it.hasNext()) {
            String string = it.next();
            System.out.println(string);

        }
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(Integer.parseInt("10"));
    }
    //����] ArrayList�� ����ϴ� ���ϱ�
    // ȸ�������� �����ϰ� �;��. �ٵ� ���׸����� ǥ���Ǹ�
    // ��� ���� �ٸ� �ڷ������� �־ ȸ�������� ������ �� �������?
    // ����ȭ��
        /* 1 - ȸ�������Է�, 2 - ȸ������Ʈ���, 3 - ���� :  1
     ȸ����ȣ(int) :
     ȸ�����̸�(String) :
     ȸ���Ǹ�����(float) :
     ȸ���� ���ǿ���(boolean) :
     ȸ���� �̸��� (String) :
     ȸ���� ���� (int) :
     1 - ȸ�������Է�, 2 - ȸ������Ʈ���, 3 - ���� :  1
     - ������ �ݺ��ؼ� ȸ���� 5������ �߰� -
     1 - ȸ�������Է�, 2 - ȸ������Ʈ���, 3 - ���� :  2
     ȸ����ȣ : 1
     �̸� : �̼���
     ������ : 60.5 kg
     ���ǿ��� : false
     ȸ���� �̸��� : aaa@aaa.com
     ���� : 18
     [�̼�����] / ����
     ---------------------------------------------
     ----- ��� -------
        
     [����] - A�� OOO : ArrayList�� ������ ȸ������
     */
}
