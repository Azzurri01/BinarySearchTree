/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binarysearchtree;

/**
 *
 * @author djohanne
 */
public class MyStudentTreeNode {
    private String name;
    private MyStudentTreeNode left;
    private MyStudentTreeNode right;
    
    public MyStudentTreeNode()
    {
    }
    
   public void setName(String inName)
   {
       name=inName;
   }
   
   public void setLeft(MyStudentTreeNode inLeft)
   {
       left=inLeft;
   }
   
   public void setRight(MyStudentTreeNode inRight)
   {
       right=inRight;
   }
   
   public String getName()
   {
       return name;
   }
   
   public MyStudentTreeNode getLeft()
   {
       return left;
   }
   
   public MyStudentTreeNode getRight()
   {
       return right;
   }
   
   @Override
   public String toString()
   {
       return "Name: " + name;
   }
}
