////public class Fibo {
////	public static void main(String[] args) {
////		Fibo f = new Fibo();
////		System.out.println(f.fibo1(9)); // �����ַ���ѭ��Ч�ʸ���
////		System.out.println(f.fibo2(9));
////	}
////
////	public int fibo1(int n) { // ʹ�÷������������ݹ���ʵ��
////
////        if (n == 1 || n == 2) {
////            return 1;
////        } else {
////            return fibo1(n - 1) + fibo1(n - 2);
////        }
////	}
////
////	public int fibo2(int n) { // ʹ��ѭ����ʵ��
////
////        int[] fibo = new int[n];
////        fibo[0] = fibo[1] = 1;
////        for (int i = 2; i < n; i++) {
////            fibo[i] = fibo[i - 1] + fibo[i - 2];
////        }
////        return fibo[n-1];
////	}
////
////}
//
// class A {
//    A() {
//        this.init();
//    }
//    public void init() {
//        System.out.println("p");
//
//    }
//}
//
//class B extends A {
//    int i = 4;
//
//    B(int i) {
//        this.i = i;
//    }
//    public void init() {
//        System.out.println(i);
//        System.out.println("q");
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println(new B(5).i);
//
//    }
//}