import java.util.ArrayList;
import java.util.List;

public class UF {
    private List<String> list ;
    private int[] id;   //分量id
    private int count;  // 分量数量

    UF(int N){
        count = N;
        list = new ArrayList<String>();
        id = new int[N];
        for(int i = 0 ;i <N ;i++){
            id[i] = i;
        }
    }
    public void add(String str){
        list.add(str);
    }
    public List<String> list(){
        return list;
    }

    void union (int p ,int q) {
        int pID = find(p);
        int qID = find(q);

        if(pID  == qID)
            return;
        for(int i = 0;i < id.length; i++){
            if(id[i] == pID) {
                id[i] = qID;
            }
        }
        count--;
    }

    int find(int p) {
        return id[p];
    }

    boolean connected(int p ,int q){
        return find(p) == find(q);
    }

    int count(){
        return count;
    }
}
