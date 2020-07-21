//public class BST<E extends Comparable<E>> extends AbstractTree<E> {
//    protected TreeNode<E> root;
//    protected int size = 0;
//
//    public BST(){
//    }
//
//    public BST(E[] objects){
//        for (int i = 0; i < objects.length; i++)
//            insert(objects[i]);
//    }
//
//    public boolean insert(E e){
//        if (root == null)
//            root = createNewNode(e);
//    else {
//        TreeNode<E> parent = null;
//        TreeNode<E> current = root;
//        while (current != null){
//            if (e.compareTo(current.element) <0){
//                parent = current;
//                current = current.left;
//            } else if (e.compareTo(current.element) > 0){
//                parent = current;
//                current = current.right;
//            } else
//                return false;
//        }
//        if (e.compareTo(parent.element) < 0)
//            parent.left = create
//    }
//}
