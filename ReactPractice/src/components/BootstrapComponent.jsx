    
import  Button from 'react-bootstrap/Button'
import React, { Component} from 'react'
//import './DottedBox.css'

class BootstrapComponent extends Component{
    render(){
        return(
            <div>
                 <Button variant="primary">Primary</Button>
                 <Button variant="outline-success">Success</Button>
                 <Button variant="warning">Warning</Button>
            </div>
        )
    }
}
export default BootstrapComponent;