package com.nee.queue;

public interface Queue<Item> {

  public void enQueue(Item item);
  public void deQueue() throws Exception;
  public int size();
  public void elements();
}
