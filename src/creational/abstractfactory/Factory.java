package creational.abstractfactory;

public interface Factory {
    Transport createMainTransport();
    Transport createSecondaryTransport();
}
