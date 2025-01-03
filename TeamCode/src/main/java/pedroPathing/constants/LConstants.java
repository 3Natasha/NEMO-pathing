package pedroPathing.constants;

import com.pedropathing.localization.*;
import com.pedropathing.localization.constants.*;

public class LConstants {
    static {
        DriveEncoderConstants.forwardTicksToInches = 0.0117;
        DriveEncoderConstants.strafeTicksToInches = 0.02;
        DriveEncoderConstants.turnTicksToInches = 0.02;

        DriveEncoderConstants.robot_Width = 18;
        DriveEncoderConstants.robot_Length = 18;

        DriveEncoderConstants.leftFrontEncoderDirection = Encoder.FORWARD;
        DriveEncoderConstants.rightFrontEncoderDirection = Encoder.FORWARD;
        DriveEncoderConstants.leftRearEncoderDirection = Encoder.FORWARD;
        DriveEncoderConstants.rightRearEncoderDirection = Encoder.FORWARD;
    }
}




