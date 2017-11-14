package com.jochoi.datecourses

import org.scalatra._

class DateCoursesServlet extends ScalatraServlet {
  post("/v1/courses") {
    // this route is for creating a new date course
    <p>create a new date course?</p> 
  }
  get("/v1/courses") {
    // this route if for displaying all date courses
    views.html.hello()
  }
  get("/v1/courses/:id") {
    // this route is for displaying a single date course
  }
  put("/v1/courses/:id") {
    // this route is for updating a single date course
  }
  delete("/v1/courses/:id") {
    // this route is for delete a single date course
  }
  get("/") {
    views.html.hello()
  }
}
