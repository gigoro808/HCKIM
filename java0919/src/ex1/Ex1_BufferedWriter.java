package ex1;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author kosta
 * Document : Ex1_BufferedWriter Created on : ����ö 2014. 9. 19, ���� 10:38:54
 */
public class Ex1_BufferedWriter {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //���� ��Ʈ���� ����Ʈ ��Ʈ������ �����ϱ� ���ؼ��� 
        //�긴�� ��Ʈ���� �����ؼ� ����ؾ� �Ѵ�.
        //OutputStreamWriter(byteStream, encoding);
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("C:/kosta86/test.txt"),"euc-kr"));
        bw.write("�̰��� �׽�Ʈ�Դϴ�.");
        bw.flush();
        //���� �� Ȯ��
        
    }
}
