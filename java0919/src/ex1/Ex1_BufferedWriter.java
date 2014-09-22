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
 * Document : Ex1_BufferedWriter Created on : 김현철 2014. 9. 19, 오전 10:38:54
 */
public class Ex1_BufferedWriter {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //문자 스트림을 바이트 스트림으로 연결하기 위해서는 
        //브릿지 스트림을 연결해서 사용해야 한다.
        //OutputStreamWriter(byteStream, encoding);
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("C:/kosta86/test.txt"),"euc-kr"));
        bw.write("이것은 테스트입니다.");
        bw.flush();
        //저장 후 확인
        
    }
}
