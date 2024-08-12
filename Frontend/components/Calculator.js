import { Component } from "react";

class Calculator extends Component{

    state={a:40,b:20}


    setA = (e )=>{this.setState({a:parseInt(e.target.value)})}

    setB =( e)=>{this.setState({b:parseInt(e.target.value)})}

    render(){
        return(
            <div>
<br/><br/><br/>
              <b> A:- </b><input type="text" className='inputA' onChange={this.setA}></input>
              <b>  B:-</b><input type="text" className='inputB' onChange={this.setB}></input><br/><br/>

            Add:-{this.state.a + this.state.b}<br/>

            Sub:-{this.state.a-this.state.b}    <br/>

            Mul:-{this.state.a*this.state.b}<br/>

            Div :-{this.state.a/this.state.b}<br/>
            </div>
        );
    };
}

export default Calculator;