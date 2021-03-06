package week4.uniqueNames;

import acm.program.ConsoleProgram;
import java.util.*;

public class UniqueNames extends ConsoleProgram {
	
	public void run() {
		ArrayList<String> unique = new ArrayList<String>();
	
		while(true) {
			String name= readLine("Enter name: ");
			if(name.equals("")) break;
			if(!unique.contains(name)) {
				unique.add(name);
			}
		}
		System.out.println("Unique name list contains:\n");
		for(int i=0;i<unique.size();i++) {
			System.out.println(unique.get(i));
		}
	}
}

