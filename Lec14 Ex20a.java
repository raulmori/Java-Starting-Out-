import javax.swing.*;
 2 import java.awt.event.*;
 3 import java.awt.*;
 4
 5 /**
 6 This applet demonstrates how mouse events and mouse
 7 motion events can be handled. It lets the user draw
 8 boxes by dragging the mouse.
 9 */
10
11 public class DrawBoxes extends JApplet
12 {
13 private int currentX = 0; // Mouse cursor's X position
14 private int currentY = 0; // Mouse cursor's Y position
15 private int width = 0; // The rectangle's width


private int height = 0; // The rectangle's height
17
18 /**
19 init method
20 */
21
22 public void init()
23 {
24 // Add a mouse listener and a mouse motion listener.
25 addMouseListener(new MyMouseListener());
26 addMouseMotionListener(new MyMouseMotionListener());
27 }
28
29 /**
30 paint method
31 @param g The applet's Graphics object.
32 */
33
34 public void paint(Graphics g)
35 {
36 // Call the superclass's paint method.
37 super.paint(g);
38
39 // Draw a rectangle.
40 g.drawRect(currentX, currentY, width, height);
41 }
42
43 /**
44 Mouse listener class
45 */
46
47 private class MyMouseListener
48 implements MouseListener
49 {
50 public void mousePressed(MouseEvent e)
51 {
52 // Get the mouse cursor coordinates.
53 currentX = e.getX();
54 currentY = e.getY();
55 }
56
57 //
58 // The following methods are unused, but still
59 // required by the MouseListener interface.
60 //
61
62 public void mouseClicked(MouseEvent e)
63 {


65
66 public void mouseReleased(MouseEvent e)
67 {
68 }
69
70 public void mouseEntered(MouseEvent e)
71 {
72 }
73
74 public void mouseExited(MouseEvent e)
75 {
76 }
77 }
78
79 /**
80 Mouse Motion listener class
81 */
82
83 private class MyMouseMotionListener
84 implements MouseMotionListener
85 {
86 public void mouseDragged(MouseEvent e)
87 {
88 // Calculate the size of the rectangle.
89 width = e.getX() - currentX;
90 height = e.getY() - currentY;
91
92 // Repaint the window.
93 repaint();
94 }
95
96 /**
97 The mouseMoved method is unused, but still
98 required by the MouseMotionListener interface.
99 */
100
101 public void mouseMoved(MouseEvent e)
102 {
103 }
104 }
105 }
