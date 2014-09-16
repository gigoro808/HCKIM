package ex3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author kosta Document : ExamConst Created on : 김현철 2014. 9. 11, 오후 3:59:34
 */
public class ExamConst {

    private String name;
    private int age;
    private String date; // 현재날짜...

    // 생성자를 사용해서 값을 초기화 하기
    // 객체를 생성하기 위한 다양한 방법을 오버로딩으로 제공해줘야 한다.
    public ExamConst(String name) {
        this.name = name;
        age = 19;
        // 익명으로 객체를 생성해서 사용하는 방법의 예
        // 객체가 인자로 사용될 때 참조없이 생성될 수 있음, 1회용
        date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    public ExamConst(int age) {
        name = "Guest";
        this.age = age;
        
    }

    public ExamConst(String name, int age) {
        this.name = name;
        this.age = age;
        date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    // 재사용이 가능하도록 설계 해보고, 모든 값은 생성자를 
    // 통해서 값을 초기화 시켜보자.
    public boolean insert() {
        if (age > 19) {
            System.out.println(name + "님 통과");
            return true;
        } else {
            System.out.println(name + "님 접근금지!");
            return false;
        }

    }

}
