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
import com.tools20022.repository.choice.MemberIdentificationChoice;
import com.tools20022.repository.codeset.MemberStatus1Code;
import com.tools20022.repository.codeset.MemberType1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AccountIdentificationAndName;
import com.tools20022.repository.msg.CommunicationAddressDetails;
import com.tools20022.repository.msg.ContactIdentificationAndAddress;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the members of a system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MemberDetails#mmName
 * MemberDetails.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberDetails#mmMemberReturnAddress
 * MemberDetails.mmMemberReturnAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MemberDetails#mmAccount
 * MemberDetails.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MemberDetails#mmType
 * MemberDetails.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MemberDetails#mmStatus
 * MemberDetails.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberDetails#mmContactReference
 * MemberDetails.mmContactReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberDetails#mmCommunicationAddress
 * MemberDetails.mmCommunicationAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SystemMemberRole
 * SystemMemberRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2018</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MemberDetails"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about the members of a system."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MemberDetails", propOrder = {"name", "memberReturnAddress", "account", "type", "status", "contactReference", "communicationAddress"})
public class MemberDetails {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Nm")
	protected Max35Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemberDetails MemberDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Word by which something is called or known or the family name of a person."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MemberDetails, Optional<Max35Text>> mmName = new MMMessageAttribute<MemberDetails, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.MemberDetails.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Word by which something is called or known or the family name of a person.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(MemberDetails obj) {
			return obj.getName();
		}

		@Override
		public void setValue(MemberDetails obj, Optional<Max35Text> value) {
			obj.setName(value.orElse(null));
		}
	};
	@XmlElement(name = "MmbRtrAdr")
	protected List<MemberIdentificationChoice> memberReturnAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MemberIdentificationChoice
	 * MemberIdentificationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmBICAddress
	 * ContactPoint.mmBICAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemberDetails MemberDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MmbRtrAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemberReturnAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Physical/logical address belonging to a member, segregated from its main address that is used for normal operations. The fund return address is used to route messages that require specific attention/exception handling, eg, returns or rejects."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MemberDetails, List<MemberIdentificationChoice>> mmMemberReturnAddress = new MMMessageAttribute<MemberDetails, List<MemberIdentificationChoice>>() {
		{
			businessElementTrace_lazy = () -> ContactPoint.mmBICAddress;
			componentContext_lazy = () -> com.tools20022.repository.msg.MemberDetails.mmObject();
			isDerived = false;
			xmlTag = "MmbRtrAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemberReturnAddress";
			definition = "Physical/logical address belonging to a member, segregated from its main address that is used for normal operations. The fund return address is used to route messages that require specific attention/exception handling, eg, returns or rejects.";
			minOccurs = 0;
			complexType_lazy = () -> MemberIdentificationChoice.mmObject();
		}

		@Override
		public List<MemberIdentificationChoice> getValue(MemberDetails obj) {
			return obj.getMemberReturnAddress();
		}

		@Override
		public void setValue(MemberDetails obj, List<MemberIdentificationChoice> value) {
			obj.setMemberReturnAddress(value);
		}
	};
	@XmlElement(name = "Acct")
	protected List<AccountIdentificationAndName> account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName
	 * AccountIdentificationAndName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemberDetails MemberDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a cash entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MemberDetails, List<AccountIdentificationAndName>> mmAccount = new MMMessageAssociationEnd<MemberDetails, List<AccountIdentificationAndName>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MemberDetails.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Account to or from which a cash entry is made.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentificationAndName.mmObject();
		}

		@Override
		public List<AccountIdentificationAndName> getValue(MemberDetails obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(MemberDetails obj, List<AccountIdentificationAndName> value) {
			obj.setAccount(value);
		}
	};
	@XmlElement(name = "Tp")
	protected MemberType1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MemberType1Code
	 * MemberType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#mmType
	 * SystemMemberRole.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemberDetails MemberDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nature of the relationship a member has with a system."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MemberDetails, Optional<MemberType1Code>> mmType = new MMMessageAttribute<MemberDetails, Optional<MemberType1Code>>() {
		{
			businessElementTrace_lazy = () -> SystemMemberRole.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.MemberDetails.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Nature of the relationship a member has with a system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MemberType1Code.mmObject();
		}

		@Override
		public Optional<MemberType1Code> getValue(MemberDetails obj) {
			return obj.getType();
		}

		@Override
		public void setValue(MemberDetails obj, Optional<MemberType1Code> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Sts")
	protected MemberStatus1Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MemberStatus1Code
	 * MemberStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemStatus#mmMemberStatus
	 * SystemStatus.mmMemberStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemberDetails MemberDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of a member in a system, eg, enabled or deleted."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MemberDetails, Optional<MemberStatus1Code>> mmStatus = new MMMessageAttribute<MemberDetails, Optional<MemberStatus1Code>>() {
		{
			businessElementTrace_lazy = () -> SystemStatus.mmMemberStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.MemberDetails.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of a member in a system, eg, enabled or deleted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MemberStatus1Code.mmObject();
		}

		@Override
		public Optional<MemberStatus1Code> getValue(MemberDetails obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(MemberDetails obj, Optional<MemberStatus1Code> value) {
			obj.setStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "CtctRef")
	protected List<ContactIdentificationAndAddress> contactReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentificationAndAddress
	 * ContactIdentificationAndAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemberDetails MemberDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtctRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person to be contacted in a given organisation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MemberDetails, List<ContactIdentificationAndAddress>> mmContactReference = new MMMessageAssociationEnd<MemberDetails, List<ContactIdentificationAndAddress>>() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MemberDetails.mmObject();
			isDerived = false;
			xmlTag = "CtctRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactReference";
			definition = "Person to be contacted in a given organisation.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContactIdentificationAndAddress.mmObject();
		}

		@Override
		public List<ContactIdentificationAndAddress> getValue(MemberDetails obj) {
			return obj.getContactReference();
		}

		@Override
		public void setValue(MemberDetails obj, List<ContactIdentificationAndAddress> value) {
			obj.setContactReference(value);
		}
	};
	@XmlElement(name = "ComAdr")
	protected CommunicationAddressDetails communicationAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddressDetails
	 * CommunicationAddressDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmContactPoint
	 * Party.mmContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemberDetails MemberDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommunicationAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number, or virtual address, used for communication."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MemberDetails, Optional<CommunicationAddressDetails>> mmCommunicationAddress = new MMMessageAssociationEnd<MemberDetails, Optional<CommunicationAddressDetails>>() {
		{
			businessElementTrace_lazy = () -> Party.mmContactPoint;
			componentContext_lazy = () -> com.tools20022.repository.msg.MemberDetails.mmObject();
			isDerived = false;
			xmlTag = "ComAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommunicationAddress";
			definition = "Number, or virtual address, used for communication.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CommunicationAddressDetails.mmObject();
		}

		@Override
		public Optional<CommunicationAddressDetails> getValue(MemberDetails obj) {
			return obj.getCommunicationAddress();
		}

		@Override
		public void setValue(MemberDetails obj, Optional<CommunicationAddressDetails> value) {
			obj.setCommunicationAddress(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MemberDetails.mmName, com.tools20022.repository.msg.MemberDetails.mmMemberReturnAddress, com.tools20022.repository.msg.MemberDetails.mmAccount,
						com.tools20022.repository.msg.MemberDetails.mmType, com.tools20022.repository.msg.MemberDetails.mmStatus, com.tools20022.repository.msg.MemberDetails.mmContactReference,
						com.tools20022.repository.msg.MemberDetails.mmCommunicationAddress);
				trace_lazy = () -> SystemMemberRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2018");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "MemberDetails";
				definition = "Information about the members of a system.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public MemberDetails setName(Max35Text name) {
		this.name = name;
		return this;
	}

	public List<MemberIdentificationChoice> getMemberReturnAddress() {
		return memberReturnAddress == null ? memberReturnAddress = new ArrayList<>() : memberReturnAddress;
	}

	public MemberDetails setMemberReturnAddress(List<MemberIdentificationChoice> memberReturnAddress) {
		this.memberReturnAddress = Objects.requireNonNull(memberReturnAddress);
		return this;
	}

	public List<AccountIdentificationAndName> getAccount() {
		return account == null ? account = new ArrayList<>() : account;
	}

	public MemberDetails setAccount(List<AccountIdentificationAndName> account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public Optional<MemberType1Code> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public MemberDetails setType(MemberType1Code type) {
		this.type = type;
		return this;
	}

	public Optional<MemberStatus1Code> getStatus() {
		return status == null ? Optional.empty() : Optional.of(status);
	}

	public MemberDetails setStatus(MemberStatus1Code status) {
		this.status = status;
		return this;
	}

	public List<ContactIdentificationAndAddress> getContactReference() {
		return contactReference == null ? contactReference = new ArrayList<>() : contactReference;
	}

	public MemberDetails setContactReference(List<ContactIdentificationAndAddress> contactReference) {
		this.contactReference = Objects.requireNonNull(contactReference);
		return this;
	}

	public Optional<CommunicationAddressDetails> getCommunicationAddress() {
		return communicationAddress == null ? Optional.empty() : Optional.of(communicationAddress);
	}

	public MemberDetails setCommunicationAddress(CommunicationAddressDetails communicationAddress) {
		this.communicationAddress = communicationAddress;
		return this;
	}
}