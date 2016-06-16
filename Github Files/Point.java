public class Point {
   private int totalPoints;
   
   public Point(){
  	totalPoints = 0;
   }
   
   public void add(){
  	totalPoints += 10;
   }
   
   public void subtract(){
  	int points = this.totalPoints;
  	points -= 5;
  	if (points > 0){
     	this.totalPoints = points;
  	}
  	else {
     	this.totalPoints = 0;
  	} 	 
   }
    	 
   public int getPoints(){
  	return this.totalPoints;
   }    

}
