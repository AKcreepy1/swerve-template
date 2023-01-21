// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/** Add your docs here. **/
public class OI {
    static xbox4415 xboxDrive = new xbox4415(0);
    static xbox4415 xboxClimb = new xbox4415(1);
    // static xbox4415 xboxShooterTesting = new xbox4415(2);
    // static xbox4415 xboxIntakeTesting = new xbox4415(3);
    // static xbox4415 xbox_drive_test = new xbox4415(4);
    static boolean m_prevTrigger = false;

    static public boolean getDriveForward() {
        // return xbox_drive_test.getYButton();
        return false;
    }

    static public boolean getDriveReverse() {
        // return xbox_drive_test.getAButton();
        return false;
    }

    static public boolean getDriveLeft() {
        // return xbox_drive_test.getXButton();
        return false;
    }

    static public boolean getDriveRight() {
        // return xbox_drive_test.getBButton();
        return false;
    }

    static public double getDriveY() {
        return xboxDrive.getLeftY();
    }
    
    static public double getDriveX() {
        return xboxDrive.getLeftX();
    }

    // static public boolean getAforFaceTowards() {
    //     return xboxDrive.getAButton();
    // }

    // static public boolean getBforFaceRight() {
    //     return xboxDrive.getBButton();
    // }

    // static public boolean getYforFaceAway() {
    //     return xboxDrive.getAButton();
    // }

    // static public boolean getXforFaceLeft() {
    //     return xboxDrive.getAButton();
    // }

    static public double getDriveRot() {
        return Math.copySign(Math.pow(xboxDrive.getRightX(), 2), xboxDrive.getRightX());
    }

    static public boolean getResetOdometryRightFender() {
        return xboxDrive.getPOV() == 0;
    }

    static public boolean shouldSetFieldRelative() {
        return xboxDrive.getPOV() == 270;
    }

    static public boolean shouldSetRobotRelative() {
        return xboxDrive.getPOV() == 90;
    }

    static public boolean getResetOdometryLaunchPad() {
        return xboxDrive.getPOV() == 180;
    }

    static public boolean getAButtonPressed() {
        return xboxDrive.getAButton();
    }
}