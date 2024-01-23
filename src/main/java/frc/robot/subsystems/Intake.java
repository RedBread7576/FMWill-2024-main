// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
  private VictorSPX leftIntake;
  private VictorSPX rightIntake;
  /** Creates a new Intake. */
  public Intake() {
leftIntake = new VictorSPX(20);
rightIntake = new VictorSPX(21);
intakeConfig();


  }
  public void stop(){
    leftIntake.set(VictorSPXControlMode.PercentOutput, 0.0);
    rightIntake.set(VictorSPXControlMode.PercentOutput, 0.0);
  }

  public void intake(){
    leftIntake.set(
      VictorSPXControlMode.PercentOutput,
     -0.40
    );
   rightIntake.set(
    VictorSPXControlMode.PercentOutput, 
    -0.35
    );
  }

  public void   outake(){ 
    leftIntake.set(
      VictorSPXControlMode.PercentOutput, 
      1.0
      );
    rightIntake.set(
      VictorSPXControlMode.PercentOutput, 
      1.0);
  }



  public void intakeConfig(){
    leftIntake.configFactoryDefault();
    leftIntake.enableVoltageCompensation(true);
    leftIntake.configVoltageCompSaturation(12.0);
    leftIntake.setInverted(false);
    leftIntake.setNeutralMode(NeutralMode.Brake);
    
    
    rightIntake.configFactoryDefault();
    rightIntake.enableVoltageCompensation(true);
    rightIntake.configVoltageCompSaturation(12.0);
    rightIntake.setInverted(false);
    rightIntake.setNeutralMode(NeutralMode.Brake);
    }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
