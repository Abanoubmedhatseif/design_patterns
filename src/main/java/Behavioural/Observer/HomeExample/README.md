# Observer Pattern

## Overview
The Observer Pattern defines a one-to-many dependency between objects so that when one object (the Subject) changes state, all its dependents (Observers) are notified and updated automatically.

## Key Components

### Subject Interface
Defines methods for:
- Registering observers
- Removing observers
- Notifying observers of changes

### Observer Interface
Defines the update method that gets called when the Subject changes.

### Concrete Subject
- Maintains a list of observers
- Implements methods to register/remove observers
- Notifies observers when its state changes

### Concrete Observer
- Implements the Observer interface
- Defines the action to take when notified

## Implementation Example: Home Notification System

In this example, a doorbell (Subject) notifies household members (Observers) when it rings.

```java
// When the doorbell rings, everyone in the house gets notified
DoorBell doorBell = new DoorBell();
        
Observer abanoub = new Person("Abanoub");
Observer mariam = new Person("Mariam");
        
doorBell.registerObserver(abanoub);
doorBell.registerObserver(mariam);
        
doorBell.press(); // Both Abanoub and Mariam will be notified
```

## When to Use the Observer Pattern

Use this pattern when:
- An object's state change affects multiple other objects
- You need a one-to-many dependency that's more flexible than a hard-coded notification system
- You want to decouple objects so they can vary independently
- You need to notify an unknown number of objects

## Real-World Applications

1. **Event Handling Systems**
    - UI components notify listeners when buttons are clicked

2. **Publish-Subscribe Systems**
    - News publishers notify subscribers when new content is available

3. **MVC Architecture**
    - Model notifies Views when data changes

4. **Distributed Systems**
    - Services notify clients about state changes

## Benefits

- **Loose Coupling**: Subjects don't need to know anything about observers except that they implement the Observer interface
- **Dynamic Relationships**: Observers can be added or removed at runtime
- **Broadcast Communication**: A single change can update multiple observers

## Drawbacks

- **Unexpected Updates**: Observers might be notified in an unpredictable order
- **Memory Leaks**: If observers aren't properly removed, they might prevent garbage collection
- **Cascading Updates**: One update could trigger a chain reaction of additional updates

## Related Patterns

- **Mediator Pattern**: Uses a central mediator instead of direct observer-subject communication
- **Command Pattern**: Can be used to encapsulate the update action
- **Singleton Pattern**: Often used for subjects that should exist as only one instance

## Java's Built-in Support

Java provides built-in support through:
- `java.util.Observable` class (deprecated in Java 9)
- `java.util.Observer` interface (deprecated in Java 9)
- Event listener patterns in Swing and JavaFX

## Example Code Explanation

In our implementation:
1. The `Subject` interface defines the core communication methods
2. The `Observer` interface defines how to receive updates
3. `DoorBell` maintains a list of registered observers and notifies them when pressed
4. `Person` implements the observer interface to respond to notifications

This simple but effective implementation demonstrates the essential aspects of the Observer pattern.