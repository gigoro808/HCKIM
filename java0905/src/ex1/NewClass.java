package ex1;
/**
 *
 * @author kosta
 * Document : NewClass Created on : ����ö 2014. 9. 5, ���� 11:25:25
 */
// ���� Ŭ������ ����, ����, ����� ���� ȸ�翡�� ����ϴ� 
// ������ �ʿ��� �ڵ���...............
// A���� B���� ���� �ڵ忡 �����ؼ� �۾��� �� �� �ִµ�
// �ݾ��� ������ ���� A���� �����ϰ� �Ϸ���?
public class NewClass {
    private int pay; //����ʵ�
    
    // insertPay(1000,"dd"); ȣ��ɶ�
    public void insertPay(int p, String str){
        if(!str.equals("dd")){
            System.out.println("����� ���� ������ �����ϴ�.");
            System.exit(0); //�ý��� ����
    }
        pay=p; // ȣ��� ���� 1000���� ����ʵ忡 �����س��ڴ�.
    }
    public int getPay(){
        return pay;
    }
}
