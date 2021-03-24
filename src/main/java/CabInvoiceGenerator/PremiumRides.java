package CabInvoiceGenerator;

public enum PremiumRides {

    Normal(10.0,1.0,5.0),
    Premium(15.0,2.0,20.0);

        private final double cost_per_km;
        private final double cost_per_min;
        private final double minfare;

        PremiumRides(double cost_per_km, double cost_per_min, double minfare){
            this.cost_per_km=cost_per_km;
            this.cost_per_min=cost_per_min;
            this.minfare=minfare;
        }

        public double CostOfCabRide(Rides ride) {
            double rideCost = ride.distance * cost_per_km + ride.time * cost_per_min;
            return rideCost;
        }
    }
