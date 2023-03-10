package frc.robot.subsystems;

import edu.wpi.first.util.sendable.Sendable;
import edu.wpi.first.util.sendable.SendableBuilder;

public class Base implements Sendable {
  /** Creates a new base. */
  public Base() {
  }

  @Override
  public void initSendable(SendableBuilder builder) {
  
  }

  /**
   * This function is run when the robot is first started up and should be used
   * for any
   * initialization code.
   */
  public void robotInit() {
  }

  /**
   * This function is called every robot packet, no matter the mode. Use this for
   * items like
   * diagnostics that you want ran during disabled, autonomous, teleoperated and
   * test.
   *
   * <p>
   * This runs after the mode specific periodic functions, but before LiveWindow
   * and
   * SmartDashboard integrated updating.
   */
  public void robotPeriodic() {
  }

  /**
   * This autonomous (along with the chooser code above) shows how to select
   * between different
   * autonomous modes using the dashboard. The sendable chooser code works with
   * the Java
   * SmartDashboard. If you prefer the LabVIEW Dashboard, remove all of the
   * chooser code and
   * uncomment the getString line to get the auto name from the text box below the
   * Gyro
   *
   * <p>
   * You can add additional auto modes by adding additional comparisons to the
   * switch structure
   * below with additional strings. If using the SendableChooser make sure to add
   * them to the
   * chooser code above as well.
   */
  public void autonomousInit() {
  }

  /** This function is called periodically during autonomous. */
  public void autonomousPeriodic() {
  }

  /** This function is called once when teleop is enabled. */
  public void teleopInit() {
  }

  /** This function is called periodically during operator control. */
  public void teleopPeriodic() {
  }

  /** This function is called once when the robot is disabled. */
  public void disabledInit() {
  }

  /** This function is called periodically when disabled. */
  public void disabledPeriodic() {
  }

  /** This function is called once when test mode is enabled. */
  public void testInit() {
  }

  /** This function is called periodically during test mode. */
  public void testPeriodic() {
  }
}
