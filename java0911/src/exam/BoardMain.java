package exam;

import java.util.Scanner;

/**
 *
 * @author kosta Document : BoardMain Created on : ����ö 2014. 9. 11, ���� 2:06:33
 */
public class BoardMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
       
        BoardControl ref = new BoardControl();
        board : while (true) {
            System.out.print("1.�Է�, 2.���, 3.���� : ");
            int num = Integer.parseInt(sc.nextLine());
            switch(num){
                case 1:
                    BoardVO v = new BoardVO();
                System.out.print("���� : ");
                v.setTitle(sc.nextLine());
                System.out.print("����(M,F,m,f) : ");
                v.setGender(sc.nextLine());                
                System.out.print("�ۼ��� : ");
                v.setName(sc.nextLine());
                System.out.print("���� : ");
                v.setStory(sc.nextLine());
                System.out.print("���糯¥ : ");
                v.setDate(sc.nextLine());
                
                boolean result = ref.info(v);
                if(result == false) {
                    System.out.println("�������� M,F,m,f�� �Է� �����մϴ�.!");
                }
                break;
                case 2:
                System.out.println("���� :" + ref.getVo().getTitle());
                System.out.println("���� :" + ref.getVo().getGender());
                System.out.println("�ۼ��� :" + ref.getVo().getName());
                System.out.println("���� :" + ref.getVo().getStory());
                System.out.println("���糯¥ :" + ref.getVo().getDate());
                break;
                case 3:
                System.out.println("�����մϴ�!");
                    break board;
            }            
        }        
    }
    // 1. �Է�, 2. ���, 3. ���� : 1
    // ���� : 
    // ���� :('M','F','m','f') ���޼��� !
    // �ۼ��� :
    // ���� :
    // ���糯¥ :
    // 1. �Է�, 2. ���, 3. ���� : 2
    // ���� ~~~~~ ���� ��¥�� ��� 
    
}
