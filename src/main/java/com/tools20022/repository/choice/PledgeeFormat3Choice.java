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
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.Pledgee;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification80;
import com.tools20022.repository.msg.PledgeeTypeAndAnyBICIdentifier1;
import com.tools20022.repository.msg.PledgeeTypeAndText1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between formats for the entity to which the financial instruments are
 * pledged.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PledgeeFormat3Choice#mmTypeAndIdentification
 * PledgeeFormat3Choice.mmTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PledgeeFormat3Choice#mmIdentification
 * PledgeeFormat3Choice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PledgeeFormat3Choice#mmProprietary
 * PledgeeFormat3Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Pledgee Pledgee}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PledgeeFormat3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between formats for the entity to which the financial instruments are pledged."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.PledgeeFormat1Choice
 * PledgeeFormat1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PledgeeFormat3Choice", propOrder = {"typeAndIdentification", "identification", "proprietary"})
public class PledgeeFormat3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TpAndId", required = true)
	protected PledgeeTypeAndAnyBICIdentifier1 typeAndIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PledgeeTypeAndAnyBICIdentifier1
	 * PledgeeTypeAndAnyBICIdentifier1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Pledgee Pledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PledgeeFormat3Choice
	 * PledgeeFormat3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpAndId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeAndIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the entity to which the financial instruments are pledged expressed as a code and a BIC."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PledgeeFormat4Choice#mmTypeAndIdentification
	 * PledgeeFormat4Choice.mmTypeAndIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PledgeeFormat1Choice#mmTypeAndIdentification
	 * PledgeeFormat1Choice.mmTypeAndIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PledgeeFormat3Choice, PledgeeTypeAndAnyBICIdentifier1> mmTypeAndIdentification = new MMMessageAssociationEnd<PledgeeFormat3Choice, PledgeeTypeAndAnyBICIdentifier1>() {
		{
			businessComponentTrace_lazy = () -> Pledgee.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PledgeeFormat3Choice.mmObject();
			isDerived = false;
			xmlTag = "TpAndId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeAndIdentification";
			definition = "Identification of the entity to which the financial instruments are pledged expressed as a code and a BIC.";
			nextVersions_lazy = () -> Arrays.asList(PledgeeFormat4Choice.mmTypeAndIdentification);
			previousVersion_lazy = () -> PledgeeFormat1Choice.mmTypeAndIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PledgeeTypeAndAnyBICIdentifier1.mmObject();
		}

		@Override
		public PledgeeTypeAndAnyBICIdentifier1 getValue(PledgeeFormat3Choice obj) {
			return obj.getTypeAndIdentification();
		}

		@Override
		public void setValue(PledgeeFormat3Choice obj, PledgeeTypeAndAnyBICIdentifier1 value) {
			obj.setTypeAndIdentification(value);
		}
	};
	@XmlElement(name = "Id", required = true)
	protected PledgeeTypeAndText1 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PledgeeTypeAndText1
	 * PledgeeTypeAndText1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Pledgee Pledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PledgeeFormat3Choice
	 * PledgeeFormat3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the entity to which the financial instruments are pledged expressed as a code and a narrative description."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PledgeeFormat4Choice#mmIdentification
	 * PledgeeFormat4Choice.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PledgeeFormat1Choice#mmIdentification
	 * PledgeeFormat1Choice.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PledgeeFormat3Choice, PledgeeTypeAndText1> mmIdentification = new MMMessageAssociationEnd<PledgeeFormat3Choice, PledgeeTypeAndText1>() {
		{
			businessComponentTrace_lazy = () -> Pledgee.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PledgeeFormat3Choice.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the entity to which the financial instruments are pledged expressed as a code and a narrative description.";
			nextVersions_lazy = () -> Arrays.asList(PledgeeFormat4Choice.mmIdentification);
			previousVersion_lazy = () -> PledgeeFormat1Choice.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PledgeeTypeAndText1.mmObject();
		}

		@Override
		public PledgeeTypeAndText1 getValue(PledgeeFormat3Choice obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(PledgeeFormat3Choice obj, PledgeeTypeAndText1 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected GenericIdentification80 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification80
	 * GenericIdentification80}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PledgeeFormat3Choice
	 * PledgeeFormat3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the entity to which the financial instruments are pledged expressed as a proprietary type and narrative description."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PledgeeFormat4Choice#mmProprietary
	 * PledgeeFormat4Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PledgeeFormat1Choice#mmProprietary
	 * PledgeeFormat1Choice.mmProprietary}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PledgeeFormat3Choice, GenericIdentification80> mmProprietary = new MMMessageAssociationEnd<PledgeeFormat3Choice, GenericIdentification80>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.PledgeeFormat3Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Identification of the entity to which the financial instruments are pledged expressed as a proprietary type and narrative description.";
			nextVersions_lazy = () -> Arrays.asList(PledgeeFormat4Choice.mmProprietary);
			previousVersion_lazy = () -> PledgeeFormat1Choice.mmProprietary;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification80.mmObject();
		}

		@Override
		public GenericIdentification80 getValue(PledgeeFormat3Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(PledgeeFormat3Choice obj, GenericIdentification80 value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PledgeeFormat3Choice.mmTypeAndIdentification, com.tools20022.repository.choice.PledgeeFormat3Choice.mmIdentification,
						com.tools20022.repository.choice.PledgeeFormat3Choice.mmProprietary);
				trace_lazy = () -> Pledgee.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PledgeeFormat3Choice";
				definition = "Choice between formats for the entity to which the financial instruments are pledged.";
				previousVersion_lazy = () -> PledgeeFormat1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PledgeeTypeAndAnyBICIdentifier1 getTypeAndIdentification() {
		return typeAndIdentification;
	}

	public PledgeeFormat3Choice setTypeAndIdentification(PledgeeTypeAndAnyBICIdentifier1 typeAndIdentification) {
		this.typeAndIdentification = Objects.requireNonNull(typeAndIdentification);
		return this;
	}

	public PledgeeTypeAndText1 getIdentification() {
		return identification;
	}

	public PledgeeFormat3Choice setIdentification(PledgeeTypeAndText1 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public GenericIdentification80 getProprietary() {
		return proprietary;
	}

	public PledgeeFormat3Choice setProprietary(GenericIdentification80 proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}