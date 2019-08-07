/*
const name = 'Santosh'
const element = <h1>{name}</h1>

function Welcome(props) {
    return (
        <div>
        <h1  style={{color:'blue'}}>{props.name}</h1>
        {// <button onClick={()=>alert('button')}>Click</button> }
        <button onClick={alert.bind(this, 'button')}>Click</button>
        </div>
    )
}
*/

class Message extends React.Component {
    constructor(props){
        super(props)
        this.state = {
            name : 'Mahadev',
            id : 'meditating'
        }
        this.changeMessage = this.changeMessage.bind(this);
        //this.clickLink = this.clickLink.bind(this);
        //by binding we get access to class state
    }

    render() {
        console.log("Rendering...")
        return (
            <div>
                <h1>{this.state.name}</h1>
                <h2>{this.state.id}</h2>
                <button onClick={this.changeMessage}>Change Message</button><br></br><br></br>
                <a href="https://www.google.com" onClick={this.clickLink}>Link</a>
            </div>
        )
    }

    clickLink(event) {
        event.preventDefault();
    }

    changeMessage(){
        console.log("Change Message method")
        //this.state.name = 'Hari'
        //this.render()
        this.setState({ name : 'Hari'});
    }
}

//ReactDOM.render(element, document.getElementById('app'));
//ReactDOM.render(<Welcome name='Santosh'/>, document.getElementById('app'));
ReactDOM.render(<Message/>, document.getElementById('app'));
