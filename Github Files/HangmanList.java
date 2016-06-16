import java.awt.*;  	//drawingpanel
import java.io.*;   	//for file
import java.util.*; 	//scanner

public class HangmanList {
   private ArrayList<String> list;
   private String level;
   
   public HangmanList() {
  	this.list = new ArrayList<String>();
   }
   
   public void setList(String level) throws FileNotFoundException {
  	list.clear();
  	Scanner input = new Scanner(new File("" + level + ".txt"));
  	String easy = "easy";
  	String medium = "medium";
  	if (level.equals(easy)) {
     	while (input.hasNextLine()) {
        	list.add(input.nextLine());
     	}
  	} else if (level.equals(medium)) {
     	while (input.hasNextLine()) {
        	list.add(input.nextLine());
     	}    
  	} else {
     	while (input.hasNextLine()) {
        	list.add(input.nextLine());
     	}
  	}
   }

   public String getWord() {
  	int random = (int) (Math.random() * list.size());
  	return list.get(random);
   }
   
   public void setLevel(String level) {
  	this.level = level;
   }
}
