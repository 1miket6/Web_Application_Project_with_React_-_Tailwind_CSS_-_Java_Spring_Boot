import React from "react";
import Price from "./Price";

export default function ProductCard({ product }) {
  return (
    <div className="w-72 rounded-md mx-auto border border-dark dark:border-primary shadow-md overflow-hidden flex flex-col hover:border-primary dark:hover:border-dark transition">
      <div className="relative w-full h-72 border-b border-black dark:border-white">
        <img
          src={product.imageUrl}
          alt={product.name}
          className="w-full h-full object-cover transition-transform duration-500 ease-in-out hover:scale-150"
        />
      </div>
      <div className="relative h-48 p-4 flex flex-col font-primary">
        <h2 className="text-xl font-extrabold text-primary dark:text-dark mb-2">
          {product.name}
        </h2>
        <p className="text-base font-bold text-darkbg dark:text-normalbg mb-4">{product.description}</p>
        <div className="flex items-center justify-between mt-auto">
          <div className="flex bg-bg dark:bg-bg2 text-primary dark:text-dark font-extrabold text-sm py-2 px-4 rounded-tl-lg">
            <Price currency="$" price={product.price} />
          </div>
        </div>
      </div>
    </div>
  );
}
