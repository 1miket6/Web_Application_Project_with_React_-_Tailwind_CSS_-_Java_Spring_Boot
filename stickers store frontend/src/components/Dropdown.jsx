import React from 'react'

export default function Dropdown({label, options, selectedValue, handleSort}) {
  return (
    <div className='flex items-center gap-2 justify-end pr-12 flex-1 font-primary'>
        <label className='text-lg font-semibold text-primary dark:text-dark'>{label}</label>
        <select className="px-3 py-2 text-base border rounded-md transition border-primary dark:border-dark focus:ring focus:ring-dark dark:focus:ring-primary focus:outline-none text-darkbg dark:text-normalbg" 
         value={selectedValue}
         onChange={(event)=>handleSort(event.target.value)}>
            {options.map((optionVal,index)=> (
                <option key={index} value={optionVal}>{optionVal}</option>
                ))}
        </select>
    </div>
  );
}
