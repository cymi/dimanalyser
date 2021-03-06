/*
 *  Copyright © 2013 Cyril Misev
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.dimanalyser.errors;

/**
 * Error thrown in case a {@link com.dimanalyser.variablemanager.VariableManager#getInstance getInstance} call 
 * attempts to get an instance which is not existing or not accessible in the existing scope or inherited scopes.
 * @author Cyril Misev <c.misev@gmail.com>
 *
 */
public class InstanceNotFoundError extends InterpretationError {
	

	private static final long serialVersionUID = -6086043716684911573L;

	public InstanceNotFoundError(String name) {
		super(String.format("Instance %s was not found",name));
	}
}
