package supplier;

import java.util.function.Supplier;

public class OTP {
    public static void main(String[] args) {
        Supplier<String> otpSuplier=()->{
          String otp="";
            for (int i = 0; i < 6; i++) {
                otp+=(int)(Math.random()*10);
            }
            return otp;
        };

        System.out.println(otpSuplier.get());
        System.out.println(otpSuplier.get());
        System.out.println(otpSuplier.get());
        System.out.println(otpSuplier.get());
    }
}
