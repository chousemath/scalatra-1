package com.jochoi.datecourses

import org.scalatra.test.scalatest._
import org.scalatest.FunSuiteLike

class DateCoursesServletTests extends ScalatraSuite with FunSuiteLike {

  addServlet(classOf[DateCoursesServlet], "/*")

  test("GET / on DateCoursesServlet should return status 200"){
    get("/"){
      status should equal (200)
    }
  }

}
