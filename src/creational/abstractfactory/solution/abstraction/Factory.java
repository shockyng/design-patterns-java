package creational.abstractfactory.solution.abstraction;

public interface Factory {
    Transport createMainTransport();
    Transport createSecondaryTransport();
}
