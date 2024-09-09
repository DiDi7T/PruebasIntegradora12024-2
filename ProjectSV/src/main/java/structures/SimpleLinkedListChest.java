package structures;
import model.Chest;

public class SimpleLinkedListChest {

    private NodeChest first;

    public SimpleLinkedListChest() {
        this.first = null;
    }

    public void add(String id, Chest value) {
        NodeChest node = new NodeChest(id, value);

        if (first == null) {
            first = node;
        } else {
            NodeChest current = first.getNext();
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
    }

    public int getSize() {
        int size = 0;
        NodeChest current = first;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

}
