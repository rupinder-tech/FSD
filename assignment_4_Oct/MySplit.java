package assignment_4_Oct;

import java.util.ArrayList;

class MySplit {
	
     ArrayList<String> splitString (String str , String delimiter){
        
        int firstIndex = 0;
        int nextIndex = str.indexOf(delimiter);
        
        ArrayList<String> myList = new ArrayList<>();
       // System.out.println(s.length());

        while (nextIndex < str.length()) {
            myList.add(str.substring(firstIndex, nextIndex));
        
            firstIndex = nextIndex + delimiter.length();
            nextIndex = str.indexOf(delimiter, nextIndex + 1);
            
            if (nextIndex == -1)
                break;

        }
        return myList;
     }

    public static void main(String[] args) {
    	
        MySplit mySplit = new MySplit();
        ArrayList<String> myList = mySplit.splitString("abcabcabc", "c");
        for(String s : myList){
            System.out.println(s);
        }
    }
}