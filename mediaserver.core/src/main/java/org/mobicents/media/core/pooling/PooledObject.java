/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2016, Telestax Inc and individual contributors
 * by the @authors tag. 
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
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

package org.mobicents.media.core.pooling;

/**
 * Represents an object that is managed by a resource pool.<br>
 * The pool is responsible for
 * 
 * 
 * @author Henrique Rosa (henrique.rosa@telestax.com)
 *
 */
public interface PooledObject {

    /**
     * Check-in the object in the pool, resetting its internal state.
     */
    void checkIn();

    /**
     * Check-out the object in the pool, initializing its internal state.
     */
    void checkOut();

}
