package ex1;

import java.io.File;

/**
 *
 * @author kosta
 * Document : DirectoryCre Created on : ����ö 2014. 9. 18, ���� 1:29:27
 */
public class DirectoryCre {
    public static void main(String[] args) {
        String baseDir = "";
        
        File dir1 = new File(baseDir+"dir1");
        boolean isMade = dir1.mkdir();
        System.out.println("���ο� ���丮 ���� : "+isMade);
        
        File dir2 = new File(baseDir+"parent\\dir2");
        isMade = dir2.mkdirs();
        System.out.println("");
    }
}
