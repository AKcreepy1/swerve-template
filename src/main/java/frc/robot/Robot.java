// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import frc.robot.state.RobotState;
import frc.robot.subsystems.SwerveDrive;

public class Robot extends TimedRobot {
  
  SwerveDrive m_SwerveDrive;
  private RobotState m_state;
  TalonSRX talon_1 = new TalonSRX(21);
  TalonSRX talon_2 = new TalonSRX(22);

  @Override
  public void robotInit() {
    m_SwerveDrive = new SwerveDrive();
    m_SwerveDrive.robotInit();
    Shuffleboard.getTab("computil").add("swervedrive", m_SwerveDrive).withPosition(8, 1).withSize(2, 2);
    m_state = new RobotState(m_SwerveDrive.getPose2d(), m_SwerveDrive.getGyroRotation2d());
  }

  @Override
  public void robotPeriodic() {
    m_state.update(m_SwerveDrive.getPose2d(), m_SwerveDrive.getGyroRotation2d());
    m_SwerveDrive.changeOdometry(OI.shouldSetFieldRelative(), OI.shouldSetRobotRelative(),
                OI.getResetOdometryLaunchPad(), OI.getResetOdometryRightFender());
  }

  @Override
  public void teleopInit() {
    m_SwerveDrive.setFieldRelative();
  }

  @Override
  public void teleopPeriodic() {
    m_SwerveDrive.driveWithXbox(OI.getDriveY(), OI.getDriveX(), OI.getDriveRot(), false, false);
  }
}
