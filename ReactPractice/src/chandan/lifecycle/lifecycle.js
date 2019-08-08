class Lifecycle extends React.Component {
    constructor(props) {
        super(props)
        console.log('Constructor Parent Lifecycle')
        this.state =  {
            name : 'Rani',
            checked : true
        }
    }

    static getDerivedStateFromProps() {
        console.log('getDerivedStateFromProps() method called Parent ');
        //return { name: 'Raja'};
        return null;
        
    }

    render() {
        console.log('Render lifecycle method Parent ');
        if (this.state.checked) {
        return (
            <div>
            <h1>{this.state.name}</h1>
            <button onClick={this.changeName.bind(this)}>Change Name</button>
            <Child/>
            </div>            
        )
        } 
        return <h1> checked is false</h1>
    }

    changeName() {
        this.setState(
            {
                name : 'Nandi',
                checked : false            
            }
        )
    }

    componentDidMount() {
        console.log('component did mount Parent  lifecycle method')
    }

    shouldComponentUpdate() {
        console.log('Should component update Parent  lifecycle')
        return true;
    }

    getSnapshotBeforeUpdate(Snapshot) {
        console.log('Snapshot before update Parent lifecycle')
        return 'Snapshot';
    }

    componentDidUpdate(props, state, Snapshot) {
        console.log('Component did update Parent lifecycle')
        console.log('Snapshop', Snapshot)
    }
}

class Child extends React.Component {
    constructor(props) {
        super(props)
        console.log('Constructor child lifecycle')
        this.state =  {
            name : 'Rani',
            checked : true
        }
    }

    static getDerivedStateFromProps() {
        console.log('getDerivedStateFromProps() method called Child');
        //return { name: 'Raja'};
        return null;
        
    }

    render() {
        console.log('Render child lifecycle method');
        if (this.state.checked) {
        return (
            <div>
            <h1>{this.state.name}</h1>
            <button onClick={this.changeName.bind(this)}>Change Name</button>
            </div>
        )
        } 
        return <h1> checked is false</h1>
    }

    changeName() {
        this.setState(
            {
                name : 'Nandi',
                checked : false            
            }
        )
    }

    componentDidMount() {
        console.log('component did mount child lifecycle method child')
    }

    shouldComponentUpdate() {
        console.log('Should component update child lifecycle child')
        return true;
    }

    getSnapshotBeforeUpdate(Snapshot) {
        console.log('Snapshot before update child lifecycle child')
        return 'Snapshot';
    }

    componentDidUpdate(props, state, Snapshot) {
        console.log('Component did update child lifecycle child')
        console.log('Snapshop', Snapshot)
    }    
}

ReactDOM.render(<div><Lifecycle /> <Child/></div>, document.getElementById('app'))