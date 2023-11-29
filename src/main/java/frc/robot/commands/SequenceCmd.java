package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Printer;

public class SequenceCmd extends CommandBase{
    private Printer printer;
    private int number;
    private int counter = 1;
    
    public SequenceCmd (Printer p, int n){
        p = printer;
        n = number;
    }
    @Override
    public void initialize(){

    }
    @Override
    public void execute() {
        if (number >= 10 && number <=100 && counter <= number) {
            printer.printNum(counter);
        }
    }

    @Override
    public boolean isFinished() {
        if (counter == number){
            return true;
    }else {
        counter++;
        return false;
    }
}
    @Override
    public void end(boolean interrupted) {
    }
}