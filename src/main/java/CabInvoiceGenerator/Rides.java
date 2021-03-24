package CabInvoiceGenerator;

public class Rides {
        public double distance;
        public int time;
        public PremiumRides rides;

        public Rides(double distance, int time,PremiumRides rides) {
            this.distance = distance;
            this.time = time;
            this.rides=rides;
        }
    }
