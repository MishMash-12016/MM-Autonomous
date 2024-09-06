package org.firstinspires.ftc.teamcode.Commands;

import com.arcrobotics.ftclib.command.CommandBase;
import org.firstinspires.ftc.teamcode.SubSystems.Drive;

public class Moving extends CommandBase {
    Drive drive;
    double power;

    public Moving(Drive drive, double power) {
        this.power = power;
        this.drive = drive;
    }

    @Override
    public void initialize() {
        drive.setPower(power);
    }
    @Override
    public void end(boolean interrupted){
        drive.setPower(0);
    }

}
