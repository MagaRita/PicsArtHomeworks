package homework9;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("-----------Stack---------------");
        Stack<String> stack = new Stack<>();

        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("20");
        stack.push("90");
        stack.push("100");
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Let's first check whether the stack is empty or not.");
        System.out.println("Is the Stack empty? - " + stack.isEmpty());

        if(stack.empty()) {
            return;
        }

        System.out.println("The Stack elements are:");
        Iterator iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        String topElement = stack.pop();
        int index = stack.search("A");
        int size = stack.size();

        System.out.println("The top element of the stack is: " + topElement);
        System.out.println("The index of A element is: " + index);
        System.out.println("After removing the top element, the size of the stack is: " + size);

        System.out.println("Now the Stack is as follows: " + stack);

        System.out.println("Let's remove element: " + stack.pop());
        System.out.println("Let's remove element: " + stack.pop());
        System.out.println("The Stack now looks as follows:");
        //Let's iterate over a Stack using forEach() method.
        stack.forEach(st -> {
            System.out.println(st);
        });

        System.out.println("The top element of the Stack is: " + stack.peek());
        System.out.println("peek() doesn't remove the element from the stack. The stack is as follows:");
        Iterator<String> iterator2 = stack.iterator();
        while (iterator2.hasNext()) {
            String it = iterator2.next();
            System.out.println(it);
        }

        int position = stack.search("30");

        if(position != -1) {
            System.out.println("Found the element 30 at position : " + position);
        } else {
            System.out.println("Element 30 not found in the stack.");
        }

        System.out.println("\n-----------------\n");

        System.out.print("Let's show the Stack elements using forEachRemaining: ");
        Iterator<String> iterator3 = stack.iterator();
        iterator3.forEachRemaining(element -> {
            System.out.print(element + " ");
        });

        System.out.println("\n");
        System.out.println("----------------------");

        System.out.println("\nLet's reverse a Java list using a stack.");

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("The list is as follows:");
        System.out.println(list);

        Stack<String> stack2 = new Stack<>();
        while(list.size() > 0) {
            stack2.push(list.remove(0));
        }

        while(stack2.size() > 0){
            list.add(stack2.pop());
        }

        System.out.println("The reversed list is as follows:");
        System.out.println(list);

        System.out.println("\n----------------------\n");

        System.out.println("Let's convert a stack to array:");
        Object[] array = stack.toArray();
        //print the array
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]+ " ");

        System.out.println("\n\n----------------------\n");

        System.out.println("Java Deque can be used as a stack too:");
        Deque<String> dequeAsStack = new ArrayDeque<>();

        dequeAsStack.push("first");
        dequeAsStack.push("second");
        dequeAsStack.push("third");

        System.out.println("The first deque element is: " + dequeAsStack.pop());
        System.out.println("The first deque element is: " + dequeAsStack.pop());
        System.out.println("The first deque element is: " + dequeAsStack.pop());

        System.out.println("\n----------------------\n");

        System.out.println("Now let's have a stack full of integers:");
        Stack<Integer> stack3 = new Stack<>();
        stack3.add(1);
        stack3.add(2);
        stack3.add(0, 1000);

        for (int element : stack3) {
            System.out.println(element);
        }

        System.out.println();

        System.out.println("-----------Priority Queue---------------");

        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        pQueue.add(1);
        pQueue.add(2);
        pQueue.add(3);

        System.out.println("Is the priority queue empty? " + pQueue.isEmpty());

        if(pQueue.isEmpty()){
            return;
        }

        System.out.println("The priority queue size is: " + pQueue.size());
        System.out.println("The priority queue is: " + pQueue);
        System.out.println("The top element for the priority queue is: " + pQueue.peek());
        System.out.println("The top element for the priority queue will now be removed: " + pQueue.poll());
        System.out.println("Now the top element is: " + pQueue.peek());
        System.out.println("The priority queue is: " + pQueue);

        System.out.println("\n----------------------\n");

        System.out.println("Let's print the priority queue:");
        Iterator iterator4 = pQueue.iterator();
        while (iterator4.hasNext()) {
            System.out.print(iterator4.next() + " ");
        }

        System.out.println();

        while (!pQueue.isEmpty()) {
            System.out.println("Removing the elements from the priority queue: " + pQueue.remove());
        }
        System.out.println("Is the priority queue empty? " + pQueue.isEmpty());

        System.out.println("\n----------------------\n");

        PriorityQueue<String> pQueue2 = new PriorityQueue<>();

        pQueue2.add("one");
        pQueue2.add("two");
        pQueue2.add("three");

        System.out.println("The priority queue is: " + pQueue2);
        System.out.println("Let's convert a priority queue to array:");
        Object[] array2 = pQueue2.toArray();
        for (int i = 0; i < array2.length; i++)
            System.out.print(array2[i]+ " ");

        System.out.println("\n\n----------------------\n");

        pQueue2.clear();
        System.out.println("The priority queue is: " + pQueue2);
        }
}