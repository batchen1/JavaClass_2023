package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class NumberPrinter extends SubsystemBase{
    public void printNumber(int n) {
        if (10<=n && n<=100){
            System.out.print(n);
        }
    }
}
