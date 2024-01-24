package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.SubSystems.Extender;

public enum ArmPosition {

    /*
    clusters- each cluster is a group containing multiple positions that


    Assuming the robot is in the right selectedRobotSide of the board:

          far  close
           |      |
           v      v
     isSelectedScoreSideLeft     isSelectedScoreSideLeft      isSelectedScoreSideLeft  <- top
     isSelectedScoreSideLeft     isSelectedScoreSideLeft      isSelectedScoreSideLeft  <- mid
     isSelectedScoreSideLeft     isSelectedScoreSideLeft      isSelectedScoreSideLeft  <- bottom

     Robot's on the left selectedRobotSide:

   close  far
     |     |
     v     v
     isSelectedScoreSideLeft     isSelectedScoreSideLeft      isSelectedScoreSideLeft  <- top
     isSelectedScoreSideLeft     isSelectedScoreSideLeft      isSelectedScoreSideLeft  <- mid
     isSelectedScoreSideLeft     isSelectedScoreSideLeft      isSelectedScoreSideLeft  <- bottom

    Robot's on the front of the board:

         front
           |
           v
     isSelectedScoreSideLeft     isSelectedScoreSideLeft      isSelectedScoreSideLeft  <- top
     isSelectedScoreSideLeft     isSelectedScoreSideLeft      isSelectedScoreSideLeft  <- mid
     isSelectedScoreSideLeft     isSelectedScoreSideLeft      isSelectedScoreSideLeft  <- bottom

     */

    SCORE_TOP_FAR(0, Extender.Position.CLOSED, 0, 0, 0, Cluster.cluster0),
    SCORE_TOP_FRONT(0, Extender.Position.CLOSED, 0, 0, 0, Cluster.cluster0),
    SCORE_TOP_CLOSE(0, Extender.Position.CLOSED, 0, 0, 0, Cluster.cluster0),
    SCORE_MID_FAR(0, Extender.Position.CLOSED, 0, 0, 0, Cluster.cluster0),
    SCORE_MID_FRONT(0, Extender.Position.CLOSED, 0, 0, 0, Cluster.cluster0),
    SCORE_MID_CLOSE(0, Extender.Position.CLOSED, 0, 0, 0, Cluster.cluster0),
    SCORE_BOTTOM_FAR(0,Extender.Position.CLOSED,0,0, 0, Cluster.cluster0),
    SCORE_BOTTOM_FRONT(0,Extender.Position.CLOSED,0,0, 0, Cluster.cluster0),
    SCORE_BOTTOM_CLOSE(0,Extender.Position.CLOSED,0,0, 0, Cluster.cluster0),
    INTAKE(0, Extender.Position.CLOSED, 0,0, 0, Cluster.cluster0),
    SAFE_PLACE(0,Extender.Position.CLOSED,0,0.2, 0, Cluster.cluster0); //Fix extender length

    private final double elevatorHeight;
    private final Extender.Position extenderPosition;
    private final double turretAngle;
    private final double elbowAngle;
    private final double antiTurretAngle;
    private final Cluster cluster;


    private enum Cluster{
        cluster0,
        cluster1
    }
    ArmPosition(double elevatorHeight, Extender.Position extenderPosition, double turretAngle, double elbowAngle, double antiTurretAngle, Cluster cluster) {
        this.elevatorHeight = elevatorHeight;
        this.elbowAngle = elbowAngle;
        this.turretAngle = turretAngle;
        this.extenderPosition = extenderPosition;
        this.antiTurretAngle = antiTurretAngle;
        this.cluster = cluster;
    }

    public double getElevatorHeight() {
        return elevatorHeight;
    }

    public Extender.Position getExtenderPosition() {
        return extenderPosition;
    }

    public double getTurretAngle(boolean isLeftOfBoard) {return turretAngle * (isLeftOfBoard ? -1 : 1);
    }

    public double getElbowAngle() {return elbowAngle;}
    public double getAntiTurretAngle() {
        return antiTurretAngle;
    }

    public Cluster getCluster(){
        return cluster;
    }
}

