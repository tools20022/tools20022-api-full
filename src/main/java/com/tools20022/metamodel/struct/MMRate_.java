/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMRate;
import com.tools20022.metamodel.struct.MMDecimal_;
import java.util.Optional;

public interface MMRate_ extends MMDecimal_ {

	/**
	 * specifies the ratio between the base value and the actual value
	 */
	MetamodelAttribute<MMRate, Double> baseValue = newAttribute();
	/**
	 * specifies unit code required to qualify this rate
	 */
	MetamodelAttribute<MMRate, Optional<String>> baseUnitCode = newAttribute();
}