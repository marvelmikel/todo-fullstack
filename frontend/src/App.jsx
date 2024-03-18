import './App.css'
import FooterComponent from './components/FooterComponent'
import HeaderComponent from './components/HeaderComponent'
import {BrowserRouter, Routes, Route} from 'react-router-dom'
import ListTodoComponent from './components/ListTodoComponent'
import TodoComponent from './components/TodoComponent'
import RegisterComponent from './components/RegisterComponent'
import LoginComponent from './components/LoginComponent'

function App() {

  return (
    <>
    <BrowserRouter>
    <HeaderComponent/>
    <Routes>
      http:localhost:8080
      <Route path='/' element = {  <LoginComponent/>}> </Route>

      //http:localhost:8080/todos
      <Route path='/todos' element = {  <ListTodoComponent/>}> </Route>

      //http:localhost:8080/add-todo
      <Route path='/add-todo' element = {  <TodoComponent/>}> </Route>

      //http:localhost:8080/update-todo/id
      <Route path='/update-todo/:id' element = {  <TodoComponent/>}> </Route>

      //http:localhost:8080/register
      <Route path='/register' element = {  <RegisterComponent/>}> </Route>

      //http:localhost:8080/login
      <Route path='/login' element = {  <LoginComponent/>}> </Route>

    </Routes>
     <FooterComponent/>
    </BrowserRouter>
   
    </>
  )
}

export default App
