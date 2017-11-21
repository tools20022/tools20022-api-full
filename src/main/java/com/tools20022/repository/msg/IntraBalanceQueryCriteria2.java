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
import com.tools20022.repository.choice.AccountIdentificationSearchCriteria2Choice;
import com.tools20022.repository.choice.CancellationProcessingStatus3Choice;
import com.tools20022.repository.choice.DateAndDateTimeSearch2Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.BookEntry;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria based on which information is included.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria2#mmCancellationRequestIdentification
 * IntraBalanceQueryCriteria2.mmCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria2#mmProcessingStatus
 * IntraBalanceQueryCriteria2.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria2#mmCashAccount
 * IntraBalanceQueryCriteria2.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria2#mmCashAccountOwner
 * IntraBalanceQueryCriteria2.mmCashAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria2#mmMessageOriginator
 * IntraBalanceQueryCriteria2.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria2#mmCreationDateTime
 * IntraBalanceQueryCriteria2.mmCreationDateTime}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}</li>
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
 * "IntraBalanceQueryCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria based on which information is included."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "IntraBalanceQueryCriteria2", propOrder = {"cancellationRequestIdentification", "processingStatus", "cashAccount", "cashAccountOwner", "messageOriginator", "creationDateTime"})
public class IntraBalanceQueryCriteria2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<Max35Text> cancellationRequestIdentification;
	/**
	 * Collective reference identifying a set of messages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria2
	 * IntraBalanceQueryCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancellationRequestIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IntraBalanceQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "CxlReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequestIdentification";
			definition = "Collective reference identifying a set of messages.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<CancellationProcessingStatus3Choice> processingStatus;
	/**
	 * Provides the status of settlement of a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus3Choice
	 * CancellationProcessingStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria2
	 * IntraBalanceQueryCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of settlement of a transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProcessingStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IntraBalanceQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Provides the status of settlement of a transaction.";
			minOccurs = 0;
			complexType_lazy = () -> CancellationProcessingStatus3Choice.mmObject();
		}
	};
	protected List<AccountIdentificationSearchCriteria2Choice> cashAccount;
	/**
	 * Account in which cash is maintained.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationSearchCriteria2Choice
	 * AccountIdentificationSearchCriteria2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria2
	 * IntraBalanceQueryCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account in which cash is maintained."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashAccount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IntraBalanceQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "CshAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Account in which cash is maintained.";
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentificationSearchCriteria2Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SystemPartyIdentification5> cashAccountOwner;
	/**
	 * Party that owns the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification5
	 * SystemPartyIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria2
	 * IntraBalanceQueryCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashAccountOwner = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IntraBalanceQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "CshAcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountOwner";
			definition = "Party that owns the account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemPartyIdentification5.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SystemPartyIdentification5> messageOriginator;
	/**
	 * Party that originated the message, if other than the sender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification5
	 * SystemPartyIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria2
	 * IntraBalanceQueryCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgOrgtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that originated the message, if other than the sender."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMessageOriginator = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IntraBalanceQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "MsgOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOriginator";
			definition = "Party that originated the message, if other than the sender.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemPartyIdentification5.mmObject();
		}
	};
	protected DateAndDateTimeSearch2Choice creationDateTime;
	/**
	 * Specifies the creation date/time of the intra-balance movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearch2Choice
	 * DateAndDateTimeSearch2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria2
	 * IntraBalanceQueryCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the creation date/time of the intra-balance movement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IntraBalanceQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Specifies the creation date/time of the intra-balance movement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearch2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(IntraBalanceQueryCriteria2.mmCancellationRequestIdentification, IntraBalanceQueryCriteria2.mmProcessingStatus, IntraBalanceQueryCriteria2.mmCashAccount,
						IntraBalanceQueryCriteria2.mmCashAccountOwner, IntraBalanceQueryCriteria2.mmMessageOriginator, IntraBalanceQueryCriteria2.mmCreationDateTime);
				trace_lazy = () -> BookEntry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IntraBalanceQueryCriteria2";
				definition = "Defines the criteria based on which information is included.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CxlReqId")
	public List<Max35Text> getCancellationRequestIdentification() {
		return cancellationRequestIdentification;
	}

	public void setCancellationRequestIdentification(List<Max35Text> cancellationRequestIdentification) {
		this.cancellationRequestIdentification = cancellationRequestIdentification;
	}

	@XmlElement(name = "PrcgSts")
	public List<CancellationProcessingStatus3Choice> getProcessingStatus() {
		return processingStatus;
	}

	public void setProcessingStatus(List<CancellationProcessingStatus3Choice> processingStatus) {
		this.processingStatus = processingStatus;
	}

	@XmlElement(name = "CshAcct")
	public List<AccountIdentificationSearchCriteria2Choice> getCashAccount() {
		return cashAccount;
	}

	public void setCashAccount(List<AccountIdentificationSearchCriteria2Choice> cashAccount) {
		this.cashAccount = cashAccount;
	}

	@XmlElement(name = "CshAcctOwnr")
	public List<SystemPartyIdentification5> getCashAccountOwner() {
		return cashAccountOwner;
	}

	public void setCashAccountOwner(List<com.tools20022.repository.msg.SystemPartyIdentification5> cashAccountOwner) {
		this.cashAccountOwner = cashAccountOwner;
	}

	@XmlElement(name = "MsgOrgtr")
	public List<SystemPartyIdentification5> getMessageOriginator() {
		return messageOriginator;
	}

	public void setMessageOriginator(List<com.tools20022.repository.msg.SystemPartyIdentification5> messageOriginator) {
		this.messageOriginator = messageOriginator;
	}

	@XmlElement(name = "CreDtTm")
	public DateAndDateTimeSearch2Choice getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(DateAndDateTimeSearch2Choice creationDateTime) {
		this.creationDateTime = creationDateTime;
	}
}