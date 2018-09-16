package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	public static void throwParty(Robot[] r){
		for (Robot e: r) {
			e.setAngle(new Random().nextInt(360));
			e.setX(new Random().nextInt(900) + 50);
			e.setY(new Random().nextInt(600) + 50);
		}
	}
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		//3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setX((i*200)+50);
			robots[i].setY(600);
		}
			//4. make each robot start at the bottom of the screen, side by side, facing up
		
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		boolean finished = false;
    		while (!finished) {
    			for (Robot r: robots) {
    				int y = r.getY();
    				if (y < 0) {
    					finished = true;
    				}
    				r.move(new Random().nextInt(45)+5);
    			}
    		}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		
		//7. declare that robot the winner and throw it a party!
    		while (finished) {
    			throwParty(robots);
    		}
		//8. try different races with different amounts of robots.
    		
	    //9. make the robots race around a circular track.
		
	}
}
