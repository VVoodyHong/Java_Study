package Collection.Practice;

import java.util.*;

public class Practice3 {

    public static void showAll(HashMap<String, String> hmap) {

        Set<String> Keys = hmap.keySet();

        var vecKeys = new Vector<String>(Keys);
        Collections.sort(vecKeys);
        Iterator <String> it = vecKeys.iterator();

        while(it.hasNext()) {
            String name = it.next();
            String number = hmap.get(name);
            System.out.println(name + " : " + number);
        }
    }
    public static void main(String[] args) {

        var PhoneBook = new HashMap<String, String>();

        PhoneBook.put("홍정욱", "010-1111-1111");
        PhoneBook.put("양민영", "010-2222-2222");
        PhoneBook.put("최한수", "010-3333-3333");
        PhoneBook.put("김영환", "010-4444-4444");
        PhoneBook.put("홍진혁", "010-5555-5555");
        PhoneBook.put("박기표", "010-6666-6666");

        showAll(PhoneBook);
       
    }
    
}
