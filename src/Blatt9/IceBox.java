package Blatt9;

//Gruppenarbeit von Muhammad Ahad (Gr.5), Gurpreet Singh Chandi(Gr.4) und Shashank Shorya(Gr.5)

/**Container that can store food elements.*/
public class IceBox {

    // TODO: attributes and constructor
    Food[] table;
    int capacity;

    public IceBox(int capacity) {
        this.table = new Food[capacity];
        this.capacity = capacity;
    }


    //---------------------------------------------------------------//
    public void add(Food obj) {
        // TODO: implementation

        int x = obj.hashCode() % capacity;
        int i = 1;

        while (table[x] != null) {
            i++;
            x = (x + (i * i)) % capacity;
        }

        table[x] = obj;

    }


    //---------------------------------------------------------------//
    public boolean contains(Food obj) {
        // TODO: implementation

        int x = obj.hashCode() % capacity;
        int i = 1;

        while (table[x] != null) {

            if (table[x].Name.equals(obj.Name)) {
                return true;
            } else {
                i++;
                x = (x + (i * i)) % capacity;
            }
        }
        return false;
    }


    public String toString() {
        String str = "";
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                str += table[i].toString() + "\n";
            }
        }
        return str;
    }



    //---------------------------------------------------------------//
    public static void main(String[] args) {
        // TODO: test your code
        Food Orange = new Food("Orange", "Obst");
        Food Kartoffel = new Food("Kartoffeln", "Gemüse");
        Food Erdbeer = new Food("Erdbeer", "Obst");

        IceBox box = new IceBox(3);

        box.add(Orange);
        box.add(Kartoffel);

        System.out.println("List of Products :-");
        System.out.println(box);

        System.out.println("Box containes 'Erdbeer':- " + box.contains(Erdbeer));

        box.add(Erdbeer);

        System.out.println("Box containes 'Erdbeer':- " + box.contains(Erdbeer));
        System.out.println();
        System.out.println("New List :-");
        System.out.println(box);

    }
}

