package org.firstinspires.ftc.teamcode.SubSystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Drive extends SubsystemBase {
    private DcMotorEx fr;
    private DcMotorEx fl;
    private DcMotorEx br;
    private DcMotorEx bl;

    public Drive(HardwareMap hardwareMap) {
        this.fr = hardwareMap.get(DcMotorEx.class, "motor1");
        this.fl = hardwareMap.get(DcMotorEx.class, "motor2");
        this.br = hardwareMap.get(DcMotorEx.class, "motor3");
        this.bl = hardwareMap.get(DcMotorEx.class, "motor4");
    }

    public void setPower(double power) {
        fr.setPower(power);
        fl.setPower(power);
        br.setPower(power);
        bl.setPower(power);
    }


}

