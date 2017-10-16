<h3>SOLUTION TO SCALA 99 PROBLEMS</h3>
<p>Solutions to the problems Listedin the <a href="http://aperiodic.net/phil/scala/s-99/">scala99</a> website</p>


<h4>List of solution</h4>
<ol>
<!--<li><a href="https://github.com/knp069/scala99/blob/master/src/main/scala/q1.scala"></a></li>-->
    <li>
        <a href="https://github.com/knp069/scala99/blob/master/src/main/scala/q01.scala">Find the last element of a List</a>
        <p>Example:<br>
           scala> last(List(1, 1, 2, 3, 5, 8))<br>
           res0: Int = 8<br>
    </li>
    <li>
        <a href="https://github.com/knp069/scala99/blob/master/src/main/scala/q02.scala">Find the last but one element of the List</a>
        <p>Example:<br>
           scala> secondLast(List(1, 1, 2, 3, 5, 8))<br>
           res0: Int = 5<br>
        </p>
    </li>
    <li>
        <a href="https://github.com/knp069/scala99/blob/master/src/main/scala/q03.scala">Find the K<sup>th</sup> element of the List</a>
        <p>Example:<br>
           scala> nth(2, List(1, 1, 2, 3, 5, 8))<br>
           res0: Int = 2
        </p>
    </li>
    <li>
        <a href="https://github.com/knp069/scala99/blob/master/src/main/scala/q04.scala">Find the number of element of the List</a>
        <p>Example:<br>
            scala> length(List(1, 1, 2, 3, 5, 8))<br>
            res0: Int = 6
        </p>
    </li>
    <li>
        <a href="https://github.com/knp069/scala99/blob/master/src/main/scala/q05.scala">Reverse a List</a>
        <p>
            Example:<br>
            scala> reverse(List(1, 1, 2, 3, 5, 8))<br>
            res0: List[Int] = List(8, 5, 3, 2, 1, 1)
        </p>
    </li>
    <li>
        <a href="https://github.com/knp069/scala99/blob/master/src/main/scala/q06.scala">Find whether a List is a plindrome</a>
        <p>Example:<br>
           scala> isPalindrome(List(1, 2, 3, 2, 1))<br>
           res0: Boolean = true
        </p>
    </li>
    <li>
        <a href="https://github.com/knp069/scala99/blob/master/src/main/scala/q07.scala">Flatten a nested list structure</a>
        <p>
        Example:<br>
        scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))<br>
        res0: List[Any] = List(1, 1, 2, 3, 5, 8)<br>
        </p>
    </li>
    <li>
        <a href="https://github.com/knp069/scala99/blob/master/src/main/scala/q08.scala">Eliminate consecutive duplicates od list element</a>
        <p>
            If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.<br>
            Example:<br>
            scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))<br>
            res0: List\[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)<br>
        </p>
    </li>
    <li>
        <a href="https://github.com/knp069/scala99/blob/master/src/main/scala/q09.scala">Pack consecutive duplicates of list elements into sublists</a>
        <p>If a list contains repeated elements they should be placed in separate sublists.<br>
            Example:<br>
           scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))<br>
           res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
        </p>
    </li>
    <li>
        <a href="https://github.com/knp069/scala99/blob/master/src/main/scala/q10.scala">Run-length encoding of a list</a>
        <p>Use the result of problem q9 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
           <br>Example:<br> 
           scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
           <br>res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
        </p>
    </li>
    <li>
        <a href="https://github.com/knp069/scala99/blob/master/src/main/scala/q11.scala">Modified run-length encoding</a>
        <p>
            <br>Modify the result of problem q10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.
            <br>Example:
            <br>scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
            <br>res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
        </p>
    </li>
    <li>
        <a href="https://github.com/knp069/scala99/blob/master/src/main/scala/q12.scala">Decode a run-length encoded list</a>
        <p>
            Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
            <br>Example:
            <br>scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
            <br>res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
        </p>
    </li>
</ol>