public class MathRank {
    /**
     *   递归
     *   通过二分法查找数据，是否有对应的数据，若成功返回下标。若失败返回-1
     *  输入：数据，数组
     *  返回： 下标 （成功）/-1（失败）
     * */

    private int[] arr = null;
    private int value = 0;
    private int recursiveNumber = 0;

    MathRank(int value,int[] arr){
        this.value = value;
        this.arr = arr;
        this.recursiveNumber = 1;
    }

    public int rank(){
        return rank(value,arr,0,arr.length-1);
    }

    private boolean isRecursively(int low,int high){
        return low > high;
    }
    private boolean ComparaToMidisMore(int mid){
        return value > arr[mid];
    }

    private boolean ComparaToMidisLess(int mid){
        return value < arr[mid];
    }

    private int rank(int value,int[] arr,int low,int high){
        //不动点
        if(isRecursively(low,high))
            return  -1;

        //正文
        int mid =  (low + high) /2;

        rankPrint(low,mid,high);

        increaseRecursiveNumber();


        if (ComparaToMidisLess(mid))
            return rank(value,arr,low,mid - 1);
        else if (ComparaToMidisMore(mid))
            return rank(value,arr,mid + 1,high);
        else
            return  mid;
    }

    private void rankPrint(int low,int mid ,int high){
        System.out.println("第"+recursiveNumber+"次嵌套 " + "(low , int , high):" + "("+low+" , "+ mid + " , "+high+")");
    }

    private void increaseRecursiveNumber(){
        recursiveNumber++;
    }
}
