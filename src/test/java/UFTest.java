import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UFTest {

    @Test
    public void UF_test(){
        int N = 10;
        Map<Integer, Integer> testData = new HashMap<Integer, Integer>();
        testData.put(4,3);
        testData.put(3,8);
        testData.put(6,5);
        testData.put(9,4);
        testData.put(2,1);
        testData.put(5,0);
        testData.put(7,2);
        testData.put(6,1);
        testData.put(1,0);
        testData.put(6,7);

        Integer[][] arr = new Integer[2][5];

        for(int i = 0 ;i <N ; i++){
            arr[i/5][i%5] = i ;
        }

        String[][] sarr = new String[3][9];

        for(int i =0 ;i <3 ;i++){
            for (int j =0 ; j< 9;j++){
                sarr[i][j] = " ";
            }
        }

        for(int i=0 ;i < 5;i++){
            sarr[0][2*i] = arr[0][i].toString();
        }

        for(int i=0 ;i < 5;i++){
            sarr[2][2*i] = arr[1][i].toString();
        }

        for(int i =0 ;i <3 ;i++){
            for (int j =0 ; j< 9;j++){
                System.out.print(sarr[i][j]);
            }
            System.out.println();
        }

        System.out.println("------------------");

        sarr[0][7] = "*";

        for(int i =0 ;i <3 ;i++){
            for (int j =0 ; j< 9;j++){
                System.out.print(sarr[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------");
        sarr[1][6] = "*";
        for(int i =0 ;i <3 ;i++){
            for (int j =0 ; j< 9;j++){
                System.out.print(sarr[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------");
        sarr[2][1] = "*";
        for(int i =0 ;i <3 ;i++){
            for (int j =0 ; j< 9;j++){
                System.out.print(sarr[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------");
        sarr[1][8] = "*";
        for(int i =0 ;i <3 ;i++){
            for (int j =0 ; j< 9;j++){
                System.out.print(sarr[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------");
        sarr[0][3] = "*";
        for(int i =0 ;i <3 ;i++){
            for (int j =0 ; j< 9;j++){
                System.out.print(sarr[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------");
        sarr[2][7] = "*";
        for(int i =0 ;i <3 ;i++){
            for (int j =0 ; j< 9;j++){
                System.out.print(sarr[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------");
        sarr[1][0] = "*";
        for(int i =0 ;i <3 ;i++){
            for (int j =0 ; j< 9;j++){
                System.out.print(sarr[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------");
        sarr[1][4] = "*";
        for(int i =0 ;i <3 ;i++){
            for (int j =0 ; j< 9;j++){
                System.out.print(sarr[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------");
        sarr[1][2] = "*";
        for(int i =0 ;i <3 ;i++){
            for (int j =0 ; j< 9;j++){
                System.out.print(sarr[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------");
        sarr[0][1] = "*";
        for(int i =0 ;i <3 ;i++){
            for (int j =0 ; j< 9;j++){
                System.out.print(sarr[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------");
        sarr[2][3] = "*";
        for(int i =0 ;i <3 ;i++){
            for (int j =0 ; j< 9;j++){
                System.out.print(sarr[i][j]);
            }
            System.out.println();
        }
    }

    @Test
    public void UF_map_test(){
        int N = 10;
        Integer[][] arr = new Integer[2][5];

        for(int i = 0 ;i <N ; i++){
            arr[i/5][i%5] = i ;
        }

        String[][] sarr = new String[3][9];

        for(int i =0 ;i <3 ;i++){
            for (int j =0 ; j< 9;j++){
                sarr[i][j] = " ";
            }
        }

        for(int i=0 ;i < 5;i++){
            sarr[0][2*i] = arr[0][i].toString();
        }

        for(int i=0 ;i < 5;i++){
            sarr[2][2*i] = arr[1][i].toString();
        }

        for(int i =0 ;i <3 ;i++){
            for (int j =0 ; j< 9;j++){
                System.out.print(sarr[i][j]);
            }
            System.out.println();
        }

        Map<Integer, Integer> testData = new HashMap<Integer, Integer>();
        testData.put(4,3);
        testData.put(3,8);
        testData.put(6,5);
        testData.put(9,4);
        testData.put(2,1);
        testData.put(5,0);
        testData.put(7,2);
        testData.put(6,1);
        testData.put(1,0);
        testData.put(6,7);

        for(Integer integer : testData.keySet()){
                int min = Math.min(integer, testData.get(integer));
                int max = Math.max(integer, testData.get(integer));

                int front_first_index = min/5;
                int last_first_index  = max/5;
                int mid_first_index = (front_first_index + last_first_index)/2;

                int front_second_index = 2*(min%5);
                int last_second_index  = 2*(max%5);
                int mid_second_index  = (front_second_index + last_second_index)/2;

            System.out.println(front_first_index + "," + front_second_index + " " +
                               mid_first_index   + "," + mid_second_index +  " " +
                               last_first_index  + "," + last_second_index);
        }

    }
}
