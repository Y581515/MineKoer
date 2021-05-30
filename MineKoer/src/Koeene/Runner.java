package Koeene;

public class Runner {
    public static void main(String[] args) {
        //		Queue q= new Queue();
        //		q.enQueue(5);
        //		q.enQueue(2);
        //		q.enQueue(7);
        //		q.enQueue(3);
        //		
        //		q.deQueue();
        //		q.deQueue();
        //		
        //		
        //		q.enQueue(9);
        //		q.enQueue(1);
        //		
        //		q.enQueue(19);
        //		q.enQueue(15);
        //		System.out.println("is empty? "+q.isEmpty());
        //		System.out.println("is Full? "+q.isFull());
        //		
        //		System.out.println("size "+q.getSize());

        //		q.show();

        //		int [][]tab1={{0,0,0,0,0,0,0,0},
        //					{0,0,1,1,1,0,0,0},
        //					{0,1,0,1,0,0,0,0},
        //					{0,1,1,0,1,1,0,0},
        //					{0,1,0,1,0,5,0,0},
        //					{0,0,0,1,1,0,1,1},
        //					{0,0,0,0,0,1,0,0},
        //					{0,0,0,0,0,1,0,0}};
        //		
        //		
        //		int [][]tab2={{0,0,0,0,0,0,0},
        //				{0,0,1,1,0,0,0},
        //				{0,1,0,0,1,0,0},
        //				{0,1,0,0,1,0,0},
        //				{0,0,1,1,0,1,1},
        //				{0,0,0,0,1,0,0},
        //				{0,0,0,0,1,0,0}};	

        int[][] tab1 = { { 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 1, 0, 0, 0, 0 },
                { 0, 1, 1, 0, 1, 1, 0, 0 }, { 0, 1, 0, 1, 0, 5, 0, 0 }, { 0, 0, 0, 1, 1, 0, 1, 1 },
                { 0, 0, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0, 1, 0, 0 } };

        int[][] tab2 = { { 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 1, 0, 0 },
                { 0, 1, 0, 0, 1, 0, 0 }, { 0, 0, 1, 1, 0, 1, 1 }, { 0, 0, 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 1, 0, 0 } };

        int startIndek = 4;

        System.out.println("Breadth First Search");
        BFS(tab2, startIndek);

        System.out.println("\n\nDepth First Search");
        DFS(tab2, startIndek);

    }

    public static void BFS(int[][] tab,int i) {
        int n= tab.length;
        int[] visited=new int[n];
        KjedetKoe<Integer> Q = new KjedetKoe<Integer>();
        System.out.print(i + "  ");
        visited[i]=1;
        Q.innKoe(i);

        while (!Q.erTom()){
            i = (int)Q.utKoe();
            for (int j = 1; j < n; j++) {
                if (tab[i][j] == 1 && visited[j]==0) {
                    System.out.print(j+ "  ");
                    visited[j] = 1;
                    Q.innKoe(j);
                }
            }
        }

    }

    public static  int[] visited=new int[10];
    public static void DFS(int[][] tab,int u) {
        int n= tab.length;

        if (visited[u] == 0) {
            System.out.print(u + "  ");
            visited[u] = 1;

            for (int v = 1; v < n; v++) {
                if (tab[u][v] == 1 && visited[v]==0) {
                    DFS(tab, v);
                }
            }
        }
    }
}
