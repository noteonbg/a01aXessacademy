import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import MedicalList from './components/MedicalList';
import MedicalListFromJson from './components/MedicalListFromJson';
import PatientTable from './components/PatientTable';
import PatientTableWithSortFilter from './components/PatientTableWithSortFilter';
import PatientManager from './components/componentcommunication/PatientManager';
import PatientForm from './components/validation/PatientForm';
import AllEmp from './components/createviewall/AllEmp';

function App() {
  return (
    <div className="App">

      {/*
       <MedicalList/>
       <MedicalListFromJson/>
       <PatientTable/>
       <PatientTableWithSortFilter/>

       */}

       {/* parent and child communication */}
       <PatientManager/>

       {/* form validation in react  */}
       <PatientForm/>
       <hr/>
       <AllEmp/>
     </div>
  );
}

export default App;
