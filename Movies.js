import React, { Component } from 'react';
import '../css/Movies.css';
import Note from './Note';

import { Route, BrowserRouter as Router, Link } from "react-router-dom";
import Home from "./Home";
import About from "./About";

class Routes extends Component {
  render() {
    return (
      <Router>
        <div>
          <hr />
          <Route name="Home" exact path="/" component={Home} />
          <Route name="About" path="/about" component={About} />
        </div>
      </Router>
    );
  }
}


class Movies extends Component {
  constructor() {
    super();
    this.state = {
      notes: [
        {
          title: "Never Let Me Go",
          body: "2005 | Science Fiction",
          description: "Friends grow up together at a seemingly idyllic boarding school in the English countryside. The horrible truth of their true purpose is revealed to them, and threatens to tear their friendship asunder."
        },
        {
          title: "Melancholia",
          body: "2011 | Science Fiction",
          description: "A planet hurtles toward a collision course with Earth. Two sisters, one of them trying to recover from a heavy bout of depression and a failed marriage, cope with their destiny in very different ways."
        },
        {
          title: "The Ramen Girl",
          body: "2008 | Comedy Drama",
          description: "An American woman is stranded in Tokyo after breaking up with her boyfriend. Searching for direction in life, she trains to be a ramen chef."
        },
        {
          title: "The Fringe Dwellers",
          body: "1986 | Drama",
          description: "Trilby is a young Aboriginal woman living with her people on the outskirts of Australian society. Her family attempts to find happiness in the suburbs."
        }
      ]
    }
  }

  addNote() {
    this.state.notes.push(
      {
        title: "Move Title",
        body: "Year | Genre",
        description: "Movie Description"
      }
    );
    this.setState(
      {
        notes: this.state.notes
      }
    );
  }

  deleteNote(id) {
    let newNoteArr = this.state.notes;
    newNoteArr.map((note, index) => {
      if (id === note.id) {
        newNoteArr.splice(index, 1);
      }
    });
    this.setState(
      {
        notes: newNoteArr
      }
    );
  }

  render() {
    return (
      <div>
        <div className="div-board">
          <Router>
            <div className="nav">
              <Link to="/">Home</Link>  | |
                    <Link to="/about">About Us</Link>
            </div>
          </Router>
          <div className="row">
            {
              this.state.notes.map(note => {
                return <Note title={note.title} body={note.body} description={note.description} />
              })
            }
          </div>
        </div>
        <div>
          <button className="btn btn-success add-button" onClick={this.addNote.bind(this)}>Add</button>
        </div>
      </div>
    );
  }
}


export default Movies;
