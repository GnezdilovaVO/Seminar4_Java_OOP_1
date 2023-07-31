import java.util.Iterator;

@SuppressWarnings("unchecked")
public class LinkedListGB<U> implements ListGB<U> {
    private Node<U> firstNode;
    private Node<U> lastNode;
    private int size = 0;

    public LinkedListGB() {
        firstNode = new Node<U>(null, null, lastNode);
        lastNode = new Node<U>(null, firstNode, null);
    }


    private class Node<U> {
        private U currentEl;
        private Node<U> nextEl;
        private Node<U> prevEl;

        private Node(U currentEl, Node<U> nextEl, Node<U> prevEl) {
            this.currentEl = currentEl;
            this.nextEl = nextEl;
            this.prevEl = prevEl;
        }

        public U getCurrentEl() {
            return currentEl;
        }

        public void setCurrentEl(U currentEl) {
            this.currentEl = currentEl;
        }

        public Node<U> getNextEl() {
            return nextEl;
        }

        public void setNextEl(Node<U> nextEl) {
            this.nextEl = nextEl;
        }

        public Node<U> getPrevEl() {
            return prevEl;
        }

        public void setPrevEl(Node<U> prevEl) {
            this.prevEl = prevEl;
        }
    }


        @Override
    public boolean add(U u) {
        try {
            Node<U> temp = lastNode;
            temp.setCurrentEl(u);
            lastNode = new Node<U>(null, temp, null);
            temp.setNextEl(lastNode);
            size++;
            return true;
        } catch (ClassCastException e) {
            return false;
        }
    }

    public void addFirst(U u) {
        Node<U> next = firstNode;
        next.setCurrentEl(u);
        firstNode = new Node<U>(null, null, next);
        next.setPrevEl(firstNode);
        size++;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public U get(int index) {
        Node<U> target = firstNode.getNextEl();
        for (int i = 0; i < index; i++) {
            target = getNextElement(target);
        }
        return target.getCurrentEl();
    }

    public Node<U> getNextElement(Node<U> current) {
        return current.getNextEl();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void update(int index, U u) {

    }

    @Override
    public Iterator<U> iterator() {
        return null;
    }
}
