package ex3;
/**
 *
 * @author kosta
 * Document : Ex3_Constructor Created on : ����ö 2014. 9. 11, ���� 3:47:41
 */
public class Ex3_Constructor {
    // �����ϴܰ� -> JVM����
    // �����ڰ� �����ڸ� ���� ���� �ص��� ������ �����Ϸ��� 
    // �⺻�����ڸ� ���� �صд�.
    // �����ڴ� Ŭ������� ���� ��ȯ���� ����.
    // ���� :  ���� Ŭ������ �ʱ�ȭ ��Ű�� ���� �����̴�.
    // �⺻������ 
//    public Ex3_Constructor(){
//    
//    }
    private String msg;
    // ����� �ڿ��� �ʱ�ȭ �ϴ� ���� !!!!!
    // ���ڰ��� �ִ� ������
    // �����ڰ� ������ �����ڰ� ������ �����Ϸ��� �⺻ �����ڸ� 
    // ������ �ʴ´�.
    
    // ���� Ŭ������ ���� ������ �� �ִ� ���: �޼���(setter), ������ ��!!
    public Ex3_Constructor(String msg){
    this.msg = msg;
    }
    public static void main(String[] args) {
        //Ŭ������ ��ü�� ����
        Ex3_Constructor ref = new Ex3_Constructor("����");  // ����
        ref.test();      
    }
private void test() {
    System.out.println("�׽�Ʈ!!");
}
}
