package com.nee.stack;

public interface Stack<Item> {

  public void push(Item item);
  public void pop() throws Exception;
  public int size();
  public void elements();
}
