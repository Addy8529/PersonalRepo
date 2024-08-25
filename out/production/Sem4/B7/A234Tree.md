Solution
---
Question : What is a 2-3-4 tree ?
Answer   :
 
  i) It's a self-balancing tree whose node can have 2 , 3 or 4 children.
 ii) Each node has n children and n-1 data elements , n<=4 .
iii) All leaf nodes are at the same level , thus has no height difference .


**TODO** show what happens during the insertion of the numbers 3, 7,
5, 15, 17, 9, 13, 21, 11 and 19 (in this order) into an 2-3-4-Tree

Top_down 
-
insert 3 :
- 
                        3 
                      /   \ 
insert 7 :          
-                      3 | 7
-                     /  |  \

insert 5 :
-                     
-                     3 | 5 | 7
                     /  |  |   \

insert 15 :
-The root is split on the way down and then inserted 15 
- 
-                      5
-                     /  \
                     3   7 |15
-                   / \  / | \ 

insert 17 :
-
                       5
-                     /  \
                     3   7 |15|17
-                   / \  / |   | \ 

insert 9:
-
- we iterate from top to bottom to look fo ra suitable position for 9 and reached a 3 node which we will
- first split and then insert 9 
                  
                        5 | 15             5 | 15
-                      /  |  \    -- >    /  |  \  
-                     3  7  17           3  7|9  17
                         
insert 13:
- 
                                        5 | 15
                                       /  |    \  
                                      3  7|9|13  17

insert 21:  
-                                       5 | 15
                                       /  |    \  
                                      3  7|9|13  17|21
insert 11:
- 
                                       5 | 15                         5 |9| 15                5 | 9 | 15
                                       /  |    \       -->           /  | |  \     -->        /  |  |   \
                      (node split)   3  7|9|13  17|21              3  7  13  17|21          3  7  11|13  17|21
insert 19: 
-
-root is  a 4 node ,so we split the node first  
                                 
                                      5 | 9 | 15    -->(split)           9
                                     /  |  |    \                      /   \ 
                                    3  7  11|13  17|21                5      15 
                                                                     / \   /    \
                                                                    3  7  11|13 17|19|21
bottom_up:
-
insert 3 :
- 
                        3 
                      /   \ 
insert 7 :
-                      3 | 7
-                     /  |  \

insert 5 :
-                     
-                     3 | 5 | 7
                     /  |  |   \

insert 15 :
-
-inserted 15 then the root is split.
-
-                      3 | 5 | 7 | 15  (5 node shoudl be split)     5   
                      /  |   |   |   \       -->                   /  \
-                                                                 3   7|15
insert 17 :                                          
-
                       5
-                     /  \
                     3   7 |15|17
-                   / \  / |   | \ 

insert 9:
-
                       5                                                                            5 |15
-                     /  \                                                                          / |  \
                     3   7| 9 |15|17(a 5-Node)  -->split   15  merge to balance the tree --->      3 7|9 17
-                   / \  / |   | \                        / \
-                                                        7|9 17

insert 13:
- 
                                        5 | 15
                                       /  |    \  
                                      3  7|9|13  17

insert 21:
-                                       5 | 15
                                       /  |    \  
                                      3  7|9|13  17|21
insert 11:
- 
                                       5  |  15                            5 |9| 15                
                                      /   |      \          -->           / |   |    \    
                      (insert 11)   3  7|9|11|13  17|21  (node split)    3  7  11|13  17|21    
insert 19:
-
-

                                      5 | 9 | 15            
                                     /  |  |    \                      
                                    3  7  11|13  17|19|21                
                                                                     

**TODO** show what happens during the insertion of the numbers 3, 5,
7, 9, 11, 13, 15, 17, 19 and 21 (in this order) into an 2-3-4-Tree


