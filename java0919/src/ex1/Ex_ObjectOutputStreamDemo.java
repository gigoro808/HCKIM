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
 * Document : Ex_ObjectOutputStreamDemo Created on : 김현철 2014. 9. 19, 오전 11:25:08
 */
public class Ex_ObjectOutputStreamDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        String path = "c:/kosta86/obj.txt";
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // 전송할 객체 생성 및 값 설정
        MemberVO v = new MemberVO();
        v.setName("김길동");
        v.setAge(30);
        v.setAddr("서울");
        v.setTimes(System.currentTimeMillis());
        v.setFlag(true);
        // 스트림을 통해서 객체를 전송(마샬링 - 직렬화)
        oos.writeObject(v);
        
        //역직렬화로 읽어 오기
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        MemberVO v1 = (MemberVO) ois.readObject();
        System.out.println("Name :"+v1.getName());
        System.out.println("Age :"+v1.getAge());
        System.out.println("Addr :"+v1.getAddr());
        System.out.println("Flag :"+v1.isFlag());
        System.out.println("소요시간 :"+(System.currentTimeMillis()-v1.getTimes()));
           
    }
}
