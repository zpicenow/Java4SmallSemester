package ZPutil;

public class XstAfterPoint {
    public static final int theXstAfterPoint(int isDiv, int div, int xst) {

        int theXst = 0;
        int tempisDiv = isDiv % div; //通过取余处理，先消去结果的整数部分，就可以再循环直接对小数部分进行操作
        for (int i = 0; i < xst; i++) {

            theXst = tempisDiv * 10 / div;
            tempisDiv = tempisDiv * 10 % div;
        }
        return theXst;
    }
}
