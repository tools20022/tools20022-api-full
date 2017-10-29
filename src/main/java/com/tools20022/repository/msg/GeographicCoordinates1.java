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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.Max16Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Location on the Earth specified by two numbers representing vertical and
 * horizontal position.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeographicCoordinates1#Latitude
 * GeographicCoordinates1.Latitude}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeographicCoordinates1#Longitude
 * GeographicCoordinates1.Longitude}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GeographicCoordinates1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Location on the Earth specified by two numbers representing vertical and horizontal position."
 * </li>
 * </ul>
 */
public class GeographicCoordinates1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Latitude measured in degrees, minutes and seconds, following by 'N' for
	 * the north and 'S' for the south of the equator (for example 48°51'29" N
	 * for the Eiffel Tower latitude).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeographicCoordinates1
	 * GeographicCoordinates1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Latitude"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Latitude measured in degrees, minutes and seconds, following by 'N' for the north and 'S' for the south of the equator (for example 48°51'29\" N for the Eiffel Tower latitude)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Latitude = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> GeographicCoordinates1.mmObject();
			isDerived = false;
			xmlTag = "Lat";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Latitude";
			definition = "Latitude measured in degrees, minutes and seconds, following by 'N' for the north and 'S' for the south of the equator (for example 48°51'29\" N for the Eiffel Tower latitude).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	/**
	 * Angular measurement of the distance of a location on the earth east or
	 * west of the Greenwich observatory.<br>
	 * The longitude is measured in degrees, minutes and seconds, following by
	 * 'E' for the east and 'W' for the west (for example 2°17'40" E for the
	 * Eiffel Tower longitude).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeographicCoordinates1
	 * GeographicCoordinates1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Long"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Longitude"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Angular measurement of the distance of a location on the earth east or west of the Greenwich observatory.\r\nThe longitude is measured in degrees, minutes and seconds, following by 'E' for the east and 'W' for the west (for example 2°17'40\" E for the Eiffel Tower longitude)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute Longitude = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> GeographicCoordinates1.mmObject();
			isDerived = false;
			xmlTag = "Long";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Longitude";
			definition = "Angular measurement of the distance of a location on the earth east or west of the Greenwich observatory.\r\nThe longitude is measured in degrees, minutes and seconds, following by 'E' for the east and 'W' for the west (for example 2°17'40\" E for the Eiffel Tower longitude).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeographicCoordinates1.Latitude, com.tools20022.repository.msg.GeographicCoordinates1.Longitude);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "GeographicCoordinates1";
				definition = "Location on the Earth specified by two numbers representing vertical and horizontal position.";
			}
		});
		return mmObject_lazy.get();
	}
}