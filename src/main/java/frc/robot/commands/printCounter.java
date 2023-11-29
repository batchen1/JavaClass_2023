package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Printer;
import frc.robot.subsystems.Counter;

public class printCounter extends CommandBase {
    private Printer printer;
    private Counter counter;

    public printCounter(Printer p, Counter c){
        printer = p;
        counter = c;
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        printer.printInt(counter.getCounter());
    }

    @Override
    public boolean isFinished() {
        return true;
    } 

    @Override
    public void end(boolean interrupted) {
    }
    
}