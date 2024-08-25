Solution
---
AVL-Tree :
  i) It's a self-balancing Binary tree named after its inventors Adelson-Velsky and Landis .
 ii) The difference between left and right subtree should be less than or equal to 1. This is called balance factor.
iii) If the difference between the heights of left and tight subtree gets greater than 1 , it can balance itself by 
     rotating left or right.
 iv) Its O(log n) for insertion , deletion and search.
  v) Its height is also O(log n)

Question :why balancing the tree is important ?
Answer : To maintain the time complexity of O(log n) and to avoid degeneration where the tree gets unbalanced to an extent that the 
         tree starts resembling like a linked list.



**TODO** show what happens during the insertion of the numbers 14, 15,
17, 7, 5, 10 and 16 (in this order) into an AVL-Tree

insert 14 :
 
        14
      /    \

insert 15:
 
        14
      /    \
           15
          /  \

insert 17 :
      
        14                         15
      /    \                      /  \
           15    -->            14   17
          /  \
             17
          
insert 7:

        15
       /  \
      14  17
     / \  / \
    7

insert 5:

        15                        15
       /  \                      /  \
      14  17                    7    17
     / \  / \   -- >           / \   / \
    7                         5  14 
   /
  5

insert 10:


        15                      14
       /  \                    /  \
      7   17                  7   15 
     / \  / \  -->           / \    \ 
    5  14                   5  10   17
       / \
      10
inset 16 :

        14                     14 
       / \                    /  \
      7  15                  7   16
     / \   \      -->       / \  /  \ 
    5  10  17              5  10 15  17
           /
          16            