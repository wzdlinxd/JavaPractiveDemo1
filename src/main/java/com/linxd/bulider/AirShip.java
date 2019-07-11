package com.linxd.bulider;


/**
 * Created with IntelliJ IDEA.
 *
 * @author linxd
 * @date 2019/7/11 21:37
 * Description: No Description
 */
public class AirShip {
    private Engine engine;
    private Tower tower;
    private Module module;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tower getTower() {
        return tower;
    }

    public void setTower(Tower tower) {
        this.tower = tower;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }
}

class Engine {
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Module {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Module(String name) {
        this.name = name;
    }
}

class Tower {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tower(String name) {
        this.name = name;
    }
}
