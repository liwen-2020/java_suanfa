public class MathBinarySearch {
    /**
     *  迭代
     *  通过二分法查找数据，是否有对应的数据，若成功返回下标。若失败返回-1
     *  输入：数据，数组（已排序，升序）
     *  返回： 下标 （成功）/-1（失败）
     * */
    private int value = 0;
    private int[] arr = null;
    private int iteratedNumber = 0;
    private int low = 0;
    private int high = 0;
    private int mid = 0;


    public MathBinarySearch(int value ,int[] arr){
        this.arr = arr;
        this.low = 0;
        this.high = arr.length -1;
        this.mid = (low+high)/2;
        this.iteratedNumber = 1;
        this.value = value;

    }

    private int changeMid(){
        return (low+high)/2;
    }

    private int increaseMid(){
        return mid + 1;
    }

    private int decreaseMid(){
        return mid - 1;
    }

    private void increaseIteratedNumber(){
        iteratedNumber++;
    }

    private boolean isIteratively(){
        return low <= high;
    }
    private boolean ComparaToMidisMore(){
        return value > arr[mid];
    }

    private boolean ComparaToMidisLess(){
        return value < arr[mid];
    }

    public int binarySearch(){

        while(isIteratively()){
            mid = changeMid();

            // 备注
            binarySearchPrint();

            //正文
            if (ComparaToMidisLess()) {
                high = decreaseMid();
                increaseIteratedNumber();
            }
            else if (ComparaToMidisMore()) {
                low = increaseMid();
                increaseIteratedNumber();
            }
            else {
                return mid;
            }
        }
        return  -1;
    }

    private void binarySearchPrint(){
        System.out.println("第"+iteratedNumber+"次迭代: "+"(low , mid , high) "+"( "+low +" , "+ mid + " , " + high + ")");
    }
}
