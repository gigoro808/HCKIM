package ex3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author kosta
 * Document : Ex3_Map Created on : 김현철 2014. 9. 17, 오전 11:56:07
 */
public class Ex3_Map {
    public static void main(String[] args) {
        String[] msg = {"Test1","Test2","Test3"};
        // key, value : key는 set구조 이기 때문에 중복을 허용하지 않음
        HashMap<Integer,String> map = new HashMap<>();
        int size = msg.length;
        for(int i = 0; i < size; i++){
            map.put(i, msg[i]); //map에 저장
        }
        System.out.println("Map의 사이즈 :"+map.size());
        // 맵에서 출력
        // key값을 저장 후 출력
        Set<Integer> keys = map.keySet();
        for(Integer e : keys){
            // 맵에서 get(key)를 사용해서 value를 획득
            System.out.println(map.get(e));
        }
        // Entry : 키와 값으로 객체의 순서를 쌍으로 가진 레코드
        for(Map.Entry e : map.entrySet()){
            System.out.println(e.getKey()+"."+e.getValue());
        }
    }
}
