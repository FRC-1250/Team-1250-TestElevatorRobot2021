// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.ControlType;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Elevator extends SubsystemBase {
  CANSparkMax driveMotor = new CANSparkMax(2 ,MotorType.kBrushless);

  public double kP, kI, kD, kIz, kFF, kMaxOutput, kMinOutput;

  /** Creates a new Elevator. */
  public Elevator() {

    // PID coefficients
    kP = 0.1;
    kI = 1e-4;
    kD = 1;
    kIz = 0;
    kFF = 0;
    kMaxOutput = 1;
    kMinOutput = -1;

    driveMotor.getPIDController().setP(kP);
    driveMotor.getPIDController().setI(kI);
    driveMotor.getPIDController().setD(kD);
    driveMotor.getPIDController().setIZone(kIz);
    driveMotor.getPIDController().setFF(kFF);
    driveMotor.getPIDController().setOutputRange(kMinOutput,kMaxOutput);
    driveMotor.setIdleMode(IdleMode.kCoast);
  }

  public void Up() {
    driveMotor.set(-0.1);
  }

  public void Down() {
    driveMotor.set(0.1);
  }

  public void Stop() {
    driveMotor.set(0);
  }

  public double GetTicks() {
    return driveMotor.getEncoder().getPosition();
  }
  public void SetPosition(double position){
   driveMotor.getPIDController().setReference(position,ControlType.kPosition);
  }
  @Override
  public void periodic() {
    //SmartDashboard.setDefaultNumber("Ticks", GetTicks());
    // This method will be called once per scheduler run
  }
}
