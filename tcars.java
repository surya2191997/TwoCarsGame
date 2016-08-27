import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class tcars extends Frame implements KeyListener{



Cars cars;
static double rand1;
static double rand2;
static double rand3;
static double rand4;
static double rand2i;
static double rand4i;
static double rand4j;
static double rand2j;
static int C=250;


public static void main(String[] args)
{
tcars frame=new tcars();
}

public tcars(){
    super();
    addKeyListener(this);
    this.setSize(new Dimension(200, 300));
         this.setTitle("2cars");
         
         this.cars=new Cars(25,250,105,250);
         add(cars);
         this.setVisible(true);
         while(true){
         cars.repaint();

for(int i=0;i<C;i++)
  for(int j=0;j<C;j++)
    for(int g=0;g<C;g++)
      for(int l=0;l<C;l++);
      
    

        }

}



  public void keyPressed(KeyEvent ev){
          int key=ev.getKeyCode();
          if(key==KeyEvent.VK_A)
          {
          cars.x=25;
          cars.repaint();
          }
           else if(key==KeyEvent.VK_D)
          {
          cars.x=60;
          cars.repaint();
          }
           else if(key==KeyEvent.VK_LEFT)
          {
          cars.p=105;
          cars.repaint();
          }
            else if(key==KeyEvent.VK_RIGHT)
          {
          cars.p=145;
          cars.repaint();
          }
  






  }
      
     public void keyReleased(KeyEvent ev){}
     public void keyTyped(KeyEvent ev){}





        class Cars extends JPanel{
        public Color t;
        public int x,y,p,q,k,l,v1,v2,v3,v4;
               public void paintComponent(Graphics g){
           setBackground(Color.white);
            g.setColor(Color.red);
            g.fillRect(x,y,25,25);
            g.setColor(Color.blue);           
            g.fillRect(p,q,25,25);
            
           
            
if(rand1<0.33)
            {
            g.setColor(Color.black);
            g.fillRect(k,v1,25,25);
            v1++;
            if(v1==300){v1=0;rand1=Math.random();}
            }
if(0.66>rand1&&rand1>=0.33)      
            {
            g.setColor(Color.white);
            g.fillRect(k,v1,0,0);
            v1++;
            if(v1==300){v1=0;rand1=Math.random();}
            }
if(rand1>=0.66)
            {
            g.setColor(Color.black);
            g.fillOval(k,v1,25,25);
            v1++;
            if(y==v1&&x==k)C--;
            if(v1==300){v1=0;rand1=Math.random();rand2i=Math.random();}
            }
if(rand2<0.33)
            {
              if(rand1<0.33)
              {
                
                if(rand2i>=0.5)
                  {
                    g.setColor(Color.white);
                    g.fillRect(k+40,v2,0,0);
                    v2++;
                    if(v2==300){v2=0;rand2=Math.random();}}
                  else if(rand2i<0.5)
                      {
                      g.setColor(Color.black);
                      g.fillOval(k+40,v2,25,25);
                      v2++;
                      if(y==v1&&x==k)C=C--;
                      if(v2==300){v2=0;rand2=Math.random();}
                      }

                  }
            
              else {
                 g.setColor(Color.black);
                 g.fillRect(k+40,v2,25,25);
                 v2++;
                 if(v2==300){v2=0;rand2=Math.random();}
                   }
            }
if(0.66>rand2&&rand2>=0.33)      
            {
            g.setColor(Color.white);
            g.fillRect(k+40,v2,0,0);
            v2++;
            if(v2==300){v2=0;rand2=Math.random();rand2j=Math.random();}
            }
if(rand2>=0.66)      
            {
              if(rand1>=0.66)
           {
if(rand2j>=0.5)
{
 g.setColor(Color.black);
                 g.fillRect(k+40,v2,25,25);
                 v2++;
                 if(v2==300){v2=0;rand2=Math.random();}

}
  else if(rand2j<0.5)
  {
             g.setColor(Color.white);
            g.fillRect(k+40,v2,0,0);
            v2++;
            if(v2==300){v2=0;rand2=Math.random();rand2j=Math.random();}
  }         
           

           }
            



else{
            g.setColor(Color.black);
            g.fillOval(k+40,v2,25,25);
            v2++;
            if(y==v2&&x==k+40)C--;
            if(v2==300){v2=0;rand2=Math.random();}
            }
            }
if(rand3<0.33)
            {
            g.setColor(Color.black);
            g.fillRect(k+80,v3,25,25);
            v3++;
            if(v3==300){v3=0;rand3=Math.random();}
            }
if(0.66>rand3&&rand3>=0.33)      
            {
            g.setColor(Color.white);
            g.fillRect(k+80,v3,0,0);
            v3++;
            if(v3==300){v3=0;rand3=Math.random();}
            }
if(rand3>=0.66)      
            {
            g.setColor(Color.black);
            g.fillOval(k+80,v3,25,25);
            v3++;
            if(q==v3&&p==k+80)C--;
            if(v3==300){v3=0;rand3=Math.random();rand4i=Math.random();}
            }
if(rand4<0.33)
            {
              if(rand3<0.33)
              {
              
              if(rand4i>=0.5)
              {
            g.setColor(Color.white);
            g.fillRect(k+120,v4,0,0);
            v4++;
            if(v4==300){v4=0;rand4=Math.random();}
              }
              else if(rand4i<0.5)
              {
            g.setColor(Color.black);
            g.fillOval(k+120,v4,25,25);
            v4++;
            if(q==v4&&x==k+120)C--;
            if(v4==300){v4=0;rand4=Math.random();}
                }
              }
            else{
            g.setColor(Color.black);
            g.fillRect(k+120,v4,25,25);
            v4++;
            if(v4==300){v4=0;rand4=Math.random();}
            }
            }
if(0.66>rand4&&rand4>=0.33)      
            {
            g.setColor(Color.white);
            g.fillRect(k+120,v4,0,0);
            v4++;
            if(v4==300){v4=0;rand4=Math.random();rand4j=Math.random();}
            }
if(rand4>=0.66)      
            {
           if(rand3>=0.66)
           {

if(rand4j>=0.5)
{
  g.setColor(Color.white);
            g.fillRect(k+120,v4,0,0);
            v4++;
            if(v4==300){v4=0;rand4=Math.random();rand4j=Math.random();}
}
else if(rand4j<0.5)
{
            g.setColor(Color.black);
            g.fillRect(k+120,v4,25,25);
            v4++;
            if(v4==300){v4=0;rand4=Math.random();}
}

           
           }
else{
            g.setColor(Color.black);
            g.fillOval(k+120,v4,25,25);
            v4++;
            if(q==v4&&p==k+120)C--;
            if(v4==300){v4=0;rand4=Math.random();}
            }
            }
 }
     
        
    
     public Cars(int a,int b,int c,int d)         
    {
      super();
      x=a;
      y=b;
      p=c;
      q=d;
      k=x;
      l=p;
      v1=0;
      v2=0;
      v3=0;
      v4=0;
    rand1=Math.random();
    rand2=Math.random();
    rand3=Math.random();
    rand4=Math.random();
    rand2i=Math.random();
    rand2j=Math.random();
    rand4i=Math.random();
    rand4j=Math.random();
    }
  
}

}
    
    
