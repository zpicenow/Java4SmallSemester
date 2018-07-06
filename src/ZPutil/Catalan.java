package ZPutil;


import javax.swing.*;
import java.util.*;

public class Catalan {

    private static int variety = 1;

    public static final void CTLOutStack(ArrayDeque<Integer> from, ArrayDeque<Integer> to, Stack<Integer> s, int num) {

        Stack<Integer> st = new Stack<>();
        cloneStack(st, s);
        ArrayDeque<Integer> inqueue = new ArrayDeque<>();
        cloneQueue(inqueue, from);
        ArrayDeque<Integer> out = new ArrayDeque<>();
        cloneQueue(out, to);
        if (num < 0 || (st.empty() && inqueue.isEmpty() && out.isEmpty())) {
            return;
        }
        if (pushOutQueue(num, out)) return;
        Stack<Integer> stcopy = new Stack<>();
        cloneStack(stcopy, st);
        ArrayDeque<Integer> outcopy = new ArrayDeque<>();
        cloneQueue(outcopy, out);
        if (!st.empty()) {
            out.addLast(st.pop());
            CTLOutStack(inqueue, out, st,num);

        }
        if (!inqueue.isEmpty()) {
            stcopy.push(inqueue.poll());
            CTLOutStack( inqueue, outcopy,stcopy, num);

        }
    }

    private static boolean pushOutQueue(int num, ArrayDeque<Integer> out) {
        if (out.size() == num) {
            System.out.print("µÚ"+ variety++ +"ÖÖ   ");
            while (!out.isEmpty()) {
                System.out.print(out.pop());


            }
            System.out.println();
            return true;
        }
        return false;
    }

    public static final void CTLOutStack(ArrayDeque<Integer> from, ArrayDeque<Integer> to, Stack<Integer> s, int num,int stackCol) {

        if (s.size() == (stackCol+1)) return;




        Stack<Integer> st = new Stack<>();
        cloneStack(st, s);
        ArrayDeque<Integer> inqueue = new ArrayDeque<>();
        cloneQueue(inqueue, from);
        ArrayDeque<Integer> out = new ArrayDeque<>();
        cloneQueue(out, to);
        if (num < 0 || (st.empty() && inqueue.isEmpty() && out.isEmpty())) {
            return;
        }
        if (pushOutQueue(num, out)) return;
        Stack<Integer> stcopy = new Stack<>();
        cloneStack(stcopy, st);
        ArrayDeque<Integer> outcopy = new ArrayDeque<>();
        cloneQueue(outcopy, out);
        if (!st.empty()) {
            out.addLast(st.pop());
            CTLOutStack(inqueue, out, st,num,stackCol);

        }
        if (!inqueue.isEmpty()) {
            stcopy.push(inqueue.poll());
            CTLOutStack( inqueue, outcopy,stcopy, num,stackCol);

        }
    }

    private static  void cloneStack(Stack<Integer> stack, Stack<Integer> stack1) {
        for (int i :
                stack1) {
            stack.push(i);

        }
    }
    private static void cloneQueue(ArrayDeque<Integer> deque, ArrayDeque<Integer> deque1) {
        for (int i :
                deque1) {
            deque.addLast(i);

        }
    }



}



