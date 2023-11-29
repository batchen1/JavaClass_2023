package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Counter;

public class AddCounterCmd extends CommandBase {

    private Counter counter;
    private int number = counter.getCounter();
    private Timer timer = new Timer();

    public AddCounterCmd(Counter cr) {
        counter = cr;
    }

    @Override
    public void initialize() {
        number = 0;
    }

    @Override
    public void execute() {
        number += 1;
    }

    @Override
    public boolean isFinished() {
        return (timer.hasElapsed(2));
    }

    @Override
    public void end(boolean interrupted) {
    }
    
}
