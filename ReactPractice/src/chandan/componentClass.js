
class Header extends React.Component {
    constructor(props) {
        super(props);
        console.log(this.props);
    }
    
    render() {
        return React.createElement('h1', {className:'blue'}, 'Header');
    }
}

class Footer extends React.Component {
    render() {
        return React.createElement('h1',{className:'green'}, 'Footer');
    }
}

class Content extends React.Component {
    constructor(props){
        super(props);    
    }

    render() {
        return React.createElement('p', {className:'black'}, 
        this.props.item.map((value, index) => React.createElement('li', {key:index}, value)));
    }
}

const items = ['bag', 'pencil', 'book'];
const header = React.createElement(Header, {item:['Bag']});
const footer = React.createElement(Footer);
const content = React.createElement(Content, {item : items});
const myApp = React.createElement('div', null, header, content, footer)

ReactDOM.render(myApp, document.getElementById('app'));