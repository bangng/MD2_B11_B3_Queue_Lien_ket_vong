import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Solution.Queue a = new Solution.Queue();
        a.front = a.rear = null;
        Solution.enQueue(a,10);
        Solution.enQueue(a,15);
        Solution.enQueue(a,12);
        Solution.enQueue(a,20);
        Solution.displayQueue(a);
        System.out.printf("Delete value = %d", Solution.deQueue(a));
        System.out.printf("Delete value = %d", Solution.deQueue(a));
        Solution.displayQueue(a);

        Solution.enQueue(a,45);
        Solution.enQueue(a,97);
        Solution.displayQueue(a);


    }
}
