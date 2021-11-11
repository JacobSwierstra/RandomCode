public class AnimatedConsole {
    public static void main(String[] args) throws InterruptedException {
        double i = 0;
        while(true){
            System.out.printf("%.2f", i);
            System.out.print("% done"+"\r");
            i += .01;
            Thread.sleep(1);
            if(i >= 100){
                if(i != 100){
                    i=100.00;
                    System.out.printf("%.2f", i);
                    System.out.print("% done"+"\r");
                }
                break;
            }
        }
    }
}
