package com.nee.stack;

public class MyArrayStack<Item> implements Stack<Item>{

  private int size = 0;
  Item[] items = (Item[]) new Object[1];
  
  public void push(Item item) {
    if(size>=items.length){
      resize(2*items.length);
    }
    items[size++] = item;
  }
  public void pop() throws Exception{
    if(size==0){
      throw new Exception();
    }
    items[--size] = null;
    if(size<=items.length/4){
      resize(items.length/2);
    }
  }
  public int size() {
    return size;
  }
  public void elements(){
    if(items.length>0){
      for (int i=size-1;i>=0;i--) {
       System.out.println(items[i]);
      }
    }
  }
  private void resize(int n){
    Item[] temp = (Item[]) new Object[n];
    for (int i=size-1;i>=0;i--) {
      temp[i] = items[i];
    }
    items = temp;
  }
}
