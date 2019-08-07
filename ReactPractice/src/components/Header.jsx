import React, { Component} from 'react'
import { Navbar, Nav, } from  'react-bootstrap'
//import './DottedBox.css'

class Header extends Component{
    render(){
        return(
            <div>
    <Navbar bg="primary" variant="dark">
    <Navbar.Brand href="#home">Welcome</Navbar.Brand>
    <Nav className="mr-auto">
      <Nav.Link href="#home">Signin</Nav.Link>
      <Nav.Link href="#features">Login</Nav.Link>
    </Nav>
  </Navbar>
            </div>
        )
    }
}
export default Header;