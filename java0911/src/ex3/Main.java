package ex3;
/**
 *
 * @author kosta
 * Document : Main Created on : ����ö 2014. 9. 11, ���� 4:17:53
 */
public class Main {
    public static void main(String[] args) {
        ExamConst ref = new ExamConst("��浿");
        if(!ref.insert()){
            System.out.println("����� ���θ� �����մϴ�.");
        }
        ExamConst ref1 = new ExamConst(20);
        if(!ref1.insert()){
            System.out.println("����� ���θ� �����մϴ�. ^^");
        }else{
            System.out.println("�����մϴ�. ��÷!");
        } 
    }

}
