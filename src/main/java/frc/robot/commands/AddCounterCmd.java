package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.Timer;


public class AddCounterCmd extends CommandBase{
    private Timer timer = new Timer();
    private int seconds;
    public Counter counter = new Counter();

    public AddCounterCmd(int s){
        s = seconds;
    }

    @Override
    public void initialize() {
        timer.reset();
        timer.start();
        counter.setCounter(0);
    }

    @Override
    public void execute() {
        counter.incCounter();
    }

    @Override
    public boolean isFinished() {
        return (timer.hasElapsed(seconds));
    }

    @Override
    public void end(boolean interrupted) {
    }
    
}
