import { Component } from 'react';

export default class ParentToChildComponent extends Component{

    state={name:'Ravallika',id:100}

    render(){

        return(
            <div>
                <Child name={this.state.name} id={this.state.id}/>

            </div>
        );


    }
}

 class Child extends Component{
    render(){
        return(<div>

            <h1>name:-{this.props.name}</h1>
            <h1>id:-{this.props.id}</h1>
        </div>);
    }
}

