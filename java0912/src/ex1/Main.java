package ex1;
/**
 *
 * @author kosta
 * Document : Main Created on : ����ö 2014. 9. 12, ���� 10:16:22
 */
public class Main {
    public static void main(String[] args) {
        //�ڽ�Ŭ������ ������ �� ��ü ����
        D_carPhone ref = new D_carPhone("����Ʈ3", "500000", 1000, "20px");
        System.out.println("�𵨸�:"+ref.model); // �θ�
        System.out.println("����:"+ref.getNumber()); // �θ�
        System.out.println("ȭ��:"+ref.getChord()); // �θ� ���
        System.out.println("�ȼ�:"+ref.getPixel()); // �ڽ�
        System.out.println("");
        
        MP3Phone ref1 = new MP3Phone("������10", "2�鸸��", 10000, 1);
        System.out.println("�𵨸�:"+ref1.model); 
        System.out.println("����:"+ref1.getNumber()); 
        System.out.println("ȭ��:"+ref1.getChord()); 
        System.out.println("����뷮:"+ref1.getSize()+"��Ÿ");
    }
}
