package utsplayground;

public class Mage extends Character {
	protected int A;
    public Mage(int hp, int attack, int speed) {
        super(hp, attack, speed * 3); // Mage gets 3x speed
        this.A = level * 10;
    }
	public int getA() {
		return A;
	}
	public void setA(int a) {
		A = a;
	}
    
    
}