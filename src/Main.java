import java.lang.reflect.Constructor;
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

        Set<String> set = new HashSet<>(wordList);
        wordList.clear();
        wordList.addAll(set);



        phoneNumbers[] nums = new phoneNumbers[10];
        nums[0] = new phoneNumbers (123123,"Bob");
        nums[1] = new phoneNumbers(321321,"Justin");
        nums[2] = new phoneNumbers(345321,"Sten");
        nums[3] = new phoneNumbers(876345,"Bob");
        nums[4] = new phoneNumbers(213678,"Charley");
        nums[5] = new phoneNumbers(694312,"Gabriel");
        nums[6] = new phoneNumbers(237834,"Diego");
        nums[7] = new phoneNumbers(234976,"Justin");
        nums[8] = new phoneNumbers(762947,"Harry");
        nums[9] = new phoneNumbers(758612,"Mad");



        List<Object> numList = new ArrayList<>();

        numList.add(nums);



        }

    }













