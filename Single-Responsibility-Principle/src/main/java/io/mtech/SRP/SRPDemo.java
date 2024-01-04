package io.mtech.SRP;

import io.mtech.entity.Journal;
import io.mtech.entity.Persistence;

public class SRPDemo {

	public static void main(String[] args) throws Exception {
		Journal j = new Journal();
	    j.addEntry("I cried today");
	    j.addEntry("I ate a bug");
	    System.out.println(j);

	    Persistence p = new Persistence();
	    String filename = "/home/mahadi/Documents/journal.txt";
	    p.saveToFile(j, filename, true);

	    // windows!
	    //Runtime.getRuntime().exec("subl" + filename);
	}

}
