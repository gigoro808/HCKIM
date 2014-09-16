package ex3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author kosta Document : ExamConst Created on : ����ö 2014. 9. 11, ���� 3:59:34
 */
public class ExamConst {

    private String name;
    private int age;
    private String date; // ���糯¥...

    // �����ڸ� ����ؼ� ���� �ʱ�ȭ �ϱ�
    // ��ü�� �����ϱ� ���� �پ��� ����� �����ε����� ��������� �Ѵ�.
    public ExamConst(String name) {
        this.name = name;
        age = 19;
        // �͸����� ��ü�� �����ؼ� ����ϴ� ����� ��
        // ��ü�� ���ڷ� ���� �� �������� ������ �� ����, 1ȸ��
        date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    public ExamConst(int age) {
        name = "Guest";
        this.age = age;
        
    }

    public ExamConst(String name, int age) {
        this.name = name;
        this.age = age;
        date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    // ������ �����ϵ��� ���� �غ���, ��� ���� �����ڸ� 
    // ���ؼ� ���� �ʱ�ȭ ���Ѻ���.
    public boolean insert() {
        if (age > 19) {
            System.out.println(name + "�� ���");
            return true;
        } else {
            System.out.println(name + "�� ���ٱ���!");
            return false;
        }

    }

}
