package MentoringWithAhmet.RecapJava;

import java.util.HashMap;
import java.util.TreeMap;

public class Map {
    /*
    POSSIBLE INTERVIEW QUESTIONS:(MOCK-REAL):
    1)Can you tell me about map and why do you use map in your project?
      map is an awesome interface that I used in my framework to store
      my data as KEY-VALUE pairs.for example: in my finance company i
      was verifying the customers name with their SSN number. At this time
      all data was coming from our Map.
    2)What is the connections between map and collection?
    They are all usefull for the framework for different purposes. As i mentioned
    before set is all obout uniquess, list is all about dublication and efficiency
    (indexing). map is all about key-value pairs.
    3)What is the type of map and differences between them ?
    #HASHMAP:-->random order
    #LINKHASHMAP: insertion order
    #TREEMAP: ascending order
    SHOWOFF: DO you know sir/madam that map is the combination of
    LIST AND SET --> the key part of the Map is referring to SET:
                    the value part of the Map is referring to LIST.

    ***What is the difference between Hashmap and Hashtable?
    ***What do you understand from Thread-safe can you give an example?
       *Hashtable is synchronized. THREAD-SAFE
       *Hashtable is slower

       * HashMap is non-synchronized. -NOT Thread-SAFE
       *HashMap is faster.

       NOTES: DO not forget to specify the keys and values data :
         HashMap<String,Integer> map = new HashMap();

     */

    public static void main(String[] args) {
        String[] fruits = {"Apple","Banana","Peach","Apple","Orange",
        "Strawberry","Banana","Apple","Cherry","Orange"};
        //I want you get the numbers of fruits with a key-and value
        //output: Apple =3 , Banana = 2,.....

        // I think you are asking me to find the numbers of each fruits and
        //want me show them like this output?
        //I am going to use loops to access each of the fruits
        //then I am going to put if conditions for a specific map.
        //and then print them out
        TreeMap<String,Integer> map = new TreeMap();
        for(int i = 0 ; i<fruits.length;i++){
            if(!map.containsKey(fruits[i])){
                map.put(fruits[i],1);
            }else{
                map.put(fruits[i],map.get(fruits[i])+1);
            }

        }
        System.out.println(map);
    }

    //HOMEWORK: String = "ArrayList is a part of the collection framework. It is present in the java.util package and provides us dynamic arrays in Java. Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed. We can dynamically add and remove items. It automatically resizes itself. The following is an example to demonstrate the implementation of the ArrayList. "
    //output: A=1423; a=42454; b =4354; ...
    //I WANT YOU GET EACH OF THE LETTER AND HOW MANY WITH THE MAP FORM.
    //Coding bat.

}
