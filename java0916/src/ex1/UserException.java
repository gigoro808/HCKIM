package ex1;
/**
 *
 * @author kosta
 * Document : UserException Created on : ����ö 2014. 9. 16, ���� 10:48:50
 */
public class UserException extends Exception {
    private int port=772;
    public UserException(String message) {//�޼����� �޾� Exception�� ����
        super(message);//����ó���� �޼���!
    }
    public UserException(String message, int port) {//�޼����� port�� �ʱ�ȭ
        super(message);
        this.port = port;
    }
    public int getPort() {
        return port;
    }
}
