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
 
package com.gwtext.client.widgets.event;

import com.gwtext.client.core.EventObject;
import com.gwtext.client.widgets.Resizable;

/**
 *
 * @author Sanjiv Jivan
 */
public interface ResizableListener {

    /**
     * Fires event before the resize.
     *
     * @param self this
     * @param e    the event object
     * @return false to prevent the resize
     */
    boolean doBeforeResize(Resizable self, EventObject e);

    /**
     * Fires when the element is resized.
     *
     * @param self   this
     * @param width  the new width
     * @param height the new height
     */
    void onResize(Resizable self, int width, int height);
}
