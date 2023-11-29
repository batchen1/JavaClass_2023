package frc.robot.commands;

import frc.robot.subsystems.Printer;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class SequenceCmd extends CommandBase{
    private Printer printer;
    private int integer;

    public void sequenceCmd(Printer z, int c) {
        printer = z;
        integer = c;

    }

   // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
  }
        
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
