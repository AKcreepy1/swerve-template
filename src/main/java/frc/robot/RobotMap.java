// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/** Add your docs here. */
public class RobotMap {

    /* turning motor gearing:
     * motor--->
     * 8:24
     * 18:72
     * turning wheel
     * 24/8 * 72/18 = 12
     */

    // CANIVORE // 
    public static final String kCANivore_name = "canivore";

    // TALON FX //
    public static final int kDrive_FrontLeftDrive_TalonFX   = 4;
    public static final int kDrive_FrontLeftTurn_TalonFX    = 3;
    public static final int kDrive_FrontRightDrive_TalonFX  = 2;
    public static final int kDrive_FrontRightTurn_TalonFX   = 1;
    public static final int kDrive_BackLeftDrive_TalonFX    = 6;
    public static final int kDrive_BackLeftTurn_TalonFX     = 5;
    public static final int kDrive_BackRightDrive_TalonFX   = 8;
    public static final int kDrive_BackRightTurn_TalonFX    = 7;

    // CANCODER //
    public static final int kDrive_FrontLeftEncoder         = 13;
    public static final int kDrive_FrontRightEncoder        = 11;
    public static final int kDrive_BackLeftEncoder          = 14;
    public static final int kDrive_BackRightEncoder         = 12;
    // END CANCODER //

}
