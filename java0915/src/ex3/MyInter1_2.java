/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex3;

/**
 *
 * @author kosta
 */

/*
    Inter1,Inter2는 각각 다른 목적에 의해서 설계 되었지만 
    현재 MyInter1_에서 통합해서 사용하고 싶을 때
    인터페이스 끼리는 다중 상속이 가능하다.
*/
public interface MyInter1_2 extends Inter1, Inter2{
    public int getData();
}
