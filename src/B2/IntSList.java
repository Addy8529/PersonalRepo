package B2;

import aud.SList;

import java.util.function.Predicate;

// This class "wraps" an instance of `SList<Integer>` (attribute
// `li`): Calls to `toString()` and `push_front()` are "delegated" to
// the instance.
// The additional method `filter()` applies a predicate and constructs
// a new list with all items for which the predicate evaluates to `true`.
//
public class IntSList {
  // Store list of integers as an SList.
  SList<Integer> li;


  public IntSList(SList<Integer> li) {
    this.li = li;
  }

  // delegate to SList
  @Override
  public String toString() {
    return li.toString();
  }

  // delegate to SList
  public void push_front(int obj){
    li.push_front(obj);
  }

  // Filter list by predicate `p` and return list of all items for
  // which predicate evaluates to `true`.
  // The order of items in the returned list may differ from the order
  // in `this` list (because we use always `push_front()`).
  //
  public IntSList filter(Predicate<Integer> p){
    IntSList list=new IntSList(new SList<>());

    for(Integer i:this.li)
      if(p.test(i)) list.push_front(i);

    return  list;
  }

  // You must provide a main() method!
  public static void main(String[] args) {

    IntSList testList = new IntSList(new SList<>());

    for(int i=0;i<=15;i++){
      testList.push_front(i);
    }

    Predicate<Integer> even= num-> num%2 ==0;
    Predicate<Integer> odd = num-> num%2 !=0;
    Predicate<Integer> less_than= num->num<10;


    System.out.println("List :"+testList);
    System.out.println("Even numbers :"+testList.filter(even));
    System.out.println("Odd  numbers :"+testList.filter(odd));
    System.out.println("less than 10 :"+testList.filter(less_than));


  }
}
