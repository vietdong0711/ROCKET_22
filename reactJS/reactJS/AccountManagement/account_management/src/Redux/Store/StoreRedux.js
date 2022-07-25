import { createStore, applyMiddleware, compose } from "redux";
import rootReducers from "../Reducer/RootReducer";
import thunk from "redux-thunk";

const middleware = compose(applyMiddleware(thunk), window.__REDUX_DEVTOOLS_EXTENSION__ && window.__REDUX_DEVTOOLS_EXTENSION__());

const storeRedux = createStore(rootReducers, middleware);

export default storeRedux;
