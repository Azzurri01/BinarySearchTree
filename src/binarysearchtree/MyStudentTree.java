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
public class MyStudentTree {
    private MyStudentTreeNode root;
    private MyStudentTreeNode left;
    private MyStudentTreeNode right;
    
    public MyStudentTree()
    {
        root=null;
    }
    
    public void insert(String nm)
    {
        root=insert(root, nm);
    }
    
    public MyStudentTreeNode insert(MyStudentTreeNode root, String nm)
    {
        if(root==null)
        {
            root=new MyStudentTreeNode();
            root.setName(nm);
            root.setLeft(null);
            root.setRight(null);  
        }
        
           else if(nm.compareTo(root.getName())<0)
            {
                MyStudentTreeNode leftTree = insert(root.getLeft(), nm);
                root.setLeft(leftTree);
            }
                      else if(nm.compareTo(root.getName())>0)
                        {
                              MyStudentTreeNode rightTree = insert(root.getRight(), nm);
                              root.setRight(rightTree);
                        }
                      /*else if(nm==root.getData())
                      { 
                          root.setCount(root.getCount()+1);
                      }*/
        return root;
    }
    
   public void delete(String nm)
    {
        root=delete(root, nm);
    }
    
    private MyStudentTreeNode del(MyStudentTreeNode r, MyStudentTreeNode p)
    {
        if(r.getRight()!=null)
        {
            r.setRight(del(p, r.getRight()));
            return p;
        }
            else
            {
                p.setName(r.getName());
                r=r.getLeft();
            }
        return r;
    }
    
    private MyStudentTreeNode delete(MyStudentTreeNode t, String nm)
    {
        if(t==null)
        {
            return t;
        }
            else if(nm.compareTo(t.getName())<0)
            {
                root.setLeft(delete(t.getLeft(), nm));
            }
                else if(nm.compareTo(t.getName())>0)
                {
                    root.setRight(delete(t.getRight(), nm));
                }
                    else if(nm.equals(t.getName()))
                    {
                        t.setLeft(del(t, t.getLeft()));     
                    }
        return t;
    }
    
    public void search() 
    {
    
    }
}
