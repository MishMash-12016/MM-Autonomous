package org.firstinspires.ftc.teamcode.Commands.auto;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;

import org.firstinspires.ftc.teamcode.Commands.turret.RotateTurretByPID;
import org.firstinspires.ftc.teamcode.RoadRunner.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.SubSystems.Turret;

public class AutoTest extends SequentialCommandGroup {
    public AutoTest(SampleMecanumDrive driveTrain, Turret turret) {
        super(
                new TrajectoryFollowerCommand(Trajectories.get("3"), driveTrain),
                new RotateTurretByPID(3, turret)
        );
    }

}
