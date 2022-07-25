import { combineReducers } from "redux";
import accountReducer from "./AccountReducer";
import departmentReducer from "./DepartmentReducer";
import formReducer from "./FormReducer";
import formUpdateReducer from "./FormUpdateReducer";
import positionReducer from "./PositionReducer";

let rootReducers = combineReducers({
  showForm: formReducer,
  listAccount: accountReducer,
  listDepartment: departmentReducer,
  listPosition: positionReducer,
  formUpdate: formUpdateReducer,
});

export default rootReducers;
