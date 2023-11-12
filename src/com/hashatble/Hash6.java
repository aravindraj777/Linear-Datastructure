package com.hashatble;

public class Hash6 {
    private int size=10;
    private Node [] datamap;
    class  Node {
        int key;
        String value;
        Node next;
        Node (int key,String value){
            this.key=key;
            this.value=value;
        }

    }
    Hash6(){
        datamap = new Node[size];
    }

    public  int  hash(int key){
        int hash=0;
        int k=key;

        hash=(hash+k)%datamap.length;
        return hash;
    }

    public void set(int key,String value){
        Node newnode= new Node(key,value);
        int index=hash(key);
        if(datamap[index]==null){
            datamap[index]=newnode;
        }
        else {
            Node temp=datamap[index];
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    public void print(){
        for(int i=0;i<datamap.length;i++){
            System.out.print(i+": ");
            Node temp=datamap[i];
            while (temp!=null){
                System.out.print(" "+temp.key+" "+temp.value+",");
//
                temp=temp.next;
            }
            System.out.println();
        }
        System.out.println();
    }
    public String get(int key){
        int index=hash(key);
        Node temp=datamap[index];
        while(temp!=null){
            if(temp.key==key){
                return temp.value;
            }
            temp=temp.next;

        }
        return null;
    }

//    public void remove(int key){
//        int index=hash(key);
//        Node temp=datamap[index];
//        while (temp!=null){
//            if(temp.key==key){
//                temp=temp.next;
//            }
//
//        }
//    }

//    public void remove(int key){
//        int index=hash(key);
//        Node  prev=null;
//        Node  current=datamap[index];
//        while(current!=null){
//            if(current.key==key){
//                if(prev==null){
//                    datamap[index]=current.next;
//                }
//                else {
//                    prev.next=current.next;
//
//                }
//            }
//            prev=current;
//            current=current.next;
//
//        }
//
//
//    }

    public void remove(int key){
        int index=hash(key);
        Node prev=null;
        Node current=datamap[index];
        while(current!=null){
            if(current.key==key){
                if(prev==null){
                    datamap[index]=current.next;
                }
                else{
                    prev.next=current.next;
                }
            }
            prev=current;
            current=current.next;
        }
    }
}

class  mainHash6{
    public static void main(String[] args) {
        Hash6 newhassh =  new Hash6();
        newhassh.set(4,"Aravind");
        newhassh.set(14,"Adarash");
        newhassh.set(78,"Joy");
        newhassh.set(90,"Subhash");
        newhassh.set(10,"Arun");
        newhassh.set(44,"Shyam");
        newhassh.set(11,"Sreeekanth");
        newhassh.set(12,"Arya");


        newhassh.print();

        System.out.println();

        System.out.println(newhassh.get(44)+"  :found");

//        newhassh.remove(11);
//        newhassh.remove(12);
        newhassh.remove(12);
        newhassh.print();

    }

}
