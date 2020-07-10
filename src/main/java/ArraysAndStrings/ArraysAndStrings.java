package main.java.ArraysAndStrings;

public class ArraysAndStrings {

    /**
     * Tests if a string has all uniqueCharecters
     * @param str string to test
     * @return true if all characters unique
     */
    public boolean isUniqueCharacterised(String str){
       if(str == null) return false;
       if(str.length() > 128) return false;

       boolean[] charSet = new boolean[128];

       for(int i=0; i<str.length(); i++){
          int val = str.charAt(i);
           if(charSet[val]) return false;

           charSet[val] = true;
        }

       return true;
    }
}
