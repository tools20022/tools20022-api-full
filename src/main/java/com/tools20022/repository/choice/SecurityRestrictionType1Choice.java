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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.RestrictionType1Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification40;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between the type of restriction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityRestrictionType1Choice#mmProprietaryRestriction
 * SecurityRestrictionType1Choice.mmProprietaryRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityRestrictionType1Choice#mmRestrictionType
 * SecurityRestrictionType1Choice.mmRestrictionType}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityRestrictionType1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between the type of restriction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecurityRestrictionType1Choice", propOrder = {"proprietaryRestriction", "restrictionType"})
public class SecurityRestrictionType1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected GenericIdentification40 proprietaryRestriction;
	/**
	 * Type of the restriction, for example, selling restriction, buying
	 * restriction, placing restriction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification40
	 * GenericIdentification40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityRestrictionType1Choice
	 * SecurityRestrictionType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryRstrctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryRestriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of the restriction, for example, selling restriction, buying restriction, placing restriction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietaryRestriction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecurityRestrictionType1Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryRstrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryRestriction";
			definition = "Type of the restriction, for example, selling restriction, buying restriction, placing restriction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification40.mmObject();
		}
	};
	protected RestrictionType1Code restrictionType;
	/**
	 * Type of the restriction, for example, selling restriction, buying
	 * restriction, placing restriction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RestrictionType1Code
	 * RestrictionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityRestrictionType1Choice
	 * SecurityRestrictionType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RstrctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of the restriction, for example, selling restriction, buying restriction, placing restriction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRestrictionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecurityRestrictionType1Choice.mmObject();
			isDerived = false;
			xmlTag = "RstrctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionType";
			definition = "Type of the restriction, for example, selling restriction, buying restriction, placing restriction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictionType1Code.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecurityRestrictionType1Choice.mmProprietaryRestriction, SecurityRestrictionType1Choice.mmRestrictionType);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecurityRestrictionType1Choice";
				definition = "Choice between the type of restriction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PrtryRstrctn", required = true)
	public GenericIdentification40 getProprietaryRestriction() {
		return proprietaryRestriction;
	}

	public void setProprietaryRestriction(GenericIdentification40 proprietaryRestriction) {
		this.proprietaryRestriction = proprietaryRestriction;
	}

	@XmlElement(name = "RstrctnTp", required = true)
	public RestrictionType1Code getRestrictionType() {
		return restrictionType;
	}

	public void setRestrictionType(RestrictionType1Code restrictionType) {
		this.restrictionType = restrictionType;
	}
}