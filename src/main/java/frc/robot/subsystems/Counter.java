package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Counter extends SubsystemBase{

    int counter = 0;
    
    public int getCounter() {
        return counter;
    }

    public void setCounter(int value) {
        counter = value;
    }

    public void incCounter() {
        counter += 1;
    }
}
