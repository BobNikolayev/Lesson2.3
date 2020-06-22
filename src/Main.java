import java.lang.reflect.Constructor;
import java.net.JarURLConnection;
import java.sql.SQLOutput;
import java.util.*;

public class Main  {


    public static void main(String[] args) {

        List<String> wordList = new ArrayList<>();

        wordList.add("Over");
        wordList.add("Steel");
        wordList.add("Reason");
        wordList.add("Starter");
        wordList.add("Math");
        wordList.add("Reason");
        wordList.add("Horizon");
        wordList.add("Over");
        wordList.add("Steel");
        wordList.add("Horizon");

        System.out.println(wordList);
//Оставляем только слова которые не повторяются
        Set<String> set = new HashSet<>(wordList);
        wordList.clear();
        wordList.addAll(set);



        //        phoneNumbers[] nums = new phoneNumbers[10];
//        nums[0] = new phoneNumbers (123123,"Bob");
//        nums[1] = new phoneNumbers(321321,"Justin");
//        nums[2] = new phoneNumbers(345321,"Sten");
//        nums[3] = new phoneNumbers(876345,"Bob");
//        nums[4] = new phoneNumbers(213678,"Charley");
//        nums[5] = new phoneNumbers(694312,"Gabriel");
//        nums[6] = new phoneNumbers(237834,"Diego");
//        nums[7] = new phoneNumbers(234976,"Justin");
//        nums[8] = new phoneNumbers(762947,"Harry");
//        nums[9] = new phoneNumbers(758612,"Mad");




        //Создание листов для каждого имени.
        List<Integer> BobNums = new ArrayList<>();
        BobNums.add(123123);
        BobNums.add(876345);
        List<Integer> JustinNums = new ArrayList<>();
        JustinNums.add(321321);
        JustinNums.add(234976);
        List<Integer> StenNums = new ArrayList<>();
        StenNums.add(345321);
        List<Integer> CharleyNums = new ArrayList<>();
        CharleyNums.add(213678);
        List<Integer> HarryNums = new ArrayList<>();
        HarryNums.add(762947);

//    Map<String ,List<Integer>> phoneNum = new HashMap<>();
//        phoneNum.put("Bob",123123);
//        phoneNum.put("Justin",);
//        phoneNum.put("Sten",);
//        phoneNum.put("Bob",876345);
//        phoneNum.put("Charley",);
//        phoneNum.put("Gabriel",694312);
//        phoneNum.put("Diego",237834);
//        phoneNum.put("Justin",);
//        phoneNum.put("Harry",);
//        phoneNum.put("Mad",758617);


        //Карта с номерами и именами. Номера собрани в листы чтоб можна было отображать все номера под 1 именем.
        Map<String ,List<Integer>> phoneNum = new HashMap<>();
        phoneNum.put("Bob",BobNums);
        phoneNum.put("Justin",JustinNums);
        phoneNum.put("Sten",StenNums);
        phoneNum.put("Charley",CharleyNums);
        phoneNum.put("Harry",HarryNums);


        phoneSearch("Justin",phoneNum);

    }



//Метод выводящий на екран номера под именем. На вход подаётся Имя и карта.
public static void phoneSearch(String name, Map map){

    System.out.println(map.get(name));
}

}








