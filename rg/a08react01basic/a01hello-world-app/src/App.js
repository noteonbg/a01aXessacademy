import './App.css';
import Freak from './Freak';
import MultiplesComponent from './reactpocforspring/Multiples';
import PatientManager from './reactpocforspring/PatientManager';
import RectangleForm from './reactpocforspring/RectangleForm';

function App() {
  return (
    <div className="App">
        <h1> opinion </h1>
        {/* <Freak/>  we are telling use the freak component here */}
        {/* <MultiplesComponent/> */}
        {/* <RectangleForm/> */}
        <PatientManager/>
        </div>
  );
}

export default App;
