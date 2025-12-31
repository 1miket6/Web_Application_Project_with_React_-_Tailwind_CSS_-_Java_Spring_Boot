import React from "react";
import PageTitle from "./PageTitle";

export default function PageHeading({ title, children }) {
  return (
    <div className="text-center max-w-[576px] mx-auto px-4 py-6">
      <PageTitle title={title} />
      <p className="font-primary font-extrabold leading-6 text-black">{children}</p>
    </div>
  );
}
