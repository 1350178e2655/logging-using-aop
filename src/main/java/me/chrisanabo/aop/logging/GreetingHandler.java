package me.chrisanabo.aop.logging;

import me.chrisanabo.aop.logging.annotation.LogEntryExit;

import java.time.temporal.ChronoUnit;

public class GreetingHandler {

  @LogEntryExit(showArgs = true, showResult = true, unit = ChronoUnit.MILLIS)
  public String greet(String name) {
    return "Hello, " + resolveName(name) + "!";
  }

  @LogEntryExit(showArgs = true, showResult = true, unit = ChronoUnit.MILLIS)
  private String resolveName(String name) {
    return !name.isBlank() ? name : "world";
  }

  public String resolveNothing(String randomString) {
    return "All good, nothing to resolve!";
  }
}
