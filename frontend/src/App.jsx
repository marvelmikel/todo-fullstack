import './App.css'
import FooterComponent from './components/FooterComponent'
import HeaderComponent from './components/HeaderComponent'
import {BrowserRouter, Routes, Route} from 'react-router-dom'
import ListTodoComponent from './components/ListTodoComponent'

function App() {

  return (
    <>
    <HeaderComponent/>
     <ListTodoComponent/>
     <FooterComponent/>
    </>
  )
}

export default App
