import { getListDepartmentAPI } from "../../API/DepartmentAPI";
import { FETCH_DEPARTMENT_LIST } from "../Contants/ActionType";

//action call API, đưa dữ liệu vào redux
export let actionFecthListDepartmentAPI = () => {
  return (dispatch) => {
    return getListDepartmentAPI().then((list) => {
      // list ===> listAccount redux
      // dispatch
      dispatch(actionFecthListDepartmentRedux(list));
    });
  };
};

export let actionFecthListDepartmentRedux = (list) => {
  return {
    type: FETCH_DEPARTMENT_LIST,
    payload: list,
  };
};
