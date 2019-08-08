import React from 'react';
import ReactDOM from 'react-dom';
import * as serviceWorker from './serviceWorker';
import Home from './components/Home'
import User from './components/User'
import UserDetails from './components/UserDetails'
import {Route, Link, BrowserRouter} from 'react-router-dom'

const routing = (<BrowserRouter>
        <ul>
            <li>
                <Link to='/'>Home</Link>
            </li>
            <li>
                <Link to='/users'>User</Link>
            </li>
            <li>
                <Link to='/contact'>Details</Link>
            </li>

        </ul>

        <div>
            <Route exact path="/" component = {Home} />
            <Route path="/users" component = {User} />
            <Route path="/contact" component = {UserDetails} />
        </div>
        </BrowserRouter>)

ReactDOM.render(routing, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
