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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.AccountIdentificationSearchCriteria2Choice;
import com.tools20022.repository.choice.CancellationProcessingStatus9Choice;
import com.tools20022.repository.choice.DateAndDateTimeSearch2Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.BookEntry;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SystemPartyIdentification6;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria5#mmCancellationRequestIdentification
 * IntraBalanceQueryCriteria5.mmCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria5#mmProcessingStatus
 * IntraBalanceQueryCriteria5.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria5#mmCashAccount
 * IntraBalanceQueryCriteria5.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria5#mmCashAccountOwner
 * IntraBalanceQueryCriteria5.mmCashAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria5#mmMessageOriginator
 * IntraBalanceQueryCriteria5.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria5#mmCreationDateTime
 * IntraBalanceQueryCriteria5.mmCreationDateTime}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}</li>
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
 * "IntraBalanceQueryCriteria5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria based on which information is included."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria2
 * IntraBalanceQueryCriteria2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraBalanceQueryCriteria5", propOrder = {"cancellationRequestIdentification", "processingStatus", "cashAccount", "cashAccountOwner", "messageOriginator", "creationDateTime"})
public class IntraBalanceQueryCriteria5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CxlReqId")
	protected List<Max35Text> cancellationRequestIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria5
	 * IntraBalanceQueryCriteria5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::POOL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria2#mmCancellationRequestIdentification
	 * IntraBalanceQueryCriteria2.mmCancellationRequestIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalanceQueryCriteria5, List<Max35Text>> mmCancellationRequestIdentification = new MMMessageAttribute<IntraBalanceQueryCriteria5, List<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceQueryCriteria5.mmObject();
			isDerived = false;
			xmlTag = "CxlReqId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::POOL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequestIdentification";
			definition = "Collective reference identifying a set of messages.";
			previousVersion_lazy = () -> IntraBalanceQueryCriteria2.mmCancellationRequestIdentification;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(IntraBalanceQueryCriteria5 obj) {
			return obj.getCancellationRequestIdentification();
		}

		@Override
		public void setValue(IntraBalanceQueryCriteria5 obj, List<Max35Text> value) {
			obj.setCancellationRequestIdentification(value);
		}
	};
	@XmlElement(name = "PrcgSts")
	protected List<CancellationProcessingStatus9Choice> processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CancellationProcessingStatus9Choice
	 * CancellationProcessingStatus9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria5
	 * IntraBalanceQueryCriteria5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria2#mmProcessingStatus
	 * IntraBalanceQueryCriteria2.mmProcessingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalanceQueryCriteria5, List<CancellationProcessingStatus9Choice>> mmProcessingStatus = new MMMessageAttribute<IntraBalanceQueryCriteria5, List<CancellationProcessingStatus9Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceQueryCriteria5.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Provides the status of settlement of a transaction.";
			previousVersion_lazy = () -> IntraBalanceQueryCriteria2.mmProcessingStatus;
			minOccurs = 0;
			complexType_lazy = () -> CancellationProcessingStatus9Choice.mmObject();
		}

		@Override
		public List<CancellationProcessingStatus9Choice> getValue(IntraBalanceQueryCriteria5 obj) {
			return obj.getProcessingStatus();
		}

		@Override
		public void setValue(IntraBalanceQueryCriteria5 obj, List<CancellationProcessingStatus9Choice> value) {
			obj.setProcessingStatus(value);
		}
	};
	@XmlElement(name = "CshAcct")
	protected List<AccountIdentificationSearchCriteria2Choice> cashAccount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria5
	 * IntraBalanceQueryCriteria5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria2#mmCashAccount
	 * IntraBalanceQueryCriteria2.mmCashAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalanceQueryCriteria5, List<AccountIdentificationSearchCriteria2Choice>> mmCashAccount = new MMMessageAttribute<IntraBalanceQueryCriteria5, List<AccountIdentificationSearchCriteria2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceQueryCriteria5.mmObject();
			isDerived = false;
			xmlTag = "CshAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Account in which cash is maintained.";
			previousVersion_lazy = () -> IntraBalanceQueryCriteria2.mmCashAccount;
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentificationSearchCriteria2Choice.mmObject();
		}

		@Override
		public List<AccountIdentificationSearchCriteria2Choice> getValue(IntraBalanceQueryCriteria5 obj) {
			return obj.getCashAccount();
		}

		@Override
		public void setValue(IntraBalanceQueryCriteria5 obj, List<AccountIdentificationSearchCriteria2Choice> value) {
			obj.setCashAccount(value);
		}
	};
	@XmlElement(name = "CshAcctOwnr")
	protected List<SystemPartyIdentification6> cashAccountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification6
	 * SystemPartyIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria5
	 * IntraBalanceQueryCriteria5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria2#mmCashAccountOwner
	 * IntraBalanceQueryCriteria2.mmCashAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalanceQueryCriteria5, List<SystemPartyIdentification6>> mmCashAccountOwner = new MMMessageAssociationEnd<IntraBalanceQueryCriteria5, List<SystemPartyIdentification6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceQueryCriteria5.mmObject();
			isDerived = false;
			xmlTag = "CshAcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountOwner";
			definition = "Party that owns the account.";
			previousVersion_lazy = () -> IntraBalanceQueryCriteria2.mmCashAccountOwner;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification6.mmObject();
		}

		@Override
		public List<SystemPartyIdentification6> getValue(IntraBalanceQueryCriteria5 obj) {
			return obj.getCashAccountOwner();
		}

		@Override
		public void setValue(IntraBalanceQueryCriteria5 obj, List<SystemPartyIdentification6> value) {
			obj.setCashAccountOwner(value);
		}
	};
	@XmlElement(name = "MsgOrgtr")
	protected List<SystemPartyIdentification6> messageOriginator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification6
	 * SystemPartyIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria5
	 * IntraBalanceQueryCriteria5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria2#mmMessageOriginator
	 * IntraBalanceQueryCriteria2.mmMessageOriginator}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalanceQueryCriteria5, List<SystemPartyIdentification6>> mmMessageOriginator = new MMMessageAssociationEnd<IntraBalanceQueryCriteria5, List<SystemPartyIdentification6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceQueryCriteria5.mmObject();
			isDerived = false;
			xmlTag = "MsgOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOriginator";
			definition = "Party that originated the message, if other than the sender.";
			previousVersion_lazy = () -> IntraBalanceQueryCriteria2.mmMessageOriginator;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification6.mmObject();
		}

		@Override
		public List<SystemPartyIdentification6> getValue(IntraBalanceQueryCriteria5 obj) {
			return obj.getMessageOriginator();
		}

		@Override
		public void setValue(IntraBalanceQueryCriteria5 obj, List<SystemPartyIdentification6> value) {
			obj.setMessageOriginator(value);
		}
	};
	@XmlElement(name = "CreDtTm")
	protected DateAndDateTimeSearch2Choice creationDateTime;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria5
	 * IntraBalanceQueryCriteria5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::TRAD</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria2#mmCreationDateTime
	 * IntraBalanceQueryCriteria2.mmCreationDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalanceQueryCriteria5, Optional<DateAndDateTimeSearch2Choice>> mmCreationDateTime = new MMMessageAttribute<IntraBalanceQueryCriteria5, Optional<DateAndDateTimeSearch2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceQueryCriteria5.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::TRAD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Specifies the creation date/time of the intra-balance movement.";
			previousVersion_lazy = () -> IntraBalanceQueryCriteria2.mmCreationDateTime;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearch2Choice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeSearch2Choice> getValue(IntraBalanceQueryCriteria5 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(IntraBalanceQueryCriteria5 obj, Optional<DateAndDateTimeSearch2Choice> value) {
			obj.setCreationDateTime(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraBalanceQueryCriteria5.mmCancellationRequestIdentification, com.tools20022.repository.msg.IntraBalanceQueryCriteria5.mmProcessingStatus,
						com.tools20022.repository.msg.IntraBalanceQueryCriteria5.mmCashAccount, com.tools20022.repository.msg.IntraBalanceQueryCriteria5.mmCashAccountOwner,
						com.tools20022.repository.msg.IntraBalanceQueryCriteria5.mmMessageOriginator, com.tools20022.repository.msg.IntraBalanceQueryCriteria5.mmCreationDateTime);
				trace_lazy = () -> BookEntry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IntraBalanceQueryCriteria5";
				definition = "Defines the criteria based on which information is included.";
				previousVersion_lazy = () -> IntraBalanceQueryCriteria2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<Max35Text> getCancellationRequestIdentification() {
		return cancellationRequestIdentification == null ? cancellationRequestIdentification = new ArrayList<>() : cancellationRequestIdentification;
	}

	public IntraBalanceQueryCriteria5 setCancellationRequestIdentification(List<Max35Text> cancellationRequestIdentification) {
		this.cancellationRequestIdentification = Objects.requireNonNull(cancellationRequestIdentification);
		return this;
	}

	public List<CancellationProcessingStatus9Choice> getProcessingStatus() {
		return processingStatus == null ? processingStatus = new ArrayList<>() : processingStatus;
	}

	public IntraBalanceQueryCriteria5 setProcessingStatus(List<CancellationProcessingStatus9Choice> processingStatus) {
		this.processingStatus = Objects.requireNonNull(processingStatus);
		return this;
	}

	public List<AccountIdentificationSearchCriteria2Choice> getCashAccount() {
		return cashAccount == null ? cashAccount = new ArrayList<>() : cashAccount;
	}

	public IntraBalanceQueryCriteria5 setCashAccount(List<AccountIdentificationSearchCriteria2Choice> cashAccount) {
		this.cashAccount = Objects.requireNonNull(cashAccount);
		return this;
	}

	public List<SystemPartyIdentification6> getCashAccountOwner() {
		return cashAccountOwner == null ? cashAccountOwner = new ArrayList<>() : cashAccountOwner;
	}

	public IntraBalanceQueryCriteria5 setCashAccountOwner(List<SystemPartyIdentification6> cashAccountOwner) {
		this.cashAccountOwner = Objects.requireNonNull(cashAccountOwner);
		return this;
	}

	public List<SystemPartyIdentification6> getMessageOriginator() {
		return messageOriginator == null ? messageOriginator = new ArrayList<>() : messageOriginator;
	}

	public IntraBalanceQueryCriteria5 setMessageOriginator(List<SystemPartyIdentification6> messageOriginator) {
		this.messageOriginator = Objects.requireNonNull(messageOriginator);
		return this;
	}

	public Optional<DateAndDateTimeSearch2Choice> getCreationDateTime() {
		return creationDateTime == null ? Optional.empty() : Optional.of(creationDateTime);
	}

	public IntraBalanceQueryCriteria5 setCreationDateTime(DateAndDateTimeSearch2Choice creationDateTime) {
		this.creationDateTime = creationDateTime;
		return this;
	}
}