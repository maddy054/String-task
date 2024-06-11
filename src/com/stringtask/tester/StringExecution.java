package com.stringtask.tester;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.stringtask.exceptions.InputInvalidException;
import com.stringtask.logics.StringTask;

import java.util.Arrays;

public class StringExecution{

public static void main(String[] args){
	Logger logger = Logger.getLogger("myLogger");

try (Scanner strScan = new Scanner(System.in);

Scanner intScan = new Scanner(System.in);){
StringTask strOpr = new StringTask();
int select =0;
logger.log(Level.INFO," 1.Find length of string \n 2.convert string into character array \n 3.Find the character at the last but one place of a string \n 4.Find number of occurance of a letter in string \n 5.Find the greatest position of given letter in string \n 6.Get last characters of string \n 7.Get the first characters of a string \n 8.Replace first with specific pattern \n 9.check whether the String starts with particular pattern\n 10.check whether a String ends with particular pattern \n 11.convert all lowercase string to an uppercase string.\n 12.convert all uppercase string to an lowercase string\n 13.reverse the String \n 14. Get multiple input \n 15.Combine number of strings \n 16.Enclose string into string Array \n 17.Combine string using particular symbol \n 18. Check two strings are case sensitively equal \n 19.check whether two string are equal - case im sensitive \n 20.Remove spaces before and after string \n 0. quit");

String string=null;
do{

do{

 logger.log(Level.INFO,"Choose any one: ");
 select = intScan.nextInt();

 if(select<0 || select>20){
 logger.log(Level.INFO,"enter number between 1 and 20");
 }
 }while(select<0 || select>20);


 if(!(select == 15 || select == 17 || select == 0 || select == 1)){

 logger.log(Level.INFO,"Enter the string: "); 
 string = strScan.nextLine();

}

try{
switch(select){

case 1:	
 if(args.length <= 0){
 logger.log(Level.INFO,"You didnt Enter any value!!");
 }
 int strLength = strOpr.getLength(args[0]);

 logger.log(Level.INFO,"Length of the string "+args[0]+" is "+strLength);
break;

case 2:
 char[] charArray = strOpr.getCharArray(string);
 logger.log(Level.INFO,"Character array for string "+string+" is "+Arrays.toString(charArray));
break;

case 3:
 System.out.print("Enter the index: ");
 int index = intScan.nextInt(); 
 char character = strOpr.getCharacter(string,index);
 logger.log(Level.INFO,"Character at the index of "+index+" in "+string+" is "+character);
break;

case 4:

 logger.log(Level.INFO,"enter the character: ");
 char OccuranceChar = strScan.nextLine().charAt(0);

 int occurance = strOpr.getOccurance(string,OccuranceChar);
 logger.log(Level.INFO,"The number of occurance of "+OccuranceChar+" in "+string+" is "+occurance);
break;

case 5:

 logger.log(Level.INFO,"Enter the character: ");
 char reqCharacter = strScan.nextLine().charAt(0);
 int position = strOpr.getGreatPosition(string,reqCharacter);
 logger.log(Level.INFO,"The greatest position of "+reqCharacter+" in "+string+" is "+position);
break;

case 6:
 System.out.print("Enter number of character: ");
 int NoLastChar = intScan.nextInt(); 
 String lastChars = strOpr.getLast(string,NoLastChar);
 logger.log(Level.INFO,"The last "+NoLastChar+" character of "+string+" is "+lastChars);
break;

case 7:
System.out.print("Enter number of character: ");
int noFirstChar = intScan.nextInt(); 
String firstChars = strOpr.getFirst(string,noFirstChar);
logger.log(Level.INFO,"The first "+noFirstChar+" character of "+string+" is "+firstChars);
break;

case 8:
logger.log(Level.INFO,"Enter the pattern: ");
String patternToChange = strScan.nextLine();
System.out.print("Enter the number of string to be changed");	
int numberOfChar = intScan.nextInt();
String firstChange = strOpr.changeFirst(string,patternToChange,numberOfChar);
logger.log(Level.INFO,"The string "+string+" is changed to "+firstChange);
break;

case 9:
logger.log(Level.INFO,"Enter the pattern: ");
String startCheckPattern = strScan.nextLine();
boolean startCheck = strOpr.checkStart(string,startCheckPattern);
logger.log(Level.INFO,"Is string "+string+" starts with "+startCheckPattern+" : "+startCheck);
break;

case 10:
logger.log(Level.INFO,"Enter the pattern: ");
String endCheckPattern = strScan.nextLine();
boolean endCheck = strOpr.checkEnd(string,endCheckPattern);
logger.log(Level.INFO,"Is string "+string+" ends with "+endCheckPattern+" : "+endCheck);
break;

case 11:
String upperCase = strOpr.toUpper(string);
logger.log(Level.INFO,"The string "+string+" is changed into "+upperCase);
break;

case 12:
String lowerCase = strOpr.toLower(string);
logger.log(Level.INFO,"The string "+string+" is changed into "+lowerCase);
break;

case 13:
logger.log(Level.INFO,"The string "+string+" is reversed into "+strOpr.reverse(string));
break;

case 14:
String mulString1 = strScan.next();
String mulString2 = strScan.next();
String mulString3 = strScan.nextLine();
break;

case 15:
logger.log(Level.INFO,"Enter a line which contain 3 word: ");
String mulString4 = strScan.next();
String mulString5 = strScan.next();
String mulString6 = strScan.next(); 
strScan.nextLine(); 
String combineStr = strOpr.singleString(mulString4,mulString5,mulString6);
logger.log(Level.INFO,"Three String "+mulString4+", "+mulString5+" and "+mulString6+" combined as "+combineStr);
break;

case 16:
logger.log(Level.INFO,"Enter the splitting symbol: ");

String encloseSymbol = strScan.nextLine();

String[] enclosed = strOpr.encloseString(string,encloseSymbol);
logger.log(Level.INFO,"Entered string "+string+" is splitted using "+encloseSymbol+" as "+Arrays.toString(enclosed));
break;


case 17:
logger.log(Level.INFO,"Enter the joining symbol: ");

String joinSymbol = strScan.nextLine();

logger.log(Level.INFO,"number of string: ");
int count1 = intScan.nextInt();

String[] merge = new String[count1];
for(int j=0;j<count1;j++){
logger.log(Level.INFO,"Enter string "+j);

merge[j] = strScan.nextLine();
}
String mergeStr = strOpr.mergeString(merge,joinSymbol);
logger.log(Level.INFO,"Entered strings are merged to form "+mergeStr);
break;


case 18:
logger.log(Level.INFO,"Enter the string2: ");
String stringToCheck = strScan.nextLine();
boolean caseSenseEqual = strOpr.checkString(string,stringToCheck);	
logger.log(Level.INFO,"Is "+string+" and "+stringToCheck+" are equal with case sensitive : "+caseSenseEqual);
break;

case 19:
logger.log(Level.INFO,"Enter the string2: ");
String checkString = strScan.nextLine();
boolean ignoreCaseEqual = strOpr.checkStrIgnoreCase(string,checkString);
logger.log(Level.INFO,"Is "+string+" and "+checkString+" are equal with Ignorance of case sensitive : "+ignoreCaseEqual);
break;

case 20:
String trimedString = strOpr.trimBlank(string);
logger.log(Level.INFO,"The string "+string +" is trimmed to "+trimedString);	
break;

default: break;
}
}

catch(InputInvalidException ie){	
logger.log(Level.SEVERE,ie.toString());
logger.log(Level.SEVERE,"Reason for exception is "+ie.getCause());
}
}while(select !=0);
}
}
}

