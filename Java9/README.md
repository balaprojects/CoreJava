# Java 9

>Features introduced in Java 9
<img src="https://github.com/balaprojects/images/blob/master/Java9_Features.png" width="600" height="400">

1. **Private Method**
<br>Multiple Default method's common code can be extracted to private method.
2. **Private Static Method**
<br>When common code is shared between static methods then private static method can be used.
3. **Try With Resources**
<br>Now autocloseable resources can be created outsite and its reference alone can be passed inside try() to autoclose the resource.
4. **UnModifiable Collections**
<br>List.of(), Set.of(), Map.of() are used to create unmodifiable collections.
5. **@SafeVarargs**
<br>When varargs are used on a method we generally get a warning related to heap pollution.
<br>To suppress the warning @SafeVarargs is used and it was allowed on only static and final methods. Starting Java 9 it is allowed on private methods also.
6. **Streaming API new methods**
<br>takeWhile() - The circuit opens the moment predicate inside takeWhile becomes false,
<br>dropWhile() - The circuit closes the moment predicate inside dropWhile become false,
<br>Stream.OfNullable()

