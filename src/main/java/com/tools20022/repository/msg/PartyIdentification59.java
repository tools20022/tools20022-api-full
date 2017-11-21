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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.ClearingSystemIdentification2Choice;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.datatype.Max34Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of a party. The party can be identified by providing the
 * party's name and optionally, the BIC, account number, address, clearing
 * system identification or LEI can also be provided.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification59#mmPartyName
 * PartyIdentification59.mmPartyName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification59#mmAnyBIC
 * PartyIdentification59.mmAnyBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification59#mmAccountNumber
 * PartyIdentification59.mmAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification59#mmAddress
 * PartyIdentification59.mmAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification59#mmClearingSystemIdentification
 * PartyIdentification59.mmClearingSystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification59#mmLegalEntityIdentifier
 * PartyIdentification59.mmLegalEntityIdentifier}</li>
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
 * "PartyIdentification59"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of a party. The party can be identified by providing the party's name and optionally, the BIC, account number, address, clearing system identification or LEI can also be provided."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PartyIdentification59", propOrder = {"partyName", "anyBIC", "accountNumber", "address", "clearingSystemIdentification", "legalEntityIdentifier"})
public class PartyIdentification59 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max34Text partyName;
	/**
	 * Identification of the party expressed as the party's name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max34Text
	 * Max34Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification59
	 * PartyIdentification59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the party expressed as the party's name."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartyName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> PartyIdentification59.mmObject();
			isDerived = false;
			xmlTag = "PtyNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyName";
			definition = "Identification of the party expressed as the party's name.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max34Text.mmObject();
		}
	};
	protected PartyIdentification44 anyBIC;
	/**
	 * Identification of the party expressed as a BIC and an optional
	 * alternative identifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification44
	 * PartyIdentification44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmAnyBIC
	 * OrganisationIdentification.mmAnyBIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification59
	 * PartyIdentification59}</li>
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
	 * definition} =
	 * "Identification of the party expressed as a BIC and an optional alternative identifier."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAnyBIC = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmAnyBIC;
			componentContext_lazy = () -> PartyIdentification59.mmObject();
			isDerived = false;
			xmlTag = "AnyBIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyBIC";
			definition = "Identification of the party expressed as a BIC and an optional alternative identifier.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification44.mmObject();
		}
	};
	protected Max34Text accountNumber;
	/**
	 * Identification of the party's account number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max34Text
	 * Max34Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountPartyRole#mmAccount
	 * AccountPartyRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification59
	 * PartyIdentification59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the party's account number."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountPartyRole.mmAccount;
			componentContext_lazy = () -> PartyIdentification59.mmObject();
			isDerived = false;
			xmlTag = "AcctNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountNumber";
			definition = "Identification of the party's account number.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max34Text.mmObject();
		}
	};
	protected Max105Text address;
	/**
	 * Identification of the party's address.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification59
	 * PartyIdentification59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Adr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Address"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the party's address."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAddress = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> PartyIdentification59.mmObject();
			isDerived = false;
			xmlTag = "Adr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Address";
			definition = "Identification of the party's address.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};
	protected ClearingSystemIdentification2Choice clearingSystemIdentification;
	/**
	 * Choice of a clearing system identifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification2Choice
	 * ClearingSystemIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmClearingSystemMemberIdentificationType
	 * OrganisationIdentification.mmClearingSystemMemberIdentificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification59
	 * PartyIdentification59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrSysId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Choice of a clearing system identifier."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearingSystemIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmClearingSystemMemberIdentificationType;
			componentContext_lazy = () -> PartyIdentification59.mmObject();
			isDerived = false;
			xmlTag = "ClrSysId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystemIdentification";
			definition = "Choice of a clearing system identifier.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ClearingSystemIdentification2Choice.mmObject();
		}
	};
	protected LEIIdentifier legalEntityIdentifier;
	/**
	 * Identification of the Legal Entity Identifier. This is a code allocated
	 * to a party as described in ISO 17442
	 * "Financial Services - Legal Entity Identifier (LEI)".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification59
	 * PartyIdentification59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglNttyIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalEntityIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the Legal Entity Identifier. This is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\"."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegalEntityIdentifier = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> OrganisationIdentification.mmObject();
			componentContext_lazy = () -> PartyIdentification59.mmObject();
			isDerived = false;
			xmlTag = "LglNttyIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalEntityIdentifier";
			definition = "Identification of the Legal Entity Identifier. This is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PartyIdentification59.mmPartyName, PartyIdentification59.mmAnyBIC, PartyIdentification59.mmAccountNumber, PartyIdentification59.mmAddress,
						PartyIdentification59.mmClearingSystemIdentification, PartyIdentification59.mmLegalEntityIdentifier);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentification59";
				definition = "Identification of a party. The party can be identified by providing the party's name and optionally, the BIC, account number, address, clearing system identification or LEI can also be provided.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PtyNm")
	public Max34Text getPartyName() {
		return partyName;
	}

	public void setPartyName(Max34Text partyName) {
		this.partyName = partyName;
	}

	@XmlElement(name = "AnyBIC")
	public PartyIdentification44 getAnyBIC() {
		return anyBIC;
	}

	public void setAnyBIC(com.tools20022.repository.msg.PartyIdentification44 anyBIC) {
		this.anyBIC = anyBIC;
	}

	@XmlElement(name = "AcctNb")
	public Max34Text getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Max34Text accountNumber) {
		this.accountNumber = accountNumber;
	}

	@XmlElement(name = "Adr")
	public Max105Text getAddress() {
		return address;
	}

	public void setAddress(Max105Text address) {
		this.address = address;
	}

	@XmlElement(name = "ClrSysId")
	public ClearingSystemIdentification2Choice getClearingSystemIdentification() {
		return clearingSystemIdentification;
	}

	public void setClearingSystemIdentification(ClearingSystemIdentification2Choice clearingSystemIdentification) {
		this.clearingSystemIdentification = clearingSystemIdentification;
	}

	@XmlElement(name = "LglNttyIdr")
	public LEIIdentifier getLegalEntityIdentifier() {
		return legalEntityIdentifier;
	}

	public void setLegalEntityIdentifier(LEIIdentifier legalEntityIdentifier) {
		this.legalEntityIdentifier = legalEntityIdentifier;
	}
}