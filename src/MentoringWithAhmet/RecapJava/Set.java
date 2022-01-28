package MentoringWithAhmet.RecapJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Set {
    /*
    Interview Questions:
    1)How can you make  the elements unique with collection? (American Style)
    In my project, I was using set to make the customers unique to prevent
    dublication which causes some problems for my company.
    I was storing the customers name in the SET.
    1*)What is Set and why do you use it?
    Set is a collection and i was using it to store my customers unique.
    2 Can you tell me the types of collection?
    *List
    *Set
    *Queue(we didn't learn)
    3)Can you explain the difference between them ?
    4)What is the difference between ArrayList and LinkedList
    I do not use LinkedList a lot but efficiency of reaching  the element in  Arraylist is faster
    than Linkedlist.

    5)What is the difference between Set types?
    HASHSET: it stores the elements without any orders--> Null value
    LINKHASHSET: it stores the elements insertion order-->  Null value
    TREESET: it stores the elements ascending order. no null values




    LIST :
    1)List can store the duplicates elements.
    2)ArrayList and LinkedList
    3)Synthax is different


    SET:
    1)Set only stores unique elements.
    2)HashSet, LinkedHashSet, TreeSet
    3)Synthax is different



     */
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        java.util.Set set = new HashSet(list);


    }
}
