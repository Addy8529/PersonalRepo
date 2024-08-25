package Blatt3;

import aud.DList;


public class MyDList<T> extends DList<T> {

  //GruppenArbeit bei Muhammad ahad, Shashank Shorya und Gurpreet Singh Chandi//

//-----------------------------------------------------------------//
  public  MyDList() {
    super();
  }

//-----------------------------------------------------------------//
  public void append(MyDList<T> li) {
    // TODO: append `li` to `this` list

    // created iterator
    ForwardIterator l_it=li.iterator();
    int size=this.size();

    if (this==li){   // if caller and calle are same

      for(int i=0;i<size;i++)
        this.push_back(l_it.next());
    }else
      while( l_it.hasNext())
        this.push_back(l_it.next());

  }

//-----------------------------------------------------------------//
  public void insert(int n, MyDList<T> li) {
    // created iterator
    BackwardIterator li_rev_it = li.reverse_iterator();
    //created new Blatt3.MyDList
    MyDList<T> clone=new MyDList<>();


    if (this == li) {  // if caller and callie are same
      clone.append(this); // copied caller
      this.insert(n,clone);  // inserted the same in new Blatt3.MyDList

    } else
    {                /// caller and callie are different
      while(li_rev_it.hasNext())  // until caller has next element

        // inserts next element into insert from li at n position
        this.insert(n,li_rev_it.next());

    }

  }

//-----------------------------------------------------------------//
  public  static void main(String[] args) {
   // created tests
    MyDList<Integer> m=new MyDList<>();
    MyDList<Integer> n=new MyDList<>();

    m.push_back(1);
    m.push_back(2);
    m.push_back(3);
    m.push_back(4);
    n.push_back(5);
    n.push_back(6);
    n.push_back(7);
    n.push_back(8);
    System.out.println("m:"+m);
    System.out.println("n:"+n);


   m.append(m);
    System.out.println("Appended:"+m);
   m.insert(2,n);
    System.out.println("Inserted: "+m);

  }
}
