package structures;

import model.Crop;

public class SimpleLinkedListCrop {

    private NodeCrop first;

    public void add (String id, Crop value){
        NodeCrop node = new NodeCrop(id, value);

        //la lista esta vacia
        if (first == null){
            first = node;
        }

        //la lista no esta vacia
        else{
            if (first.getNext()==null){
                first.setNext(node);
            }
            //caso iterativo
            else{
                NodeCrop current = first.getNext();
                while (current.getNext()!=null){
                    current = current.getNext();
                }
                current.setNext(node);
            }
        }
    }

    public NodeCrop search (String value){
        NodeCrop found = null;

        //caso base
        if (first.getValue().equals(value)){
            found = first;
        }

        //caso iterativo
        else{
            NodeCrop current = first;
            boolean isFound = false;

            while (current.getNext() != null && !isFound){
                if (current.getValue().equals(value)){
                    found = current;
                    isFound = true;
                }
                current = current.getNext();
            }
        }
        return found;
    }

}
