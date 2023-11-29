package frc.robot.commands;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer;

import edu.wpi.first.wpilibj.Timer;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Printer;
import frc.robot.subsystems.Counter;
public class printCounter extends CommandBase{
    private Printer printer;
    private Counter counter;
    public printCounter(Printer p, Counter c){
        printer = p;
        counter = c;
    }
    @Override
    public void execute(){
        printer.printInt(counter.getCounter());
    }
    @Override
    public boolean isFinished(){
        return true;
    }
}
