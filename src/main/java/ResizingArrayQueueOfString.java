import java.util.Iterator;

public class ResizingArrayQueueOfString implements Iterable<String> {

    private String[] a;
    private int frontNumber = -1;
    private int lastNumber = -1;

    public ResizingArrayQueueOfString(int cap){
        a = new String[cap];
    }

    public boolean isEmpty() {
        return lastNumber == -1 && frontNumber == -1;
    }

    public int size() {
        if(frontNumber == -1 && lastNumber == -1){
            return 0;
        }
        return (lastNumber - frontNumber) +1;
    }

    private void resize(int max) {
        String[] tmp = new String[max];
        int currenct = frontNumber;

        for(int i = 0 ; i < lastNumber - currenct +1;i++){
            tmp[i] = a[currenct+i];
        }
        a = tmp;
        lastNumber = lastNumber - frontNumber;
        frontNumber = 0;
    }

    public void enqueue(String str) {
        if(frontNumber == -1 && lastNumber == -1){
            frontNumber = 0;
            lastNumber  = 0;
            a[frontNumber] = str;
            return;
        }

        if((lastNumber + 1) == a.length && size() < a.length){
            resize(a.length);
        }
        if((lastNumber +1) == a.length && size() == a.length){
            resize(2 * a.length);
        }

        a[++lastNumber] = str;
    }

    public String dequeue() {

        // System.out.println("动态缩减数组"+ a.length +" ," + frontNumber);
        if(frontNumber == -1 && lastNumber == -1){
            return  null;
        }

        if(frontNumber == lastNumber && frontNumber != -1){
            int tmp = frontNumber;
            frontNumber = -1;
            lastNumber  = -1;
            return a[tmp];
        }

        String tmp = a[frontNumber++];

        if (size() > 0 && size() == a.length / 4) {
            resize(a.length / 2);
        }
        return tmp;
    }

    private class ArrayIterator implements Iterator<String>{
        private int current = frontNumber;

        @Override
        public boolean hasNext() {
            if (current == -1 && lastNumber == -1)
                return  false;
            return current <= lastNumber;
        }

        @Override
        public String next() {
            return a[current++];
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new ArrayIterator();
    }
}
