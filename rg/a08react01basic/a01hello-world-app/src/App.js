import './App.css';
import Freak from './Freak';
import MultiplesComponent from './services/Multiples';

function App() {
  return (
    <div className="App">
        <h1> opinion </h1>
        {/* <Freak/>  we are telling use the freak component here */}
        <MultiplesComponent/>
    </div>
  );
}

export default App;
