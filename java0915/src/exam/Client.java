package exam;

/**
 *
 * @author kosta Document : Client Created on : ����ö 2014. 9. 15, ���� 1:12:20
 */
public class Client {

    public static void main(String[] args) {
        Animal[] ar = new Animal[3];
        ar[0] = new Bird();
        ar[1] = new Cat();
        ar[2] = new Dog();
        // instanceof : ������ ��ü�� �����ʿ� ����� Ŭ������ ����
        // ������ ��ü(�������踦 ������ ��ü������) ������ �����ִ� �����
        System.out.println(ar[0] instanceof Cat);
        for (Animal e : ar) {
            e.cry();

        }
        Animal2 ref1 = new Bird();
        Animal2 ref2 = new Dog();
        Animal ref3 = new Cat();
        System.out.println(ref1 instanceof Bird);
        System.out.println(ref2 instanceof Dog);
        System.out.println(ref3 instanceof Cat);

    }
}
