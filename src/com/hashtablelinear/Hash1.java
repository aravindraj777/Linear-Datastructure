package com.hashtablelinear;

public class Hash1 {

    private  int size=10;
    private Node [] datamap;

    class  Node {
        int key;
        String value;
        Node next;
        Node(int key,String value){
            this.key=key;
            this.value=value;

        }
    }
    Hash1(){
        datamap = new Node[size];
    }

    public int hash(int key){
        int hash=0;
        int k=key;
        hash = k+hash;
        return hash;
    }

    public void set(int key,String value){
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
        int val=hash(key);
        int index=val%size;

        if(datamap[index].key==key){
            return datamap[index].value;
        }
        else {
            for(int i=0;i<size;i++){
                index=(val+i)%size;
                if (datamap[index].key==key){
                    return datamap[index].value;
                }
            }
        }
        return null;
    }
    public void print (){
        for(int i=0;i<datamap.length;i++){
            System.out.print(i+" :");
            Node temp=datamap[i];
            while(temp!=null){
                System.out.print(" "+temp.key+" "+temp.value+" ");
//                System.out.println();;
                temp=temp.next;
            }
            System.out.println();
        }
    }
}

class mainhash1{
    public static void main(String[] args) {


        Hash1 newhassh  = new Hash1();
        newhassh.set(4,"Athul chandran");
        newhassh.set(14,"Nandhu");
        newhassh.set(24,"Anu sasi");
        newhassh.set(48,"Athul Ajith");
        newhassh.set(57,"Athul Raj");
        newhassh.set(19,"jithin sudarshan");
        newhassh.set(10,"Aravind raj");
        newhassh.set(10,"Adarsh");


        newhassh.print();
        System.out.println(newhassh.get(10)+" found ");
//        System.out.println(n);

    }
}
