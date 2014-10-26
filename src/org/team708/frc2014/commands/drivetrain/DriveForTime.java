/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team708.frc2014.commands.drivetrain;

import org.team708.frc2014.commands.CommandBase;

/**
 *
 * @author Owner
 */
public class DriveForTime extends CommandBase {
    
    private double goalTime;
    private double speed = 1.0;
    
    public DriveForTime(double goalTime) {
        // Use requires() here to declare subsystem dependencies
        requires(drivetrain);
        
        this.goalTime = goalTime;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        drivetrain.haloDrive(speed, 0.0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (goalTime >= timeSinceInitialized());
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
