package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Printer;

public class PrintTwoCharsCmd extends CommandBase{
private char charOne;
private char charTwo;
private Printer printer;

    public PrintTwoCharsCmd(Printer p, char a, char b){
        a = charOne;
        b = charTwo;
        printer = p;
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        printer.printChar(charOne);
        printer.printChar(charTwo);
    }

    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public void end(boolean interrupted) {
    }
}
