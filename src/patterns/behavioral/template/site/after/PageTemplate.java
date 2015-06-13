/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.template.site.after;

/**
 *
 * @author Hany
 */
public abstract class PageTemplate {
    
    public void display() {
        header();
        title();
        body();
        footer();
    }

    private void header() {
        System.out.println("My Demo Web Site");
    }

    protected abstract void title();

    protected abstract void body();

    private void footer() {
        System.out.println("copyright (c)");
    }
    
}
