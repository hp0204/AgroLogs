import React from "react";
import { Link } from "react-router-dom";
import 'bootstrap/dist/css/bootstrap.min.css';

function Addretailer() {
  return (
    <>
    <br></br>
    <form>
  <div class="form-group">
    <label for="formGroupExampleInput">Retailer Name</label>
    <input style={{width:300, height:30}} type="text" class="form-control" id="formGroupExampleInput"/>
  </div>
  <br></br>
  <div class="form-group">
    <label for="formGroupExampleInput2">Mobile No</label>
    <input style={{width:300, height:30}} type="text" class="form-control" id="formGroupExampleInput2"/>
  </div>
  <br></br>
  <div class="form-group">
    <label for="formGroupExampleInput2">Email</label>
    <input style={{width:300, height:30}} type="email" class="form-control" id="formGroupExampleInput2"/>
  </div>
  <br></br>
  <div class="form-group">
    <label for="formGroupExampleInput2">Password</label>
    <input style={{width:300, height:30}} type="password" class="form-control" id="formGroupExampleInput2"/>
  </div>
  <br></br>
  <div class="form-group">
    <label for="formGroupExampleInput2">Address</label>
    <input style={{width:300, height:30}} type="text" class="form-control" id="formGroupExampleInput2"/>
  </div>
</form>
<br></br>
<Link
        to="/addretailer"
        style={{ alignItems: "center", fontSize: 20 }}
        class="btn btn-secondary"
      >
        Add Retailer
      </Link>
    </>
  );
}

export default Addretailer;
