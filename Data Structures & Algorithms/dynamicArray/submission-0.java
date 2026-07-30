class DynamicArray {
    int[] data;
    int lastIndex = 0;
    public DynamicArray(int capacity) {
      data = new int[capacity];
    }

    public int get(int i) {
     return data[i];
    }

    public void set(int i, int n) {
       data[i] = n;
    }

    public void pushback(int n) {
       if (lastIndex == data.length) {
           resize();
       }
       data[lastIndex] = n;
       lastIndex++;
    }

    public int popback() {
       int result =  data[lastIndex - 1];
       lastIndex--;
       return result;
    }

    public void resize() {
      data = Arrays.copyOf(data, data.length * 2);
    }

    public int getSize() {
         return lastIndex;
    }

    public int getCapacity() {
        return data.length;
    }
}