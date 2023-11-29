package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Counter extends SubsystemBase{
    int count = 0;
    public void setCounter(int a) {
        count = a;
    }

    public void incCounter() {
        count++;
    }

    public int getCounter() {
        return count;
    }
}
