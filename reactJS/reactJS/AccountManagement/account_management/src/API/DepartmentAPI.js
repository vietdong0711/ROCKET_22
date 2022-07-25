import { api } from "./api";

//get listAccountAPI
const getListDepartmentAPI = () => {
  return api("GET", "departments/", null);
};

export { getListDepartmentAPI };
