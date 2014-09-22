package ex3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author kosta
 * Document : Ex3_Map Created on : ����ö 2014. 9. 17, ���� 11:56:07
 */
public class Ex3_Map {
    public static void main(String[] args) {
        String[] msg = {"Test1","Test2","Test3"};
        // key, value : key�� set���� �̱� ������ �ߺ��� ������� ����
        HashMap<Integer,String> map = new HashMap<>();
        int size = msg.length;
        for(int i = 0; i < size; i++){
            map.put(i, msg[i]); //map�� ����
        }
        System.out.println("Map�� ������ :"+map.size());
        // �ʿ��� ���
        // key���� ���� �� ���
        Set<Integer> keys = map.keySet();
        for(Integer e : keys){
            // �ʿ��� get(key)�� ����ؼ� value�� ȹ��
            System.out.println(map.get(e));
        }
        // Entry : Ű�� ������ ��ü�� ������ ������ ���� ���ڵ�
        for(Map.Entry e : map.entrySet()){
            System.out.println(e.getKey()+"."+e.getValue());
        }
    }
}
