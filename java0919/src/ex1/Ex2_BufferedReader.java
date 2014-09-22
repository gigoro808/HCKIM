package ex1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author kosta Document : Ex2_BufferedReader Created on : ����ö 2014. 9. 19, ����
 * 10:48:47
 */
public class Ex2_BufferedReader {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // BufferedReader�� 2�� ��Ʈ���̶�
        // 1����Ʈ���� FileInputStream�� ������ �� ����.
        // �긴�� ��Ʈ���� InputStreamReader�� ����
        BufferedReader br = null;

        try {

            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:/kosta86/test.txt"), "euc-kr"));

            String rv = null;
            // ���� �������� �����ϸ� null���� ��ȯ
            while ((rv = br.readLine()) != null) {
                System.out.println(rv);
            }
        } catch (Exception e) {
            System.out.println("������ �߻��߽��ϴ�.");
            e.printStackTrace();
        } finally {
            if (br != null) {
                br.close();
            }
        }
    }
}
