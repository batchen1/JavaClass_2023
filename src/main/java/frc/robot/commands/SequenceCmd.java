package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Printer;

public class SequenceCmd extends CommandBase {

    private Printer printer;
    private int number;
    private int currentNumber = 0;

    public SequenceCmd(Printer p, int c) {
        printer = p;
        number = c;
    }

    @Override
    public void initialize() {
        currentNumber = 0;
    }

    @Override
    public void execute() {
        currentNumber++;
        printer.printInt(currentNumber);
    }   

    @Override
    public boolean isFinished() {
        return currentNumber == number;
    }

    @Override
    public void end(boolean interrupted) {
    }
    
}
