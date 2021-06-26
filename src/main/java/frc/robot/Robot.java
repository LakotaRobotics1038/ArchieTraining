/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.libraries.*;

import edu.wpi.first.wpilibj.Joystick;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


/*
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */

  public class Robot extends TimedRobot {
    Joystick1038 driverJoystick = new Joystick1038(0);
    Joystick1038 operatorJoystick = new Joystick1038(1);
    /*
     * This function is run when the robot is first started up and should be used
     * for any initialization code.
     */
  
    @Override
    public void robotInit() {
    }
  
    @Override
    public void robotPeriodic() {
    }
  
    public void teleopInit() {
    }
  
    public void teleopPeriodic() {

    }
  
    
  
    public void autonomousInit() {
    }
  
    public void autonomousPeriodic() {
    }
  
    public void disabledInit() {
    }
  
    public void disabledPeriodic() {
    }
  
    /**
     * This function is called periodically during test mode.
     */
    @Override
    public void testInit() {
    }
  
    @Override
    public void testPeriodic() {
    }
  
  
 }
