package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Printer;

public class PrintTwoCharsCmd extends CommandBase {
    private Printer printer;
    private char char1;
    private char char2;

    public PrintTwoCharsCmd(Printer p, char b, char c){
        printer = p;
        char1 = b;
        char2 = c;
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        printer.printChar(char1);
        printer.printChar(char2);
    }

    @Override
    public boolean isFinished() {
        return true;
    } 

    @Override
    public void end(boolean interrupted) {
    }
    
}