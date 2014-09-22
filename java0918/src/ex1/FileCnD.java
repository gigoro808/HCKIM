package ex1;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author kosta Document : FileCnD Created on : ����ö 2014. 9. 18, ���� 1:21:27
 */
public class FileCnD {

    public static void main(String[] args) throws IOException {
        File file = new File("newFile.txt");
        try {
            boolean isC = file.createNewFile();
            System.out.println("���ο� ������ �����Ǿ����ϴ�. :" + isC);
            System.out.println("������ �����մϱ�? :" + file.exists());

            boolean isD = file.delete();
            System.out.println("������ �����Ǿ����ϴ�.: " + isD);
            System.out.println("������ �����մϱ�? :" + file.exists());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
