module Vehicles.java
    public class Vehicles  implements Car,Bus
            {
                int distanceTravelled;
                int averageSpeed;
                int timeInHours = 2;
            public void distanceTravelled()
            {
                distanceTravelled = speed*timeInHours;
                System.out.println("Total Distance Travelled is : "+distanceTravelled);
            }
            public void speed()
            {
                int averageSpeed = distanceTravelled/timeInHours;
                System.out.println("Average Speed maintained is : "+averageSpeed);
            }
            public static void main(String args[])
            {
                Vehicles v1=new Vehicles();
                v1.distanceTravelled();
                v1.speed();
            }

            }
