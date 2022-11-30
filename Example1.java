package StackClass;

import java.util.Stack;

public class Example1 {

    static void showPush(Stack st, int a){
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }

    static void showPop(Stack st){
        System.out.println("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack " + st);
    }

    public static void main(String[] args) {

        Stack st = new Stack();
        System.out.println("stack " + st);
        showPush(st, 23);
        showPush(st, 45);
        showPop(st);
    }
}
