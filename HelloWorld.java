
package com.di.maven;


/**
 * Spring bean
 *
 */
public class HelloWorld {
    private String name;

    public void setName(String name) {
         this.name = name;

}


public void printHello() {
    System.out.printIn("Hello !" + name);

 }

}
