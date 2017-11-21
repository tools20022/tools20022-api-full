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
import com.tools20022.repository.codeset.Status6Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Status of the securities account processed in the system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountStatus1#mmRelatedSecuritiesAccount
 * SecuritiesAccountStatus1.mmRelatedSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountStatus1#mmStatus
 * SecuritiesAccountStatus1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountStatus1#mmStatusReason
 * SecuritiesAccountStatus1.mmStatusReason}</li>
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
 * "SecuritiesAccountStatus1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of the securities account processed in the system. "</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesAccountStatus1", propOrder = {"relatedSecuritiesAccount", "status", "statusReason"})
public class SecuritiesAccountStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesAccount13 relatedSecuritiesAccount;
	/**
	 * Unique identification of the securities account referenced by a request
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountStatus1
	 * SecuritiesAccountStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdSctiesAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the securities account referenced by a request"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedSecuritiesAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesAccountStatus1.mmObject();
			isDerived = false;
			xmlTag = "RltdSctiesAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedSecuritiesAccount";
			definition = "Unique identification of the securities account referenced by a request";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount13.mmObject();
		}
	};
	protected Status6Code status;
	/**
	 * Status of the securities account maintenance instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Status6Code
	 * Status6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountStatus1
	 * SecuritiesAccountStatus1}</li>
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
	 * definition} = "Status of the securities account maintenance instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuritiesAccountStatus1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the securities account maintenance instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Status6Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.StatusReasonInformation10> statusReason;
	/**
	 * Reason for the status of a securities account maintenance instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation10
	 * StatusReasonInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountStatus1
	 * SecuritiesAccountStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for the status of a securities account maintenance instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatusReason = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesAccountStatus1.mmObject();
			isDerived = false;
			xmlTag = "StsRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReason";
			definition = "Reason for the status of a securities account maintenance instruction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.StatusReasonInformation10.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecuritiesAccountStatus1.mmRelatedSecuritiesAccount, SecuritiesAccountStatus1.mmStatus, SecuritiesAccountStatus1.mmStatusReason);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesAccountStatus1";
				definition = "Status of the securities account processed in the system. ";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RltdSctiesAcct")
	public SecuritiesAccount13 getRelatedSecuritiesAccount() {
		return relatedSecuritiesAccount;
	}

	public void setRelatedSecuritiesAccount(com.tools20022.repository.msg.SecuritiesAccount13 relatedSecuritiesAccount) {
		this.relatedSecuritiesAccount = relatedSecuritiesAccount;
	}

	@XmlElement(name = "Sts", required = true)
	public Status6Code getStatus() {
		return status;
	}

	public void setStatus(Status6Code status) {
		this.status = status;
	}

	@XmlElement(name = "StsRsn")
	public List<StatusReasonInformation10> getStatusReason() {
		return statusReason;
	}

	public void setStatusReason(List<com.tools20022.repository.msg.StatusReasonInformation10> statusReason) {
		this.statusReason = statusReason;
	}
}