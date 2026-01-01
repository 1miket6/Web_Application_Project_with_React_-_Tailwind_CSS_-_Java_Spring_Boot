import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faHeart } from "@fortawesome/free-solid-svg-icons";

export default function Footer() {
  return ( //text-center text-lg font-primary font-bold text-primary py-2
    <footer className="flex justify-center items-center py-4 mt-4 font-primary text-lg text-darkbg dark:text-normalbg">
      Built with
      <FontAwesomeIcon
        icon={faHeart}
        className="text-red-700 mx-1 animate-pulse scale-200 size-10"
        aria-hidden="true"
      />
      by
      <a
        href="https://stickers.com/"
        target="_blank"
        rel="noreferrer"
        className="text-primary dark:text-dark font-extrabold px-1 transition-colors duration-300 hover:text-2xl"
      >
        Stickers
      </a>
    </footer>
  );
}
