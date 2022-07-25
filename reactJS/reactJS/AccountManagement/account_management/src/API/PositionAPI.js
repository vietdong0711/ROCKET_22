import { api } from "./api";

//get listAccountAPI
const getListPositionAPI = () => {
  return api("GET", "possitions/", null);
};

export { getListPositionAPI };
