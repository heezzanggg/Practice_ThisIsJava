package ch08_Interface.sec13;

public sealed interface InterfaceA permits InterfaceB {
    void methodA();
}
