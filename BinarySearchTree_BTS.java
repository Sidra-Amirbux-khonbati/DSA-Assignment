 class Node {
        int data;
        Node left;
        Node right;

        Node( int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
public class BinarySearchTree_BTS{
      public static void main(String[] args) {
        Node root = null;

        int arr[] = {50,30,70,20,40,60,80};

        for(int val : arr){
            root = insert(root, val);
        }

        System.out.print("InOrder: ");
        inOrder(root);
        System.out.println();

        System.out.print("PreOrder: ");
        preOrder(root);
        System.out.println();

        System.out.print("PostOrder: ");
        postOrder(root);
        System.out.println();
        System.out.println();

        int key = 60;
        System.out.println("Search Element " +key+ ": " +search(root, key));

        System.out.println("Deleting Node 80");
        root = delete(root, 80);

        System.out.println("InOrder after deleting ");
        inOrder(root);
        System.out.println();

        System.out.println("Minimum value in the BTS: " +findMin(root));
        System.out.println("Maximum value in the BTS: " +findMax(root));
        System.out.println("Total nodes: " +countTotal(root));
        System.out.println("Total leaf nodes: " +countLeaf(root));
        System.out.println("Height of tree: " +height(root));
    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data +" ");
        inOrder(root.right);
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data +" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data +" ");
    }

    public static Node insert(Node root, int value){
        if(root == null){
            return new Node(value);
        }
        if(value < root.data){
            root.left = insert(root.left, value);
        }else{
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static boolean search(Node root, int key){
        if(root == null){
            System.out.println("root is Empty!");
            return false;
        }
        if(key == root.data){
            return true;
        }else if(key < root.data){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int valDelete){
        if(root == null){
            return null;
        }
        if(root.data == valDelete){
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
            root.data = findMin(root.right);
            root.right = delete(root.right, root.data);
        }
        else if(root.data < valDelete){
            root.right = delete(root.right, valDelete);
        }else{
            root.left = delete(root.left, valDelete);
        }
        return root;
    }

    public static int findMax(Node root){
        while(root.right != null){
            root = root.right;
        }
        return root.data;
    }

    public static int findMin(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(height(root.left),height(root.right));
    }

    public static int countTotal(Node root){
        if(root == null){
            return 0;
        }
        return 1 + countTotal(root.left)+countTotal(root.right);
    }

    public static int countLeaf(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        return countLeaf(root.left)+countLeaf(root.right);
    }
}
