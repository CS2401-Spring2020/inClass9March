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
    public void addName(String name){
        NameLL current = this;
        while(current.next!=null){
            current = current.next;
        }
        current.next = new NameLL(name);
    }

    public void printLL(){
        NameLL temp = this;
        while(temp!=null){
            System.out.println("name: " + temp.name + " counter: " + this.counter);
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
    public NameLL fromNamesArray(String [] names){
        if(names.length == 0){
            return null;
        }
        NameLL list = new NameLL(names[0]);
        for(int i = 1; i < names.length; i++){
            addName(names[i]);
        }
        return list;
    }
}
