package ex1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author kosta Document : FileCopyDemo1 Created on : ����ö 2014. 9. 18, ����
 * 1:44:10
 */
public class FileCopyDemo1 {

    public static void main(String[] args) {
        //��������� �о�ͼ� Ư�� �ٸ� ���丮�� �����ϴ� �۾�
        //�о���� ���� ��Ʈ�� - FileInputStream
        //�ۼ��ϱ� ���� ��Ʈ�� - FileOutputStream
        String path = "C:\\kosta86\\javaStudy\\util\\kosta86.zip";
        String path2 = "C:\\kosta86\\javaStudy\\tmp\\kosta86.zip";
        FileInputStream fis = null; //����
        FileOutputStream fos = null;
        long start = System.currentTimeMillis();
        try {
            fis = new FileInputStream(path);
            fos = new FileOutputStream(path2);
            int rv = 0;
            while ((rv = fis.read()) != -1) {
                // �ѹ���Ʈ�� ���� ������ �ѹ���Ʈ�� �ۼ�
                fos.write(rv);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("������ ���׿�");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("�о� ���� �� ������ �߻��߽��ϴ�.");
            ex.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("�ð� :"+(end - start));
    }
}
