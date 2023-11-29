package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
public class Counter extends SubsystemBase{
    public int Counter =0;
    public void setCounter(int x){
        Counter = x;
    }
    public void incCounter(){
        Counter++;
    }
    public int getCounter(){
        return Counter;
    }
}
