```
AutomationCheckbox check = window.getCheckbox(0);
check.toggle();

try {
  ToggleState state = check.getToggleState();
  logger.info("State: " + state);
} catch (Exception ex) {
  logger.info("Failed to get toggle state");
}
```