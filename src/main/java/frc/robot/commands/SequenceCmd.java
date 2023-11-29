package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Printer;

public class SequenceCmd extends CommandBase{
    private Printer printer;
    private int number;
    
    public SequenceCmd (Printer p, int n){
        p = printer;
        n = number;
    }
    @Override
    public void initialize(){

    }
    @Override
    public void execute() {
        int counter = 1;
        if (number >= 10 && number <=100 && counter <= number) {
            printer.printNum(counter);
            counter++;
        }
    }

    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public void end(boolean interrupted) {
    }
}