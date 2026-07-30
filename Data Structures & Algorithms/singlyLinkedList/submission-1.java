class LinkedList {

    private class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    Node head;
    Node tail = null;
    int size = 0;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {
        if(index<0 || index>= size){
            return -1;
        }
        Node curr = head;
        for (int i =0;i<index;i++){
            curr = curr.next;
        }
        return curr.value;
    }

    public void insertHead(int val) {
        Node curr = new Node(val);
        
        if(head == null) {
            head = tail = curr;
        } else {
            curr.next = head;
            head = curr;
        }
        size++;
    }

    public void insertTail(int val) {
        Node curr = new Node(val);
        if(tail == null) {
            head = tail = curr;
        }else{
            tail.next = curr;
            tail = curr;
        }
        size++;
    }

    public boolean remove(int index) {
        if(index < 0 || index >= size){
          return false;
        }
        if(index == 0){
            head = head.next;
            if(head == null){
                tail = null;
            }
            size --;
            return true;
        } else{
            Node prev = head;
            for(int i = 0; i< index -1 ;i++){
                prev = head.next;
            }
            Node deleted = prev.next;
            prev.next = deleted.next;
            if(deleted == tail){
                tail = prev;
            }
            size--;
            return true;
        }
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> result = new ArrayList();
        Node curr = head;
        while(curr != null){
            result.add(curr.value);
            curr = curr.next;
        }
        return result;
    }
}
