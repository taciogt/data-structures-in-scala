package lists

import org.scalatest.FunSuite


class LinkedListTest extends FunSuite {
  test("LinkedList.cube"){
    assert(LinkedList.cube(3) === 27)
  }
}