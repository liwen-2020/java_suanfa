public class UF {
    private int[] id;   //分量id
    private int count;  // 分量数量

    /**
     * 以整数标识(0到N-1)初始化N个触点
     * @param N
     */
    UF(int N){
        count = N;
        id = new int[N];
        for(int i = 0 ;i <N ;i++){
            id[i] =i;
        }
    }

    /**
     * 在p和q之间添加一条连接
     * @param p
     * @param q
     */
    void union (int p ,int q) {
        int pID = find(p);
        int qID = find(q);

        if(pID  == qID )
            return;
        for(int i = 0;i < id.length; i++){
            if(id[i] == pID)
                id[i] = qID;
            count--;
        }
    }


    /**
     * p所在的分量的标识符(0到N-1)
     * @param p
     * @return
     */
    int find(int p) {
        return id[p];
    }


    /**
     * 如果p和q存在于同一个分量中则返回true
     * @param p
     * @param q
     * @return
     */
    boolean connected(int p ,int q){
        return find(p) == find(q);
    }

    /**
     * 连接分量的数量
     * @return
     */
    int count(){
        return count;
    }
}
