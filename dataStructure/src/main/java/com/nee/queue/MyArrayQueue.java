package com.nee.queue;

public class MyArrayQueue<Item> implements Queue<Item>{

  Item[] items = (Item[]) new Object[1];
  private int top =0;
  private int bottom =0;
  
  public void enQueue(Item item) {
    if((bottom-top)>=items.length){
      resize(2*items.length);
    }
    items[bottom++] = item;
  }
  public void deQueue() throws Exception{
    if(top>bottom){
      throw new Exception();
    }
    items[top++] = null;
    if((bottom-top)<=items.length/4){
      resize(items.length/2);
    }
  }
  public int size() {
    return (bottom-top);
  }
  public void elements(){
    if(items.length>0){
      for (int i=top;i<bottom;++i) {
       System.out.println(items[i]);
      }
    }
  }
  private void resize(int n){
    Item[] temp = (Item[]) new Object[n];
    int j=bottom-top;
    for (int i=bottom-1;i>=top;i--) {
      temp[--j] = items[i];
    }
    bottom = bottom-top;
    top = 0;
    items = temp;
  }
}
