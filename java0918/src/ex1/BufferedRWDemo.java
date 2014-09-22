package ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author kosta Document : BufferedRWDemo Created on : ����ö 2014. 9. 18, ����
 * 3:04:44
 */
public class BufferedRWDemo {

    public static void main(String[] args) throws IOException {
        //�ۼ� �� �о� ���� ���·� ���
        Scanner sc = new Scanner(System.in);
        System.out.print("�Է� ���� :");
        String content = sc.nextLine();
        // �ۼ��ϱ� ���� ��Ʈ�� ����
        BufferedWriter bw = null;
        BufferedReader br = null;
        try {
            //�ۼ� 
            // new FileWriter("c:\\kosta86\\mytext.txt",true)
            // ù��° ���ڴ� ���, �ι�° ���ڴ� append Mode
            // true�� ���ϳ��� ��µ����͸� ���̰� 
            // false�� ������ �����.
            String path = "c:\\kosta86\\mytext.txt";
            bw = new BufferedWriter(
                    new FileWriter(path, true));
            bw.write(content + "\r\n");
            bw.flush();
            System.out.println("�ۼ��ϱ� �Ϸ�!");
            //�б�
            System.out.println("==================================");
            br = new BufferedReader(new FileReader(path));
            String rv = null;
            // file�� �������� �����ϸ� null�� ��ȯ�Ѵ�.
            while ((rv = br.readLine()) != null) {
                System.out.println(rv);
            }
        } catch (IOException e) {
            System.out.println("������ �߻��߽��ϴ�.");
            e.printStackTrace();
        } finally {
            if (bw != null) {
                bw.close();
            }
            if (br != null) {
                br.close();
            }
        }
    }
}
