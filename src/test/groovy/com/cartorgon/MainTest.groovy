package com.cartorgon

import spock.lang.Specification
import spock.lang.Title
import spock.lang.Unroll

@Title("Tests for Main class")
class MainTest extends Specification {

    @Unroll
    def "Test for sayHello method with String #arg"() {
        when: "sayHello receives #arg"
        def string = Main.sayHello(arg)

        then: "return appropriate string"
        string == expectedResult

        where: "input arg string are"
        arg      || expectedResult
        'Carlos' || 'Hello Carlos!'
        'David'  || 'Hello David!'
        'Oscar'  || 'Hello Oscar!'
        'Jose'   || 'Hello Jose!'
    }

    @Unroll
    def "Test for sayHello method with int #arg"() {
        when: "sayHello receives #arg"
        def string = Main.sayHello(arg)

        then: "return appropriate string"
        string == expectedResult

        where: "input arg string are"
        arg || expectedResult
        1   || 'Hello 1!'
        2   || 'Hello 2!'
        3   || 'Hello 3!'
        4   || 'Hello 4!'
    }
}
