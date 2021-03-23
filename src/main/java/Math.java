public class Math {

    /**
     * 计算两个非负整数p和q的最大公约数：
     * 若q是0，则最大公约数为p。
     * 否则，将p除以q得到余数r，
     * p和q的最大公约数即为q和r的最大公约数
     */
    public static int gcd(int p,int q){
        if(q == 0) return  p;
        int r = p% q;
        return gcd(q,r);
    }

    /**
     *  迭代
     *  通过二分法查找数据，是否有对应的数据，若成功返回下标。若失败返回-1
     *  输入：数据，数组
     *  返回： 下标 （成功）/-1（失败）
     *
     * */
    public static int binarySearch(int value ,int[] arr){
        int low = 0;
        int high = arr.length -1;
        while(low <= high){
            int mid = (low + high)/2;
            if (value < arr[mid])
                high = mid -1;
            else if (value > arr[mid])
                low = mid + 1;
            else
                return mid;
        }
        return  -1;
    }


    /**
     *   递归
     *   通过二分法查找数据，是否有对应的数据，若成功返回下标。若失败返回-1
     *  输入：数据，数组
     *  返回： 下标 （成功）/-1（失败）
     *
     * */

    public static int rank(int value,int[] arr){
        return rank(value,arr,0,arr.length-1);
    }


    public static int rank(int value,int[] arr,int low,int high){
        //不动点
        if(low > high)
            return  -1;

        //正文
        int mid =  (low + high) /2;
        if (value < arr[mid])
            return rank(value,arr,low,mid - 1);
        else if (value > arr[mid])
            return rank(value,arr,mid + 1,high);
        else
            return  mid;
    }

}
