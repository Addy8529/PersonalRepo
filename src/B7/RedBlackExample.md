Red-Black-Tree
---

**TODO**
Insert your answers and solutions for the Red-Black-Tree tasks!
**Teil A**
-RED-BLACK TREE:
- A self-balancing binary search tree.
- who has two types of colored nodes, namely red nad black. 
- Root is always black.
- Both children of a red node are black.
- Red nodes cannot have a red child.
- Every path from a node to any reachable leaf has same number of black nodes.
- All leaf nodes(Null knoten) are black.
- TimeComplexity is O(log n) for search, insert and delete.


**Teil B**
input ={6,7,3,4,2,1} into RED-BLACK TREE.
- insert 6:
- 
-                   (red )  6            (black )   6
-                         /  \    -->             /  \
insert 7 :   
-
-                      6(black )
-                     /  \
-                        7(red)
insert 3: 
-
-                      6(black)
-                     / \
-                3(red) 7(red)
insert 4 :
-
-                      6(black)                                6 (black)
-                     / \                                   /     \
-                3(red) 7(red)          ----> recolor      3(black) 7(black) 
-                    \                                       \
-                      4(red)   Red-red collision           4(red)
insert 2 :
-
-                        6 (black)
-                      /     \
-                    3(black) 7(black)
                       /  \ 
-                 2(red)   4(red)
inser 1 :
-
-                        6 (black)                                6 (black)
-                      /     \                                     /     \
-                    3(black) 7(black)                         3(red) 7(black)     
                       /  \                                     /    \   
-                 2(red)   4(red)                           2(black)  4(black)
-                   /                                         /
-                1(red)             red-red collison       1(red) 

**Teil C**
input ={6,7,3,4,2,1} into AVL-TREE.

insert 6:
-
-
-                          6            
-                         /  \    
insert 7 :
-
-                      6
-                     /  \
-                        7
insert 3:
-
-                      6
-                     / \
-                     3  7
insert 4 :
-
-                      6                               
-                     / \                           
-                    3   7                 
-                    \                              
-                      4                            
insert 2 :
-
-                        6 
-                      /   \
-                     3     7
                    /  \ 
-                  2    4
insert 1 :
-
-                        6                                            3 
-                      /   \                                         /  \
-                     3     7                                       2    6 
                    /  \            -->adjusting heigh hy rotation / \   / \
-                  2    4                                         1     4   7
-                 /
-                 1            (height difference greater than 1)                     
-         
**Tein D**
Folie #50 Suchbaume.
