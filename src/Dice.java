
public class Dice {
	static int side;
	public Dice(int side ){
		this.side = side;
		}
	 
	int rollTheDice(int side){
		int x= (int) ((Math.random()*(side-1)+1)+1);
	if(side==2){
		switch(x){
		case 1:System.out.println("Heads");
		case 2:System.out.println("Tails");
		}
	}
	else{	
		System.out.println(x);
	}
	return 0;
		}
	public static void main(String[] args){
		Dice dice1 = new D2();
		dice1.rollTheDice(side);
		
		Dice dice2 = new D4();
		dice2.rollTheDice(side);
	}
	
}
