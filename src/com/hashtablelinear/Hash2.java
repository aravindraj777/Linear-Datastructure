package com.hashtablelinear;

public class Hash2 {
    private  int size = 10;
    private Node[] datamap;
    class  Node{
        int key;
        String value;
        Node next;
        Node (int key,String value){
            this.key=key;
            this.value=value;
        }

    }

    Hash2 (){
         datamap = new Node[size];
    }

    public int hash(int key){
        int hash = 0;
        int k=key;
        hash = (hash+key);
        return hash;
    }

    public void Set(int key,String value){
        Node newnode = new Node(key, value);
        int val= hash(key);
        int index = val%size;

        if(datamap[index]==null){
            datamap[index]=newnode;
        }
        else {
            for(int i=0;i<size;i++){
                index=(val+i)%size;
                if(datamap[index]==null){
                    datamap[index]=newnode;
                    break;
                }

            }
        }
    }

    public String get(int key){
        int val= hash(key);
        int index = val%size;
        if(datamap[index].key==key){
            return datamap[index].value;
        }
        else {
            for(int i=0;i<size;i++){
                index = (val+i)%size;
                if(datamap[index].key == key){
                    return datamap[index].value;
                }
            }
        }
        return null;
    }

    public void print(){
        for(int i=0;i<datamap.length;i++){
            System.out.print(i+":");
            Node temp = datamap[i];
            while(temp!=null){
                System.out.print(" "+temp.key+" "+temp.value);
                temp=temp.next;
            }
            System.out.println();
        }
    }
}

class mainhash2{

    public static void main(String[] args) {

        Hash2 newhash  = new Hash2();

        newhash.Set(10,"Aravind");
        newhash.Set(20,"Jithin");
        newhash.Set(30,"Athul");
        newhash.Set(40,"Sheet");
        newhash.Set(50,"Anusasi");
        newhash.Set(60,"AthulAjith");
        newhash.Set(70,"Nandhu");
        newhash.Set(80,"Unni");
        newhash.Set(100,"Athul");

        newhash.print();

        System.out.println(newhash.get(80));


    }
}
