package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Counter;

public class AddCounterCmd extends CommandBase {
    private Counter counter;
    private Timer timer = new Timer();

    public AddCounterCmd(Counter c) {
        counter = c;
    }

    @Override
    public void initialize() {
        counter.setCounter(0);
        timer.reset();
        timer.start();
    }

    @Override
    public void execute() {
        counter.incCounter();
    }

    @Override
    public boolean isFinished() {
        return (timer.hasElapsed(2));
    } 

    @Override
    public void end(boolean interrupted) {
    }
    
}