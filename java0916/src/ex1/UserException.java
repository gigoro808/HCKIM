package ex1;
/**
 *
 * @author kosta
 * Document : UserException Created on : 김현철 2014. 9. 16, 오전 10:48:50
 */
public class UserException extends Exception {
    private int port=772;
    public UserException(String message) {//메세지를 받아 Exception에 전달
        super(message);//예외처리의 메세지!
    }
    public UserException(String message, int port) {//메세지와 port를 초기화
        // 부모인 Exception의 기본생성자를 호출
        // String message를 추가한다.
        super(message); 
        this.port = port; // 멤버필드의 포트값을 초기화
    }
    public int getPort() {
        return port;
    }
}
