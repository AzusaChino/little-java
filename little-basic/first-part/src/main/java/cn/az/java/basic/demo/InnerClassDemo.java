package cn.az.java.basic.demo;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.concurrent.Callable;

/**
 * 内置类实例
 *
 * @author az
 */
public class InnerClassDemo {

    // Static 块
    static {
        new Runnable() {
            @Override
            public void run() {

            }
        };
    }

    // 实例块
    {
        new Callable<Object>() {
            @Override
            public Object call() {
                return null;
            }
        };
    }

    // 构造器
    public InnerClassDemo() {
        new Comparable<Object>() {

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }

    public static void main(String[] args) {

        // 方法（类或实例）
        PropertyChangeListener listener = new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {

            }
        };
    }

    static class PropertyChangeListenerImpl implements PropertyChangeListener {

        @Override
        public void propertyChange(PropertyChangeEvent evt) {

            new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {

                }

                @Override
                public void keyPressed(KeyEvent e) {

                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            };
        }
    }
}
