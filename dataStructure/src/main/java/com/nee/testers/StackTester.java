package com.nee.testers;

import com.nee.stack.MyArrayStack;

public class StackTester {

  public static void main(String[] args) {
    

    try{
    MyArrayStack<String> myStack = new MyArrayStack<String>();
    System.out.println("Stack size: "+myStack.size());
    myStack.elements();
    myStack.push("My");
    System.out.println("Stack size: "+myStack.size());
    myStack.elements();
    myStack.push("Name");
    System.out.println("Stack size: "+myStack.size());
    myStack.elements();
    myStack.push("is");
    System.out.println("Stack size: "+myStack.size());
    myStack.elements();
    myStack.push("Neeraj");
    System.out.println("Stack size: "+myStack.size());
    myStack.elements();
    myStack.push("And");
    System.out.println("Stack size: "+myStack.size());
    myStack.elements();
    myStack.push("your");
    System.out.println("Stack size: "+myStack.size());
    myStack.elements();
    myStack.push("name");
    System.out.println("Stack size: "+myStack.size());
    myStack.elements();
    myStack.push("is");
    System.out.println("Stack size: "+myStack.size());
    myStack.elements();
    myStack.push("Kamna");
    System.out.println("Stack size: "+myStack.size());
    myStack.elements();
    myStack.pop();
    System.out.println("Stack size: "+myStack.size());
    myStack.elements();
    myStack.pop();
    System.out.println("Stack size: "+myStack.size());
    myStack.elements();
    myStack.pop();
    System.out.println("Stack size: "+myStack.size());
    myStack.elements();
    myStack.pop();
    System.out.println("Stack size: "+myStack.size());
    myStack.elements();
    myStack.pop();
    System.out.println("Stack size: "+myStack.size());
    myStack.elements();
    myStack.pop();
    System.out.println("Stack size: "+myStack.size());
    myStack.elements();
    myStack.pop();
    System.out.println("Stack size: "+myStack.size());
    myStack.elements();
    myStack.pop();
    System.out.println("Stack size: "+myStack.size());
    myStack.elements();
    }
    catch(Exception ex){
      System.out.println("error"+ex.getMessage());
    }
  
  }
}
