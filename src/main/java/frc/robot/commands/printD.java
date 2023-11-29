package frc.robot.commands;
import edu.wpi.first.wpilibj.Timer;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Printer;
public class printD extends CommandBase{
    private Printer printer;
    public printD(Printer p){
        printer = p;
    }
    public double start_time;
    public double end_time;
    @Override
    public void initialize() {
        start_time = Timer.getFPGATimestamp();
    }
    @Override
    public void execute() {
        printer.printChar('d');
    }
    @Override
    public boolean isFinished() {
        end_time = Timer.getFPGATimestamp();
        if (end_time-start_time>=4) {
            return true;
        } else {
        return false;
        }
    }
}
