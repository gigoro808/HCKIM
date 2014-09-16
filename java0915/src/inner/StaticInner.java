package inner;

/**
 *
 * @author kosta Document : StaticInner Created on : 김현철 2014. 9. 15, 오후 3:20:22
 */
public class StaticInner {

    int a = 10;
    private int b = 100;
    static int c = 200;

    static class Inner {

        // 어쩔수 없이 "내부 클래스안에서 static자원"을 사용하게 된다면
        // 이때 내부클래스는 static 내부클래스로 정의되어야 한다.

        static int d = 1000;

        public void printData() {
            
//            System.out.println("int a:"+a);
//            System.out.println("int b:"+b);
            System.out.println("int c :"+c);
        }
        
    }
    public static void main(String[] args) {
        // 내부클래스 생성후  printData()를 호출해보기
        StaticInner.Inner inner = new StaticInner.Inner();
        inner.printData();
    }
}
