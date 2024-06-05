import java.util.Scanner;

public class GraphMain_18 {

    public static void main(String[] args) throws Exception {

        Scanner input_18 = new Scanner(System.in);

        // Percobaan 1

        // Graph_18 gedung = new Graph_18(6);

        // gedung.AddEdgeDirected(0, 1, 50);
        // gedung.AddEdgeDirected(0, 2, 100);
        // gedung.AddEdgeDirected(1, 3, 70);
        // gedung.AddEdgeDirected(2, 3, 40);
        // gedung.AddEdgeDirected(3, 4, 60);
        // gedung.AddEdgeDirected(4, 5, 80);
        // gedung.DegreeDirected(0);
        // gedung.PrintGraph();

        // gedung.RemoveEdge(1, 3);
        // gedung.PrintGraph();

        // Percobaan 2

        // GraphMatriks_18 gdg = new GraphMatriks_18(4);

        // gdg.MakeEdge(0, 1, 50);
        // gdg.MakeEdge(1, 0, 60);
        // gdg.MakeEdge(1, 2, 70);
        // gdg.MakeEdge(2, 1, 80);
        // gdg.MakeEdge(2, 3, 40);
        // gdg.MakeEdge(3, 0, 90);
        // gdg.PrintGraph();

        // System.out.println("\nHasil setelah penghapusan edge\n");

        // gdg.RemoveEdge(2, 1);
        // gdg.PrintGraph();

        // TUGAS PRAKTIKUM

        int pilihan = 0;

        System.out.print("Masukkan jumlah gedung  : ");
        int vertex = input_18.nextInt();

        GraphMatriks_18 Graph = new GraphMatriks_18(vertex);

        do {

            System.out.println("===================================================");
            System.out.println("                      Graph");
            System.out.println("===================================================");
            System.out.println("\n1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Keluar\n");
            System.out.println("===================================================");
            System.out.print("Masukkan Pilihan    : ");
            pilihan = input_18.nextInt();
            System.out.println("===================================================");

            switch (pilihan) {
                case 1:

                    System.out.print("\nMasukkan asal       : ");
                    int asal = input_18.nextInt();
                    System.out.print("Masukkan tujuan     : ");
                    int tujuan = input_18.nextInt();
                    System.out.print("Masukkan jarak      : ");
                    int jarak = input_18.nextInt();
                    System.out.println();

                    Graph.MakeEdge(asal, tujuan, jarak);

                    break;

                case 2:

                    System.out.print("/nMasukkan asal       : ");
                    asal = input_18.nextInt();
                    System.out.print("Masukkan tujuan     : ");
                    tujuan = input_18.nextInt();

                    Graph.RemoveEdge(asal, tujuan);

                    break;

                case 3:

                    System.out.print("\nMasukkan node            : ");
                    int node = input_18.nextInt();

                    System.out.println("InDegree dari node " + (char) ('A' + node) + "     : " + Graph.GetInDegree(node));
                    System.out.println("OutDegree dari node " + (char) ('A' + node) + "    : " + Graph.GetOutDegree(node));
                    System.out.println(
                            "TotalDegree dari node " + (char) ('A' + node) + "  : " + Graph.GetTotalDegree(node));

                    break;

                case 4:

                    Graph.PrintGraph();

                    break;

                case 5:

                    System.out.print("\nMasukkan node ke-1     : ");
                    int node1 = input_18.nextInt();
                    System.out.print("Masukkan node ke-2     : ");
                    int node2 = input_18.nextInt();

                    if (Graph.IsConnected(node1, node2)) {
                        System.out.println("\nNode " + (char) ('A' + node1) + " " + (char) ('A' + node2) + " bertetangga");
                    } else {
                        System.out.println("\nNode " + (char) ('A' + node1) + " " + (char) ('A' + node2) + " tidak bertetangga");
                        
                    }

                    break;

                default:
                    break;
            }

        } while (pilihan != 6);

        input_18.close();

    }

}
