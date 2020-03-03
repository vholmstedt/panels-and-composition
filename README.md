# panels-and-composition
The code can be discussed in terms of the composition mechanism

Look at MultipleColorsPanel. Can we say that the class owns 10 instances of RandomColorPanel?

We can program each instance through getComponent(n), since each component has a composition relationship with the Container super class. 

There is a composition, but it remains to be beteween superclasses, while RandomColorPanel attributes and messages are accessible through the type conversion syntax.

If you want to use getBackground, you don't even need to type convert, since the message is already declared and defined in  Container class.

 