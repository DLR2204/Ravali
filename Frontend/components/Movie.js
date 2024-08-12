import './Movie.css';

function Movie(props){
    return(
        <div className="movie-card">

        <img src={props.banner}/>
        <div className='card-body'>
        <center><b>{props.title}</b></center>
        <p>{props.zoner}</p>
        </div>
        
        
        </div>
    );
}
export default Movie;