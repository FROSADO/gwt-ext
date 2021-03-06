/*
 * GWT-Ext Widget Library
 * Copyright 2007 - 2008, GWT-Ext LLC., and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
 

package com.gwtext.client.widgets.menu;

import com.google.gwt.core.client.JavaScriptObject;
import com.gwtext.client.widgets.ColorPalette;

/**
 * A menu item that wraps the {@link ColorPalette} component.
 *
 * @author Sanjiv Jivan
 *
 */
public class ColorItem extends Item {

    private static JavaScriptObject configPrototype;

    static {
        init();
    }

    private static native void init()/*-{
        var c = new $wnd.Ext.menu.ColorItem();
        @com.gwtext.client.widgets.menu.ColorItem::configPrototype = c.initialConfig;
    }-*/;


	protected JavaScriptObject getConfigPrototype() {
		return configPrototype;
	}

    /**
     * Create a new ColorItem.
     */
    public ColorItem() {
    }

    protected native JavaScriptObject create(JavaScriptObject config) /*-{
        return new $wnd.Ext.menu.ColorItem(config);    
    }-*/;

    /**
     * Return the CollorPalette associated with the menu item.
     *
     * @return the ColorPalette
     */
    public native ColorPalette getPalette() /*-{
        var ci = this.@com.gwtext.client.widgets.Component::getOrCreateJsObj()();
        return @com.gwtext.client.widgets.ColorPalette::instance(Lcom/google/gwt/core/client/JavaScriptObject;)(ci.palette);
    }-*/;
}