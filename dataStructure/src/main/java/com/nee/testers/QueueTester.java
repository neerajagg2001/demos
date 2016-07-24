package com.nee.testers;

import com.nee.queue.MyArrayQueue;

public class QueueTester {
 
  public static void main(String[] args) {
    try{
    MyArrayQueue<String> myQueue = new MyArrayQueue<String>();
    System.out.println("Queue size: "+myQueue.size());
    myQueue.elements();
    myQueue.enQueue("My");
    System.out.println("Queue size: "+myQueue.size());
    myQueue.elements();
    myQueue.enQueue("Name");
    System.out.println("Queue size: "+myQueue.size());
    myQueue.elements();
    myQueue.enQueue("is");
    System.out.println("Queue size: "+myQueue.size());
    myQueue.elements();
    myQueue.enQueue("Neeraj");
    System.out.println("Queue size: "+myQueue.size());
    myQueue.elements();
    myQueue.enQueue("And");
    System.out.println("Queue size: "+myQueue.size());
    myQueue.elements();
    myQueue.enQueue("your");
    System.out.println("Queue size: "+myQueue.size());
    myQueue.elements();
    myQueue.enQueue("name");
    System.out.println("Queue size: "+myQueue.size());
    myQueue.elements();
    myQueue.enQueue("is");
    System.out.println("Queue size: "+myQueue.size());
    myQueue.elements();
    myQueue.enQueue("Kamna");
    System.out.println("Queue size: "+myQueue.size());
    myQueue.elements();
    myQueue.deQueue();
    System.out.println("Queue size: "+myQueue.size());
    myQueue.elements();
    myQueue.deQueue();
    System.out.println("Queue size: "+myQueue.size());
    myQueue.elements();
    myQueue.deQueue();
    System.out.println("Queue size: "+myQueue.size());
    myQueue.elements();
    myQueue.deQueue();
    System.out.println("Queue size: "+myQueue.size());
    myQueue.elements();
    myQueue.deQueue();
    System.out.println("Queue size: "+myQueue.size());
    myQueue.elements();
    myQueue.deQueue();
    System.out.println("Queue size: "+myQueue.size());
    myQueue.elements();
    myQueue.deQueue();
    System.out.println("Queue size: "+myQueue.size());
    myQueue.elements();
    myQueue.deQueue();
    System.out.println("Queue size: "+myQueue.size());
    myQueue.elements();
    }
    catch(Exception ex){
      System.out.println("error"+ex.getMessage());
    }
  }
  
 
}
