package geo;

public class Carre {
	
	 private int x;
	 private int y;
	 private int cote;
	 
	 Carre(){
	        this.x = 0;
	        this.y = 0;
	        this.cote = 0;
	    }

	 Carre(int x, int y, int cote){
	        this.x = x;
	        this.y = y;
	        this.cote = cote;
	    }
	 
	 public int getX(){
	        return this.x;
	    }
	 
	 public int getY(){
	        return this.y;
	    }
	 
	 public int getCote(){
	        return this.cote;
	    }
	 
	 public void translate(int x, int y) {
				 
	    }
}
