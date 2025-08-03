// to show default properties for props

import React from 'react';

function DoctorGreeting({ name = "Dr. Unknown" }) {
  return <h3>Welcome, {name}!</h3>;
}

export default DoctorGreeting;
