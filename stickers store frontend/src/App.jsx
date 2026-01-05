import Header from "./components/Header";
import Footer from "./components/footer/Footer";
import React from "react";
import { Outlet } from "react-router-dom";
import { useNavigation } from "react-router-dom";

function App() {
  const navigation = useNavigation();
  
  return (
    <>
      <Header/>
      {navigation.state === "loading"?(
      <div className="flex items-center justify-center min-h-screen">
        <span className="text-5xl font-semibold text-primary dark:text-dark">
        Loading
        </span>
      </div>
      ):(<Outlet/>)}
      <Footer/>
    </>
  );
}

export default App;
