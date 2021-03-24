package CabInvoiceGenerator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

    class CabInvoiceGeneratorTest {

        CabInvoiceGenerator cabInvoiceGenerator;

        @BeforeAll
        public void execute(){
            cabInvoiceGenerator=new CabInvoiceGenerator();
        }
        @Test
        void CalculateFareTrueTest() {
            double totalFare = cabInvoiceGenerator.calculateFare(1.0, 5);
            Assertions.assertEquals(15.0, totalFare, 0.0);
        }

        @Test
        void CalculateFareFalseTest() {
            double totalFare = cabInvoiceGenerator.calculateFare(1.0, 5);
            Assertions.assertEquals(5, totalFare, 0);
        }

        @Test
        public void InvoiceGeneratorMinimumFare() {
            double totalFare = cabInvoiceGenerator.calculateFare(0.2, 2);
            Assertions.assertEquals(5, totalFare, 0.0);
        }

        @Test
        public void MultipleRidesTotalFare() {
            Rides[] rides = { new Rides(1.0,5),
                    new Rides(0.2,2)};

            double totalFare = cabInvoiceGenerator.MultipleFare(rides);
            Assertions.assertEquals(20, totalFare, 0.0);
        }

    }
