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
import com.tools20022.repository.datatype.RequestedIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria used to report on a member.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberReturnCriteria#mmNameIndicator
 * MemberReturnCriteria.mmNameIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberReturnCriteria#mmMemberReturnAddressIndicator
 * MemberReturnCriteria.mmMemberReturnAddressIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberReturnCriteria#mmAccountIndicator
 * MemberReturnCriteria.mmAccountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberReturnCriteria#mmTypeIndicator
 * MemberReturnCriteria.mmTypeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberReturnCriteria#mmStatusIndicator
 * MemberReturnCriteria.mmStatusIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberReturnCriteria#mmContactReferenceIndicator
 * MemberReturnCriteria.mmContactReferenceIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MemberReturnCriteria#mmCommunicationAddressIndicator
 * MemberReturnCriteria.mmCommunicationAddressIndicator}</li>
 * </ul>
 * </li>
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
 * "MemberReturnCriteria"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to report on a member."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MemberReturnCriteria1
 * MemberReturnCriteria1}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MemberReturnCriteria", propOrder = {"nameIndicator", "memberReturnAddressIndicator", "accountIndicator", "typeIndicator", "statusIndicator", "contactReferenceIndicator", "communicationAddressIndicator"})
public class MemberReturnCriteria {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NmInd")
	protected RequestedIndicator nameIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemberReturnCriteria
	 * MemberReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the member name is requested."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MemberReturnCriteria1#mmNameIndicator
	 * MemberReturnCriteria1.mmNameIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MemberReturnCriteria, Optional<RequestedIndicator>> mmNameIndicator = new MMMessageAttribute<MemberReturnCriteria, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MemberReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "NmInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameIndicator";
			definition = "Indicates whether the member name is requested.";
			nextVersions_lazy = () -> Arrays.asList(MemberReturnCriteria1.mmNameIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(MemberReturnCriteria obj) {
			return obj.getNameIndicator();
		}

		@Override
		public void setValue(MemberReturnCriteria obj, Optional<RequestedIndicator> value) {
			obj.setNameIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "MmbRtrAdrInd")
	protected RequestedIndicator memberReturnAddressIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemberReturnCriteria
	 * MemberReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MmbRtrAdrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemberReturnAddressIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the member return address is requested."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MemberReturnCriteria1#mmMemberReturnAddressIndicator
	 * MemberReturnCriteria1.mmMemberReturnAddressIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MemberReturnCriteria, Optional<RequestedIndicator>> mmMemberReturnAddressIndicator = new MMMessageAttribute<MemberReturnCriteria, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MemberReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "MmbRtrAdrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemberReturnAddressIndicator";
			definition = "Indicates whether the member return address is requested.";
			nextVersions_lazy = () -> Arrays.asList(MemberReturnCriteria1.mmMemberReturnAddressIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(MemberReturnCriteria obj) {
			return obj.getMemberReturnAddressIndicator();
		}

		@Override
		public void setValue(MemberReturnCriteria obj, Optional<RequestedIndicator> value) {
			obj.setMemberReturnAddressIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctInd")
	protected RequestedIndicator accountIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemberReturnCriteria
	 * MemberReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the member account is requested."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MemberReturnCriteria1#mmAccountIndicator
	 * MemberReturnCriteria1.mmAccountIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MemberReturnCriteria, Optional<RequestedIndicator>> mmAccountIndicator = new MMMessageAttribute<MemberReturnCriteria, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MemberReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "AcctInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIndicator";
			definition = "Indicates whether the member account is requested.";
			nextVersions_lazy = () -> Arrays.asList(MemberReturnCriteria1.mmAccountIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(MemberReturnCriteria obj) {
			return obj.getAccountIndicator();
		}

		@Override
		public void setValue(MemberReturnCriteria obj, Optional<RequestedIndicator> value) {
			obj.setAccountIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "TpInd")
	protected RequestedIndicator typeIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemberReturnCriteria
	 * MemberReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the member type is requested."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MemberReturnCriteria1#mmTypeIndicator
	 * MemberReturnCriteria1.mmTypeIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MemberReturnCriteria, Optional<RequestedIndicator>> mmTypeIndicator = new MMMessageAttribute<MemberReturnCriteria, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MemberReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "TpInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeIndicator";
			definition = "Indicates whether the member type is requested.";
			nextVersions_lazy = () -> Arrays.asList(MemberReturnCriteria1.mmTypeIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(MemberReturnCriteria obj) {
			return obj.getTypeIndicator();
		}

		@Override
		public void setValue(MemberReturnCriteria obj, Optional<RequestedIndicator> value) {
			obj.setTypeIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "StsInd")
	protected RequestedIndicator statusIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemberReturnCriteria
	 * MemberReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the member status is requested."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MemberReturnCriteria1#mmStatusIndicator
	 * MemberReturnCriteria1.mmStatusIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MemberReturnCriteria, Optional<RequestedIndicator>> mmStatusIndicator = new MMMessageAttribute<MemberReturnCriteria, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MemberReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "StsInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusIndicator";
			definition = "Indicates whether the member status is requested.";
			nextVersions_lazy = () -> Arrays.asList(MemberReturnCriteria1.mmStatusIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(MemberReturnCriteria obj) {
			return obj.getStatusIndicator();
		}

		@Override
		public void setValue(MemberReturnCriteria obj, Optional<RequestedIndicator> value) {
			obj.setStatusIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CtctRefInd")
	protected RequestedIndicator contactReferenceIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemberReturnCriteria
	 * MemberReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtctRefInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactReferenceIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the contact references are requested."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MemberReturnCriteria1#mmContactReferenceIndicator
	 * MemberReturnCriteria1.mmContactReferenceIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MemberReturnCriteria, Optional<RequestedIndicator>> mmContactReferenceIndicator = new MMMessageAttribute<MemberReturnCriteria, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MemberReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "CtctRefInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactReferenceIndicator";
			definition = "Indicates whether the contact references are requested.";
			nextVersions_lazy = () -> Arrays.asList(MemberReturnCriteria1.mmContactReferenceIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(MemberReturnCriteria obj) {
			return obj.getContactReferenceIndicator();
		}

		@Override
		public void setValue(MemberReturnCriteria obj, Optional<RequestedIndicator> value) {
			obj.setContactReferenceIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "ComAdrInd")
	protected RequestedIndicator communicationAddressIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MemberReturnCriteria
	 * MemberReturnCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComAdrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommunicationAddressIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the communication addresses are requested."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MemberReturnCriteria1#mmCommunicationAddressIndicator
	 * MemberReturnCriteria1.mmCommunicationAddressIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MemberReturnCriteria, Optional<RequestedIndicator>> mmCommunicationAddressIndicator = new MMMessageAttribute<MemberReturnCriteria, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MemberReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "ComAdrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommunicationAddressIndicator";
			definition = "Indicates whether the communication addresses are requested.";
			nextVersions_lazy = () -> Arrays.asList(MemberReturnCriteria1.mmCommunicationAddressIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(MemberReturnCriteria obj) {
			return obj.getCommunicationAddressIndicator();
		}

		@Override
		public void setValue(MemberReturnCriteria obj, Optional<RequestedIndicator> value) {
			obj.setCommunicationAddressIndicator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MemberReturnCriteria.mmNameIndicator, com.tools20022.repository.msg.MemberReturnCriteria.mmMemberReturnAddressIndicator,
						com.tools20022.repository.msg.MemberReturnCriteria.mmAccountIndicator, com.tools20022.repository.msg.MemberReturnCriteria.mmTypeIndicator, com.tools20022.repository.msg.MemberReturnCriteria.mmStatusIndicator,
						com.tools20022.repository.msg.MemberReturnCriteria.mmContactReferenceIndicator, com.tools20022.repository.msg.MemberReturnCriteria.mmCommunicationAddressIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2018");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "MemberReturnCriteria";
				definition = "Defines the criteria used to report on a member.";
				nextVersions_lazy = () -> Arrays.asList(MemberReturnCriteria1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RequestedIndicator> getNameIndicator() {
		return nameIndicator == null ? Optional.empty() : Optional.of(nameIndicator);
	}

	public MemberReturnCriteria setNameIndicator(RequestedIndicator nameIndicator) {
		this.nameIndicator = nameIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getMemberReturnAddressIndicator() {
		return memberReturnAddressIndicator == null ? Optional.empty() : Optional.of(memberReturnAddressIndicator);
	}

	public MemberReturnCriteria setMemberReturnAddressIndicator(RequestedIndicator memberReturnAddressIndicator) {
		this.memberReturnAddressIndicator = memberReturnAddressIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getAccountIndicator() {
		return accountIndicator == null ? Optional.empty() : Optional.of(accountIndicator);
	}

	public MemberReturnCriteria setAccountIndicator(RequestedIndicator accountIndicator) {
		this.accountIndicator = accountIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getTypeIndicator() {
		return typeIndicator == null ? Optional.empty() : Optional.of(typeIndicator);
	}

	public MemberReturnCriteria setTypeIndicator(RequestedIndicator typeIndicator) {
		this.typeIndicator = typeIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getStatusIndicator() {
		return statusIndicator == null ? Optional.empty() : Optional.of(statusIndicator);
	}

	public MemberReturnCriteria setStatusIndicator(RequestedIndicator statusIndicator) {
		this.statusIndicator = statusIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getContactReferenceIndicator() {
		return contactReferenceIndicator == null ? Optional.empty() : Optional.of(contactReferenceIndicator);
	}

	public MemberReturnCriteria setContactReferenceIndicator(RequestedIndicator contactReferenceIndicator) {
		this.contactReferenceIndicator = contactReferenceIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getCommunicationAddressIndicator() {
		return communicationAddressIndicator == null ? Optional.empty() : Optional.of(communicationAddressIndicator);
	}

	public MemberReturnCriteria setCommunicationAddressIndicator(RequestedIndicator communicationAddressIndicator) {
		this.communicationAddressIndicator = communicationAddressIndicator;
		return this;
	}
}