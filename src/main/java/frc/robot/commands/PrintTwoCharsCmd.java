package frc.robot.commands;

import frc.robot.subsystems.Printer;

import org.ejml.ops.DConvertArrays;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class PrintTwoCharsCmd extends CommandBase{

    private Printer printer;
    private char character;
    private char character1;

    public void PrintTwoCharCmd(Printer x, char c, char d) {
        printer = x;
        character = c;
        character1 = d;
    }

   // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    printer.printChar(character);
    printer.printChar(character1);
  }
        
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
