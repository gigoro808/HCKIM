package ex1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author kosta
 * Document : Ex_ObjectOutputStreamDemo Created on : ����ö 2014. 9. 19, ���� 11:25:08
 */
public class Ex_ObjectOutputStreamDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        String path = "c:/kosta86/obj.txt";
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // ������ ��ü ���� �� �� ����
        MemberVO v = new MemberVO();
        v.setName("��浿");
        v.setAge(30);
        v.setAddr("����");
        v.setTimes(System.currentTimeMillis());
        v.setFlag(true);
        // ��Ʈ���� ���ؼ� ��ü�� ����(������ - ����ȭ)
        oos.writeObject(v);
        
        //������ȭ�� �о� ����
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        MemberVO v1 = (MemberVO) ois.readObject();
        System.out.println("Name :"+v1.getName());
        System.out.println("Age :"+v1.getAge());
        System.out.println("Addr :"+v1.getAddr());
        System.out.println("Flag :"+v1.isFlag());
        System.out.println("�ҿ�ð� :"+(System.currentTimeMillis()-v1.getTimes()));
           
    }
}
