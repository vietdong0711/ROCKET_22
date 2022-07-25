import { FETCH_DEPARTMENT_LIST } from "../Contants/ActionType";

let initialState = [];

let departmentReducer = (state = initialState, action) => {
  switch (action.type) {
    case FETCH_DEPARTMENT_LIST:
      let listDepartmentAPI = action.payload;
      return listDepartmentAPI;

    default:
      return [...state];
  }
};

export default departmentReducer;
