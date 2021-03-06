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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.GeographicCoordinates1#mmLatitude
 * GeographicCoordinates1.mmLatitude}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeographicCoordinates1#mmLongitude
 * GeographicCoordinates1.mmLongitude}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GeographicCoordinates1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Location on the Earth specified by two numbers representing vertical and horizontal position."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GeographicCoordinates1", propOrder = {"latitude", "longitude"})
public class GeographicCoordinates1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Lat", required = true)
	protected Max16Text latitude;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Latitude"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Latitude measured in degrees, minutes and seconds, following by 'N' for the north and 'S' for the south of the equator (for example 48°51'29\" N for the Eiffel Tower latitude)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GeographicCoordinates1, Max16Text> mmLatitude = new MMMessageAttribute<GeographicCoordinates1, Max16Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GeographicCoordinates1.mmObject();
			isDerived = false;
			xmlTag = "Lat";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Latitude";
			definition = "Latitude measured in degrees, minutes and seconds, following by 'N' for the north and 'S' for the south of the equator (for example 48°51'29\" N for the Eiffel Tower latitude).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Max16Text getValue(GeographicCoordinates1 obj) {
			return obj.getLatitude();
		}

		@Override
		public void setValue(GeographicCoordinates1 obj, Max16Text value) {
			obj.setLatitude(value);
		}
	};
	@XmlElement(name = "Long", required = true)
	protected Max16Text longitude;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Longitude"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Angular measurement of the distance of a location on the earth east or west of the Greenwich observatory.\r\nThe longitude is measured in degrees, minutes and seconds, following by 'E' for the east and 'W' for the west (for example 2°17'40\" E for the Eiffel Tower longitude)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GeographicCoordinates1, Max16Text> mmLongitude = new MMMessageAttribute<GeographicCoordinates1, Max16Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.GeographicCoordinates1.mmObject();
			isDerived = false;
			xmlTag = "Long";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Longitude";
			definition = "Angular measurement of the distance of a location on the earth east or west of the Greenwich observatory.\r\nThe longitude is measured in degrees, minutes and seconds, following by 'E' for the east and 'W' for the west (for example 2°17'40\" E for the Eiffel Tower longitude).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Max16Text getValue(GeographicCoordinates1 obj) {
			return obj.getLongitude();
		}

		@Override
		public void setValue(GeographicCoordinates1 obj, Max16Text value) {
			obj.setLongitude(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeographicCoordinates1.mmLatitude, com.tools20022.repository.msg.GeographicCoordinates1.mmLongitude);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GeographicCoordinates1";
				definition = "Location on the Earth specified by two numbers representing vertical and horizontal position.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max16Text getLatitude() {
		return latitude;
	}

	public GeographicCoordinates1 setLatitude(Max16Text latitude) {
		this.latitude = Objects.requireNonNull(latitude);
		return this;
	}

	public Max16Text getLongitude() {
		return longitude;
	}

	public GeographicCoordinates1 setLongitude(Max16Text longitude) {
		this.longitude = Objects.requireNonNull(longitude);
		return this;
	}
}