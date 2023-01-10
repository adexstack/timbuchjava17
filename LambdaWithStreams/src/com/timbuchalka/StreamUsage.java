package com.timbuchalka;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUsage {
    public static void main(String[] args) {
        String [] lis = {"Seyi", "Ayo", "Azeez", "Ade", "Femi", "Ace", "Dean", "dan","Steve","sad"};

        String [] lisNo1 = {"Ace", "Dean", "dan","Steve","sad"};
        String [] lisNo2 = {"Dean", "dan","Steve","sad"};

        List<String> lis3 = Arrays.asList(lis);
        /*int count = 0;
        List<String> lis1 = Arrays.asList(lis);
        List<String> lis2 = new ArrayList<String>();
        for (String getName : lis1) {
            if (getName.startsWith("S")) {
                count++;
                lis2.add(getName);
            }
        }
        System.out.println(lis2);
        System.out.println(count);*/

        // Using streams to achieve the above
         /*Stream.of(lis).filter(s ->
                s.toUpperCase().startsWith("S")).limit(2).forEach(s -> System.out.println(s));*/

         // using Map to manipulate(modification) the filtered object
        // filter is not mandatory
        /*
        Stream.of(lis).filter(s -> s.endsWith("e")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
        ADE
        ACE
        STEVE
         */

        // Filtering and sorting
        /*
        Stream.of(lis).filter(s -> s.startsWith("A")).sorted().forEach(s -> System.out.println(s));
        */

        // Using the streamMet method below here
       /*
        List<String> lis1 = Arrays.asList(lis);
        streamMet(lis1);
        */

       // Joining two lists and printing out
         /*
         Stream.concat(Arrays.stream(lisNo1), Arrays.stream(lisNo2)).forEach(s -> System.out.println(s));
         */

       // When I don't need anything  but just want a returned boolean to assert
         /*
         Boolean flag = Stream.of(lis).anyMatch(s -> s.equalsIgnoreCase("Seyi"));
        System.out.println(flag);
        */

         // Converting streams back to list and manipulating the list as needed
        //Could also convert to map, set e.t.c
        List<Integer>nums = Arrays.asList(3,2,2,4,5,1,8,7);

        //List<Integer>numsNew = nums.stream().sorted().collect(Collectors.toList()); //not distincting
        //sorting after distincting the list
        List<Integer>numsNew = nums.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(numsNew);
        System.out.println(numsNew.get(2));


    }
    public static void streamMet(List<String> lis){

        Stream.of(lis).forEach(System.out::println);

    }
}
