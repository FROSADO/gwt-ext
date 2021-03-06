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
 

package com.gwtext.client.widgets.menu.event;

import com.gwtext.client.widgets.menu.CheckItem;

/**
 *
 * @author Sanjiv Jivan
 */
public interface CheckItemListener extends BaseItemListener {

    /**
     * Fires before the checked value is set, providing an opportunity to cancel if needed.
     *
     * @param item    this
     * @param checked the new checked value that will be set
     * @return false to cancel
     */
    boolean doBeforeCheckChange(CheckItem item, boolean checked);

    /**
     * Fires after the checked value has been set.
     *
     * @param item    this
     * @param checked the checked value that was set
     */
    void onCheckChange(CheckItem item, boolean checked);
}
