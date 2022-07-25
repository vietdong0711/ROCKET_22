import axios from "axios";
import storage from "../Storage/Storage";

const axiosClient = axios.create({
  baseURL: "http://localhost:8080/api/v1/",
  headers: {
    "content-type": "application/json",
    // auth: {
    //   username: "Username10",
    //   password: "123456",
    // },
  },
});

// axiosClient.interceptors.request.use(async (config) => {
//   // Handle token here ...
//   // if token exists then attach token
//   let auth = {
//     username: "Username10",
//     password: "123456",
//   };
//   config.headers.Authorization = auth;

//   return config;
// });
// Thêm thông tin xác thực cho mỗi request, bao gồm thông tin Username vào Password
export const api = (method, endpoint, payload, accountLogin) => {
  // TH login sẽ lấy thông tin login từ giao diện
  if (accountLogin) {
    return axiosClient(
      endpoint,
      {
        auth: {
          username: accountLogin.Username,
          password: accountLogin.Password,
        },
      },
      { method: method, data: payload }
    )
      .then((response) => {
        return response.data;
      })
      .catch((error) => {
        console.log(error);
      });
    // Trường hợp đã đăng nhập, lấy thông tin login từ LocalStorage
  } else {
    let accountloginStorage = storage.getUserInfo();
    return axiosClient(
      endpoint,
      {
        auth: {
          username: accountloginStorage.username,
          password: accountloginStorage.password,
        },
      },
      { method: method, data: payload }
    )
      .then((response) => {
        return response.data;
      })
      .catch((error) => {
        console.log(error);
      });
  }
};
