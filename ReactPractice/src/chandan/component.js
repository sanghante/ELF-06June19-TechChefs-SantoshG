
function Header(props) {
    console.log(props);
    return React.createElement('h1', null, 'Header');
}

function Footer() {
    return React.createElement('h1', null, 'Footer');
}

function Content() {
    return React.createElement('p', {className:'blue'}, 'Content');
}

const header = React.createElement(Header, {item:['Bag']});
const footer = React.createElement(Footer);
const content = React.createElement(Content);
const myApp = React.createElement('div', null, header, content, footer)

ReactDOM.render(myApp, document.getElementById('app'));