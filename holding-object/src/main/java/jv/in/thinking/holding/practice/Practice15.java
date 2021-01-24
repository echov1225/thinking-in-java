package jv.in.thinking.holding.practice;

import jv.in.thinking.commons.utils.Stack;

/***
 * 栈在编程语言中经常会用来对表达式求值。请使用{@link jv.in.thinking.commons.utils.Stack}
 * 对下面的表达式求值，其中"+"表示"将后面的字母压进栈"，而"-"表示"弹出栈顶字母并打印它":
 * "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---"
 */
public class Practice15 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("U");
        stack.push("n");
        stack.push("c");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push("e");
        stack.push("r");
        stack.push("t");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push("a");
        System.out.println(stack.pop());
        stack.push("i");
        System.out.println(stack.pop());
        stack.push("n");
        stack.push("t");
        stack.push("y");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push("r");
        stack.push("u");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push("l");
        stack.push("e");
        stack.push("s");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
