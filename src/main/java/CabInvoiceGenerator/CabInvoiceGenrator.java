package CabInvoiceGenerator;

import java.util.Arrays;

class CabInvoiceGenerator {
        private final int COST_PER_KM = 10;
        private final int COST_PER_MINUTE = 1;
        private final double MINIMUM_FARE = 5.0;

        public double calculateFare( double distance, int time) {
            double totalFare;
            totalFare = distance * COST_PER_KM + time * COST_PER_MINUTE;
            if (totalFare < MINIMUM_FARE)
                totalFare = MINIMUM_FARE;

            return totalFare;
        }

        public double MultipleFare(Rides[] rides) {
        double totalFare = 0.0;
        for (Rides ride : rides)
            totalFare = totalFare + this.calculateFare(ride.distance,ride.time);

        return totalFare;
        }

        public int numberOfRides(Rides[] rides) {
            return rides.length;
        }

        public double averageFarePerRide(Rides[] rides) {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double totalFare = cabInvoiceGenerator.MultipleFare(rides);
        double numberOfRides = rides.length;
        double averageFare = totalFare/numberOfRides;
        return averageFare;
    }
    }

