package ex1;

/**
 *
 * @author kosta Document : Client Created on : ����ö 2014. 9. 15, ���� 9:25:34
 */
public class Client {

    public static void main(String[] args) {
//        Animal animal1 = new Bird();
//        animal1.cry();
//        Animal animal2 = new Cat();
//        animal2.cry();
//        Animal animal3 = new Dog();
//        animal3.cry();
        // �迭�� ����� ������ ó��
        // �迭�� ��ü
        // - �Ϲ��ڷ��� �迭, �����ڷ��� �迭
        // - ������ �迭�� ������ �迭
        // - �迭�� ������ �ݵ�� ũ�Ⱑ �����Ǿ�� �Ѵ�.
        Animal[] ar = new Animal[3];
        ar[0] = new Bird();
        ar[1] = new Cat();
        ar[2] = new Dog();
        int size = ar.length;
        System.out.println("�迭�� ũ�� :"+ar.length) ;
        // ȿ������ �ڵ带 ����ϴ� ���
        for (int i = 0; i < size; i++) {
            ar[i].cry();
        } 
        System.out.println("-----------------------------");
        // jdk5���� ���� for
        // (�迭/�÷����� ��ü �������� : (in�� �ǹ�) ������){
        // ����
        // }
        for(Animal e : ar) {
            e.cry();
        }

    }
}
