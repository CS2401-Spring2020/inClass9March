/*
Carlos Chavez
CS2401
Demo done in class Wednesday, March 11 2020
Note: Recall that adding a counter functionality was not fully implemented
by the end of the lab. Currently NameLL is adding every name to the
end of the list, repeated or not, NOT incrementing the counter.
Please consider that if you are using this class as a reference for your lab
 */

public class Main {
    public static void main(String[] args){

        String [] names = {"Carlos", "Alex", "Isaac","Carlos", "Daniela", "Dan", "Dan"};

        NameLL list = NameLL.fromNamesArray(names);

        list.printLL();
        System.out.println();
        list.method1();
    }
}
