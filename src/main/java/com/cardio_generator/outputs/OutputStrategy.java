package com.cardio_generator.outputs;

public interface OutputStrategy {
    /**
     * Outputs the generated patient data to a specific destination 
     * @param patientId patients id number 
     * @param timestamp the time the data was generated in ms 
     * @param label the type of data being output 
     * @param data the actual data value to be output 
     */
    void output(int patientId, long timestamp, String label, String data);
}
