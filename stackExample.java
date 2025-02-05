import java.util.Stack;

public class stackExample {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        System.out.println(" checking stack capacity "+stack.capacity());
        System.out.println("checking stack size"+stack.size());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        System.out.println(stack);

        System.out.println(stack.peek());

    }
}
