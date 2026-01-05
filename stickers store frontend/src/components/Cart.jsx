import React from "react";
import PageTitle from "./PageTitle";
import { Link } from "react-router-dom";
import { useNavigate } from "react-router-dom";
import emptyCartImage from "../../util/emptycart.png";

export default function Cart() {
  const navigation = useNavigate();

  const handleClick = () => {
    navigation("/home", { state: { username: "madan" } });
  };

  return (
    <div className="min-h-[852px] py-12 font-primary">
      <div className="max-w-4xl mx-auto px-4">
        <PageTitle title="Your Cart" />
        <div className="text-center text-darkbg dark:text-normalbg flex flex-col items-center">
          <p className="max-w-[576px] text-darkbg dark:text-normalbg px-2 mx-auto text-base mb-4">
            Oops... Your cart is empty. Continue shopping
          </p>
          <img
            src={emptyCartImage}
            alt="Empty Cart"
            className="max-w-[300px] mx-auto mb-6 dark:rounded-md"
          />
          <button
            onClick={handleClick}
            className="py-2 px-4 bg-primary dark:bg-dark text-darkbg dark:text-normalbg text-xl font-semibold rounded-sm flex justify-center items-center hover:bg-dark dark:hover:bg-primary transition"
          >
            Back to Products
          </button>
        </div>
      </div>
    </div>
  );
}
