public void main() {
    BinarySearchTree tree = new BinarySearchTree();
  
   tree.addNode(10);
   tree.addNode(5);
   tree.addNode(15);
   tree.addNode(3);
   tree.addNode(7);
   tree.addNode(12);
   tree.addNode(20);
   tree.addNode(9);
   tree.addNode(22);
   tree.addNode(13);
   tree.addNode(40);
   tree.addNode(29);
   tree.addNode(19);

    System.out.println();
    System.out.println("Quantidade de folhas: " + tree.countLeaves());
}
