package exam;
/**
 *
 * @author kosta
 * Document : Dog Created on : ±èÇöÃ¶ 2014. 9. 15, ¿ÀÈÄ 1:08:48
 */
public class Dog extends Animal2 implements Animal{

    @Override
    public void cry() {
        System.out.println("¸Û¸Û");
    }

    @Override
    public String col() {
        return "°ËÀº»ö Ä¡¿Í¿Í";
    }

    

}
