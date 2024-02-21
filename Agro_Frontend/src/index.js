// import React from 'react';
// import ReactDOM from 'react-dom/client';
// import './index.css';
// import App from './App';
// import reportWebVitals from './reportWebVitals';

// const root = ReactDOM.createRoot(document.getElementById('root'));
// root.render(
//   <React.StrictMode>
//     <App />
//   </React.StrictMode>
// );

// // If you want to start measuring performance in your app, pass a function
// // to log results (for example: reportWebVitals(console.log))
// // or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
// reportWebVitals();

import React from "react";
import ReactDOM from "react-dom";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Homepage from "./home";
import Addproduct from "./addproduct";
import Addsupplier from "./addsupplier";
import Addretailer from "./addretailer";

ReactDOM.render(
  <>
    <Router>
      <Routes>
        <Route exact path="/" element={<Homepage />} />
        <Route exact path="/home" element={<Homepage />} />
        <Route exact path="/addproduct" element={<Addproduct />} />
        <Route exact path="/addsupplier" element={<Addsupplier />} />
        <Route exact path="/addretailer" element={<Addretailer />} />
      </Routes>
    </Router>
  </>,
  document.getElementById("root")
);
