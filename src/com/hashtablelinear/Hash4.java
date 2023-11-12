package com.hashtablelinear;

public class Hash4 {
    private  int size = 11;
    private  Node[] datamap;
    class  Node {
        int key;
        String value;
        Node next;

        Node(int key,String value){
            this.key = key;
            this.value = value;

        }
    }
    Hash4(){
        datamap = new Node[size];
    }

    public int  hash(int key){
        int k = key;
        int hash = 0;
        hash = (hash+k)%size;
        return hash;

    }
    public void set(int key,String value) {
        Node newnode = new Node(key, value);
        int val = hash(key);
        int index = val % size;
        if (datamap[index] == null) {
            datamap[index] = newnode;

        } else {
            for (int i = 0; i < size; i++) {
                index = (val + i) % size;
                if (datamap[index] == null) {
                    datamap[index] = newnode;
                    break;
                }
            }
        }
    }
        public void print(){
            for(int i=0;i<datamap.length;i++){
                System.out.print(i+" :");
                Node temp = datamap[i];
                while (temp!=null){
                    System.out.print(" "+temp.key+" "+temp.value);
                    temp=temp.next;
                }
                System.out.println();
            }
        }




}

class imp{
    public static void main(String[] args) {

        Hash4 newhash = new Hash4();
        newhash.set(89,"ARAVIND");
        newhash.set(89,"ARAVIND");
        newhash.set(89,"ARAVIND");
        newhash.set(89,"ARAVIND");
        newhash.set(89,"ARAVIND");
        newhash.set(89,"ARAVIND");
        newhash.set(89,"ARAVIND");

        newhash.set(89,"ARAVIND");
        newhash.set(89,"ARAVIND");
        newhash.set(8,"ARAVIND");
        newhash.set(89,"ARAVIND");

        newhash.print();


    }
}





