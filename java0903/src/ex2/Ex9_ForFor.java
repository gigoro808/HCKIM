package ex2;
/**
 *
 * @author kosta
 * Document : Ex9_MultiFor Created on : 2014. 9. 3, ���� 3:50:25
 */
public class Ex9_ForFor {
    public static void main(String[] args) {
        // ���� for()�� : ū for�� �ݺ��� ������ �׾ȿ��� 
        // ��� �ʱ�� ���� ���ǽı��� �ݺ��� �ֱ������� �����ϰ� �ȴ�.
        /* for(�ʱ��;���ǽ�;������){
             ���๮;
             for(�ʱ��;���ǽ�;������){
                 ���๮;
            }
        }
        */
        for(int i=1; i<=9 ; i++){
            for(int j=2; j<=9; j++){
                System.out.print(j+" x "+i+" = "+(i*j)+"\t");
            }
            System.out.println("");
        }
    }

}
