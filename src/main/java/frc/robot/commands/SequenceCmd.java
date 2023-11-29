package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.NumberPrinter;

public class SequenceCmd extends CommandBase {

    private NumberPrinter numberPrinter;
    private int number;

    public SequenceCmd(NumberPrinter np, int n) {
        numberPrinter = np;
        number = n;
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        numberPrinter.printNumber(number);
        number -= 1;
    }

    @Override
    public boolean isFinished() {
            return (number <= 10);
    }

    @Override
    public void end(boolean interrupted) {
    }
    
}
