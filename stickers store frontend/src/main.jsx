import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import "./index.css";
import App from "./App.jsx";
import { createBrowserRouter, RouterProvider } from "react-router-dom";
import Home from "./components/Home.jsx";
import About from "./components/About.jsx";
import Contact from "./components/Contact.jsx";
import Login from "./components/Login.jsx";
import Cart from "./components/Cart.jsx";
import Errorpage from "./components/Errorpage.jsx";


const appRouter = createBrowserRouter([
  {
    path: "/",
    element: <App/>,
    errorElement:<Errorpage/>,          //define at parent is the best coz the same error page
    children:[
   {
      index: true,
      element: <Home/>
    },
    {
    path: "/home",
    element: <Home/>
    },
   {
    path: "/about",
    element: <About/>
    },
   {
    path: "/contact",
    element: <Contact/>
    },
   {
    path: "/Login",
    element: <Login/>
    },
   {
    path: "/cart",
    element: <Cart/>
    }
    ]}
])

createRoot(document.getElementById("root")).render(
  <StrictMode>
    <RouterProvider router={appRouter}/>
  </StrictMode>
);
