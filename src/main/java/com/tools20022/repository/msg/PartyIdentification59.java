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
import com.tools20022.repository.msg.PartyIdentification44;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPartyNameOrLEIRule#forPartyIdentification59
 * ConstraintPartyNameOrLEIRule.forPartyIdentification59}</li>
 * </ul>
 * </li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyIdentification59", propOrder = {"partyName", "anyBIC", "accountNumber", "address", "clearingSystemIdentification", "legalEntityIdentifier"})
public class PartyIdentification59 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PtyNm")
	protected Max34Text partyName;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<PartyIdentification59, Optional<Max34Text>> mmPartyName = new MMMessageAttribute<PartyIdentification59, Optional<Max34Text>>() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification59.mmObject();
			isDerived = false;
			xmlTag = "PtyNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyName";
			definition = "Identification of the party expressed as the party's name.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max34Text.mmObject();
		}

		@Override
		public Optional<Max34Text> getValue(PartyIdentification59 obj) {
			return obj.getPartyName();
		}

		@Override
		public void setValue(PartyIdentification59 obj, Optional<Max34Text> value) {
			obj.setPartyName(value.orElse(null));
		}
	};
	@XmlElement(name = "AnyBIC")
	protected PartyIdentification44 anyBIC;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<PartyIdentification59, Optional<PartyIdentification44>> mmAnyBIC = new MMMessageAssociationEnd<PartyIdentification59, Optional<PartyIdentification44>>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmAnyBIC;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification59.mmObject();
			isDerived = false;
			xmlTag = "AnyBIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyBIC";
			definition = "Identification of the party expressed as a BIC and an optional alternative identifier.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification44.mmObject();
		}

		@Override
		public Optional<PartyIdentification44> getValue(PartyIdentification59 obj) {
			return obj.getAnyBIC();
		}

		@Override
		public void setValue(PartyIdentification59 obj, Optional<PartyIdentification44> value) {
			obj.setAnyBIC(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctNb")
	protected Max34Text accountNumber;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<PartyIdentification59, Optional<Max34Text>> mmAccountNumber = new MMMessageAttribute<PartyIdentification59, Optional<Max34Text>>() {
		{
			businessElementTrace_lazy = () -> AccountPartyRole.mmAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification59.mmObject();
			isDerived = false;
			xmlTag = "AcctNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountNumber";
			definition = "Identification of the party's account number.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max34Text.mmObject();
		}

		@Override
		public Optional<Max34Text> getValue(PartyIdentification59 obj) {
			return obj.getAccountNumber();
		}

		@Override
		public void setValue(PartyIdentification59 obj, Optional<Max34Text> value) {
			obj.setAccountNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "Adr")
	protected Max105Text address;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<PartyIdentification59, Optional<Max105Text>> mmAddress = new MMMessageAttribute<PartyIdentification59, Optional<Max105Text>>() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification59.mmObject();
			isDerived = false;
			xmlTag = "Adr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Address";
			definition = "Identification of the party's address.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}

		@Override
		public Optional<Max105Text> getValue(PartyIdentification59 obj) {
			return obj.getAddress();
		}

		@Override
		public void setValue(PartyIdentification59 obj, Optional<Max105Text> value) {
			obj.setAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrSysId")
	protected ClearingSystemIdentification2Choice clearingSystemIdentification;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<PartyIdentification59, Optional<ClearingSystemIdentification2Choice>> mmClearingSystemIdentification = new MMMessageAttribute<PartyIdentification59, Optional<ClearingSystemIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmClearingSystemMemberIdentificationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification59.mmObject();
			isDerived = false;
			xmlTag = "ClrSysId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystemIdentification";
			definition = "Choice of a clearing system identifier.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ClearingSystemIdentification2Choice.mmObject();
		}

		@Override
		public Optional<ClearingSystemIdentification2Choice> getValue(PartyIdentification59 obj) {
			return obj.getClearingSystemIdentification();
		}

		@Override
		public void setValue(PartyIdentification59 obj, Optional<ClearingSystemIdentification2Choice> value) {
			obj.setClearingSystemIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "LglNttyIdr")
	protected LEIIdentifier legalEntityIdentifier;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<PartyIdentification59, Optional<LEIIdentifier>> mmLegalEntityIdentifier = new MMMessageAttribute<PartyIdentification59, Optional<LEIIdentifier>>() {
		{
			businessComponentTrace_lazy = () -> OrganisationIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification59.mmObject();
			isDerived = false;
			xmlTag = "LglNttyIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalEntityIdentifier";
			definition = "Identification of the Legal Entity Identifier. This is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}

		@Override
		public Optional<LEIIdentifier> getValue(PartyIdentification59 obj) {
			return obj.getLegalEntityIdentifier();
		}

		@Override
		public void setValue(PartyIdentification59 obj, Optional<LEIIdentifier> value) {
			obj.setLegalEntityIdentifier(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentification59.mmPartyName, com.tools20022.repository.msg.PartyIdentification59.mmAnyBIC,
						com.tools20022.repository.msg.PartyIdentification59.mmAccountNumber, com.tools20022.repository.msg.PartyIdentification59.mmAddress, com.tools20022.repository.msg.PartyIdentification59.mmClearingSystemIdentification,
						com.tools20022.repository.msg.PartyIdentification59.mmLegalEntityIdentifier);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPartyNameOrLEIRule.forPartyIdentification59);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentification59";
				definition = "Identification of a party. The party can be identified by providing the party's name and optionally, the BIC, account number, address, clearing system identification or LEI can also be provided.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max34Text> getPartyName() {
		return partyName == null ? Optional.empty() : Optional.of(partyName);
	}

	public PartyIdentification59 setPartyName(Max34Text partyName) {
		this.partyName = partyName;
		return this;
	}

	public Optional<PartyIdentification44> getAnyBIC() {
		return anyBIC == null ? Optional.empty() : Optional.of(anyBIC);
	}

	public PartyIdentification59 setAnyBIC(PartyIdentification44 anyBIC) {
		this.anyBIC = anyBIC;
		return this;
	}

	public Optional<Max34Text> getAccountNumber() {
		return accountNumber == null ? Optional.empty() : Optional.of(accountNumber);
	}

	public PartyIdentification59 setAccountNumber(Max34Text accountNumber) {
		this.accountNumber = accountNumber;
		return this;
	}

	public Optional<Max105Text> getAddress() {
		return address == null ? Optional.empty() : Optional.of(address);
	}

	public PartyIdentification59 setAddress(Max105Text address) {
		this.address = address;
		return this;
	}

	public Optional<ClearingSystemIdentification2Choice> getClearingSystemIdentification() {
		return clearingSystemIdentification == null ? Optional.empty() : Optional.of(clearingSystemIdentification);
	}

	public PartyIdentification59 setClearingSystemIdentification(ClearingSystemIdentification2Choice clearingSystemIdentification) {
		this.clearingSystemIdentification = clearingSystemIdentification;
		return this;
	}

	public Optional<LEIIdentifier> getLegalEntityIdentifier() {
		return legalEntityIdentifier == null ? Optional.empty() : Optional.of(legalEntityIdentifier);
	}

	public PartyIdentification59 setLegalEntityIdentifier(LEIIdentifier legalEntityIdentifier) {
		this.legalEntityIdentifier = legalEntityIdentifier;
		return this;
	}
}