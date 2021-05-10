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
    
    public void insert(int value)
    {
        root=insert(root, value);
    }
    
    public MyStudentTreeNode insert(MyStudentTreeNode root, int value)
    {
        if(root==null)
        {
            root=new MyStudentTreeNode();
            root.setData(value);
            root.setLeft(null);
            root.setRight(null);  
        }
        
            else if(value>root.getData())
            {
                //right = new MyStudentTreeNode();
                //right.setData(value);
                //root.setRight(right);
                insert(root.getLeft(), value);
            }
                      else if(value<root.getData())
                        {
                            left = new MyStudentTreeNode();
                            left.setData(value);
                            root.setLeft(left);
                        }
                      else if(value==root.getData())
                      { 
                          root.setCount(root.getCount()+1);
                      }
        return root;
    }
    
    public void delete(int value)
    {
        root=delete(root, value);
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
                p.setData(r.getData());
                r=r.getLeft();
            }
        return r;
    }
    
    private MyStudentTreeNode delete(MyStudentTreeNode t, int value)
    {
        if(t==null)
        {
            return t;
        }
            else if(value<t.getData())
            {
                root.setLeft(delete(t.getLeft(), value));
            }
                else if(value>t.getData())
                {
                    root.setRight(delete(t.getRight(), value));
                }
                    else if(value==t.getData())
                    {
                        t.setLeft(del(t, t.getLeft()));
                          
                    }
        return t;
    }
    
    public void search() 
    {
    
    }
}
