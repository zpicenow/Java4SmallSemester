import java.lang.reflect.Array;

public class Dijkstra {
    private static char[] EN = "ABCDEF".toCharArray();

    public static void main(String[] args) {

        //�ڽӾ���
        int MAX = 10000;
        int[][] weight = {
                {0,2,5,1, MAX, MAX},
                {2,0,3,2, MAX, MAX},
                {5,3,0,3,1,5},
                {1,2,3,0,1, MAX},
                {MAX, MAX,1,1,0,2},
                {MAX, MAX,5, MAX,2,0}
        };

        int start=0;
        Dijsktra(weight,start);
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
            //����ѡ���Ķ�����Ϊ��������·�����ҵ�start�����·������dmin
            shortPath[k] = dmin;
            visited[k] = 1;
            //��kΪ�м�㣬������start��δ���ʸ���ľ���
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
            System.out.print("��" + EN[start] + "������" + EN[i] + "�����·��Ϊ��" + path[i]);

            System.out.println( "      ��̾���Ϊ��" + shortPath[i]);
        }
        System.out.println("=====================================");

    }
}
