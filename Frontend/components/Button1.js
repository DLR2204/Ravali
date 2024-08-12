import React,{Component} from 'react';

class Button1 extends Component{

    state = {title:'Submit'}

    submit(){
        alert('submitted');
    }

    render(){
        return(
            <div>

                <button type="button" onClick={this.submit}>{this.state.title}</button>

            </div>
            
            );
    };
}

export default Button1;