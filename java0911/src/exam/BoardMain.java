package exam;

import java.util.Scanner;

/**
 *
 * @author kosta Document : BoardMain Created on : 김현철 2014. 9. 11, 오후 2:06:33
 */
public class BoardMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
       
        BoardControl ref = new BoardControl();
        board : while (true) {
            System.out.print("1.입력, 2.출력, 3.종료 : ");
            int num = Integer.parseInt(sc.nextLine());
            switch(num){
                case 1:
                    BoardVO v = new BoardVO();
                System.out.print("제목 : ");
                v.setTitle(sc.nextLine());
                System.out.print("성별(M,F,m,f) : ");
                v.setGender(sc.nextLine());                
                System.out.print("작성자 : ");
                v.setName(sc.nextLine());
                System.out.print("내용 : ");
                v.setStory(sc.nextLine());
                System.out.print("현재날짜 : ");
                v.setDate(sc.nextLine());
                
                boolean result = ref.info(v);
                if(result == false) {
                    System.out.println("성별에는 M,F,m,f만 입력 가능합니다.!");
                }
                break;
                case 2:
                System.out.println("제목 :" + ref.getVo().getTitle());
                System.out.println("성별 :" + ref.getVo().getGender());
                System.out.println("작성자 :" + ref.getVo().getName());
                System.out.println("내용 :" + ref.getVo().getStory());
                System.out.println("현재날짜 :" + ref.getVo().getDate());
                break;
                case 3:
                System.out.println("종료합니다!");
                    break board;
            }            
        }        
    }
    // 1. 입력, 2. 출력, 3. 종료 : 1
    // 제목 : 
    // 성별 :('M','F','m','f') 경고메세지 !
    // 작성자 :
    // 내용 :
    // 현재날짜 :
    // 1. 입력, 2. 출력, 3. 종료 : 2
    // 제목 ~~~~~ 현재 날짜가 출력 
    
}
