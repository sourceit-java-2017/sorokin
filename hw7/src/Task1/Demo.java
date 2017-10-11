package Task1;

public class Demo {
    public static void main(String[] args) {
        Task1 arrays = new Task1();
        System.out.println(arrays.arrMillion.size());
        System.out.println(arrays.linkMillion.size());

        arrays.addArrListElements();
        arrays.addLinkListElements();
        arrays.deleteArrListElements();
        arrays.deleteLinkListElements();
        arrays.printArrListElements();
        arrays.printLinkListElements();
    }
}
