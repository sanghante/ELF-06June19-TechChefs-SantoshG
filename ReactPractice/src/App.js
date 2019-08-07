import React,{ Component} from 'react';
// import './DottedBox.css';
// import './App.css';
// import TodoList from './Components/TodoList';
// import TodoItems from './Components/TodoItems';
// import BootstrapComponent from './Components/BootstrapComponent';
import Header from './Components/Header';
import Carouse from './Components/Carouse';

class App extends Component{
inputElement = React.createRef()
  constructor(){
    super()
    this.state={
      items:[],
      currentItem:{text:'',key:''},
      color:'purple'
    }
  }
  deleteItem= key =>{
    const filteredItems= this.state.items.filter(item =>{
      return item.key !== key
    })
    this.setState({
      items:filteredItems,
    })
  }
  handleInput = e =>{
    const itemText = e.target.value
    const currentItem={text : itemText , key: Date.now() }
    //console.log('check',itemText.lenght);
    if(itemText.length!==0){
    this.setState({
      color:'red'
    })}
    else{
      this.setState({
        color:'yellow'
      })
    }
    
    this.setState({
      currentItem,
    })
    console.log(itemText)
    console.log('Hello Handleinput')
  }
  addItem= e =>{
    e.preventDefault()
    const newItem = this.state.currentItem
    if(newItem.text !==''){
    console.log(newItem)
    const items=[...this.state.items,newItem]
    this.setState({
      items: items,
      currentItem : {text: '' ,key: ''},
    })
  }
  console.log('Hello Add item')
}


  render(){
  return (
    <div className="App">
      {/* <TodoList 
      //we are passing props to TodoList component
      addItem={this.addItem} 
      inputElement={this.inputElement}
      handleInput={this.handleInput}
      currentItem={this.state.currentItem}
      color={this.state.color}
      />
    
      <TodoItems entries={this.state.items} deleteItem={this.deleteItem}/>
      <DottedBox1/>
      <BootstrapComponent/> */}
      <Header/>
      <Carouse/>
     </div>
 )
}
}
const DottedBox1 =() =>{
  return(
  <div className="DottedBox">
      <p className="DottedBox_content">Get Started with CSS</p>
  </div>
)
  }

export default App;