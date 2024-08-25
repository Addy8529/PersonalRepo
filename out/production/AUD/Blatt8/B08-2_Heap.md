//Gruppearbeit von Muhammad ahad (Gr.5), Gurpreet Singh Chandi (Gr. 4) und Shashank Shorya(Gr. 5)

Heap
---

**TODO:** Insert your answer for task 1 - 3!

**1**
Ein Binärbaum ist ein Heap, wenn für jeden Knoten X (außer der
  Wurzel) gilt X >= parent(X).
  **Beispiel**
    MinHeap:-      2
                 /   \
                /     \
               6       4
             /   \    /  \
            3    2   1    3
           /
          1     

In min heap sollten sich alle Werte, die kleiner oder gleich Wurzel sind, unter Wurzel befinden.  
Jeder Elternknoten sollte zwei Kinder Knoten haben, mit Ausnahme der Knoten in der letzten Ebene.
    
 **2**      
  => Das größte Element soll in der letzten Ebene befinden.  
  => Wenn ein Feld in aufsteigend sortierter Reihenfolge vorliegt,dann ist er Min Heap.
 **3**
                                 5, 1, 19, 25, 17, 21, 5, 19, 20, 9, 15, 14
                                 5
                               /   \
                             1         19
                           /  \      /    \  
                         25   17     21     5
                       /  \   / \   / 
                     19   20 9  15  14  
     **DownHeap**
                                               Swap(14,21)
                                                       5                           
                                                     /   \
                                                   1         19
                                                 /  \      /    \  
                                               25   17    `14`     5
                                             /  \   / \   / 
                                           19   20 9  15  21 
                                          Swap(17,9)
                                                       5
                                                     /   \
                                                   1         19
                                                 /  \      /    \  
                                               25   `9`     14     5
                                             /  \   / \     / 
                                           19   20 17  15  21  
                                           Swap(19,25)    
                                                        5
                                                      /   \
                                                    1         19
                                                  /  \      /    \  
                                               `19`    9     14     5
                                               /  \   / \     / 
                                             25   20 17  15  21      
                                           Swap(19,5)
                                                       5
                                                    /   \
                                                 1         `5`
                                               /  \      /    \  
                                             19    9     14     19
                                           /  \   / \     / 
                                         25   20 17  15  21 
     **UpHeap**                                       
                          5, 1, 19, 25, 17, 21, 5, 19, 20, 9, 15, 14
                                                      5                          Swap(5,1)
                                                     /
                                                    1  
                                               **************
                                                      1
                                                   /     \
                                                  5      `19`                          Swap(5,19)  
                                                /  \     /  \ 
                                               25   17  21   5
                                               ***************
                                                             1
                                                          /     \
                                                        5        5                         
                                                       /  \     /  \ 
                                                      25   17  21   19                 Swap(25,19)
                                                     /
                                                    19 
                                               ***************
                                                1
                                             /     \
                                             5        5                        
                                          /    \        /  \ 
                                        `19`    14     21   19                        Swap(9,14)
                                        / \     / \
                                      25   20  9                          
                                               ***************
                                              1
                                          /       \
                                         5          5                        
                                       /  \        /  \ 
                                      19   `9`     `14`   19                
                                    / \    / \     /  
                                  25   20 14  15   21                                Swap(14,21)             
    Time Complexity:  DownHeap  O(lnn)          
                      UpHeap    O(nln(n))
                     
                     
           
  
 
 