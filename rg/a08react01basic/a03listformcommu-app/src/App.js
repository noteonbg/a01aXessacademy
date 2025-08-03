import './App.css';
import MedicalList from './components/MedicalList';
import MedicalListFromJson from './components/MedicalListFromJson';

function App() {
  return (
    <div className="App">
       <MedicalList/>
       <MedicalListFromJson/>
     </div>
  );
}

export default App;
