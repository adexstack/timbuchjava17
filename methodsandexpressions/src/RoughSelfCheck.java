import java.util.*;

public class RoughSelfCheck {
    public static void main(String[] args) {
        int[] numsTouse = {7, 2, 4, 8, 12, 0, -1};
        System.out.println(findMinimum(numsTouse));
        System.out.println(makeList(0, 100, 10));
        System.out.println(makeList(5, 100, 2));
        arrayUse(1,10,1);
        arrayUse2(1,10,1);

        String[] students = {"Dan", "Steve", "Ken", "Dave"};
        hashMapUse1(students);
        hashMapUse2(students);

        linkedListUse1();
        hashSet1();
    }

    public static int findMinimum(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static List<Integer> makeList(int start, int end, int step) {
        List<Integer> lis = new ArrayList<>();
        for (int i = start; i <= end; i += step) {
            lis.add(i);
        }
        return lis;
    }

    public static void arrayUse(int num1, int num2, int num3) {
        System.out.println("Iterator to remove items from array; Cannot use Arraylist");
        List<Integer> lis1 = makeList(num1, num2, num3);
        Collections.sort(lis1); //used to sort list
        Iterator<Integer> it = lis1.iterator();
        while(it.hasNext()){
            if(it.next() < 5){
                it.remove();
            }
        }
        System.out.println(lis1);
    }
    public static void arrayUse2(int num1, int num2, int num3) {
        List<Integer> lis1 = makeList(num1, num2, num3);
        lis1.removeIf(integer -> integer < 5);
        System.out.println(lis1);
    }

    public static void hashMapUse1(String[] names){
        System.out.println("Hashmap getting keys and values");
        HashMap<Integer, String> map1 = new HashMap<>();
        for(int i = 0; i < names.length; i++)
        map1.put(i, names[i]);
        for(Integer num : map1.keySet()){
            if(map1.get(num).equals("Dan")){
                continue;
            }
            System.out.println(num);
            System.out.println(map1.get(num));

        }
    }
    public static void hashMapUse2(String[] names){
        System.out.println("Hashmap getting values");
        HashMap<Integer, String> map1 = new HashMap<>();
        for(int i = 0; i < names.length; i++)
            map1.put(i, names[i]);
        for(String name : map1.values()){
            System.out.println(name);
        }
    }

    public static void linkedListUse1(){
        System.out.println("LinkedList is used to manipulate data more efficiently in a container" +
                "ArrayLise stores data in array and recreate a bigger array if more array space is needed");
        LinkedList<String> link1 = new LinkedList<>();
        link1.add("Guy");
        link1.add("Fam");
        link1.add("Sam");
        link1.add("Yet");
        System.out.println(link1);
        link1.addFirst("Seyi");
        link1.addLast("Davina");
        System.out.println(link1.getFirst());
        link1.removeFirst();
        System.out.println(link1);
    }

    public static void hashSet1(){
        System.out.println("-----Hashset is to ensure uniqueness and no duplicate------");
        HashSet<String> hash1 = new HashSet<>();
        hash1.add("Guy");
        hash1.add("Fam");
        hash1.add("Sam");
        hash1.add("Yet");
        hash1.add("Yet");
        System.out.println(hash1);
        System.out.println(hash1.contains("Fam"));
        System.out.println(hash1.contains("NotExist"));
    }
}
