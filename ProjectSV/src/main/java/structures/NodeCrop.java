package structures;

import model.Crop;

public class NodeCrop {
    private String id;
    private Crop value;

    private NodeCrop next;

    public NodeCrop(String id, Crop value) {
        this.id = id;
        this.value = value;
    }


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Crop getValue() {
        return value;
    }
    public void setValue(Crop value) {
        this.value = value;

    }
    public NodeCrop getNext() {
        return next;
    }
    public void setNext(NodeCrop next) {
        this.next = next;
    }

}
