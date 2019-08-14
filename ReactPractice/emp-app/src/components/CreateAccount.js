import React, { Component } from 'react'
import Axios from 'axios';

export class CreateAccount extends Component {
    constructor(props) {
        super(props);
        this.state = {
            name: '',
            email: '',
            phoneno: '',
            password: ''
        }
        this.postData = this.postData.bind(this);
        this.saveValidation = this.saveValidation.bind(this);

    }
    
    saveValidation() {
        const{name, email,  password, phoneno} = this.state;
        if (name.trim().length === 0 || email.trim().length === 0 || password.trim().length === 0 || phoneno.trim().length ===  0) {
            alert('All fields are mandatory, no spaces allowed!');
            return false;
        } else if (phoneno.trim().length !== 10) {
            alert('Phone should be 10 digits')
            return false;
        } else if (!/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(email)) {
            alert("You have entered an invalid email address!")  
            return false
        } else {
            alert('returning true')
             return true
        }

    }

    postData(event) {
        event.preventDefault();
        console.log('Post Data', this.state);
        let accountData = this.state;
        if(this.saveValidation()) {
            Axios.post('https://emp-app-818c3.firebaseio.com/accounts.json', accountData).then((response) => {
                console.log('Response Object', response);
                this.setState({
                    name: '',
                    email: '',
                    phoneno: '',
                    password: ''
                })
            }).catch((error) => {
                console.log('Error Object', error);
            })
        }
    }

    render() {
        return (
            <div>
                <form onSubmit={this.postData} className="p-5">
                    <div className="row ">
                        <div className="col">
                            <input type="text" onChange={(event) => {
                                this.setState({
                                    name: event.target.value
                                })
                            }}
                                value={this.state.name} className="form-control" placeholder="Name" />
                        </div>
                        <div className="col">
                            <input type="text"
                                onChange={(event) => {
                                    this.setState({
                                        email: event.target.value
                                    })
                                }}
                                value={this.state.email} className="form-control" placeholder="Email" />
                        </div>
                    </div>
                    <br />
                    <div className="row">
                        <div className="col">
                            <input type="number"
                                onChange={(event) => {
                                    this.setState({
                                        phoneno: event.target.value
                                    })
                                }}
                                value={this.state.phoneno} className="form-control" placeholder="Phone Number" />
                        </div>
                        <div className="col">
                            <input type="password"
                                onChange={(event) => {
                                    this.setState({
                                        password: event.target.value
                                    })
                                }}
                                value={this.state.password} className="form-control" placeholder="Password" />
                        </div>
                    </div>
                    <br />
                    <div className="row">
                        <div className="col-md-2 offset-5">
                            <button className="btn btn-success w-100" type="submit">Add</button>
                        </div>
                    </div>
                </form>
            </div>
        )
    }
}

export default CreateAccount