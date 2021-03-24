import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MathBinomial {
    private Map<String, Double> map = null;
    private int N = 0;
    private int k = 0;
    private double[][] arr = null;
    private double doubleParameter = 0.0;

    MathBinomial(int N, int k, double p) {
        this.doubleParameter = p;
        this.N = N;
        this.k = k;
        this.arr = new double[N + 1][k + 1];
        this.map = new HashMap<String, Double>();
    }

    private void initArr() {
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= k; j++) {
                arr[i][j] = -1.0;
            }
        }
    }

    private void writeArr() {
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= k; j++) {
                String str = "(" + i + " , " + j + ")";
                double tmp = 0.0;
                if (isExist(i, j)) {
                    tmp = map.get(str);
                }
                arr[i][j] = tmp;
            }
        }
    }


    private void arrPrint() {
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= k; j++) {
                String str = String.valueOf(arr[i][j]);
                System.out.print("(" + i + "," + j + "):" + str + "   ");
            }
            System.out.println();
        }
    }


    public double binomial() {
        initArr();
        double tmp = binomial(N, k);
        writeArr();
        arrPrint();
        return tmp;
    }

    public boolean isRight() {
        initMap();
        writeMap();
        mapPrint();
        initArr();
        writeArr();
        arrPrint();
        return isRight(N);
    }

    public void WriteMapPath(String path) {
        initMap();
        writeMap();
        mapPrint();
        WriteMapIo(path);
    }

    private void WriteMapIo(String Path) {
        try {
            File file = new File(Path);

            if (!file.exists()) {
                file.createNewFile();
            }

            //使用true，即进行append file

            FileWriter fileWritter = new FileWriter(file.getName(), true);

            for(String key :map.keySet()){
                String dataLine =  key + "=" + map.get(key) +"\r\n";
                System.out.println(dataLine);
                fileWritter.write(dataLine);
            }
            fileWritter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //精度不够需要调整
    private boolean isRight(int N) {
        double tmp = 0.0;
        for (int i = 0; i <= k; i++) {
            tmp += arr[N][i];
        }
        return ((1.0 - tmp) > -0.000001) && ((1.0 - tmp) < 0.000001);

    }

    private void writeMap() {
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= k; j++) {
                String str = "(" + i + " , " + j + ")";
                map.put(str, binomial(i, j));
            }
        }

    }

    private void initMap() {
        map = null;
        map = new HashMap<String, Double>();
    }


    private void mapPrint() {
        for (String key : map.keySet()) {
            System.out.println("Key:" + key + " Value:" + map.get(key));
        }
    }

    private boolean isExist(int N, int k) {
        String str = "(" + N + " , " + k + ")";
        return map.containsKey(str);
    }


    public double binomial(int N, int k) {

        double tmp = 0.0;
        String str = "(" + N + " , " + k + ")";

        if (isExist(N, k)) {
            return tmp = map.get(str);
        } else if (N == 0 && k == 0) {
            tmp = 1.0;
            map.put(str, tmp);
            return tmp;
        } else if (N < 0 || k < 0) {
            tmp = 0.0;
            map.put(str, tmp);
            return tmp;
        }

        tmp = (1.0 - doubleParameter) * binomial(N - 1, k) + doubleParameter * binomial(N - 1, k - 1);
        map.put(str, tmp);
        return tmp;
    }
}
