import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
    SalaryWorker sWorker;

    @BeforeEach
    void setUp() {
        sWorker = new SalaryWorker("0009","Valerie","Nyx","She/Her","Ms.","1998",55000);
    }

    @Test
    void calculateWeeklyPay() {
        System.out.println("Calculate Weekly Pay 40 Hours: "+ sWorker.calculateWeeklyPay(40.0));
        System.out.println("Calculate Weekly Pay 50 Hours: "+ sWorker.calculateWeeklyPay(50.0));
    }

    @Test
    void displayWeeklyPay() {
        System.out.println(sWorker.displayWeeklyPay(65.4));
    }
}