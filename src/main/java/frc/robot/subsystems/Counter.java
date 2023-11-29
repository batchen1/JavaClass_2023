package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Counter extends SubsystemBase{
    private int counter = 0;
    public void setCounter(int value) {
        counter = value;
    }
    public void incCounter(){
        counter += 1;
    }
    public int getCounter(){
        return counter;
    }
}
