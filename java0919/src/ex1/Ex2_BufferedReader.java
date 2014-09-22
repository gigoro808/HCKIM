package ex1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author kosta Document : Ex2_BufferedReader Created on : 김현철 2014. 9. 19, 오전
 * 10:48:47
 */
public class Ex2_BufferedReader {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // BufferedReader는 2차 스트림이라
        // 1차스트림인 FileInputStream에 연결할 수 없다.
        // 브릿지 스트림인 InputStreamReader로 연결
        BufferedReader br = null;

        try {

            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:/kosta86/test.txt"), "euc-kr"));

            String rv = null;
            // 파일 마지막에 도달하면 null값을 반환
            while ((rv = br.readLine()) != null) {
                System.out.println(rv);
            }
        } catch (Exception e) {
            System.out.println("문제가 발생했습니다.");
            e.printStackTrace();
        } finally {
            if (br != null) {
                br.close();
            }
        }
    }
}
