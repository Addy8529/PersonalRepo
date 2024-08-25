// zusammenarbeit von Muhammad Ahad (Gr.5), Gurpreet Singh Chandi(Gr.4) und Shashank Shorya(Gr. 5) 

1)

Ein AVL-Baum ist ein binärer Suchbaum mit der zusätzlichen Eigenschaft, dass sich die Höhe 
der beiden Teilbäume an jedem Knoten um den höchsten unterscheidet.


2)
 
Zuerst fügen wir die Knoten wie im binären Suchbaum hinzu und prüfen dann, ob es sich um einen AVL-Baum handelt oder nicht. 
Beim AVL-Baum muss die Differenz zwischen der Höhe des linken Teilbaums und des rechten Teilbaums -1,0,1 sein,
wenn nicht, dann konvertieren wir sie durch Rotation in den Avl-Baum.


Beispiel:- 14,15,17,7,5,10,16


ADD 14                                    ADD 15

 14                                          14
 /\                                          /\
                                              15
(An AVL -Tree)                                /\

                                          (An AVL -Tree) 




ADD 17 

 14                                                        15
 /\                      convert into AVL                  /\
  15                     ----------------->             14  17
  /\                                                    /\  /\
   17
   /\
(RR, Not an AVL Tree)                   (AVL-Kriterium wieder erfüllt)




ADD 7

    15
    /\
  14 17
  /\ /\
 7
/\

(AN AVL Tree)


ADD 5
      
      15                                                       15
      /\                                                       /\
    14 17                                                     7  17
    /\ /\                  Convert into AVL(Rotation)        /\  /\
   7                       ------------------------>        5 14
  /\                                                       /\  /\
 5         
/\

(LL, Not an AVL Tree)                      


ADD 10
      
      15                                                       14
     / \                                                       / \
    7   17                                                    7   15
   / \  /\          convert into AVL                         /\   /\
  5  14            ------------------------>                5 10    17
 /\  /\                                                    /\ /\    /\
  10
  /\

(Not an AVL Tree)                          


ADD 16

     14                                                        14
     /\                                                        / \
    7  15                Convert into AVL                     7  16
   /\  /\               --------------------------->         /\   /\
  5 10  17                                                  5 10  15 17
        / \                                                /\ /\  /\  /\                                       
       16 
       /\
 
 

          
        
                