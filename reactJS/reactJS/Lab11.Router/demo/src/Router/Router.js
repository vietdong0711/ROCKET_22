import About from "../Component/About";
import Home from "../Component/Home";
import { Route, Routes } from "react-router-dom";
import Error from "../Component/Error";
import SignUp from "../Component/SignUp";
import Login from "../Component/Login";
import AccountManagement from "../Component/AccountManagement";
import AccountDepartment from "../Component/AccountDepartment";
import AccountDetail from "../Component/AccountDetail";

export let router = (
  <Routes>
    <Route path="/home" element={<Home />} />
    <Route path="/about" element={<About />} />
    <Route path="*" element={<Error />} />
    <Route path="/signUp" element={<SignUp />} />
    <Route path="/login" element={<Login />} />
    <Route path="/accountManagement" element={<AccountManagement />} />
    <Route path="/accountDepartment" element={<AccountDepartment />} />
    <Route path="/accountDetail/:ID" element={<AccountDetail />} />
  </Routes>
);

export default router;
