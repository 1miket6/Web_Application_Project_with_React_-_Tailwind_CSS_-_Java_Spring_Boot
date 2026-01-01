import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faShoppingBasket, faTags , faSun, faMoon} from "@fortawesome/free-solid-svg-icons";
import { useEffect, useState } from "react";
import { Link, NavLink } from "react-router-dom";

export default function Header() {
  
  const [theme, setTheme] = useState(()=>{
    return localStorage.getItem("theme") === "dark" ? "dark" : "light"; //session storage would be gone after browser closed.
  });

useEffect(()=>{
  if (theme === "dark"){
    document.documentElement.classList.add("dark");}
  else {
    document.documentElement.classList.remove("dark");}

},[theme]);

  const toggleTheme = () => {setTheme((prevTheme)=>{
    
    const newTheme = prevTheme === "light"?"dark":"light";
    localStorage.setItem("theme", newTheme);
    return newTheme;});
  };

  const navLinkClass =
    "text-center text-lg font-primary font-bold text-primary py-2 dark:text-dark hover:text-dark dark:hover:text-primary";
  return (
    <header className="border-4 border-black sticky top-0 z-20 bg-bg dark:bg-bg2">
      <div className="flex items-center justify-between mx-auto max-w-6xl px-6 py-4">
        <NavLink to="/" className={navLinkClass}>
          <FontAwesomeIcon icon={faTags} className="h-8 w-8" />
          <span className="font-extrabold text-3xl hover:text-dark duration-500 transition-colors">Stickers</span>
        </NavLink>
        <nav className="flex items-center py-2 z-10">
          <button className="flex items-center justify-center mx-3 w-8 h-8 rounded-full border border-primary dark:border-dark transition duration-300 hover:bg-black dark:hover:bg-white"
            aria-label="Toggle theme"
            onClick={toggleTheme}
            >
            <FontAwesomeIcon icon={theme === "dark"?faMoon:faSun} className="w-4 h-4 dark:text-dark text-primary"/>
          </button>
          <ul className="flex space-x-6">
            <li>
              <NavLink  to="/home"
                        className={({isActive}) =>                    //single line no need to return
                          isActive? `underline ${navLinkClass}`:navLinkClass
                        }>
                Home
              </NavLink>
            </li>
            <li>
              <NavLink  to="/about"
                        className={({isActive}) =>                    //single line no need to return
                          isActive? `underline ${navLinkClass}`:navLinkClass
                        }>
                About
              </NavLink>
            </li>
            <li>
              <NavLink  to="/contact"
                        className={({isActive}) =>                    //single line no need to return
                          isActive? `underline ${navLinkClass}`:navLinkClass
                        }>
                Contact
              </NavLink>
            </li>
            <li>
              <NavLink  to="/login"
                        className={({isActive}) =>                    //single line no need to return
                          isActive? `underline ${navLinkClass}`:navLinkClass
                        }>
                Login
              </NavLink>
            </li>
            <li>
              <NavLink to="/cart" className="text-primary py-2">
                <FontAwesomeIcon icon={faShoppingBasket}  className="dark:text-dark"/>
              </NavLink>
            </li>
          </ul>
        </nav>
      </div>
    </header>
  );
}

// export default Header;
