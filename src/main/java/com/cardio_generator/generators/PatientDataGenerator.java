package com.cardio_generator.generators;

import com.cardio_generator.outputs.OutputStrategy;

public interface PatientDataGenerator {

/**
 * Generates health data for the specified patient and sends it 
 * to the given output destination 
 * @param patientId the unique identifier of the patient 
 * @param outputStrategy the destination where the data will be sent 
 */


    void generate(int patientId, OutputStrategy outputStrategy);
}
