package ex1;

import java.util.Scanner;

/**
 *
 * @author kosta Document : UserExceptionTest Created on : ����ö 2014. 9. 16, ����
 * 10:53:18
 */
public class UserExceptionTest {
    UserException ues;
    private void test(String n) throws UserException {
        if (n.length() < 1) {
            throw ues = new UserException("���� �־�� �մϴ�.");
        } else {
            System.out.println("Test1");
            throw ues = new UserException("��������", 703);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("���Է� :");
        String n = sc.nextLine();
        // ���� ��ü�� ����
        UserExceptionTest ut = new UserExceptionTest();
        try {
            ut.test(n);
        } catch (Exception e) {
            // �߻��� ���� ��ü�� ����ϰ� �ִ� ������ �޼����� ��ȯ
            System.out.println(e.getMessage());
            // ������ ������ �������� �޼��� ȣ��� ��ϱ��� ��� ����� 
            // �Ǿ ���ϰ� Ȯ��
            // e.printStackTrace();
        } finally{
            System.out.println("PORT"+ut.ues.getPort());
        }
    }

}


