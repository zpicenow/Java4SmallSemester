import ZPutil.Catalan;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Stack;

public class Dijkstra {
    private static char[] EN = "ABCDEF".toCharArray();

    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<>();
        ArrayDeque<Integer> integerArrayDeque = new ArrayDeque<>();
        ArrayDeque<Integer> outtegerArrayDeque = new ArrayDeque<>();
        for (int i = 1; i <=  7; i++) {
            integerArrayDeque.push(i);

        }
//        Catalan.CTLOutStack(integerArrayDeque, outtegerArrayDeque, integerStack, 7);
        Catalan.CTLOutStack(integerArrayDeque, outtegerArrayDeque, integerStack, 7, 4);

//
//        //邻接矩阵
//        int MAX = 10000;
//        int[][] weight = {
//                {0,2,5,1, MAX, MAX},
//                {2,0,3,2, MAX, MAX},
//                {5,3,0,3,1,5},
//                {1,2,3,0,1, MAX},
//                {MAX, MAX,1,1,0,2},
//                {MAX, MAX,5, MAX,2,0}
//        };
//
//        int start=0;
//        Dijsktra(weight,start);
    }

    private static void Dijsktra(int[][] weight, int start){

        int n = weight.length;
        int[] shortPath = new int[n];
        String[] path=new String[n];
        for(int i=0;i<n;i++)
        {
            path[i] = EN[start] + "-->" + EN[i];
        }
        int[] visited = new int[n];

        shortPath[start] = 0;
        visited[start] = 1;
        for(int count = 1;count <= n - 1;count++)
        {
            int k = -1;
            int dmin = Integer.MAX_VALUE;
            for(int i = 0;i < n;i++)
            {
                if(visited[i] == 0 && weight[start][i] < dmin)
                {
                    dmin = weight[start][i];
                    k = i;
                }
            }
            //将新选出的顶点标记为已求出最短路径，且到start的最短路径就是dmin
            shortPath[k] = dmin;
            visited[k] = 1;
            //以k为中间点，修正从start到未访问各点的距离
            for(int i = 0;i < n;i++)
            {
                if(visited[i] == 0 && weight[start][k] + weight[k][i] < weight[start][i])
                {
                    weight[start][i] = weight[start][k] + weight[k][i];
                    path[i]=path[k]+"-->"+EN[i];
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print("从" + EN[start] + "出发到" + EN[i] + "的最短路径为：" + path[i]);

            System.out.println( "      最短距离为：" + shortPath[i]);
        }
        System.out.println("=====================================");

    }
}
