package week6;

import java.util.ArrayList;
import java.util.Arrays;
public class ArraylistClass {

    public static void main(String[] args) {
        // // to use arraylist import at the top like Scanner from java.utils
        // // ArrayList<String> animals = new ArrayList<>();

        // // //  size is automatically allocated according to the element
        // // //  To add data in animals
        // // animals.add("car");
        // // animals.add("Dog");
        // // animals.add("Elephant");
        // // System.out.println(animals);

        // // // can add element directly to index, it will shift rest to +1 of index
        // // animals.add(1,"Tiger");

        // // // notice how the previous 1 and rest are shifted by 1 index

        // // // To remove use.remove(index)
        // // animals.remove(2);
        // // System.out.println(animals);

        // // // to update .set(index, value)
        // // animals.set(1,"snake");
        // // System.out.println(animals);
        // // // to access cannot use (index)--> square, use.get(index)
        // // System.out.println(animals.get(0));
        // // // get 0th index element

        // /*task
        //  * make an arraylist of int
        //  * [100,200,300,400,500]
        //  * remove the value  300
        //  * add -100 at the first of array list
        //  * change 200 -210
        //  * change 400- 420
        //  * print the arrylist
        //  */
        // // ArrayList <Integer> intList = new ArrayList<Integer>(Arrays.asList(100,200,300,400,500));
        // // intList.add(100);
        // // intList.add(200);
        // // intList.add(300);
        // // intList.add(400);
        // // intList.add(500);
 
        // // intList.remove(2);
        // // intList.add(0,-100);
        // // intList.set(1,210);
        // // intList.set(3,420);
        // // System.out.println(intList);  

        // ArrayList <String> names = new ArrayList<>();

        // names.add("Aadhar");
        // names.add("Ayayam");
        // names.add("yusan");
        // names.add("Ayush");
        // names.add("Niraj");
        // names.add("Rijan");
    
        // //  to loop , find the length \element count , . size
        // int namesLength = names.size();
        // //  loop same as array
        // for(int index = 0;index<namesLength; index ++){
        //     // get each element with.get(index)
        //     String singleName = names.get(index);
        //     System.out.println("index : "+ index+"value"+singleName);

        // }
        // // using froeach in jave , iterate with element \actual value 

        // for(String element: names){
        //     System.out.println(element);
        
           /*Task
         * make ande arraylist animals
         * ["Cat","Tiger","Dog","Elephant"]
         * make two more arraylist called wildanimal ,domestic animal
         * loop the animals
         * if the element/value is "Cat", 'Dog" add in domestic animal
         * same for 'Tiger AND "elephant'
         * print domestic animal and widl animal
         *
         */
        ArrayList <String> animals = new ArrayList<String>(Arrays.asList("Cat","Tiger","Dog","Elephant"));
        ArrayList<String> wildanimal = new ArrayList<>();
        ArrayList<String> domesticanimal = new ArrayList<>();
        for(String animal : animals) {
            if(animal == "Cat" || animal == "Dog") {
                domesticanimal.add(animal);
        }else{
            wildanimal.add(animal);
        }

        System.out.println("Wild animal: "+ wildanimal);
        System.out.println("Domestic animal: "+ domesticanimal);
}

    }
}