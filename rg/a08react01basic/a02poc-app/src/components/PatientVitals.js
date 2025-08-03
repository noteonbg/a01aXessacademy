import React, { useState } from 'react';

function PatientVitals() {
  const [heartRate, setHeartRate] = useState(72); // Initial heart rate


  //observe if you want to change the state based on earlier state please pass function and dont change directly
  //byheart this..
  const increaseRate = () => {
    setHeartRate(prev => prev + 5);
  };

  const decreaseRate = () => {
    setHeartRate(prev => Math.max(30, prev - 5)); // prevent dangerously low rate
  };

  return (
    <div className="card p-3 mt-4">
      <h3>Patient Vitals</h3>
      <p>Current Heart Rate: <strong>{heartRate} bpm</strong></p>
      <button className="btn btn-success me-2" onClick={increaseRate}>Increase</button>
      <button className="btn btn-danger" onClick={decreaseRate}>Decrease</button>
    </div>
  );
}

export default PatientVitals;
