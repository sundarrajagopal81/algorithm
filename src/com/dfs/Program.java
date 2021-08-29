package com.dfs;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String args[]){
        Program.Node graph = new Program.Node("A");
        graph.addChild("B").addChild("C").addChild("D");
        graph.children.get(0).addChild("E").addChild("F");
        graph.children.get(2).addChild("G").addChild("H");
        graph.children.get(0).children.get(1).addChild("I").addChild("J");
        graph.children.get(2).children.get(0).addChild("K");
        List<String> inputArray = new ArrayList<String>();
        System.out.println("LIST:"+graph.depthFirstSearch(inputArray));
    }

    static class Node{
        String name;
        List<Node>  children = new ArrayList<>();
        public Node(String name){
            this.name = name;
        }
        public List<String> depthFirstSearch(List<String> array){
            array.add(this.name);
            for(int i=0;i<children.size();i++){
                children.get(i).depthFirstSearch(array);
            }
            return array;
        }
        public Node addChild(String name){
            Node child  = new Node(name);
            children.add(child);
            return this;
        }
    }
}