package ss9_dsa_danh_sach.bai_tap.trien_khai_phuong_thuc_linked_list;


public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4, 9);
        ll.add(2);
        ll.printList();


    }
}
