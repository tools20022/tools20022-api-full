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
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification1;
import com.tools20022.repository.msg.NameAndAddress15;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of formats for the identification of a party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice#mmAnyBIC
 * PartyIdentification96Choice.mmAnyBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice#mmProprietaryIdentification
 * PartyIdentification96Choice.mmProprietaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice#mmNameAndAddress
 * PartyIdentification96Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice#mmTaxIdentificationNumber
 * PartyIdentification96Choice.mmTaxIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice#mmNationalRegistrationNumber
 * PartyIdentification96Choice.mmNationalRegistrationNumber}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
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
 * "PartyIdentification96Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of formats for the identification of a party."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.PartyIdentification90Choice
 * PartyIdentification90Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PartyIdentification96Choice", propOrder = {"anyBIC", "proprietaryIdentification", "nameAndAddress", "taxIdentificationNumber", "nationalRegistrationNumber"})
public class PartyIdentification96Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected AnyBICIdentifier anyBIC;
	/**
	 * Identification of the party expressed as a BIC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmAnyBIC
	 * OrganisationIdentification.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice
	 * PartyIdentification96Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AnyBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the party expressed as a BIC."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification90Choice#mmAnyBIC
	 * PartyIdentification90Choice.mmAnyBIC}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAnyBIC = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmAnyBIC;
			componentContext_lazy = () -> PartyIdentification96Choice.mmObject();
			isDerived = false;
			xmlTag = "AnyBIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyBIC";
			definition = "Identification of the party expressed as a BIC.";
			previousVersion_lazy = () -> PartyIdentification90Choice.mmAnyBIC;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AnyBICIdentifier.mmObject();
		}
	};
	protected GenericIdentification1 proprietaryIdentification;
	/**
	 * Unique and unambiguous identifier, as assigned to the party using a
	 * proprietary identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification1
	 * GenericIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice
	 * PartyIdentification96Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier, as assigned to the party using a proprietary identification scheme."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification90Choice#mmProprietaryIdentification
	 * PartyIdentification90Choice.mmProprietaryIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietaryIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> PartyIdentification96Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Unique and unambiguous identifier, as assigned to the party using a proprietary identification scheme.";
			previousVersion_lazy = () -> PartyIdentification90Choice.mmProprietaryIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification1.mmObject();
		}
	};
	protected NameAndAddress15 nameAndAddress;
	/**
	 * Name and address of the party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NameAndAddress15
	 * NameAndAddress15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice
	 * PartyIdentification96Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmAndAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameAndAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name and address of the party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification90Choice#mmNameAndAddress
	 * PartyIdentification90Choice.mmNameAndAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNameAndAddress = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> PartyIdentification96Choice.mmObject();
			isDerived = false;
			xmlTag = "NmAndAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameAndAddress";
			definition = "Name and address of the party.";
			previousVersion_lazy = () -> PartyIdentification90Choice.mmNameAndAddress;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> NameAndAddress15.mmObject();
		}
	};
	protected Max35Text taxIdentificationNumber;
	/**
	 * Number assigned by a tax authority to an entity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmTaxIdentificationNumber
	 * PartyIdentificationInformation.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice
	 * PartyIdentification96Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxIdNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxIdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number assigned by a tax authority to an entity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxIdentificationNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmTaxIdentificationNumber;
			componentContext_lazy = () -> PartyIdentification96Choice.mmObject();
			isDerived = false;
			xmlTag = "TaxIdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxIdentificationNumber";
			definition = "Number assigned by a tax authority to an entity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text nationalRegistrationNumber;
	/**
	 * Number assigned by a national registration authority to an entity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmNationalRegistrationNumber
	 * PartyIdentificationInformation.mmNationalRegistrationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification96Choice
	 * PartyIdentification96Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtlRegnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalRegistrationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number assigned by a national registration authority to an entity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNationalRegistrationNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmNationalRegistrationNumber;
			componentContext_lazy = () -> PartyIdentification96Choice.mmObject();
			isDerived = false;
			xmlTag = "NtlRegnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalRegistrationNumber";
			definition = "Number assigned by a national registration authority to an entity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PartyIdentification96Choice.mmAnyBIC, PartyIdentification96Choice.mmProprietaryIdentification, PartyIdentification96Choice.mmNameAndAddress,
						PartyIdentification96Choice.mmTaxIdentificationNumber, PartyIdentification96Choice.mmNationalRegistrationNumber);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentification96Choice";
				definition = "Choice of formats for the identification of a party.";
				previousVersion_lazy = () -> PartyIdentification90Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AnyBIC", required = true)
	public AnyBICIdentifier getAnyBIC() {
		return anyBIC;
	}

	public void setAnyBIC(AnyBICIdentifier anyBIC) {
		this.anyBIC = anyBIC;
	}

	@XmlElement(name = "PrtryId", required = true)
	public GenericIdentification1 getProprietaryIdentification() {
		return proprietaryIdentification;
	}

	public void setProprietaryIdentification(GenericIdentification1 proprietaryIdentification) {
		this.proprietaryIdentification = proprietaryIdentification;
	}

	@XmlElement(name = "NmAndAdr", required = true)
	public NameAndAddress15 getNameAndAddress() {
		return nameAndAddress;
	}

	public void setNameAndAddress(NameAndAddress15 nameAndAddress) {
		this.nameAndAddress = nameAndAddress;
	}

	@XmlElement(name = "TaxIdNb", required = true)
	public Max35Text getTaxIdentificationNumber() {
		return taxIdentificationNumber;
	}

	public void setTaxIdentificationNumber(Max35Text taxIdentificationNumber) {
		this.taxIdentificationNumber = taxIdentificationNumber;
	}

	@XmlElement(name = "NtlRegnNb", required = true)
	public Max35Text getNationalRegistrationNumber() {
		return nationalRegistrationNumber;
	}

	public void setNationalRegistrationNumber(Max35Text nationalRegistrationNumber) {
		this.nationalRegistrationNumber = nationalRegistrationNumber;
	}
}