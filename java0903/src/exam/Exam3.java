package exam;
/* ex) ���Է� : 7
       �����Է�(3,5,7,9,) :  3
------------------------------------------------------
       6��              7��            8��
------------------------------------------------------
   6 x 1 = 6         7 x 1 = 7      8 x 1 = 8
   6 x 2 = 12        7 x 2 = 14     8 x 2 = 16
*/


import java.util.Scanner;

/**
 *
 * @author kosta
 * Document : Exam3 Created on : 2014. 9. 3, ���� 4:09:04
 */
public class Exam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("���Է� : ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("�����Է�(3,5,7,9) :");
        int b = Integer.parseInt(sc.nextLine());
        // ������ ���̴� ������ 3�� �϶��� 9���϶� ���̰� ���̳��µ� 
        // �̰� ������ ���� ���̰� �޶����� �� �� �ֳ���?
        System.out.println("-------------------------------------------------");
        // �������� 3�� ��� �Էµ� ���� �������� �¿�� 1����
        // 5�� ��� 2���� , 7�� ��� 3���� , 9�� ��� 4���� ��ġ�ϰ� �Ǵµ�
        // (b/2)�� ���� 1.5, 2.5, 3.5, 4.5 �̳�   
        // ����� ���� int���̱� ������ 1, 2, 3, 4 ���� ������ �ǹǷ� 
        // a-(b/2)�� ����  a+(b/2)�ܱ��� ������ �����ָ� �ȴ�.
        for(int c=(a-(b/2)); c<=(a+(b/2)); c++){
                System.out.print("    "+c+"��"+"\t       ");
        }
        System.out.println("");
        System.out.println("-------------------------------------------------");
        for(int i=1; i<=9 ; i++){
            for(int j=(a-(b/2)); j<=(a+(b/2)); j++){
                if(j>0){
                System.out.print(j+" x "+i+" = "+(i*j)+"\t");
                }
                else { System.out.print("                ");
                }
                }
             System.out.println("");
            }
            
        }
    }




        
            
 
