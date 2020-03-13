/*
Carlos Chavez
CS2401
Demo done in class Wednesday, March 11 2020
Note: Recall that adding a counter functionality was not fully implemented
by the end of the lab.
That functionality has been added, hopefully it helps with your lab.
 */

public class NameLL {

    String name;
    int counter;
    NameLL next;

    public NameLL(String name){
        this.name = name;
        this.counter = 0;
        this.next = null;
        incrementCounter();

    }
    // method to increment counter
    public void incrementCounter(){
        this.counter++;
    }

    // method to add name to linked list
    public void addName(String inName){
        /*
        *** RECURSIVE VERSION ***
        if(name.equals(inName)){
            incrementCounter();
        }else{
            if(next == null){
                next = new NameLL(inName);
            }else{
                next.addName(inName);
            }
        }*/

        NameLL current = this;
        while(current != null){
            if(current.name.equals(inName)){
                current.incrementCounter(); // incrementing counter here when name is found in list
                return;
            }
            if(current.next == null){
                current.next = new NameLL(inName);
                return;
            }
            current = current.next;
        }
    }

    public void printLL(){
        NameLL temp = this;
        while(temp!=null){
            System.out.println("name: " + temp.name + " counter: " + temp.counter);
            temp = temp.next;
        }
    }

    // method to print linked list recursively
    public void method1(){
        if(this.next==null){
            System.out.println("Name: " + this.name);
            return;
        }
        this.next.method1();
        System.out.println("Name: " + this.name);
    }

    // method to create linked list after receiving an array of strings
    public static NameLL fromNamesArray(String [] names){
        if(names.length == 0){
            return null;
        }
        NameLL list = new NameLL(names[0]);
        for(int i = 1; i < names.length; i++){
            //list.printLL();
            //System.out.println();
            list.addName(names[i]);
        }
        return list;
    }
}
