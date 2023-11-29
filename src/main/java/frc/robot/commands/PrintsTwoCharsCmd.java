package frc.robot.commands;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer;

import edu.wpi.first.wpilibj.Timer;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Printer;
public class PrintsTwoCharsCmd extends CommandBase {
    private Printer printer;
    private char character1;
    private char character2;
    public PrintsTwoCharsCmd(Printer p, char one, char two) {
        printer = p;
        character1 = one;
        character2 = two;
    }
    @Override
    public void execute () {
        printer.printChar(character1);
        printer.printChar(character2);
    }
    @Override
    public boolean isFinished () {
        return true;
    }

}
