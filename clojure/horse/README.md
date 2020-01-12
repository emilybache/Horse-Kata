# horse-kata

Clojure version using [Midje](https://github.com/marick/Midje/) for testing.

## How to run the tests

`lein midje` will run all tests.

`lein midje :autotest` will run all the tests indefinitely. It sets up a
watcher on the code files. If they change, only the relevant tests will be
run again.

If you want the REPL driven experience:

```
lein repl

user> (use '[midje.repl])
user> (autotest)
```

This behaves like `lein midje :autotest` with the advantages of leaving a REPL running.

