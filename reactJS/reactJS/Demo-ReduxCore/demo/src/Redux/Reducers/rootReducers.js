import { combineReducers } from "redux";
import accountReducer from "./accountReducer";
import formReducer from "./formReducer";

let rootReducers = combineReducers({
  listAccount: accountReducer,
  isShowForm: formReducer,
});

export default rootReducers;
