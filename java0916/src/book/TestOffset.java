package book;
/**
 *
 * @author kosta
 * Document : TestOffset Created on : ±èÇöÃ¶ 2014. 9. 16, ¿ÀÈÄ 3:12:15
 */
public class TestOffset {
    public static void main(String[] args) {
        String str = "abcdefghijk";
        
        System.out.println("String = "+str);
        
        int retval = str.offsetByCodePoints(1, 3);
        System.out.println(retval);
        System.out.println(str.charAt(retval));
    }
    
}
