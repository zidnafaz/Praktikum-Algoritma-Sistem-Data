public class GraphMatriks_18 {
    int vertex;
    int[][] matriks;

    public GraphMatriks_18(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void MakeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void RemoveEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void PrintGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + "m), ");
                }
            }
            System.out.println();
        }
    }

    public int GetInDegree(int node) {
        int inDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][node] != -1) {
                inDegree++;
            }
        }
        return inDegree;
    }

    public int GetOutDegree(int node) {
        int outDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[node][i] != -1) {
                outDegree++;
            }
        }
        return outDegree;
    }

    public int GetTotalDegree(int node) {
        return GetInDegree(node) + GetOutDegree(node);
    }

    public void PrintDegrees() {
        for (int i = 0; i < vertex; i++) {
            System.out.println("Gedung " + (char) ('A' + i) + "     : ");
            System.out.println("InDegree    : " + GetInDegree(i));
            System.out.println("OutDegree   : " + GetOutDegree(i));
            System.out.println("TotalDegree : " + GetTotalDegree(i));
            System.out.println();
        }
    }

    public boolean IsConnected(int node1, int node2) {
        return matriks[node1][node2] != -1;
    }

}