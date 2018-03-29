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
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityRestrictionType1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between the type of restriction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityRestrictionType2Choice
 * SecurityRestrictionType2Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityRestrictionType1Choice", propOrder = {"proprietaryRestriction", "restrictionType"})
public class SecurityRestrictionType1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrtryRstrctn", required = true)
	protected GenericIdentification40 proprietaryRestriction;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityRestrictionType2Choice#mmProprietaryRestriction
	 * SecurityRestrictionType2Choice.mmProprietaryRestriction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityRestrictionType1Choice, GenericIdentification40> mmProprietaryRestriction = new MMMessageAttribute<SecurityRestrictionType1Choice, GenericIdentification40>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityRestrictionType1Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryRstrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryRestriction";
			definition = "Type of the restriction, for example, selling restriction, buying restriction, placing restriction.";
			nextVersions_lazy = () -> Arrays.asList(SecurityRestrictionType2Choice.mmProprietaryRestriction);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification40.mmObject();
		}

		@Override
		public GenericIdentification40 getValue(SecurityRestrictionType1Choice obj) {
			return obj.getProprietaryRestriction();
		}

		@Override
		public void setValue(SecurityRestrictionType1Choice obj, GenericIdentification40 value) {
			obj.setProprietaryRestriction(value);
		}
	};
	@XmlElement(name = "RstrctnTp", required = true)
	protected RestrictionType1Code restrictionType;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityRestrictionType2Choice#mmRestrictionType
	 * SecurityRestrictionType2Choice.mmRestrictionType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityRestrictionType1Choice, RestrictionType1Code> mmRestrictionType = new MMMessageAttribute<SecurityRestrictionType1Choice, RestrictionType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityRestrictionType1Choice.mmObject();
			isDerived = false;
			xmlTag = "RstrctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionType";
			definition = "Type of the restriction, for example, selling restriction, buying restriction, placing restriction.";
			nextVersions_lazy = () -> Arrays.asList(SecurityRestrictionType2Choice.mmRestrictionType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictionType1Code.mmObject();
		}

		@Override
		public RestrictionType1Code getValue(SecurityRestrictionType1Choice obj) {
			return obj.getRestrictionType();
		}

		@Override
		public void setValue(SecurityRestrictionType1Choice obj, RestrictionType1Code value) {
			obj.setRestrictionType(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityRestrictionType1Choice.mmProprietaryRestriction, com.tools20022.repository.choice.SecurityRestrictionType1Choice.mmRestrictionType);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecurityRestrictionType1Choice";
				definition = "Choice between the type of restriction.";
				nextVersions_lazy = () -> Arrays.asList(SecurityRestrictionType2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification40 getProprietaryRestriction() {
		return proprietaryRestriction;
	}

	public SecurityRestrictionType1Choice setProprietaryRestriction(GenericIdentification40 proprietaryRestriction) {
		this.proprietaryRestriction = Objects.requireNonNull(proprietaryRestriction);
		return this;
	}

	public RestrictionType1Code getRestrictionType() {
		return restrictionType;
	}

	public SecurityRestrictionType1Choice setRestrictionType(RestrictionType1Code restrictionType) {
		this.restrictionType = Objects.requireNonNull(restrictionType);
		return this;
	}
}