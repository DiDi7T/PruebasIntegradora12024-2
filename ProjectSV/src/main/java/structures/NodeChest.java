package structures;
import model.Chest;

public class NodeChest {

    private String id;
    private Chest value;

    private NodeChest next;

    public NodeChest(String id, Chest value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Chest getValue() {
        return value;
    }

    public void setValue(Chest value) {
        this.value = value;
    }

    public NodeChest getNext() {
        return next;
    }

    public void setNext(NodeChest next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodeChest{" +
                "id='" + id + '\'' +
                ", value=" + value +
                '}';
    }
}
