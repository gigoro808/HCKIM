package inner;

import exam.Animal2;

/**
 *
 * @author kosta
 * Document : MemberInner Created on : 김현철 2014. 9. 15, 오후 2:05:17
 */
//내부클래스 : 특정클래스 안에 또 다른 클래스가 정의 되는 것을 의미한다.
//종류 : 멤버, 로컬, static, 익명
public class MemberInner {
    private int a = 10;
    private int b;
    private int c;
    public MemberInner(){
        b = 100;
        c = 200;
    }
    
    public class Inner extends Animal2{
        public void printData() {
            System.out.println("외부클래스의 private 접근 가능"+a);
            System.out.println("외부클래스의 private 접근 가능"+b);
            System.out.println("외부클래스의 private 접근 가능"+c);
        }

        @Override
        public String col() {
            return "내부클래스가 상속한 자원을 재정의";
        }
    }
    //내부클래스 생성 및 접근
    public static void main(String[] args) {
        //외부클래스를 생성한다.
        MemberInner outer = new MemberInner();
        //외부클래스의 주소를 통해서 내부클래스를 생성 및 접근
       MemberInner.Inner inner = outer.new Inner();
        inner.printData();
        //연습문제.. 축약시켜보기 두줄로
        MemberInner.Inner inner2 = new MemberInner().new Inner();
        inner2.printData();
        System.out.println(inner2.col());
        
    }
}
