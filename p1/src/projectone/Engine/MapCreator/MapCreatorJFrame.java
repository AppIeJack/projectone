/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectone.Engine.MapCreator;

import com.sun.glass.events.KeyEvent;
import java.awt.Dimension;
import projectone.game.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import projectone.Engine.Employer;
import projectone.Engine.GameJFrame;
import projectone.Engine.TRendering2D;

/**
 *
 * @author Snowdrop
 */
public class MapCreatorJFrame extends GameJFrame {
            DialogWHJFrame dialogNew, dialogResize;
            TileChooserJFrame dialogTile;
            boolean canPaint, paintLine;
   
    public MapCreatorJFrame() {
        dialogResize = new DialogWHJFrame();
        dialogNew = new DialogWHJFrame();
        canPaint = false;
        paintLine = false;
        dialogTile = new TileChooserJFrame();
        dialogTile.setVisible(true);
        initComponents();
    }       //конструктор

    public void paint(Graphics g) {
        if(canPaint) {
            Image iTempMap = TRendering2D.DrawMap(room, screenPosition, this);
            TRendering2D.DrawUnit(room, screenPosition, this, iTempMap);
            //<editor-fold defaultstate="collapsed" desc="swing elements repaint">
           jLabelTileID.repaint();
        jLabelTilePos.repaint();
       jMenuBar1.repaint();
       jMenuItemLoad.repaint();
    jMenuItemNew.repaint();
    jMenuItemRefresh.repaint();
    jMenuItemResize.repaint();
    jMenuItemSave.repaint();
        jTextFieldTileID.repaint();
        //</editor-fold>
            iTempMap.getGraphics().drawImage(tiles[wTID()].getTileImage(), jLabelTileID.getX() + 10, jLabelTileID.getY( ), this);
            iTempMap.getGraphics().drawImage(units[wUID()].getImage(), labelUID.getX() + 10, labelUID.getY( ), this);
            iTempMap.getGraphics().drawImage(cursor, cursorTile.x * 64 - screenPosition.width, cursorTile.y * 64 - screenPosition.height, this);
            g.drawImage(iTempMap, 0, 0, this);
        }
    }   //рендер итоговой картинки
    
    /** This method is called from wthin the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */ 
    @SuppressWarnings("unchecked")                                                                //система
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jLabelTilePos = new javax.swing.JLabel();
        jLabelTileID = new javax.swing.JLabel();
        jTextFieldTileID = new javax.swing.JTextField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        textFieldPath = new java.awt.TextField();
        labelUID = new java.awt.Label();
        textFieldUID = new java.awt.TextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItemNew = new javax.swing.JMenuItem();
        jMenuItemSave = new javax.swing.JMenuItem();
        jMenuItemLoad = new javax.swing.JMenuItem();
        jMenuEdit = new javax.swing.JMenu();
        jMenuItemResize = new javax.swing.JMenuItem();
        jMenuItemRefresh = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

        jDialog1.setResizable(false);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jDialog2.setResizable(false);

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        setForeground(jLabelTileID.getForeground());
        setPreferredSize(new java.awt.Dimension(800, 600));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabelTilePos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTilePos.setText("Current Tile Coordinates(X, Y)");
        jLabelTilePos.setName("CurrentTile"); // NOI18N

        jLabelTileID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTileID.setText("Tile ID ");
        jLabelTileID.setName("labelTileID"); // NOI18N
        jLabelTileID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTileIDMouseClicked(evt);
            }
        });

        jTextFieldTileID.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextFieldTileID.setText("0");
        jTextFieldTileID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldTileID.setName("textBoxTileID"); // NOI18N
        jTextFieldTileID.setPreferredSize(new java.awt.Dimension(60, 28));
        jTextFieldTileID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldTileIDKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTileIDKeyReleased(evt);
            }
        });

        jInternalFrame1.setBorder(null);
        jInternalFrame1.setEnabled(false);
        jInternalFrame1.setVisible(false);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        textFieldPath.setBackground(new java.awt.Color(255, 255, 255));
        textFieldPath.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textFieldPath.setForeground(new java.awt.Color(0, 0, 0));
        textFieldPath.setText("D:\\\\1");

        labelUID.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelUID.setText("UnitID");

        textFieldUID.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textFieldUID.setText("0");
        textFieldUID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldUIDKeyPressed(evt);
            }
        });

        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuFile.setText("File");
        jMenuFile.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jMenuFile.setName("jMenuFile"); // NOI18N

        jMenuItemNew.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItemNew.setText("New");
        jMenuItemNew.setName("jMenuItemNew"); // NOI18N
        jMenuItemNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNewActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemNew);

        jMenuItemSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItemSave.setText("Save");
        jMenuItemSave.setName("jMenuItemSave"); // NOI18N
        jMenuItemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSaveActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemSave);

        jMenuItemLoad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItemLoad.setText("Load");
        jMenuItemLoad.setName("jMenuItemLoad"); // NOI18N
        jMenuItemLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLoadActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemLoad);

        jMenuBar1.add(jMenuFile);

        jMenuEdit.setText("Edit");
        jMenuEdit.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N

        jMenuItemResize.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItemResize.setText("Resize");
        jMenuItemResize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemResizeActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuItemResize);

        jMenuItemRefresh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItemRefresh.setText("Refresh");
        jMenuItemRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRefreshActionPerformed(evt);
            }
        });
        jMenuEdit.add(jMenuItemRefresh);

        jMenuBar1.add(jMenuEdit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(textFieldPath, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTileID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTileID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldUID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                        .addComponent(jLabelTilePos)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textFieldPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 375, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTilePos)
                        .addComponent(jLabelTileID)
                        .addComponent(jTextFieldTileID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelUID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldUID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //события задания размера карты: клик по New,  клик по resize
    private void jMenuItemNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNewActionPerformed
        dialogNew.boolDialogResult = false;
        dialogNew.setVisible(true); 
        screenPosition = new Dimension(0, 0);
    }//GEN-LAST:event_jMenuItemNewActionPerformed
    private void jMenuItemResizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemResizeActionPerformed
       dialogResize.boolDialogResult = false;
       dialogResize.setVisible(true);
       screenPosition = new Dimension(0, 0);
    }//GEN-LAST:event_jMenuItemResizeActionPerformed
    //Применения результатов диалогов New и Resize
    private void jMenuItemRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRefreshActionPerformed
        // <editor-fold defaultstate="collapsed" desc="create new map">
        if(dialogNew.boolDialogResult)//working
       {
           dialogNew.boolDialogResult = false;
           canPaint = true;
           game = true;
           int[][] grnd = new int[dialogNew.getNewWidth()][dialogNew.getNewHeight()];	
           for(int x = 0;  x < grnd.length; x++)		
                for(int y = 0; y < grnd[x].length; y++)	
                    grnd[x][y] = (int)Math.abs(Math.random() * tiles.length);
           room = new Room(new Map(grnd));                                                              //end of creating map
       }
        //</editor-fold>
        // <editor-fold defaultstate="collapsed" desc="resize map">
       if(dialogResize.boolDialogResult)//twerking
       {
           dialogResize.boolDialogResult = false;
           int[][] grnd = new int[dialogResize.getNewWidth()][dialogResize.getNewHeight()];	
           if(grnd.length < room.map.ground.length || grnd[0].length < room.map.ground[0].length) //уменьшение
            for(int x = 0;  (x < grnd.length); x++)                                                                                                         //карты 
                for(int y = 0; (y < grnd[0].length); y++)	
                    grnd[x][y] = room.map.ground[x][y];
           if(grnd.length > room.map.ground.length || grnd[0].length > room.map.ground[0].length) {//увеличение
             int i = 0, j = 0;
          for(i = 0;  i < room.map.ground.length; i++)                                                                                     //карты
                for(j = 0; j < room.map.ground[0].length; j++)	
                    grnd[i][j] = room.map.ground[i][j];
          for(;  i < grnd.length; i++)                                                                                     //карты
                for(; j < grnd[0].length; j++)
                    grnd[i][j] = (int)(Math.random() * tiles.length);
           }
           room.map.ground = grnd;                                                              //end of creating map
       }
       //</editor-fold>
       screenPosition = new Dimension(0, 0);
    }//GEN-LAST:event_jMenuItemRefreshActionPerformed
    
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        jLabelTilePos.setText("[" + cursorTile.x + ", " + cursorTile.y +"]");
        if(paintLine) changeTile();
    }//GEN-LAST:event_formMouseMoved
    //закрашивание карты тайлом при клике
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        System.out.println("smth has clicked on map!");
        System.out.println("button = " + evt.getButton());
        if(evt.getButton() == MouseEvent.BUTTON1)
            changeTile();
    
        if(evt.getButton() == MouseEvent.BUTTON3){
            System.out.println("rmb clicked");
            changeUnit();
        }
    }//GEN-LAST:event_formMouseClicked
    //включение рисованя линией
    private void jTextFieldTileIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTileIDKeyPressed
        paintLine = true;
    }//GEN-LAST:event_jTextFieldTileIDKeyPressed
    //отключение рисования линией
    private void jTextFieldTileIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTileIDKeyReleased
        paintLine = false;
    }//GEN-LAST:event_jTextFieldTileIDKeyReleased
    //сериализация
    private void jMenuItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSaveActionPerformed
        room.saveMap(PathToFile());

    }//GEN-LAST:event_jMenuItemSaveActionPerformed

//десериализация
    private void jMenuItemLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLoadActionPerformed
        timer.stop();
        room.loadMap(PathToFile());
        canPaint = true;
        game = true;
        screenPosition = new Dimension(0,0);
        timer.start();
    }//GEN-LAST:event_jMenuItemLoadActionPerformed



    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
                jTextFieldTileID.setText(String.valueOf(dialogTile.tileID));

    }//GEN-LAST:event_formWindowGainedFocus
    private void jLabelTileIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTileIDMouseClicked
        // TODO add your handling code here:
        dialogTile.setVisible(true);
    }//GEN-LAST:event_jLabelTileIDMouseClicked

    private void textFieldUIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldUIDKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_DELETE) room.units[cursorTile.x][cursorTile.y] = null;
    }//GEN-LAST:event_textFieldUIDKeyPressed
    private String PathToFile() {
        return textFieldPath.getText() + ".p1map";
    }
   //замена тайла под курсором на выбранный
    private void changeTile() {
        room.map.ground[cursorTile.x][cursorTile.y] = wTID();
    }
    private void changeUnit() {
        room.units[cursorTile.x][cursorTile.y] = new UnitDescription(units[wUID()].ud);
    }
    //возращает id тайла кисти
    private int wTID() {
        return Employer.convertToInteger(jTextFieldTileID.getText());
    }
    private int wUID(){
        return Employer.convertToInteger(textFieldUID.getText());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTileID;
    private javax.swing.JLabel jLabelTilePos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEdit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItemLoad;
    private javax.swing.JMenuItem jMenuItemNew;
    private javax.swing.JMenuItem jMenuItemRefresh;
    private javax.swing.JMenuItem jMenuItemResize;
    private javax.swing.JMenuItem jMenuItemSave;
    private javax.swing.JTextField jTextFieldTileID;
    private java.awt.Label labelUID;
    private java.awt.TextField textFieldPath;
    private java.awt.TextField textFieldUID;
    // End of variables declaration//GEN-END:variables


}
