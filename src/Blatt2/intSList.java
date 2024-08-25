package Blatt2;

import aud.SList;

import java.util.function.Predicate;

                           // Muhammad Ahad,  Shashank Shorya,  Gurpreet Singh Chandi
public class intSList {
       // Store list of integers as an SList.
      SList<Integer> li;


  public intSList() {
      this.li= new SList<>();
  }


  @Override
  public String toString() {
      return li.toString();
  }


  public void push_front(int obj){
      li.push_front(obj);
  }


  public intSList filter(Predicate<Integer> p){
       // created IntList
      intSList newList=new intSList();


      // as long as li has elements this loop will push elements who pass the test into newList
    for (Integer i : this.li) {

      if (p.test(i))
        newList.push_front(i);
    }
       return newList;
  }


  public static void main(String args[]) {
    // Created a Predicate with 2 tests 1) even 2) smaller than 50
    Predicate<Integer> P=new Predicate<Integer>() {
      @Override
      public boolean test(Integer integer) {
        return integer % 2 == 0 && integer < 50;
      }
    };


    // created a new IntList
    intSList a=new intSList();
      // created a loop to fill IntList
      for(int i=0;i<100;i++){
      a.push_front(i);
      }
    System.out.println(a.filter(P));


 }}
