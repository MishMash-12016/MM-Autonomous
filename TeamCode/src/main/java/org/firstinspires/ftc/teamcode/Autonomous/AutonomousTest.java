package org.firstinspires.ftc.teamcode.Autonomous;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Commands.Moving;
import org.firstinspires.ftc.teamcode.SubSystems.Drive;


@Autonomous(name = "Teleop")
public class AutonomousTest extends CommandOpMode {

    // subsystems here
    Drive drive;

    @Override
    public void initialize() {
        //init subsystem
        //Ex: subsystem  = new Subsystem(hardwareMap)
        drive = new Drive(hardwareMap);
    }

    @Override
    public void run() {
        super.run();

        new Moving(drive, 1).schedule();

    }
}