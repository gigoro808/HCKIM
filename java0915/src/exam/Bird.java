package exam;
/**
 *
 * @author kosta
 * Document : Bird Created on : ����ö 2014. 9. 15, ���� 1:08:32
 */
// �ϳ��� Ŭ������ ����� ���� �� ������ �������� �������̽��� ����!
public class Bird extends Animal2 implements Animal{

    @Override
    public void cry() {
        System.out.println("±±");
    }

    @Override
    public String col() {
        return "����� ����";
    }
    
}
