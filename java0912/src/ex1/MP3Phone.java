package ex1;

/**
 *
 * @author kosta Document : MP3Phone Created on : ����ö 2014. 9. 12, ���� 9:57:31
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
