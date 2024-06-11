package com.stringtask.logics;
import com.stringtask.exceptions.InputInvalidException;
import com.stringtask.utility.Helper;

public class StringTask{

public int getLength(String name) throws InputInvalidException{
   Helper.checkNull(name);
   return name.length();
  }


public char[] getCharArray(String name)throws InputInvalidException{
  Helper.checkNull(name);
  return name.toCharArray();
}


 public char getCharacter(String name, int index) throws InputInvalidException{
 int strLength = getLength(name);
 if(strLength < index){
 throw new InputInvalidException("Value of "+index+" is greater than length of "+name+".\n Enter a index less than "+strLength);
 }
  char[] charArray = getCharArray(name);
  return charArray[index];
 }
 

 public int getOccurance(String name,char char1) throws InputInvalidException{
  char[] charArray = getCharArray(name);
  int count = 0;
  for(int i=0;i<charArray.length;i++){
  
   if(charArray[i]==char1){
    count++;
   }
  }
  return count;
 }


 public int getGreatPosition(String name,char char1) throws InputInvalidException{
  Helper.checkNull(name);
 return name.lastIndexOf(char1);
 }
 

 public String getLast(String name,int lastNum)throws InputInvalidException{
 int strLength = getLength(name);
 if(strLength < lastNum){
 throw new InputInvalidException("Number of character "+lastNum+" is greater than length of string "+strLength);
 }
 return name.substring(strLength-lastNum);
  }
  

public String getFirst(String name, int firstNum) throws InputInvalidException{
int strLength = getLength(name);
if(strLength<firstNum){
throw new InputInvalidException("Number of character "+firstNum+" is greater than length of string "+name+"\n Enter the number of character less than or equal to length of string");
}
return name.substring(0,firstNum);
}


public String changeFirst(String name,String pattern,int numberOfChar)throws InputInvalidException{
int strLength = getLength(name);
int patternLength = getLength(pattern);

if(numberOfChar > strLength){
 throw new InputInvalidException("Length of string "+name+" is less than than number of character "+numberOfChar+"\n Enter the number of characters less than length of string");
}
return name.replaceFirst(name.substring(0,numberOfChar),pattern);
}


public boolean checkStart(String name,String pattern) throws InputInvalidException{
Helper.checkNull(name);
return name.startsWith(pattern);
}


public boolean checkEnd(String name,String pattern) throws InputInvalidException{
Helper.checkNull(name);
return name.endsWith(pattern);
}


public String toUpper(String name) throws InputInvalidException{
int strLength = getLength(name);
if(strLength<=0){
throw new InputInvalidException("Enter a string with length greater than 0");
}
return name.toUpperCase();
}

public String toLower(String name) throws InputInvalidException{

int strLength = getLength(name);
if(strLength<=0){
throw new InputInvalidException("Enter a string with length greater than 0");
 }
return name.toLowerCase();
}


public String reverse(String givenString)throws InputInvalidException{

int strLength = getLength(givenString);
char[] name = getCharArray(givenString);
char[] reversed = new char[strLength];
System.out.println(name);
for(int i=0;i<strLength;i++){
reversed[i] = name[strLength-1-i];
}
return String.valueOf(reversed);
}


public String singleString(String firstString,String secondString,String thirdString) throws InputInvalidException{
Helper.checkNull(firstString);
return firstString.concat(secondString).concat(thirdString);
}


public String[] encloseString(String name,String symbol)  throws InputInvalidException{
Helper.checkNull(symbol);
int strLength = getLength(name);
if(strLength<=0){
throw new InputInvalidException("Enter a string with length greater than 0");
 }
return name.split(symbol);
}



public String mergeString(String[] strArray,String symbol)  throws InputInvalidException{
Helper.checkNull(symbol);
Helper.checkNull(strArray);

String merge = null;
for(int i=0;i<strArray.length;i++){
if(merge != null){
merge =  String.join(symbol,merge,strArray[i]);
}
else{
merge =  String.join(symbol,strArray[i]);
}
}
return merge;
}

public boolean checkString(String nameToCheck,String name)  throws InputInvalidException{
Helper.checkNull(nameToCheck);
return nameToCheck.equals(name);

}

public boolean checkStrIgnoreCase(String nameToCheck,String name)  throws InputInvalidException{
Helper.checkNull(nameToCheck);
return nameToCheck.equalsIgnoreCase(name);
}


public String trimBlank(String name)  throws InputInvalidException{
if(getLength(name)<=0){
throw new InputInvalidException("Enter a string with length greater than 0");
 }
return name.trim();
}


}