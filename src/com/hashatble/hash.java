package com.hashatble;

public class hash {

    private  int size=7;
    private  Node[] datamap;
    class  Node{
        int key;
        String value;
        Node next;
        Node(int key,String value){
            this.key=key;
            this.value=value;
        }
    }
    hash() {
        datamap = new Node[size];
    }

    public void printtable(){
        for(int i=0;i<datamap.length;i++){
            System.out.println(i+":");
            Node temp=datamap[i];
            while (temp!=null){
                System.out.println(temp.key+" "+temp.value);
                temp=temp.next;
            }
        }
    }

    public int   hashfnc(int  key){
        int hash=0;
        int k=key;
        hash=(hash+k)% datamap.length;
        return  hash;
    }

    public void set(int key,String value){
        int index=hashfnc(key);
        Node newnode = new Node(key, value);
        if(datamap[index]==null){
            datamap[index]=newnode;
        }
        else {
            Node temp = datamap[index];
            while (temp != null) {
                temp = temp.next;
            }
               temp.next=newnode;
        }

    }

}

class  main{

    public static void main(String[] args) {
        hash newhash = new hash();
        newhash.set(6,"Aravind");
        newhash.set(12,"Sreekanth");
        newhash.set(78,"Shayam");

        newhash.printtable();
    }
}
