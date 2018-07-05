//import java.util.Arrays;
//
//public class Base64 {
//
//    private static final char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();
//
//    private static byte[] codes = new byte[256];
//
//    static {
//        for (int i = 0; i < 256; i++) {
//            codes[i] = -1;
//        }
//        for (int i = 'A'; i <= 'Z'; i++) {
//            codes[i] = (byte) (i - 'A');
//        }
//        for (int i = 'a'; i <= 'z'; i++) {
//            codes[i] = (byte) (26 + i - 'a');
//        }
//        for (int i = '0'; i <= '9'; i++) {
//            codes[i] = (byte) (52 + i - '0');
//        }
//        codes['+'] = 62;
//        codes['/'] = 63;
//    }
//
//
// public static String encode(byte[] binaryData) {
//        char[] result = new char[((binaryData.length + 2) / 3) * 4];
//        //i每次偏移三字节，
//        for (int i = 0, index = 0; i < binaryData.length; i += 3, index += 4) {
//            boolean quad = false;
//            boolean trip = false;
//            int val = (0xFF & (int) binaryData[i]);//取得第一位，然后向左偏移8位
//            val <<= 8;
//            //第二位需要判断，则令trip为true
//            if ((i + 1) < binaryData.length) {
//                val |= (0xFF & (int) binaryData[i + 1]);
//                trip = true;
//            }
//            val <<= 8;
//            //第三位需要判断，则令quad为true
//            if ((i + 2) < binaryData.length) {
//                val |= (0xFF & (int) binaryData[i + 2]);
//                quad = true;
//            }
//            //0x3F ===>63
//            result[index + 3] = alphabet[quad ? val & 0x3F : 64];
//            val >>= 6;
//            result[index + 2] = alphabet[trip ? val & 0x3F : 64];
//            val >>= 6;
//            result[index + 1] = alphabet[val & 0x3F];
//            val >>= 6;
//            result[index + 0] = alphabet[val & 0x3F];
//        }
//
//        String ss = String.valueOf(result[0]);
//        for (int i = 1; i < result.length; i++) {
//            ss = ss + result[i];
//        }
////        return Arrays.toString(result);
//
//        return ss;
// }
//
// public static byte[] decode(String s) {
//        char[] data = s.toCharArray();
//        //计算原始数据字节长度
//        int length = ((data.length + 3) / 4) * 3;
//        if (data.length > 0 && data[data.length - 1] == '=') {
//            length--;
//        }
////        data.length > 0 data.length > 1 防止数组访问越界，很重要
//        if (data.length > 1 && data[data.length - 2] == '=') {
//            length--;
//        }
//        byte[] result = new byte[length];
//        int shift = 0;
//        int accum = 0;
//        int index = 0;
//        for (int i = 0; i < data.length; i++) {
//            int value = (codes[data[i] & 0xFF]);
//            if (value >= 0) {
//                accum <<= 6;
//                shift += 6;
//                accum |= value;
//                if (shift >= 8) {
//                    shift -= 8;
//                    result[index++] = (byte) ((accum >> shift) & 0xFF);
//                }
//            }
//        }
//        if (index != result.length)
//            throw new Error("解码错误");
//        return result;
//
// }
//
// public static void main(String[] args) {
//    byte[] a = { 1, 2, 3, -7, -9, 110 };
//    String s = encode(a);
//    System.out.println(s);
//    byte[] b = decode(s);
//    for(int i=0;i<b.length;i++) {
//       System.out.print(b[i] + " ");
//    }
//    System.out.println();
//
// }
//
//}
