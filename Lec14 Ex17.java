import javax.swing.*;
2 import java.awt.*;
3 import java.awt.event.*;
4
5 /**
6 This class displays a drawing panel and a set of
7 check boxes that allow the user to select shapes.
8 The selected shapes are drawn on the drawing panel.
9 */
10
11 public class GraphicsWindow extends JApplet
12 {
13 // Declare an array of check box components
14 private JCheckBox[] checkBoxes;
15
16 // The following titles array contains the
17 // titles of the check boxes.
18 private String[] titles = { "Line", "Rectangle",
19 "Filled Rectangle",
20 "Oval", "Filled Oval",
21 "Arc", "Filled Arc" };
22
23 // The following will reference a panel to contain
24 // the check boxes.
25 private JPanel checkBoxPanel;
26
27 // The following will reference an instance of the
28 // DrawingPanel class. This will be a panel to draw on.
29 private DrawingPanel drawingPanel;

/**
32 init method
33 */
34
35 public void init()
36 {
37 // Build the check box panel.
38 buildCheckBoxPanel();
39
40 // Create the drawing panel.
41 drawingPanel = new DrawingPanel(checkBoxes);
42
43 // Add the check box panel to the east region
44 // and the drawing panel to the center region.
45 add(checkBoxPanel, BorderLayout.EAST);
46 add(drawingPanel, BorderLayout.CENTER);
47 }
48
49 /**
50 The buildCheckBoxPanel method creates the array of
51 check box components and adds them to a panel.
52 */
53
54 private void buildCheckBoxPanel()
55 {
56 // Create the panel.
57 checkBoxPanel = new JPanel();
58 checkBoxPanel.setLayout(new GridLayout(7, 1));
59
60 // Create the check box array.
61 checkBoxes = new JCheckBox[7];
62
63 // Create the check boxes and add them to the panel.
64 for (int i = 0; i < checkBoxes.length; i++)
65 {
66 checkBoxes[i] = new JCheckBox(titles[i]);
67 checkBoxes[i].addItemListener(
68 new CheckBoxListener());
69 checkBoxPanel.add(checkBoxes[i]);
70 }
71 }
72
73 /**
74 A private inner class to respond to changes in the
75 state of the check boxes.
76 */

private class CheckBoxListener implements ItemListener
79 {
80 public void itemStateChanged(ItemEvent e)
81 {
82 drawingPanel.repaint();
83 }
84 }
85 }


