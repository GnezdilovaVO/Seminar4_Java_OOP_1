public class Main {
    public static void main(String[] args) {
        ListGB<Integer> list = new ArrayListGB<>();
        System.out.println(list.size());
        list.add(12);
        list.add(65);
        list.add(846);
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        list.update(2, 43);
        System.out.println(list.get(2));
        System.out.println(list.size());
        ListGB<String> listString = new ArrayListGB<>();
        listString.add("AAA");
        listString.add("BBB");
        System.out.println(listString.get(1));
        list.add(33);
        System.out.println(list);
        System.out.println();
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
        ListGB<Integer> listLL = new LinkedListGB<>();
        listLL.add(12);
        System.out.println(listLL.size());
        System.out.println(listLL.get(0));
        listLL.addFirst(15);
        System.out.println(listLL.get(1));

    }
}
