package ex2;

import ex2.vo.MemberVO;

/**
 *
 * @author kosta
 * Document : Ex2_CallbyReference Created on : ����ö 2014. 9. 11, ���� 11:23:33
 */
public class Ex2_CallbyReference1 {
    // �������� : ���� Ŭ������ ��ȭ�� �������� ���� Ŭ������ ���谡 �Ǿ� �ִ�.
    // info�� �޼��忡�� �ڿ��� �߰��ؼ� ����ϱ� ���ؼ�
    // �޼����� ���ڰ��� �ÿ��� �ϰ�, ����ʵ� �� setter/getter�� �÷��� �Ѵ�.
    // private boolean agree�� �߰��ؼ� ����غ��� �˰���..
    // POJO, CallbyReference�� ������ ����ϸ� �ذ��.
   private MemberVO vo;
   
   // �޼���� ȣ��� MemberVO�� ������ �� setter�� ���� ������ �� 
   // ���ڰ����� ȣ���ؾ� �Ѵ�. ******
    public void info(MemberVO vo){
    // ���� ������ �ʿ��ϴٸ�? *****
        if(vo.getTel().contains("02")){
            System.out.println("Log : �������̴�!");
        }
        this.vo = vo;
    }
    public MemberVO getVO() {
        return vo;
    }
}