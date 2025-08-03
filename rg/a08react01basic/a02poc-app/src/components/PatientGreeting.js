import React from 'react';

//reading props and ensuring that we are not destructuring reading things from values...

function PatientGreeting(props) {
  return <h3>Welcome, {props.name}!</h3>;
}

export default PatientGreeting;
