package geo;

public class Cercle {
	 private int x;
	 private int y;
	 private int rayon;
	 
	 Cercle(){
	        this.x = 0;
	        this.y = 0;
	        this.rayon = 0;
	    }

	 Cercle(int x, int y, int rayon){
	        this.x = x;
	        this.y = y;
	        this.rayon = rayon;
	    }
	 
	 public int getX(){
	        return this.x;
	    }
	 
	 public int getY(){
	        return this.y;
	    }
	 
	 public int getRayon(){
	        return this.rayon;
	    }
	 
	 public void translate(int x, int y) {
		 
	 }
}
