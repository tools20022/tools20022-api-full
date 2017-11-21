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
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Location on the Earth specified by the Universal Transverse Mercator
 * coordinate system, using the WGS84 geodesic system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.UTMCoordinates1#mmUTMZone
 * UTMCoordinates1.mmUTMZone}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UTMCoordinates1#mmUTMEastward
 * UTMCoordinates1.mmUTMEastward}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UTMCoordinates1#mmUTMNorthward
 * UTMCoordinates1.mmUTMNorthward}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UTMCoordinates1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Location on the Earth specified by the Universal Transverse Mercator coordinate system, using the WGS84 geodesic system."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "UTMCoordinates1", propOrder = {"UTMZone", "UTMEastward", "UTMNorthward"})
public class UTMCoordinates1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max16Text uTMZone;
	/**
	 * UTM grid zone combination of the longitude zone (1 to 60) and the
	 * latitude band, C to X, excluding I and O (for example Eiffel tower UTM
	 * zone is 31U).
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
	 * {@linkplain com.tools20022.repository.msg.UTMCoordinates1
	 * UTMCoordinates1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UTMZone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UTMZone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UTM grid zone combination of the longitude zone (1 to 60) and the latitude band, C to X, excluding I and O (for example Eiffel tower UTM zone is 31U)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUTMZone = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UTMCoordinates1.mmObject();
			isDerived = false;
			xmlTag = "UTMZone";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UTMZone";
			definition = "UTM grid zone combination of the longitude zone (1 to 60) and the latitude band, C to X, excluding I and O (for example Eiffel tower UTM zone is 31U).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	protected Number uTMEastward;
	/**
	 * X-coordinate of the Universal Transverse Mercator coordinate system in
	 * meters (for example 448 265m for Eiffel Tower X-coordinate).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UTMCoordinates1
	 * UTMCoordinates1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UTMEstwrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UTMEastward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "X-coordinate of the Universal Transverse Mercator coordinate system in meters (for example 448 265m for Eiffel Tower X-coordinate)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUTMEastward = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UTMCoordinates1.mmObject();
			isDerived = false;
			xmlTag = "UTMEstwrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UTMEastward";
			definition = "X-coordinate of the Universal Transverse Mercator coordinate system in meters (for example 448 265m for Eiffel Tower X-coordinate).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number uTMNorthward;
	/**
	 * Y-coordinate of the Universal Transverse Mercator coordinate system (for
	 * example 5 411 920m for Eiffel Tower Y-coordinate).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UTMCoordinates1
	 * UTMCoordinates1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UTMNrthwrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UTMNorthward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Y-coordinate of the Universal Transverse Mercator coordinate system (for example 5 411 920m for Eiffel Tower Y-coordinate)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUTMNorthward = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UTMCoordinates1.mmObject();
			isDerived = false;
			xmlTag = "UTMNrthwrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UTMNorthward";
			definition = "Y-coordinate of the Universal Transverse Mercator coordinate system (for example 5 411 920m for Eiffel Tower Y-coordinate).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(UTMCoordinates1.mmUTMZone, UTMCoordinates1.mmUTMEastward, UTMCoordinates1.mmUTMNorthward);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UTMCoordinates1";
				definition = "Location on the Earth specified by the Universal Transverse Mercator coordinate system, using the WGS84 geodesic system.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "UTMZone", required = true)
	public Max16Text getUTMZone() {
		return uTMZone;
	}

	public void setUTMZone(Max16Text uTMZone) {
		this.uTMZone = uTMZone;
	}

	@XmlElement(name = "UTMEstwrd", required = true)
	public Number getUTMEastward() {
		return uTMEastward;
	}

	public void setUTMEastward(Number uTMEastward) {
		this.uTMEastward = uTMEastward;
	}

	@XmlElement(name = "UTMNrthwrd", required = true)
	public Number getUTMNorthward() {
		return uTMNorthward;
	}

	public void setUTMNorthward(Number uTMNorthward) {
		this.uTMNorthward = uTMNorthward;
	}
}