package frc.robot.commands;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer;

import edu.wpi.first.wpilibj.Timer;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Printer;
public class SequenceCmd extends CommandBase{
    

    private Printer printer;
    private int integer;
    private int counter;
    public SequenceCmd(Printer p, int a){
        printer=p;
        integer = a;
    }
    @Override
    public void initialize(){
        counter = 1;
    }
    @Override
    public void execute(){
        if (integer>10 && integer<100){
            printer.printInt(counter);
        }
        counter += 1;
    }
    @Override
    public boolean isFinished(){
        if (counter > integer || integer <11 || integer > 99){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public void end(boolean interrupted) {
    }
}
