package com.hashtablelinear;

public class Hash5 {


    private Node [] datamap;
    private  int size = 10;
    class Node {

        String key;
        int value;
        Node next;
        Node (String key,int value){
            this.key = key;
            this.value = value;
        }
    }
    Hash5(){
        datamap = new Node[size];

    }

    public int hash(String key){

        int hash = 0;
        char[] arr = key.toCharArray();
        for(int i=0;i<arr.length;i++){
            int ascii = arr[i];
            hash = (hash+ascii)%datamap.length;
        }
        return  hash;

     }

     public void Set(String key,int value){
        Node newnode = new Node(key, value);
        int index = hash(key);
        if(datamap[index]== null){
            datamap[index] = newnode;
        }
        else {
            Node temp = datamap[index];
            while(temp.next!= null){
                temp = temp.next;
            }
            temp.next = newnode;
        }

     }

     public int get(String key){
        int index = hash(key);
        Node temp = datamap[index];
        while(temp!=null){
            if(temp.key==key){
                return temp.value;
            }
            temp=temp.next;
        }
        return 0;

     }

     public void print(){
        for(int i=0;i< datamap.length;i++){
            System.out.print(i+":");
            Node temp = datamap[i];
            while (temp!=null){
                System.out.println(""+temp.key+" "+temp.value+"");
                temp = temp.next;
            }
        }
     }
}

class mainHash5{

    public static void main(String[] args) {
        Hash5 hash = new Hash5();
        hash.Set("Aravind",70);
        hash.Set("Arun",70);
        hash.Set("Sreekanth",70);
        hash.Set("KKKKK",10);
        hash.Set("kjan",20);

        hash.print();
        System.out.println(hash.get("Aravind"));
    }
}
