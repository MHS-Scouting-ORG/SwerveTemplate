// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import frc.robot.SwerveModuleConstants;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class ControllerConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static class SwerveConstants {
    public static final boolean ROTATION_ENCODER_DIRECTION = false; 

    /* * * MEASUREMENTS * * */
    //FIXME REPLACE WITH VALUES OF ACTUAL BASE 
    public static final double WHEEL_DIAMETER = 4 * 2.5 / 100;
    public static final double TRACK_WIDTH = 0.635;
    public static final double WHEEL_BASE = 0.635;
    
    public static final double DRIVE_GEAR_RATIO = 8.14 / 1;
    public static final double ROTATION_GEAR_RATIO = 150 / 7;
    
    public static final double VOLTAGE = 7.2;

    /* * * SWERVE DRIVE KINEMATICS * * */
    // ORDER IS ALWAYS FL, BL, FR, BR 
    public static final SwerveDriveKinematics DRIVE_KINEMATICS = new SwerveDriveKinematics(
      // front left
      new Translation2d(-WHEEL_BASE / 2, -TRACK_WIDTH / 2),
      // back left
      new Translation2d(-WHEEL_BASE / 2, TRACK_WIDTH / 2),
      // front right
      new Translation2d(WHEEL_BASE / 2, -TRACK_WIDTH / 2),
      // back right
      new Translation2d(WHEEL_BASE / 2, TRACK_WIDTH / 2)
    );

    /* * * FRONT LEFT * * */
    //FIXME FILL IN VALUES FOR FRONT LEFT 
    public static class FrontLeft {
      public static final int DRIVE_PORT = 1;
      public static final int ROTATION_PORT = 5;
      public static final int ABSOLUTE_ENCODER_PORT = 9;
      public static final double OFFSET = 0 + 180; //80.06; 
      public static final boolean DRIVE_INVERTED = false; 
      public static final boolean ROTATION_INVERTED = true; 

      public static final SwerveModuleConstants constants = new SwerveModuleConstants(DRIVE_PORT, ROTATION_PORT, ABSOLUTE_ENCODER_PORT, OFFSET, DRIVE_INVERTED, ROTATION_INVERTED);
    }

    /* * * BACK LEFT * * */
    //FIXME FILL IN VALUES FOR BACK LEFT 
    public static class BackLeft {
      public static final int DRIVE_PORT = 2;
      public static final int ROTATION_PORT = 6;
      public static final int ABSOLUTE_ENCODER_PORT = 10;
      public static final double OFFSET = 0 + 180; //-94.30; 
      public static final boolean DRIVE_INVERTED = true; 
      public static final boolean ROTATION_INVERTED = true; 

      public static final SwerveModuleConstants constants = new SwerveModuleConstants(DRIVE_PORT, ROTATION_PORT, ABSOLUTE_ENCODER_PORT, OFFSET, DRIVE_INVERTED, ROTATION_INVERTED);
    }

    /* * * BACK RIGHT * * */
    //FIXME FILL IN VALUES FOR BACK RIGHT 
    public static class BackRight {
      public static final int DRIVE_PORT = 3;
      public static final int ROTATION_PORT = 7;
      public static final int ABSOLUTE_ENCODER_PORT = 11;
      public static final double OFFSET = 67; //-26.98;
      public static final boolean DRIVE_INVERTED = false; 
      public static final boolean ROTATION_INVERTED = true; 

      public static final SwerveModuleConstants constants = new SwerveModuleConstants(DRIVE_PORT, ROTATION_PORT, ABSOLUTE_ENCODER_PORT, OFFSET, DRIVE_INVERTED, ROTATION_INVERTED);
    }

    /* * * FRONT RIGHT * * */
    //FIXME FILL IN VALUES FOR FRONT RIGHT 
    public static class FrontRight {
      public static final int DRIVE_PORT = 4;
      public static final int ROTATION_PORT = 8;
      public static final int ABSOLUTE_ENCODER_PORT = 12;
      public static final double OFFSET = 67 + 180; //-27.42;
      public static final boolean DRIVE_INVERTED = true; 
      public static final boolean ROTATION_INVERTED = true; 

      public static final SwerveModuleConstants constants = new SwerveModuleConstants(DRIVE_PORT, ROTATION_PORT, ABSOLUTE_ENCODER_PORT, OFFSET, DRIVE_INVERTED, ROTATION_INVERTED);
    }
    
    /* * * CONVERSIONS FOR ENCODERS * * */
    //velocity in meters per sec instead of RPM 
    public static final double DRIVE_ENCODER_POSITION_CONVERSION = DRIVE_GEAR_RATIO * Math.PI * WHEEL_DIAMETER; //drive enc rotation
    //velocity in meters instead of rotations 
    public static final double DRIVE_ENCODER_VELOCITY_CONVERSION = DRIVE_ENCODER_POSITION_CONVERSION / 60; //drive enc speed 
 
    /* * * PID VALUES FOR TURNING MOTOR PID * * */
    public static final double KP_TURNING = 0.0048;
    public static final double KI_TURNING = 0.0002;
    public static final double KD_TURNING = 0.0001;

    /* * * MAX * * */
    public static final double MAX_SPEED = 3.6576;
    public static final double MAX_ROTATION = MAX_SPEED / Math.hypot(TRACK_WIDTH / 2.0, WHEEL_BASE / 2.0);
    
  }
}
