package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Printer;

public class PrintTwoCharsCmd extends CommandBase {

    private Printer printer;
    private char characterOne;
    private char characterTwo;

    public PrintTwoCharsCmd(Printer p, char cOne, char cTwo) {
        printer = p;
        characterOne = cOne;
        characterTwo = cTwo;
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        printer.printChar(characterOne);
        printer.printChar(characterTwo);
    }

    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public void end(boolean interrupted) {
    }
    
}
