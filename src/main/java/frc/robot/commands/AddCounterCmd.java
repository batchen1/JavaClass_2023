package frc.robot.commands;
import edu.wpi.first.wpilibj.Timer;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Counter;
public class AddCounterCmd extends CommandBase{
    private Counter counter;
    private double start_time;
    private double end_time;
    public AddCounterCmd(Counter c){
        counter = c;
    }
    @Override
    public void initialize(){
        counter.setCounter(0);
        start_time = Timer.getFPGATimestamp();
    }
    @Override
    public void execute() {
        counter.incCounter();
        System.out.print("added");
    }
    @Override
    public boolean isFinished(){
        end_time = Timer.getFPGATimestamp();
        if (end_time-start_time >=2) {
            return true;
        } else {
            return false;
        }
    }
}
