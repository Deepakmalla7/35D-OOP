import

/*task
         * make an arraylist of int
         * [100,200,300,400,500]
         * remove the value  300
         * add -100 at the first of array list
         * change 200 -210
         * change 400- 420
         * print the arrylist
         */
        ArrayList <Integer> intList = new ArrayList<Integer>(Arrays.asList(100,200,300,400,500));
        // intList.add(100);
        // intList.add(200);
        // intList.add(300);
        // intList.add(400);
        // intList.add(500);
 
        intList.remove(2);
        intList.add(0,-100);
        intList.set(1,210);
        intList.set(3,420);
        System.out.println(intList);