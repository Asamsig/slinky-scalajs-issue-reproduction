# Reproduction of issue

I was unable to reproduce the issue, in my current [codebase](https://github.com/Asamsig/next-slinky-example).


It seems that it happens because `SmallestModules` splits up a lot of the standard scala/java library, and the issue disappears once most of it ends up in java.lang.Object.js.

The error is I get is `ReferenceError: $j_java$002elang$002eClass is not defined`, and it seems to be resolved, when removing the Class Component, I'm guessing the Class Component takes in some Java/Scala code, that ends up calling the standard library, and it then fails because of odd linking issues with `SmallestModules`.

## Steps to reproduce

You need to:

-   Install the javascript libraries:

    > npm install

-   Create the bundle (in a separate terminal):

    > sbt

    > \> ~fastLinkJS
    
    or just

    > \> fastLinkJS

-   Run Next.js dev server:

    > npm run dev
    
    or 
    
    > npm run build


The issue disappears if you delete the file [HomeComponent](src/main/scala/pages/HomeComponent.scala) or if you compile the Scala.js code with `fullLinkJS` (you might have to restart the dev server), also remember to clean before building, since the project uses the same output directory for `fastLinkJS` and `fullLinkJS`.