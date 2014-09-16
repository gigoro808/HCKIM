package ex1;
/**
 *
 * @author kosta
 * Document : Main Created on : 김현철 2014. 9. 12, 오전 10:16:22
 */
public class Main {
    public static void main(String[] args) {
        //자식클래스를 참조로 한 객체 생성
        D_carPhone ref = new D_carPhone("갤노트3", "500000", 1000, "20px");
        System.out.println("모델명:"+ref.model); // 부모
        System.out.println("가격:"+ref.getNumber()); // 부모
        System.out.println("화음:"+ref.getChord()); // 부모에 등록
        System.out.println("픽셀:"+ref.getPixel()); // 자식
        System.out.println("");
        
        MP3Phone ref1 = new MP3Phone("아이폰10", "2백만원", 10000, 1);
        System.out.println("모델명:"+ref1.model); 
        System.out.println("가격:"+ref1.getNumber()); 
        System.out.println("화음:"+ref1.getChord()); 
        System.out.println("저장용량:"+ref1.getSize()+"요타");
    }
}
