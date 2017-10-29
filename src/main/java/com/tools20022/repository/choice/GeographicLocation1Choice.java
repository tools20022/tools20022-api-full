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
import com.tools20022.repository.msg.GeographicCoordinates1;
import com.tools20022.repository.msg.UTMCoordinates1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.choice.GeographicLocation1Choice#GeographicCoordinates
 * GeographicLocation1Choice.GeographicCoordinates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeographicLocation1Choice#UTMCoordinates
 * GeographicLocation1Choice.UTMCoordinates}</li>
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
public class GeographicLocation1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Location on the earth specified by two numbers representing vertical and
	 * horizontal position.
	 * <p>
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
	public static final MMMessageAssociationEnd GeographicCoordinates = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> GeographicLocation1Choice.mmObject();
			isDerived = false;
			xmlTag = "GeogcCordints";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeographicCoordinates";
			definition = "Location on the earth specified by two numbers representing vertical and horizontal position.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GeographicCoordinates1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Location on the earth specified by the Universal Transverse Mercator
	 * coordinate system, using the WGS84 geodesic system.
	 * <p>
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
	public static final MMMessageAssociationEnd UTMCoordinates = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> GeographicLocation1Choice.mmObject();
			isDerived = false;
			xmlTag = "UTMCordints";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UTMCoordinates";
			definition = "Location on the earth specified by the Universal Transverse Mercator coordinate system, using the WGS84 geodesic system.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> UTMCoordinates1.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.GeographicLocation1Choice.GeographicCoordinates, com.tools20022.repository.choice.GeographicLocation1Choice.UTMCoordinates);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "GeographicLocation1Choice";
				definition = "Geographic location of the ATM specified by geographic coordinates or UTM coordinates.";
			}
		});
		return mmObject_lazy.get();
	}
}