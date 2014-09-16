package ex1;

/**
 *
 * @author kosta Document : MP3Phone Created on : ±èÇöÃ¶ 2014. 9. 12, ¿ÀÀü 9:57:31
 */
public class MP3Phone extends Ex1_Super {

    private int size;

    public MP3Phone(String model, String num, int chord, int size) {
        this.size = size;
        super.model = model;
        setNumber(num);
        super.chord = chord;
    }

    public int getSize() {
        return size;
    }

}
