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
// interface에서는 final과 abstract를 쓰지 않아도 상수와 추상메서드로 인식
// interface 설계 : 인터페이스는 메뉴판처럼 상수와 추상메서드로 
public interface InterFaceTest {
    public static final int A = 100; // 상수
    public int b = 200; //상수 
    public abstract int getA(); // 추상 메서드
    public int getB(); // 추상 메서드
}
