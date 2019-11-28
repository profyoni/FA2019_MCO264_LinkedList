package edu.touro.cmo264;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyStack {

    private List<String> bs = new LinkedList<>();
    //private List<String> bs = new ArrayList<>(); //not recommended

    public void push(String s){
        bs.add(0,s);
    }

    public String pop(){
        return bs.remove(0);
    }
}

class MyStack2 {

    private List<String> bs = new ArrayList<>();
    public void push(String s){
        bs.add(s); // amortized O(1)
    }

    public String pop(){
        return bs.remove(bs.size()-1);
    }
}
class Queue {

    private List<String> bs = new LinkedList<>();
    public void enqueue(String s){
        bs.add(s);
    }

    public String pop(){
        return bs.remove(0);
    }
}
class Queue2 {

    private List<String> bs = new ArrayList<>();
    public void enqueue(String s){
        bs.add(s);
    }

    public String pop(){
        return bs.remove(0);
    }
}