package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.ColorRangeSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class Frenzy8648HardwarePushbot {

    public DcMotor leftFront = null;
    public DcMotor rightFront = null;
    public DcMotor leftBack = null;
    public DcMotor rightBack = null;
    public DcMotor armMotor = null;
    public Servo    w   = null;
    public Servo    r   = null;
    public DcMotor    e    = null;
    public CRServo s    = null;
    public Servo    t   = null;
    public Servo    l   = null;

    public static final double MID_SERVO       =  0.5 ;
    public static final double SHOOTER    =  0.80;


    HardwareMap hwMap           =  null;
    private ElapsedTime period  = new ElapsedTime();

    public Frenzy8648HardwarePushbot(){

    }
    public void init(HardwareMap ahwMap){
        hwMap = ahwMap;

        leftFront  = hwMap.get(DcMotor.class, "left_front");
        rightFront = hwMap.get(DcMotor.class, "right_front");
        leftBack  = hwMap.get(DcMotor.class, "left_back");
        rightBack = hwMap.get(DcMotor.class, "right_back");
        armMotor = hwMap.get(DcMotor.class, "arm_motor");
        e = hwMap.get(DcMotor.class, "e_motor");



        leftFront.setDirection(DcMotorSimple.Direction.FORWARD);
        leftBack.setDirection(DcMotorSimple.Direction.FORWARD);
        rightFront.setDirection(DcMotorSimple.Direction.REVERSE);
        rightBack.setDirection(DcMotorSimple.Direction.REVERSE);


        leftBack.setPower(0);
        leftFront.setPower(0);
        rightBack.setPower(0);
        rightFront.setPower(0);


        leftBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        leftFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        w = hwMap.get(Servo.class, "w_servo");
        r  = hwMap.get(Servo.class, "r_servo");
        s  = hwMap.get(CRServo.class, "s_servo");
        t = hwMap.get(Servo.class, "t_servo");
        l = hwMap.get(Servo.class, "l_servo");
    }
}
