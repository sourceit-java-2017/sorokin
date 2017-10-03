public class Demo {
    public static void main(String[] args) {
        MyList myList = new MyListImpl();
        System.out.println(myList.size());
        myList.set(1, new Person());
        System.out.println(myList.get(1));
        myList.clear();
        System.out.println(myList.get(1));
    }
}
