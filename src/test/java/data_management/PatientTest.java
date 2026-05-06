package data_management;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.data_management.Patient;
import com.data_management.PatientRecord;


public class PatientTest {
    @Test
     public void testGetRecords(){

        Patient patient = new Patient(1);
        patient.addRecord(90.0,  "aa", 1000);
        patient.addRecord(60.0, "bb", 4000);

        List<PatientRecord> result = patient.getRecords(500, 3000);

        assertEquals(1,result.size());

    }
    
}
