import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    Worker worker;
    @BeforeEach
    void setUp() {
        worker = new Worker("0009","Valerie","Nyx","She/Her","Ms.","1998",26.0);
    }

    @Test
    void calculateWeeklyPay() {
        System.out.println("Calculate Weekly Pay Normal Hours: "+ worker.calculateWeeklyPay(40.0));
        System.out.println("Calculate Weekly Pay Overtime Hours: "+ worker.calculateWeeklyPay(50.0));
    }

    @Test
    void displayWeeklyPay() {
        System.out.println(worker.displayWeeklyPay(65.4));
    }
}