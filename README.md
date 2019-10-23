Checkout system
=======================================
## intro
### 2017
Back in 2017 I implemented pretty much same exercise https://bitbucket.org/mcichocki/orangeapplestore/src/master/. 
These were my first steps in Scala, but at the end I got the job so must have been software good enough. 
What I worked on later were components related to https://github.com/hmrc/customs-declarations 
(at some point we migrated to public github, hence commit history can be reviewed for reference https://github.com/cichockimc?tab=overview&from=2017-01-01&to=2018-12-31)

### 2019
Since it is second implementation, I paid a bit more attention to details. Maybe even over engineered few bits and did not apply YAGNI principle

## assumptions
- Currency is GBP
- input is at least close to reasonably valid (no potential overflow attacks prevention, gazzilion megabytes long strings etc)

## compile and run tests with coverage and checkstyle
```./test.sh```

## compile only
reason: scoverage instrumentation breaks running tests from Intellij Idea
```./nocoverage.sh```

## notes
- for clarity, merge commit strategy has been used.
- Test coverage 100% . I am aware it is just a number, in more complex solutions it does not imply all scenarios were tested. If given more time I'd consider mutation testing.
