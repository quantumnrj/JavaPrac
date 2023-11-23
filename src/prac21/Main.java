package prac21;
public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------
        // Тестирование ArrayQueueModule
        System.out.println("Testing ArrayQueueModule. enqueuing 5, 15, 3");
        ArrayQueueModule.enqueue(5);
        ArrayQueueModule.enqueue(15);
        ArrayQueueModule.enqueue(3);
        System.out.println("First element: " + ArrayQueueModule.element());
        System.out.println("Removed element: " + ArrayQueueModule.dequeue());
        System.out.println("Queue size after dequeue: " + ArrayQueueModule.size());
        ArrayQueueModule.clear();
        System.out.println("Queue size after clear: " + ArrayQueueModule.size() + "\n");
        //--------------------------------------------------------------------------------
        // Тестирование ArrayQueueADT
        System.out.println("Testing ArrayQueueADT. enqueuing 10, 3, 5");
        ArrayQueueADT queueADT = new ArrayQueueADT();
        ArrayQueueADT.enqueue(queueADT, 10);
        ArrayQueueADT.enqueue(queueADT, 3);
        ArrayQueueADT.enqueue(queueADT, 5);
        System.out.println("First element: " + ArrayQueueADT.element(queueADT));
        System.out.println("Removed element: " + ArrayQueueADT.dequeue(queueADT));
        System.out.println("Queue size after dequeue: " + ArrayQueueADT.size(queueADT));
        ArrayQueueADT.clear(queueADT);
        System.out.println("Queue size after clear: " + ArrayQueueADT.size(queueADT));
        System.out.println();
        //--------------------------------------------------------------------------------
        // Тестирование ArrayQueue
        System.out.println("Testing ArrayQueue. enqueuing 77, 1, 0");
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(77);
        queue.enqueue(1);
        queue.enqueue(0);

        System.out.println("First element: " + queue.element());
        System.out.println("Removed element: " + queue.dequeue());
        System.out.println("Queue size after dequeue: " + queue.size());

        queue.clear();
        System.out.println("Queue size after clear: " + queue.size());
    }
}
