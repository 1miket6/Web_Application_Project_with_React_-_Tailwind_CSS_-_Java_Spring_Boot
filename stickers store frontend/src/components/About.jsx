import React from "react";
import PageTitle from "./PageTitle";

export default function About() {
  const mainStyle = "text-lg font-semibold text-primary dark:text-dark mb-2";
  const subStyle = "text-darkbg dark:text-normalbg";

  return (
    <div className="max-w-[1152px] min-h-[852px] mx-auto px-6 py-8 font-primary">
      <PageTitle title="About Us" />
      {/* About Us Content */}
      <p className="leading-6 mb-8 text-darkbg dark:text-normalbg">
        <span className="text-lg font-semibold text-primary dark:text-dark">
          Stickers
        </span>{" "}
        store is an initiative by{" "}
        <span className="text-lg font-semibold text-primary dark:text-dark">
          Designs by Stickers
        </span>
        , dedicated to offering you the most sought-after stickers and posters!
      </p>

      {/* Why Choose Us Section */}
      <h2 className="text-2xl leading-[32px] font-bold text-primary dark:text-dark mb-6">
        Why Choose Us?
      </h2>

      {/* Features */}
      <div className="space-y-8">
        {/* Feature: Premium Quality */}
        <div>
          <h3 className={mainStyle}>Premium Quality</h3>
          <p className={subStyle}>
            We strive to provide every customer with the utmost satisfaction by
            delivering high-quality vinyl stickers crafted with care and
            precision.
          </p>
        </div>

        {/* Feature: Product Innovation */}
        <div>
          <h3 className={mainStyle}>Product Innovation</h3>
          <p className={subStyle}>
            Our vinyl stickers feature a premium matte or glossy finish
            lamination and are made with advanced adhesive technology. Designed
            to withstand all weather conditions and resist scratches, our
            stickers are gentle enough to preserve the surface of your beloved
            gadgets.
          </p>
        </div>

        {/* Feature: Excellent Service */}
        <div>
          <h3 className={mainStyle}>Excellent Service</h3>
          <p className={subStyle}>
            Customer satisfaction is our top priority, and we’re committed to
            delivering an exceptional shopping experience.
          </p>
        </div>

        {/* Feature: Designs You’ll Love */}
        <div>
          <h3 className={mainStyle}>Designs You’ll Love</h3>
          <p className={subStyle}>
            With over 1,000 designs, our collection ranges from relatable and
            seriously funny to delightfully quirky. And we’re just getting
            started—stay tuned for more exciting products and designs!
          </p>
        </div>
      </div>
    </div>
  );
}
