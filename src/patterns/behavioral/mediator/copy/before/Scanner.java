/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.mediator.copy.before;

/**
 *
 * @author Hany
 */
public interface Scanner extends IODevice {
    void scan();
    void setComputer(Computer computer);
}
