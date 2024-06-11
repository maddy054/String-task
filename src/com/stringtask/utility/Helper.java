package com.stringtask.utility;
import com.stringtask.exceptions.InputInvalidException;

public class Helper{
	
	public static void checkNull(Object obj) throws InputInvalidException{
		if(obj == null){
			throw new InputInvalidException("Argument is null");
			}
		}
  }