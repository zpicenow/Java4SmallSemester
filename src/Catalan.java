//
//public class Catalan {
//
//    public static int answers = 0;
//
//    //
//    public static void go(Deque from, Deque to, Stack s) {
//        Deque inqueue = new Deque();
//        inqueue = from.clone();
//        Stack st = new Stack();
//        st = s.clone();
//        Deque out = new Deque();
//        out = to.clone();
//        if (inqueue.size() == 0 && st.empty() && out.size() == 0) {
//            return;
//        }
//        if (out.size() == 7) {
//            while (out.size() != 0) {
//                System.out.print(out.getFirst());
//                out.removeFirst();
//            }
//            System.out.println();
//            answers++;
//            return;
//        }
//        Stack stcopy = new Stack();
//        stcopy = st.clone();
//        Deque outcopy = new Deque();
//        outcopy = out.clone();
//        if (!st.empty()) {
//            out.addLast(st.pop());
//            go(inqueue, out, st);
//        }
//        if (inqueue.size() != 0) {
//            stcopy.push(inqueue.getFirst());
//            inqueue.removeFirst();
//            go(inqueue, outcopy, stcopy );
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Deque from = new Deque();
//        Deque to = new Deque();
//        Stack s = new Stack();
//
//        for(int i=1;i<=7;i++) {
//            from.addLast(i);
//        }
//
//        go(from, to, s);
//
//        System.out.println(answers);
//
//
//    }
//
//
//
//}