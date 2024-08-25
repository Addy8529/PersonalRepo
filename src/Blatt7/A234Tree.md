//gruppearbeit von Muhammad Ahad (Gr.5), Gurpreet Singh Chandi(Gr.4) und Shashank Shorya(Gr. 5)


**TODO** show what happens during the insertion of the numbers 3, 7,
5, 15, 17, 9, 13, 21, 11 and 19 (in this order) into an 2-3-4-Tree
Top-Down = Bottom-up
3 => 3|7 => 3| 5| 7

5           ========>    5 |  15          =========>       5  | 9 |  15

3   7 15 17           3    7 9 13   17 21                3     7  11 13    17 19 21



**TODO** show what happens during the insertion of the numbers 3, 5,
7, 9, 11, 13, 15, 17, 19 and 21 (in this order) into an 2-3-4-Tree

Bottom-up Method:
3 => 3|5 => 3|5|7 =>                       5
3   7|9|11

       5 | 9          =>               5 | 9 | 13             =>             5 | 9 | 15

3     7   11 13 15               3    7  11   15 17 19               3    7 11 13  17|19|21


Top-down Method:

5 | 9 | 13           ==>                 9

3   7  11   15|17|19                   5     13|17

                                     3  7  11  15  19|21