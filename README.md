Repo for testing ClojureScript `deps.cljs` tooling.

[Relevant discussion in Google Groups](https://groups.google.com/forum/#!topic/clojurescript/LtFMDxc5D00).

### How to build:

```sh
cd cljs_liba
lein install
cd ../cljs_libb
lein install
cd ../cljs_libc
lein cljsbuild once
```

One can open libc.html after that and check if it behaves correctly.

### What we see:

```
  [org.clojure/clojure "1.6.0"]
  [org.clojure/clojurescript "0.0-2371"]
```

```
Compiling ClojureScript.
Compiling "libc.js" from ["src"]...
Upstream deps.cljs found on classpath. {:externs ["externs.js"]} This is an EXPERIMENTAL FEATURE and is not guarenteed to remain stable in future versions.
Upstream deps.cljs found on classpath. {:externs ["externs.js"]} This is an EXPERIMENTAL FEATURE and is not guarenteed to remain stable in future versions.
Nov 17, 2014 1:16:20 AM com.google.javascript.jscomp.LoggerErrorManager println
SEVERE: ERROR - Duplicate extern input: file:/Users/nprokopov/.m2/repository/cljs_liba/cljs_liba/0.1.0/cljs_liba-0.1.0.jar!/externs.js

Nov 17, 2014 1:16:20 AM com.google.javascript.jscomp.LoggerErrorManager printSummary
WARNING: 1 error(s), 0 warning(s)
ERROR: JSC_DUPLICATE_EXTERN_INPUT. Duplicate extern input: file:/Users/nprokopov/.m2/repository/cljs_liba/cljs_liba/0.1.0/cljs_liba-0.1.0.jar!/externs.js at (unknown source) line (unknown line) : (unknown column)
Successfully compiled "libc.js" in 5.69 seconds.
```

* One SEVERE error `JSC_DUPLICATE_EXTERN_INPUT` in closure compiler).
* Two `EXPERIMENTAL FEATURE` warnings.
* Generated libc.js is empty, and regardless of severe error message says it was `Successfully compiled`.

### What’s expeted:

libc.js should be generated correctly and without warnings.
