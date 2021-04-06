import org.junit.Test;

import java.util.*;

public class UFTest {

    @Test
    public void UF_test(){
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


        List<String> list = new ArrayList<String>();

        list.add("4,3");
        list.add("3,8");
        list.add("6,5");
        list.add("9,4");
        list.add("2,1");
        list.add("8,9");
        list.add("5,0");
        list.add("7,2");
        list.add("6,1");
        list.add("1,0");
        list.add("6,7");

        for( String str: list){
                int front = Integer.parseInt(str.substring(0,1));
                int last = Integer.parseInt(str.substring(2,3));


                int min = Math.min(front, last);
                int max = Math.max(front, last);

                int front_first_index = min/5== 0  ? 0:2;
                int last_first_index  = max/5 == 0 ? 0:2;
                int mid_first_index = (front_first_index + last_first_index)/2;

                int front_second_index = 2*(min%5);
                int last_second_index  = 2*(max%5);
                int mid_second_index  = (front_second_index + last_second_index)/2;

            sarr[mid_first_index][mid_second_index] = "*";
        }

        for(int i =0 ;i <3 ;i++){
            for (int j =0 ; j< 9;j++){
                System.out.print(sarr[i][j]);
            }
            System.out.println();
        }
    }

    @Test
    public void UF_func_test(){
        int N = 10;
        UF uf = new UF(N);
        uf.add("4,3");
        uf.add("3,8");
        uf.add("6,5");
        uf.add("9,4");
        uf.add("2,1");
        uf.add("8,9");
        uf.add("5,0");
        uf.add("7,2");
        uf.add("6,1");
        uf.add("1,0");
        uf.add("6,7");

        for(String str :uf.list()){
            int front = Integer.parseInt(str.substring(0,1));
            int last = Integer.parseInt(str.substring(2,3));

            if(uf.connected(front,last))
                continue;
            uf.union(front,last);
        }
        System.out.println(uf.count());

    }
}
