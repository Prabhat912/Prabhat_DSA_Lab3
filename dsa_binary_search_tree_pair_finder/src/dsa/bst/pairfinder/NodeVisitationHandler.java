package dsa.bst.pairfinder;

import java.util.Set;

import dsa.binarySearchTree.Node;

public interface NodeVisitationHandler {
    
    void handle(Node currentNode, Set<Integer> previousVisitedNodes);
}
