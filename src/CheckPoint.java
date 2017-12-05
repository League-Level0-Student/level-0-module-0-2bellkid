import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CheckPoint {
public static void main(String[] args) {
String color=JOptionPane.showInputDialog("What is your favorite color?");
JOptionPane.showMessageDialog(null,color+ " is also my favorite color!");
Robot Rusty= new Robot("mini");
for(int i=0; i <3; i++);
Rusty.penDown();
Rusty.move(100);
Rusty.turn(120);
Rusty.setRandomPenColor();
}
}
