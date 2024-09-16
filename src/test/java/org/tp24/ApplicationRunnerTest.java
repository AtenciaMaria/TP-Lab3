package org.tp24;

import org.junit.jupiter.api.Test;
//-import static org.junit.jupiter.api.Assertions.*;
class ApplicationRunnerTest {
    @Test
    void run() {
        //Llama al log de ApplicationRunner
        ApplicationRunner runner = new ApplicationRunner();
        //Llama al método que realiza el log
        runner.run();
    }
}