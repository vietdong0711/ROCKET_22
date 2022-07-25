import "./App.css";
import { Route, Routes, Link } from "react-router-dom";
import SignUp from "./Component/SignUp";
import Home from "./Component/Home";
import About from "./Component/About";
import Error from "./Component/Error";
import Menu from "./Component/Menu/Menu";
import router from "./Router/Router";

function App() {
  return (
    <div className="container">
      {/* Menu */}
      <Menu />
      {/* Content */}
      {router}
      {/* <Routes>
        <Route path="/home" element={<Home />} />
        <Route path="/about" element={<About />} />
        <Route path="*" element={<Error />} />
      </Routes> */}
    </div>
  );
}

export default App;
