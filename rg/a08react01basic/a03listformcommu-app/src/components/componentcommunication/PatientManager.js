import React, { useState } from 'react';
import PatientCard from './PatientCard';

function PatientManager() {
  const [patient, setPatient] = useState({
    id: 'P001',
    name: 'Ramesh',
    status: 'Admitted',
  });

  // Function to receive status update from the child
  const handleStatusUpdate = (newStatus) => {
    setPatient((prev) => ({ ...prev, status: newStatus }));
  };

  return (
    <div className="container mt-4">
      <h3>🏥 Patient Management</h3>
      <PatientCard
        id={patient.id}
        name={patient.name}
        status={patient.status}
        onStatusChange={handleStatusUpdate}  // Pass callback to child
      />
    </div>
  );
}

export default PatientManager;

/*

Parent → Child:

The parent (PatientManager) sends id,
 name, status, and a callback (onStatusChange) as props.

Child → Parent:
When the user clicks "Mark as Discharged",
 the child calls onStatusChange('Discharged').

The parent updates its patient.status accordingly.

*/
