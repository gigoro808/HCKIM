package inner;

import exam.Animal2;

/**
 *
 * @author kosta
 * Document : MemberInner Created on : ����ö 2014. 9. 15, ���� 2:05:17
 */
//����Ŭ���� : Ư��Ŭ���� �ȿ� �� �ٸ� Ŭ������ ���� �Ǵ� ���� �ǹ��Ѵ�.
//���� : ���, ����, static, �͸�
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
            System.out.println("�ܺ�Ŭ������ private ���� ����"+a);
            System.out.println("�ܺ�Ŭ������ private ���� ����"+b);
            System.out.println("�ܺ�Ŭ������ private ���� ����"+c);
        }

        @Override
        public String col() {
            return "����Ŭ������ ����� �ڿ��� ������";
        }
    }
    //����Ŭ���� ���� �� ����
    public static void main(String[] args) {
        //�ܺ�Ŭ������ �����Ѵ�.
        MemberInner outer = new MemberInner();
        //�ܺ�Ŭ������ �ּҸ� ���ؼ� ����Ŭ������ ���� �� ����
       MemberInner.Inner inner = outer.new Inner();
        inner.printData();
        //��������.. �����Ѻ��� ���ٷ�
        MemberInner.Inner inner2 = new MemberInner().new Inner();
        inner2.printData();
        System.out.println(inner2.col());
        
    }
}
