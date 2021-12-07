// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */

  CANSparkMax FrontrightdriveMotor = new CANSparkMax(12, MotorType.kBrushless);
  CANSparkMax BackrightdriveMotor = new CANSparkMax(10, MotorType.kBrushless);
  CANSparkMax FrontleftdriveMotor = new CANSparkMax(13, MotorType.kBrushless);
  CANSparkMax BackleftdriveMotor = new CANSparkMax(18, MotorType.kBrushless);

  public Drivetrain() {
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
