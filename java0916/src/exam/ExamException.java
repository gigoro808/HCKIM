package exam;

import java.util.Scanner;

/**
 *
 * @author kosta Document : ExamException Created on : ����ö 2014. 9. 16, ����
 * 9:45:34
 */
public class ExamException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // NumberFormatException - ���ڰ� �ƴ� ��
        // ArithmeticException - 0���� �������� �� ��
        for (int i = 0; i <= 10; i++) {
            System.out.print("�� �Է� :");
            try {
                int num = Integer.parseInt(sc.nextLine());
                int com = (int) (Math.random() * 3); //0~2
                int res = num / com;
                System.out.println("��µ� ��� :" + res);
                // return���� ���� ����Ǹ� ����� �ȵ�
                System.out.println("�ڿ� �ݳ�!");
//NumberFormatException�� ArithmeticException�� Exception�� ���ԵǾ� �ִ� ����
//���� Exception�� ó���� ������ �Ǹ� �Ʒ��� ����ó���� ���ǹ������� ������
//������ ������ �߻��Ѵ�.
//            } catch (Exception e) {
//                System.out.println("���ڸ� �ۼ�");
            } catch (NumberFormatException e) {
                System.out.println("���ڸ� �ۼ�");
                // return���� ���� �Ǹ� �����߻��� ����ǰ� �ȴ�.
                // ���� �ݵ�� ����Ǿ�� �ϴ� ������ �ִٸ� 
                // �������� finally����ϵ��� �Ѵ�.
                return; 
            } catch (ArithmeticException e) {
                System.out.println("0���� ���� �� �����ϴ�.");
            } catch (Exception e) {
                // �������ܰ�ü�� �׻� �Ʒ��� �;� �Ѵ�. ***
                System.out.println("���ڸ� �ۼ�");
            } finally { // ������ ����Ǵ� ����!
                System.out.println("������ ����Ǹ� �ڿ��� ��ȯ!");
            }

        }
    }
}
