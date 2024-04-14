package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix6.hardware.TalonFX;


public class SwerveModule extends SubsystemBase{
    private final TalonFX driveMotor;
    private final TalonFX turnMotor;

    private DutyCycleEncoder absoluteEncoder;
    private double absoluteEncoderOffset;
}
