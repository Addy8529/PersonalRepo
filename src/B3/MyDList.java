package B3;

import aud.DList;


public class MyDList<T> extends DList<T> {
//-----------------------------------------------------------------//
  public MyDList() {
    super();
  }

//-----------------------------------------------------------------//
  public void append(MyDList<T> li){

  ForwardIterator old_iterator =this.iterator();
  ForwardIterator new_iterator =li.iterator();

  int n= this.size()+li.size();
  int i=0;

  while(i<n){
   // iterated through the destination list and as it reaches the end
    // it iterates though the list being appended and pushes elements into destination list
    if(old_iterator.hasNext()){
      old_iterator.next();
    }else {
     this.push_back(new_iterator.next());
    }
    i++;
  }

  }

//-----------------------------------------------------------------//
  public void insert(int n, MyDList<T> li) {

    ForwardIterator iterator = li.reverse_iterator();
    // if the same List is being inserted , makes a copy of it and then inserts it
    if (this == li) {
      MyDList<T> copy = new MyDList<>();
      copy.append(this);
      this.insert(n, copy);
    } else {
      //iterates through the list to be inserted and inserts elements backwards on th same place in the destination list
      while (iterator.hasNext()) {
        this.insert(n, iterator.next());
      }
    }
  }
//-----------------------------------------------------------------//
  public static void main(String[] args) {
    //created 2 lists for testing
    MyDList<Integer> list= new MyDList<>();
    MyDList<Integer> list2= new MyDList<>();

    //inserted elements into the lists
    for(int i=0;i<=15;i++){
      if(i<7||i>12) list.push_back(i);
      else list2.push_back(i);
    }

    System.out.println("List1: "+list);
    System.out.println("List2: "+list2);

    list.insert(7,list2);
    System.out.println("after insertion :"+list);
    list.append(list);
    System.out.println("After appending: "+list);
  }
}
