package exam;
/* ex) 단입력 : 7
       범위입력(3,5,7,9,) :  3
------------------------------------------------------
       6단              7단            8단
------------------------------------------------------
   6 x 1 = 6         7 x 1 = 7      8 x 1 = 8
   6 x 2 = 12        7 x 2 = 14     8 x 2 = 16
*/


import java.util.Scanner;

/**
 *
 * @author kosta
 * Document : Exam3 Created on : 2014. 9. 3, 오후 4:09:04
 */
public class Exam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단입력 : ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("범위입력(3,5,7,9) :");
        int b = Integer.parseInt(sc.nextLine());
        // 빗금의 길이는 범위가 3개 일때와 9개일때 차이가 많이나는데 
        // 이걸 범위에 따라 길이가 달라지게 할 수 있나요?
        System.out.println("-------------------------------------------------");
        // 범위값이 3일 경우 입력된 단을 기준으로 좌우로 1개씩
        // 5일 경우 2개씩 , 7일 경우 3개씩 , 9일 경우 4개씩 위치하게 되는데
        // (b/2)의 값은 1.5, 2.5, 3.5, 4.5 이나   
        // 계산결과 또한 int형이기 때문에 1, 2, 3, 4 값을 가지게 되므로 
        // a-(b/2)단 부터  a+(b/2)단까지 범위를 정해주면 된다.
        for(int c=(a-(b/2)); c<=(a+(b/2)); c++){
                System.out.print("    "+c+"단"+"\t       ");
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




        
            
 
