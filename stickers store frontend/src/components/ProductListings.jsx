import React from "react";
import ProductCard from "./ProductCard";
import Searchbox from "./Searchbox";
import Dropdown from "./Dropdown";
import {useState, useMemo} from "react";

const sortList=["Popularity","Price Low to High", "Price High to Low"]


export default function ProductListings({ products }) {

const [searchText,setSearchText] = useState("");
const [selectedSort,setSelectedSort] = useState("Popularity");

const filteredAndSortedProducts = useMemo(()=> {
    if (!Array.isArray(products)){
      return [];
    }
  let filterProducts = products.filter(
    (product)=>
        product.name.toLowerCase().includes(searchText.toLowerCase()) ||
        product.description.toLowerCase().includes(searchText.toLowerCase())
  );
  
  return filterProducts.slice().sort((a,b) => {
  switch(selectedSort){
  
    case sortList.at(0):
    default:
      return parseInt(b.popularity)-parseInt(a.popularity);
  
    case sortList.at(1):
      return parseFloat(a.price)-parseFloat(b.price);
  
    case sortList.at(2):
      return parseFloat(b.price)-parseFloat(a.price);
}
  });

},[products, searchText, selectedSort]);

function handleSearchChange(inputSearch,event){
  setSearchText(inputSearch);
  }

function handleSortChange(sortType,event){
  setSelectedSort(sortType);
  }

  return (
    <div className="max-w-6xl mx-auto">
      <div className="flex flex-col sm:flex-row justify-between items-center gap-4 pt-12">
        <Searchbox label="Search" placeholder="Search products..." value={searchText} handleSearch={(value)=>handleSearchChange(value)}/>
        <Dropdown label="Sort by" options={sortList} selectedValue={selectedSort} handleSort={(value)=>handleSortChange(value)}/>
      </div>
      
      <div className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 gap-y-8 gap-x-6 py-12">
        {filteredAndSortedProducts.length > 0 ? (
          filteredAndSortedProducts.map((product) => (
            <ProductCard key={product.productId} product={product} />
          ))
        ) : (
          <p className="text-right font-primary font-extrabold text-2xl text-red-500">
            No products found
          </p>
        )}
      </div>
    </div>
  );
}
