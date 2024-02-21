import React from "react";
import { Link } from "react-router-dom";

function Homepage() {
  return (
    <>
      <h1 style={{textAlign:'center'}}>Agrologs</h1>
      <br></br>
      <Link
        to="/addproduct"
        style={{ alignItems: "center", fontSize: 16, marginRight:30 }}
        class="btn btn-secondary"
      >
        Add Product
      </Link>
      <Link
        to="/addsupplier"
        style={{ alignItems: "center", fontSize: 16, marginRight:30 }}
        class="btn btn-secondary"
      >
        Add Supplier
      </Link>
      <Link
        to="/addretailer"
        style={{ alignItems: "center", fontSize: 16, marginRight:30 }}
        class="btn btn-secondary"
      >
        Add Retailer
      </Link>
    </>
  );
}

export default Homepage;
