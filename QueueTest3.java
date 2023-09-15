public class QueueTest3
{   public static void main(String[] args)
    {   QueueInterface<Integer> queue = new LinkedQueue<Integer>();
        
        //use enqueue method
        queue.enqueue(-1);
        queue.display();
        queue.enqueue(0);
        queue.display();
        queue.enqueue(1);
        queue.display();
        queue.enqueue(5);
        queue.display();
        
        while (!(queue.isEmpty()))
        {  //remove head element
           int removedItem = queue.dequeue();
           System.out.printf("%n%d dequeued%n", removedItem);
           queue.display();
        }
    }
}