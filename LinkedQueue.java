/**
 * A class of queue whose entries are stored in a singly linked list
 *
 * @author Jing Hua Ye
 * @date Oct 26 2021
 * @version 1.0
 */
 public class LinkedQueue<T> implements QueueInterface<T>
 {
/* =============================================================================
                        HELPER CLASSES
   =============================================================================
 */
    /**
     * A class represents a node, which contains two parts - data and pointer 
     * to the next node
     */
     private class Node
     {    //the data of a node
          private T data;
          //pointer to the next node
          private Node next;

          /**
           * To create a new node instance with a specific data and pointer of 
           * the next node
           * @param data the data of a specific node
           * @param next the pointer of a specific next node
           */
           public Node(T data, Node next)
           {  this.data = data;
              this.next = next;
           }

          /**
           * To get the data of this node 
           * @return the data of this Node
           */
           public T getData()
           {   return data;  
           }

          /**
           * To get the pointer of the next node 
           * @return the pointer of the next Node
           */
           public Node getNextNode()
           {  return next;
           }

          /**
           * To set the data of this node 
           * @param data the data of this node 
           */
           public void setData(T data)
           {  this.data = data;
           }   
          
          /**
           * To set the pointer of next node 
           * @param nextNode the pointer of the next node 
           */
           public void setNextNode(Node nextNode)
           {  next = nextNode;
           }
     }

/*==============================================================================
                        INSTANCE VARIABLES
  ==============================================================================
*/
    //References node at the front of queue
    private Node firstNode;

    //References node at the rear of queue
    private Node lastNode;

    //the number of data nodes in the queue
    private int numNodes;

/*==============================================================================
                      CONSTRUCTORS
  ==============================================================================
*/
 /**
  * A default constructor for this queue
  */
  public LinkedQueue()
  {
      firstNode = null;
      lastNode = null;
      //to-complete
  }

/* =============================================================================
                     INSTANCE METHODS
   =============================================================================
 */
/* ------------------- Getters -----------------------------------------------*/
  /**
   * Count the number of entries in this queue
   * @return the number of entries in this queue
   */
   public int size()
   {
       return numNodes;
       //to-complete
   } 
/* ------------------- Other methods -----------------------------------------*/
  
  /**
   * Detects whether this queue is empty
   * @return True if the queue is empty, or false otherwise
   */
   public boolean isEmpty()
   {
       return firstNode == null && lastNode == null;
       //to-complete
   }
  
  /**
   * Retrieve the entry at the font of this queue
   * @return The object at the front of the queue
   */
   public T getFront()
   {
     { if (isEmpty())
         System.out.println("The queue is empty, cannot get front");
       else
           return firstNode.getData();
        //to-complete
     }
     return null;
   } 
  
  /**
   * Remove and returns the entry at the front of this queue
   * @return The object at the front of the queue
   */
   public T dequeue()
   {
       T first = getFront();
       firstNode.setData(null);
       firstNode = firstNode.getNextNode();
       if (firstNode == null || firstNode == lastNode)
            lastNode = null;

       return first;
       //to-complete
   }
  
  /**
   * Adds a new entry to the back of this queue
   * @param newEntry An object to be added
   */
   public void enqueue(T newEntry)
   {
       Node newNode = new Node(newEntry, null);
       if (isEmpty()){
           firstNode = newNode;
       }
       else {
           lastNode.setNextNode(newNode);
       }
       lastNode = newNode;
       //to-complete
   } 
  
  /**
   * Removes all entries from this queue
   */
   public void clear()
   {
       firstNode = null;
       lastNode = null;
       numNodes = 0;
       //to-complete
   }

  /**
   * List out all entries in this queue
   */
   public void display()
   {
       if (firstNode == null) {
           System.out.print("\nQueue Empty");
       }
       else {
           Node temp = firstNode;
           while (temp != null) {

               // print node data
               System.out.print(temp.data);
               System.out.print(" ");

               // assign temp link to temp
               temp = temp.next;
               if(temp == null) {
                   System.out.println();
               }
           }
       }
       //to-complete
   } 
 }
