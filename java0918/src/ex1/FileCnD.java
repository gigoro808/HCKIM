package ex1;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author kosta Document : FileCnD Created on : 김현철 2014. 9. 18, 오후 1:21:27
 */
public class FileCnD {

    public static void main(String[] args) throws IOException {
        File file = new File("newFile.txt");
        try {
            boolean isC = file.createNewFile();
            System.out.println("새로운 파일이 생성되었습니다. :" + isC);
            System.out.println("파일이 존재합니까? :" + file.exists());

            boolean isD = file.delete();
            System.out.println("파일이 삭제되었습니다.: " + isD);
            System.out.println("파일이 존재합니까? :" + file.exists());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
