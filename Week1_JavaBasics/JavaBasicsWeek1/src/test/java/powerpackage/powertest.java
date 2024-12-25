package powerpackage;

import org.junit.jupiter.api.Test;

class powertest {
    @Test
     public void oneRaisedToOneIsOne() {
         assert powerfinder.calculate(1,1) == 1;
     }

     @Test
     public void twoRaisedToOneIsTwo() {
         assert powerfinder.calculate(2,1) == 2;
     }

     @Test
     public void twoRaisedToTwoIsFour() {
         assert powerfinder.calculate(2, 2) == 4;
     }

     @Test
     public void threeRaisedToTwoIsNine() {
         assert powerfinder.calculate(3, 2) == 3*3;
     }
}