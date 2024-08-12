import React,{useState} from 'react';

function Button(){

  

   const title = useState('React');

    return(
            <div>

                <button type="button">{title}</button>

            </div>
    );
}

export default Button;