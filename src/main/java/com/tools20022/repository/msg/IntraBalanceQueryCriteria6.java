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
import com.tools20022.repository.choice.DateAndDateTimeSearch2Choice;
import com.tools20022.repository.choice.ModificationProcessingStatus9Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.BookEntry;
import com.tools20022.repository.entity.CashEntry;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria6#mmModificationRequestIdentification
 * IntraBalanceQueryCriteria6.mmModificationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria6#mmProcessingStatus
 * IntraBalanceQueryCriteria6.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria6#mmCashAccount
 * IntraBalanceQueryCriteria6.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria6#mmCashAccountOwner
 * IntraBalanceQueryCriteria6.mmCashAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria6#mmMessageOriginator
 * IntraBalanceQueryCriteria6.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria6#mmCreationDateTime
 * IntraBalanceQueryCriteria6.mmCreationDateTime}</li>
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
 * "IntraBalanceQueryCriteria6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria based on which information is included."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria3
 * IntraBalanceQueryCriteria3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraBalanceQueryCriteria6", propOrder = {"modificationRequestIdentification", "processingStatus", "cashAccount", "cashAccountOwner", "messageOriginator", "creationDateTime"})
public class IntraBalanceQueryCriteria6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ModReqId")
	protected List<Max35Text> modificationRequestIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria6
	 * IntraBalanceQueryCriteria6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::POOL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria3#mmModificationRequestIdentification
	 * IntraBalanceQueryCriteria3.mmModificationRequestIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmModificationRequestIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceQueryCriteria6.mmObject();
			isDerived = false;
			xmlTag = "ModReqId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::POOL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationRequestIdentification";
			definition = "Collective reference identifying a set of messages.";
			previousVersion_lazy = () -> IntraBalanceQueryCriteria3.mmModificationRequestIdentification;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "PrcgSts")
	protected List<ModificationProcessingStatus9Choice> processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus9Choice
	 * ModificationProcessingStatus9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria6
	 * IntraBalanceQueryCriteria6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria3#mmProcessingStatus
	 * IntraBalanceQueryCriteria3.mmProcessingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProcessingStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceQueryCriteria6.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Provides the status of settlement of a transaction.";
			previousVersion_lazy = () -> IntraBalanceQueryCriteria3.mmProcessingStatus;
			minOccurs = 0;
			complexType_lazy = () -> ModificationProcessingStatus9Choice.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCashAccount
	 * CashEntry.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria6
	 * IntraBalanceQueryCriteria6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria3#mmCashAccount
	 * IntraBalanceQueryCriteria3.mmCashAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashAccount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceQueryCriteria6.mmObject();
			isDerived = false;
			xmlTag = "CshAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Account in which cash is maintained.";
			previousVersion_lazy = () -> IntraBalanceQueryCriteria3.mmCashAccount;
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentificationSearchCriteria2Choice.mmObject();
		}
	};
	@XmlElement(name = "CshAcctOwnr")
	protected List<com.tools20022.repository.msg.SystemPartyIdentification6> cashAccountOwner;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.System#mmPartyRole
	 * System.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria6
	 * IntraBalanceQueryCriteria6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria3#mmCashAccountOwner
	 * IntraBalanceQueryCriteria3.mmCashAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashAccountOwner = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> System.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceQueryCriteria6.mmObject();
			isDerived = false;
			xmlTag = "CshAcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountOwner";
			definition = "Party that owns the account.";
			previousVersion_lazy = () -> IntraBalanceQueryCriteria3.mmCashAccountOwner;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemPartyIdentification6.mmObject();
		}
	};
	@XmlElement(name = "MsgOrgtr")
	protected List<com.tools20022.repository.msg.SystemPartyIdentification6> messageOriginator;
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria6
	 * IntraBalanceQueryCriteria6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria3#mmMessageOriginator
	 * IntraBalanceQueryCriteria3.mmMessageOriginator}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMessageOriginator = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceQueryCriteria6.mmObject();
			isDerived = false;
			xmlTag = "MsgOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOriginator";
			definition = "Party that originated the message, if other than the sender.";
			previousVersion_lazy = () -> IntraBalanceQueryCriteria3.mmMessageOriginator;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemPartyIdentification6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria6
	 * IntraBalanceQueryCriteria6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria3#mmCreationDateTime
	 * IntraBalanceQueryCriteria3.mmCreationDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalanceQueryCriteria6.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::TRAD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Specifies the creation date/time of the intra-balance movement.";
			previousVersion_lazy = () -> IntraBalanceQueryCriteria3.mmCreationDateTime;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearch2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraBalanceQueryCriteria6.mmModificationRequestIdentification, com.tools20022.repository.msg.IntraBalanceQueryCriteria6.mmProcessingStatus,
						com.tools20022.repository.msg.IntraBalanceQueryCriteria6.mmCashAccount, com.tools20022.repository.msg.IntraBalanceQueryCriteria6.mmCashAccountOwner,
						com.tools20022.repository.msg.IntraBalanceQueryCriteria6.mmMessageOriginator, com.tools20022.repository.msg.IntraBalanceQueryCriteria6.mmCreationDateTime);
				trace_lazy = () -> BookEntry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IntraBalanceQueryCriteria6";
				definition = "Defines the criteria based on which information is included.";
				previousVersion_lazy = () -> IntraBalanceQueryCriteria3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<Max35Text> getModificationRequestIdentification() {
		return modificationRequestIdentification == null ? modificationRequestIdentification = new ArrayList<>() : modificationRequestIdentification;
	}

	public IntraBalanceQueryCriteria6 setModificationRequestIdentification(List<Max35Text> modificationRequestIdentification) {
		this.modificationRequestIdentification = Objects.requireNonNull(modificationRequestIdentification);
		return this;
	}

	public List<ModificationProcessingStatus9Choice> getProcessingStatus() {
		return processingStatus == null ? processingStatus = new ArrayList<>() : processingStatus;
	}

	public IntraBalanceQueryCriteria6 setProcessingStatus(List<ModificationProcessingStatus9Choice> processingStatus) {
		this.processingStatus = Objects.requireNonNull(processingStatus);
		return this;
	}

	public List<AccountIdentificationSearchCriteria2Choice> getCashAccount() {
		return cashAccount == null ? cashAccount = new ArrayList<>() : cashAccount;
	}

	public IntraBalanceQueryCriteria6 setCashAccount(List<AccountIdentificationSearchCriteria2Choice> cashAccount) {
		this.cashAccount = Objects.requireNonNull(cashAccount);
		return this;
	}

	public List<SystemPartyIdentification6> getCashAccountOwner() {
		return cashAccountOwner == null ? cashAccountOwner = new ArrayList<>() : cashAccountOwner;
	}

	public IntraBalanceQueryCriteria6 setCashAccountOwner(List<com.tools20022.repository.msg.SystemPartyIdentification6> cashAccountOwner) {
		this.cashAccountOwner = Objects.requireNonNull(cashAccountOwner);
		return this;
	}

	public List<SystemPartyIdentification6> getMessageOriginator() {
		return messageOriginator == null ? messageOriginator = new ArrayList<>() : messageOriginator;
	}

	public IntraBalanceQueryCriteria6 setMessageOriginator(List<com.tools20022.repository.msg.SystemPartyIdentification6> messageOriginator) {
		this.messageOriginator = Objects.requireNonNull(messageOriginator);
		return this;
	}

	public Optional<DateAndDateTimeSearch2Choice> getCreationDateTime() {
		return creationDateTime == null ? Optional.empty() : Optional.of(creationDateTime);
	}

	public IntraBalanceQueryCriteria6 setCreationDateTime(DateAndDateTimeSearch2Choice creationDateTime) {
		this.creationDateTime = creationDateTime;
		return this;
	}
}