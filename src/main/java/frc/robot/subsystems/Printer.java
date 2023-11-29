package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Printer extends SubsystemBase{
    public void printChar(char c) {
        System.out.print(c);
    }
    public void printNum(int c) {
        System.out.print(c);
    }
}
