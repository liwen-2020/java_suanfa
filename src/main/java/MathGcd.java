import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class MathGcd {
    /**
     * 公约数：同时整除几个数的数
     * 1为所以数的约数,为最小公约数
     * eg：2能整除2和1
     * 两个最大公约数即两个数能整除几个数中最大的一个数
     * eg：6能整除6,3，2，1
     * eg：9能整除9,3，1
     * 9和6的约数为3和1
     * 9和6的最大公约数是3.
     * --------------------------------------------------------------------------
     * 假设有两个数x和y，存在一个数z=f(x,y)，即x和y都有能整除数z，
     * 那么x一定能被z整除，y也一定能被z整除，所以x和y的线性组合mx±ny也一定能被z整除。（m和n可取任意整数）
     * ----------------------------------------------------------------------------
     * 对于辗转相除法来说，思路就是：
     * 由于一般形式的mx±ny能被z整除，所以等号左边的x-ny（作为mx±ny的一个特例）就能被z整除，
     * 即x除y的余数c也能被z整除。
     * (x1,y1) =>(y1,c1)（y1>c1）(x1=x,y1=y)(c1=c)
     * 同理可证(y1,c1) => (y2,c2)(y2>c2)(y2=c1)
     * =>(x1,y1) =>(y1,c1)=>(y2,c2)...........(yn,cn)=>(cn,0)
     * (x,y,c1,c2.........cn)
     * 不定点讨论：cn为能被上述所有数整除，cn能被x和y整除
     * z可以作为一个数的集合,满足{z}=f(x,y)
     * cn属于{z},求cn为{z}最大值
     * ----------------------------------------------------------------------------
     * 假设最大公约数为z
     * x = nz
     * y = mz (n >m)
     * x = uy + c
     * c = x -uy = nz -umz = (n-um)z
     * 当且仅当(m,n-um)互质时，（x,y）(y,c)有最大公约数
     * 假设m与n-um不互质 则存在公约数k（k>1）
     * m = wk
     * n-um = vk
     * n = vk+um= vk +uwk = (v+uw)k
     * x = nz = (v+uw)kz
     * y = mz = wkz
     * x 与 y有公约数 kz,矛盾，假设成立
     * f(x1,y1)与f(y1,c1)有最大公约数，(y1,c1)=>(m,n-um)互质
     * f(y1,c1)与f(y2,c2)有最大公约数，。。。。。。。。。。互质
     * 。。。。。。。
     * f(yn-2,cn-2)与f(yn-1,cn-1)有最大公约数，。。。。。互质
     * f(yn-1,cn-1)与f(yn,cn)有最大公约数，因为yn能整除cn
     * 且(x,y,c1,c2.........cn)除了(x,y)(cn-1,cn)外，(y,c1),(c1,c2)两两互质
     * cn为最大公约数
     * ----------------------------------------------------------------
     * 计算两个非负整数p和c的最大公约数：
     * 若c是0，则最大公约数为p。
     * 否则，将p除以c得到余数r，
     * p和c的最大公约数即为c和r的最大公约数
     */

    private int front = 0;
    private int back = 0;
    private int recursiveNumber = 0;

    MathGcd(int first, int back) {
        this.front = first;
        this.back = back;

    }

    private void increaseRecursiveNumber(){
        recursiveNumber++;
    }

    private void gcdPrint(int front, int back) {
        /*
        java.util.Date date = new java.util.Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String dateStr = dateFormat.format(date);
         */

        System.out.println("第"+recursiveNumber+"次嵌套"+" (front,back):" + "(" + front + " , " + back + ")"
                /* + "  " + dateStr + "  " +date.getTime() */);
    }

    public int gcd() {
        return gcd(front, back);
    }

    private int gcd(int front, int back) {

        increaseRecursiveNumber();
        //添加备注
        gcdPrint(front, back);

        //正文
        if (back == 0) return front;
        int c = front % back;
        return gcd(back, c);
    }
}


