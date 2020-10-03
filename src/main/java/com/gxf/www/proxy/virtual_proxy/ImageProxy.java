package com.gxf.www.proxy.virtual_proxy;

import java.net.*;
import java.awt.*;
import javax.swing.*;

class ImageProxy implements Icon {

	/**
	 * 我们希望在加载后显示出来的真正图像
	 */
	volatile ImageIcon imageIcon;
	final URL imageURL;
	Thread retrievalThread;
	boolean retrieving = false;

	/**
	 * 这是我们系统图像锁显示的位置
	 */
	public ImageProxy(URL url) {
		imageURL = url;
	}

	/**
	 * 图像加载后，显示默认的宽和高，转给ImageIcon处理
	 */
	@Override
	public int getIconWidth() {
		if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
			return 800;
		}
	}

	/**
	 * 图像加载后，显示默认的宽和高，转给给ImageIcon处理
	 */
	@Override
	public int getIconHeight() {
		if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
			return 600;
		}
	}
	
	synchronized void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}
     
	@Override
	public void paintIcon(final Component c, Graphics  g, int x, int y) {
		// 如果你已经有icon，就告诉画面自己; 否则，就显示那个加载中的消息
		if (imageIcon != null) {
			imageIcon.paintIcon(c, g, x, y);
		} else {
			g.drawString("Loading album cover, please wait...", x+300, y+190);
			if (!retrieving) {
				// 如果你还没有取出图像，那么就开始取出图像
				retrieving = true;
				// 我们不希望整个用户挂起界面，所以要用多线程咯
				retrievalThread = new Thread(() -> {
					try {

						this.setImageIcon(new ImageIcon(imageURL, "Album Cover"));
						// 当图像准备好时，我们告诉swing，要重新绘制
						c.repaint();
					} catch (Exception e) {
						e.printStackTrace();
					}
				});
				
				retrievalThread.start();
				
			}
		}
	}
}
