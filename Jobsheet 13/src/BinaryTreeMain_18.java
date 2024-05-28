import org.w3c.dom.Node;

public class BinaryTreeMain_18 {

    public static class Node_18 {
        int data;
        Node_18 left;
        Node_18 right;

        public Node_18() {}

        public Node_18(int data) {
            this.left = null;
            this.data = data;
            this.right = null;
        }
    }

    // Percobaan 1

    public static class BinaryTree_18 {
        Node_18 root;
        int size;

        public BinaryTree_18() {
            root = null;
        }

        boolean IsEmpty() {
            return root == null; 
        }

        void Add(int data) {
            if (IsEmpty()) {
                root = new Node_18(data);
            } else {
                Node_18 current = root;
                while (true) {
                    if (data > current.data) {
                        if (current.left == null) {
                            current = current.left;                            
                        } else {
                            current.left = new Node_18(data);
                            break;
                        }
                    } else if (data < current.data) {
                        if (current.right == null) {                            
                            current = current.right;
                        } else {
                            current.right = new Node_18(data);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }

        boolean Find(int data) {
            Node_18 current = root;
            while (current != null) {
                if (current.data == data) {
                    return true;
                } else if (data < current.data) {
                    current = current.left;
                } else {
                    current = current.right;
                }
            }
            return false;
        }

        void TraversePreOrder(Node_18 node) {
            if (node != null) {
                System.out.print(" " + node.data);
                TraversePreOrder(node.left);
                TraversePreOrder(node.right);
            }
        }

        void TraversePostOrder(Node_18 node) {
            if (node != null) {
                TraversePostOrder(node.left);
                TraversePostOrder(node.right);
                System.out.print(" " + node.data);
            }
        }

        void TraverseInOrder(Node_18 node) {
            if (node != null) {
                TraverseInOrder(node.left);
                System.out.print(" " + node.data);
                TraverseInOrder(node.right);
            }
        }

        Node_18 getSuccessor(Node_18 del) {
            Node_18 successorParent = del;
            Node_18 successor = del;
            Node_18 current = del.right;

            while (current != null) {
                successorParent = successor;
                successor = current;
                current = current.left;
            }

            if (successor != del.right) {
                successorParent.left = successor.right;
                successor.right = del.right;
            }

            return successor;
        }

        void delete(int data) {
            if (IsEmpty()) {
                System.out.println("Tree is empty");
                return;
            }

            Node_18 parent = root;
            Node_18 current = root;
            boolean isLeftChild = false;

            while (current != null && current.data != data) {
                parent = current;
                if (data < current.data) {
                    current = current.left;
                    isLeftChild = true;
                } else {
                    current = current.right;
                    isLeftChild = false;
                }
            }

            if (current == null) {
                System.out.println("Couldn't find data");
                return;
            }

            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            }
 
            else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            }

            else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            }

            else {
                Node_18 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }

        // Tugas Praktikum 1 (Rekursif)

        void Rekursif(Node_18 current, int data) 

    }

    // Percobaan 2

    public static class BinaryTreeArray_18 {
    
        int[] data;
        int idxlast;

        public BinaryTreeArray_18() {
            data = new int[18];
        }

        void PopulateData(int data[], int idxlast) {
            this.data = data;
            this.idxlast = idxlast;
        }

        void TraverseInOrder(int idxStart) {
            if (idxStart <= idxlast) {
                TraverseInOrder(2 * idxStart + 1);
                System.out.print(data[idxStart] + " ");
                TraverseInOrder(2 * idxStart + 2);
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Percobaan 1\n");
        
        BinaryTree_18 bt = new BinaryTree_18();

        bt.Add(6);
        bt.Add(4);
        bt.Add(8);
        bt.Add(3);
        bt.Add(5);
        bt.Add(7);
        bt.Add(9);
        bt.Add(10);
        bt.Add(15);

        System.out.print("Pre Order Traversal   : ");
        bt.TraversePreOrder(bt.root);
        System.out.println();

        System.out.print("In Order Traversal    : ");
        bt.TraverseInOrder(bt.root);
        System.out.println();

        System.out.print("Post Order Traversal  : ");
        bt.TraversePostOrder(bt.root);
        System.out.println();

        System.out.println("Find Node 5: " + bt.Find(5));
        System.out.println("Delete Node 8");
        bt.delete(8);

        System.out.println();
        System.out.print("Pre Order Traversal:");
        bt.TraversePreOrder(bt.root);
        System.out.println();

        System.out.println("Percobaan 2\n");

        BinaryTreeArray_18 bta = new BinaryTreeArray_18();
        int data[] = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxlast = 6;

        bta.PopulateData(data, idxlast);
        System.out.print("\nInOrder Traversal   : ");
        bta.TraverseInOrder(0);
        System.out.println("\n");

    }
}
