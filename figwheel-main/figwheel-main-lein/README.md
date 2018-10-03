# figwheel-main-lein

## Overview

Example using figwheel-main-template and lein:

`lein new figwheel-main figwheel-main-lein`

```
.
├── README.md
├── dev.cljs.edn
├── project.clj
├── resources
│   └── public
│       ├── css
│       │   └── style.css
│       ├── index.html
│       └── test.html
├── src
│   └── figwheel_main_lein
│       └── core.cljs
├── target
│   └── public
├── test
│   └── figwheel_main_lein
│       ├── core_test.cljs
│       └── test_runner.cljs
└── test.cljs.edn
```

## Development

To get an interactive development environment run:

    lein fig:build

This will auto compile and send all changes to the browser without the
need to reload. After the compilation process is complete, you will
get a Browser Connected REPL. An easy way to try it is:

    (js/alert "Am I connected?")

and you should see an alert in the browser window.

To clean all compiled files:

	lein clean

To create a production build run:

	lein clean
	lein fig:min


## License

Copyright © 2018 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
