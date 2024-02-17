import React from 'react'
import { useState } from 'react'

const ListTodoComponent = () => {

  const dummyData =[
    {
      "id": 1,
      "title": "learn Core java",
      "description": "learning core java spring",
      "completed" : false
    },
    {
      "id": 2,
      "title": "learn Core java spring code",
      "description": "learning core java spring boot",
      "completed": false
    },
    {
      "id": 3,
      "title": "learn Core java springboot",
      "description": "learning core java spring boot",
      "completed": false
    }
  ]

  const [todos, setTodos] = useState(dummyData)

  return (
    <div className='container'>
      <h2 className='text-center'>List of Todos</h2>
      <div>
        <table className='table table-bordered table-striped'>
          <thead>
            <tr>
              <th>Todo Title</th>
              <th>Todo Description</th>
              <th>Todo Complete</th>
            </tr>
          </thead>
          <tbody>
            {
              todos.map(todo => 
                <tr key={todo.id}>
                  <td>{todo.title}</td>
                  <td>{todo.description}</td>
                  <td>{todo.completed ? 'YES': 'NO'}</td>
                </tr>

              )
            }
          
          </tbody>

        </table>
      </div>
    </div>
  )
}

export default ListTodoComponent