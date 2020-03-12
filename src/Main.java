public class Main {
    public static void main(String[] args){

        String [] names = {"Carlos", "Alex", "Isaac","Carlos", "Daniela", "Dan"};

        NameLL list = new NameLL(names[0]);
        list.fromNamesArray(names);

        list.printLL();
        System.out.println();
        list.method1();
    }
}
