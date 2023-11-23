package prac19;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        DirFiles dirFiles = new DirFiles("C:\\Users\\nazar\\Downloads");
        MyUniversalArray<Integer> intArray = new MyUniversalArray<>(5);
        intArray.set(0, 11111);
        MyUniversalArray<String> strArray = MyUniversalArray.of(String.class, 5);
        strArray.set(0, "Im the element №0");
        String[] stringArray = {"one", "two", "three"};
        Integer[] integerArray = {1, 2, 3, 4, 5};
        ArrayToList arrayToListConverter = new ArrayToList();
        List<String> stringList = arrayToListConverter.convertArrayToList(stringArray);
        List<Integer> integerList = arrayToListConverter.convertArrayToList(integerArray);

        System.out.println("String list: " + stringList);
        System.out.println("Integer list: " + integerList);

        for (int i = 0; i < intArray.length(); i++) {
            System.out.println(intArray.get(i));
        }
        for (int i = 0; i < strArray.length(); i++) {
            System.out.println(strArray.get(i));
        }

        List<String> contentList = dirFiles.getDirectoryContent();
        for (int i = 0; i < Math.min(contentList.size(), 5); i++) {
            System.out.println(contentList.get(i));
        }
    }
}