import logo from './logo.svg';
import './App.css';
import ListVinosComponent from './components/ListVinosComponent';
import HeaderComponet from './components/HeaderComponet';
import FooterComonent from './components/FooterComonent';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import AddVinoComponent from './components/AddVinoComponent';

function App() {
  return (
    <div>
      <BrowserRouter>
        <HeaderComponet />
        <div className='container'>
          <Routes>
            <Route exact path='/' element={<ListVinosComponent />}></Route>
            <Route path='/vinos' element={<ListVinosComponent />}></Route>
            <Route path='/add-vino' element={<AddVinoComponent />}></Route>
          </Routes>
        </div>
        <FooterComonent />
      </BrowserRouter>
    </div>
  );
}

export default App;
