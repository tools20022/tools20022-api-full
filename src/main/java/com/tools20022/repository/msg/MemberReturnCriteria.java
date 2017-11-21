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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MemberReturnCriteria"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to report on a member."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MemberReturnCriteria", propOrder = {"nameIndicator", "memberReturnAddressIndicator", "accountIndicator", "typeIndicator", "statusIndicator", "contactReferenceIndicator", "communicationAddressIndicator"})
public class MemberReturnCriteria {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RequestedIndicator nameIndicator;
	/**
	 * Indicates whether the member name is requested.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmNameIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MemberReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "NmInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameIndicator";
			definition = "Indicates whether the member name is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator memberReturnAddressIndicator;
	/**
	 * Indicates whether the member return address is requested.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmMemberReturnAddressIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MemberReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "MmbRtrAdrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemberReturnAddressIndicator";
			definition = "Indicates whether the member return address is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator accountIndicator;
	/**
	 * Indicates whether the member account is requested.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MemberReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "AcctInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIndicator";
			definition = "Indicates whether the member account is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator typeIndicator;
	/**
	 * Indicates whether the member type is requested.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmTypeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MemberReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "TpInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeIndicator";
			definition = "Indicates whether the member type is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator statusIndicator;
	/**
	 * Indicates whether the member status is requested.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatusIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MemberReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "StsInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusIndicator";
			definition = "Indicates whether the member status is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator contactReferenceIndicator;
	/**
	 * Indicates whether the contact references are requested.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmContactReferenceIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MemberReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "CtctRefInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactReferenceIndicator";
			definition = "Indicates whether the contact references are requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator communicationAddressIndicator;
	/**
	 * Indicates whether the communication addresses are requested.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmCommunicationAddressIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MemberReturnCriteria.mmObject();
			isDerived = false;
			xmlTag = "ComAdrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommunicationAddressIndicator";
			definition = "Indicates whether the communication addresses are requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MemberReturnCriteria.mmNameIndicator, MemberReturnCriteria.mmMemberReturnAddressIndicator, MemberReturnCriteria.mmAccountIndicator, MemberReturnCriteria.mmTypeIndicator,
						MemberReturnCriteria.mmStatusIndicator, MemberReturnCriteria.mmContactReferenceIndicator, MemberReturnCriteria.mmCommunicationAddressIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MemberReturnCriteria";
				definition = "Defines the criteria used to report on a member.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "NmInd")
	public RequestedIndicator getNameIndicator() {
		return nameIndicator;
	}

	public void setNameIndicator(RequestedIndicator nameIndicator) {
		this.nameIndicator = nameIndicator;
	}

	@XmlElement(name = "MmbRtrAdrInd")
	public RequestedIndicator getMemberReturnAddressIndicator() {
		return memberReturnAddressIndicator;
	}

	public void setMemberReturnAddressIndicator(RequestedIndicator memberReturnAddressIndicator) {
		this.memberReturnAddressIndicator = memberReturnAddressIndicator;
	}

	@XmlElement(name = "AcctInd")
	public RequestedIndicator getAccountIndicator() {
		return accountIndicator;
	}

	public void setAccountIndicator(RequestedIndicator accountIndicator) {
		this.accountIndicator = accountIndicator;
	}

	@XmlElement(name = "TpInd")
	public RequestedIndicator getTypeIndicator() {
		return typeIndicator;
	}

	public void setTypeIndicator(RequestedIndicator typeIndicator) {
		this.typeIndicator = typeIndicator;
	}

	@XmlElement(name = "StsInd")
	public RequestedIndicator getStatusIndicator() {
		return statusIndicator;
	}

	public void setStatusIndicator(RequestedIndicator statusIndicator) {
		this.statusIndicator = statusIndicator;
	}

	@XmlElement(name = "CtctRefInd")
	public RequestedIndicator getContactReferenceIndicator() {
		return contactReferenceIndicator;
	}

	public void setContactReferenceIndicator(RequestedIndicator contactReferenceIndicator) {
		this.contactReferenceIndicator = contactReferenceIndicator;
	}

	@XmlElement(name = "ComAdrInd")
	public RequestedIndicator getCommunicationAddressIndicator() {
		return communicationAddressIndicator;
	}

	public void setCommunicationAddressIndicator(RequestedIndicator communicationAddressIndicator) {
		this.communicationAddressIndicator = communicationAddressIndicator;
	}
}