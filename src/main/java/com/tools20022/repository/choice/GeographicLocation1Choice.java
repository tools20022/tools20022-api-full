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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GeographicCoordinates1;
import com.tools20022.repository.msg.UTMCoordinates1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Geographic location of the ATM specified by geographic coordinates or UTM
 * coordinates.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeographicLocation1Choice#mmGeographicCoordinates
 * GeographicLocation1Choice.mmGeographicCoordinates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeographicLocation1Choice#mmUTMCoordinates
 * GeographicLocation1Choice.mmUTMCoordinates}</li>
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
 * "GeographicLocation1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Geographic location of the ATM specified by geographic coordinates or UTM coordinates."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GeographicLocation1Choice", propOrder = {"geographicCoordinates", "uTMCoordinates"})
public class GeographicLocation1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GeogcCordints", required = true)
	protected GeographicCoordinates1 geographicCoordinates;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GeographicCoordinates1
	 * GeographicCoordinates1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.GeographicLocation1Choice
	 * GeographicLocation1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GeogcCordints"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeographicCoordinates"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location on the earth specified by two numbers representing vertical and horizontal position."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GeographicLocation1Choice, GeographicCoordinates1> mmGeographicCoordinates = new MMMessageAssociationEnd<GeographicLocation1Choice, GeographicCoordinates1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.GeographicLocation1Choice.mmObject();
			isDerived = false;
			xmlTag = "GeogcCordints";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeographicCoordinates";
			definition = "Location on the earth specified by two numbers representing vertical and horizontal position.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GeographicCoordinates1.mmObject();
		}

		@Override
		public GeographicCoordinates1 getValue(GeographicLocation1Choice obj) {
			return obj.getGeographicCoordinates();
		}

		@Override
		public void setValue(GeographicLocation1Choice obj, GeographicCoordinates1 value) {
			obj.setGeographicCoordinates(value);
		}
	};
	@XmlElement(name = "UTMCordints", required = true)
	protected UTMCoordinates1 uTMCoordinates;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UTMCoordinates1
	 * UTMCoordinates1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.GeographicLocation1Choice
	 * GeographicLocation1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UTMCordints"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UTMCoordinates"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location on the earth specified by the Universal Transverse Mercator coordinate system, using the WGS84 geodesic system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GeographicLocation1Choice, UTMCoordinates1> mmUTMCoordinates = new MMMessageAssociationEnd<GeographicLocation1Choice, UTMCoordinates1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.GeographicLocation1Choice.mmObject();
			isDerived = false;
			xmlTag = "UTMCordints";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UTMCoordinates";
			definition = "Location on the earth specified by the Universal Transverse Mercator coordinate system, using the WGS84 geodesic system.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UTMCoordinates1.mmObject();
		}

		@Override
		public UTMCoordinates1 getValue(GeographicLocation1Choice obj) {
			return obj.getUTMCoordinates();
		}

		@Override
		public void setValue(GeographicLocation1Choice obj, UTMCoordinates1 value) {
			obj.setUTMCoordinates(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.GeographicLocation1Choice.mmGeographicCoordinates, com.tools20022.repository.choice.GeographicLocation1Choice.mmUTMCoordinates);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GeographicLocation1Choice";
				definition = "Geographic location of the ATM specified by geographic coordinates or UTM coordinates.";
			}
		});
		return mmObject_lazy.get();
	}

	public GeographicCoordinates1 getGeographicCoordinates() {
		return geographicCoordinates;
	}

	public GeographicLocation1Choice setGeographicCoordinates(GeographicCoordinates1 geographicCoordinates) {
		this.geographicCoordinates = Objects.requireNonNull(geographicCoordinates);
		return this;
	}

	public UTMCoordinates1 getUTMCoordinates() {
		return uTMCoordinates;
	}

	public GeographicLocation1Choice setUTMCoordinates(UTMCoordinates1 uTMCoordinates) {
		this.uTMCoordinates = Objects.requireNonNull(uTMCoordinates);
		return this;
	}
}