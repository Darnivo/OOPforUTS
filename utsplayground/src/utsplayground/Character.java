package utsplayground;

import java.util.Random;

//Superclass Character
public class Character {
 protected int hp;
 protected int attack;
 protected int speed;
 protected int level;

 public Character(int hp, int attack, int speed) {
     this.hp = hp;
     this.attack = attack;
     this.speed = speed;
     Random rand = new Random();
     this.level = rand.nextInt(10) + 1; // Random level between 1 and 10
 }

public int getHp() {
	return hp;
}

public void setHp(int hp) {
	this.hp = hp;
}

public int getAttack() {
	return attack;
}

public void setAttack(int attack) {
	this.attack = attack;
}

public int getSpeed() {
	return speed;
}

public void setSpeed(int speed) {
	this.speed = speed;
}

public int getLevel() {
	return level;
}

public void setLevel(int level) {
	this.level = level;
}

 
 
 // Getters and setters for the attributes
 // (Omitted for brevity)
}