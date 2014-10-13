import javax.swing.JFrame;

/**
 * Allows you to see all of your wonderfully drawn objects 
 * 
 * @author Nikhil Sivapatham
 * @version 10/10/14
 */
public class CityScapeViewer
{
    /**
     * Creates the frame and a component, and adds the component to the Frame. Creates
     * an infinite loop where it resets after seven phases that each last 1 second, and pass a 
     * different phase to the component
     */
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(600,600);
        frame.setTitle("Cityscape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CityScapeComponent component = new CityScapeComponent();
        frame.add(component);

        frame.setVisible(true);
        while (true) {
            for (int phaseCount = 1;phaseCount<7;phaseCount++) {
                try {
                    component.getPhase(phaseCount);
                    Thread.sleep(1000);
                    frame.repaint();
                }
                catch (InterruptedException ex) {

                    ex.printStackTrace();

                }

            }
        }

    }

}
