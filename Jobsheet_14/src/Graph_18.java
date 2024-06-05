public class Graph_18 {
    
    int vertex;
    DoubleLinkedLists_18 list[];

    public Graph_18 (int vertex) {

        this.vertex = vertex;

        list = new DoubleLinkedLists_18[vertex];

        for (int i = 0; i < vertex; i++) {
            list[i] = new DoubleLinkedLists_18();
        }

    }

    public void AddEdgeDirected(int asal, int tujuan, int jarak) {
        list[asal].AddFirst(tujuan, jarak);
    }

    public void AddEdgeUndirected(int asal, int tujuan, int jarak) {
        list[asal].AddFirst(asal, jarak);
    }

    public void DegreeDirected(int asal) throws Exception {

        int k, totalIn = 0, totalOut = 0;

        for (int i = 0; i < vertex; i++) {
            
            for (int j = 0; j < list[i].Size(); j++) {
                if (list[i].Get(j) == asal) {
                    ++totalIn;
                }
            }

            for (k = 0; k < list[asal].Size(); k++) {
                list[asal].Get(k);
            }

            totalOut = k;

        }

        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalOut + totalOut));

    }

    public void DegreeUndirected(int asal) throws Exception {

        int k, totalIn = 0, totalOut = 0;

        for (int i = 0; i < vertex; i++) {
            
            for (int j = 0; j < list[i].Size(); j++) {
                if (list[i].Get(j) == asal) {
                    ++totalIn;
                }
            }

            for (k = 0; k < list[asal].Size(); k++) {
                list[asal].Get(k);
            }

            totalOut = k;

        }

        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + list[asal].Size());

    }

    public void RemoveEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].Remove(tujuan);
            }
        }
    }

    public void RemoveAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].Clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void PrintGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].Size() > 0) {
                System.out.println("Degree dari Gedung " + (char) ('A' + i) + " terhubung dengan");
                for (int j = 0; j < list[i].Size(); j++) {
                    System.out.println((char) ('A' + list[i].Get(j)) + " (" + list[i].GetJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public void UpdateJarak(int asal, int tujuan, int jarakBaru) {
        list[asal].UpdateJarak(tujuan, jarakBaru);
    }

    public int hitungEdge() {

        int totalEdge = 0;

        for (int i = 0; i < vertex; i++) {
            totalEdge += list[i].Size();
        }

        return totalEdge;

    }

}
