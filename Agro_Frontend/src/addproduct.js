import React from "react";
import { Link } from "react-router-dom";
import 'bootstrap/dist/css/bootstrap.min.css';

function Addproduct() {
  return (
    <>
    <br></br>
    <form>
  <div class="form-group">
    <label for="formGroupExampleInput">Product Name</label>
    <input style={{width:300, height:30}} type="text" class="form-control" id="formGroupExampleInput"/>
  </div>
  <br></br>
  <div class="form-group">
    <label for="formGroupExampleInput2">Product Description</label>
    <input style={{width:300, height:30}} type="text" class="form-control" id="formGroupExampleInput2"/>
  </div>
  <br></br>
  <div class="form-group">
    <label for="formGroupExampleInput2">Price</label>
    <input style={{width:300, height:30}} type="text" class="form-control" id="formGroupExampleInput2"/>
  </div>
  <br></br>
  <div class="form-group">
    <label for="formGroupExampleInput2">Supplier</label>
    <input style={{width:300, height:30}} type="text" class="form-control" id="formGroupExampleInput2"/>
  </div>
</form>
<br></br>
<Link
        to="/addproduct"
        style={{ alignItems: "center", fontSize: 20 }}
        class="btn btn-secondary"
      >
        Add Product
      </Link>
    </>
  );
}

export default Addproduct;
