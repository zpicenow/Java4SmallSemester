package ZPutil;

public class XstAfterPoint {
    public static final int theXstAfterPoint(int isDiv, int div, int xst) {

        int theXst = 0;
        int tempisDiv = isDiv % div;
        for (int i = 0; i < xst; i++) {
            theXst = tempisDiv * 10 / div;
            tempisDiv = tempisDiv * 10 % div;
        }
        return theXst;
    }
}
