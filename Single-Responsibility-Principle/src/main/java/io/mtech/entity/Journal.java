package io.mtech.entity;

import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Journal {
private List<String> entries = new ArrayList<>();
private static int count= 0;


public void addEntry(String txt) {
	entries.add("" + (++count) + ": " + txt);
}

public void remove(int index) {
	entries.remove(index);
}
@Override
public String toString() {
  return String.join(System.lineSeparator(), entries);
}

// here we break SRP
public void save(String filename) throws Exception
{
  try (PrintStream out = new PrintStream(filename))
  {
    out.println(toString());
  }
}

public void load(String filename) {}

public void load(URL url) {}
}
