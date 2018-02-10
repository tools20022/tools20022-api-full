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
import com.tools20022.repository.choice.DateAndDateTimeSearch2Choice;
import com.tools20022.repository.choice.ModificationProcessingStatus1Choice;
import com.tools20022.repository.codeset.InstructionQueryType1Code;
import com.tools20022.repository.datatype.Max35Text;
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
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria3#mmModificationRequestIdentification
 * IntraPositionQueryCriteria3.mmModificationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria3#mmInstructionQueryType
 * IntraPositionQueryCriteria3.mmInstructionQueryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria3#mmProcessingStatus
 * IntraPositionQueryCriteria3.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria3#mmSafekeepingAccount
 * IntraPositionQueryCriteria3.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria3#mmAccountOwner
 * IntraPositionQueryCriteria3.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria3#mmMessageOriginator
 * IntraPositionQueryCriteria3.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria3#mmCreationDateTime
 * IntraPositionQueryCriteria3.mmCreationDateTime}</li>
 * </ul>
 * </li>
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
 * "IntraPositionQueryCriteria3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria based on which information is included."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraPositionQueryCriteria3", propOrder = {"modificationRequestIdentification", "instructionQueryType", "processingStatus", "safekeepingAccount", "accountOwner", "messageOriginator", "creationDateTime"})
public class IntraPositionQueryCriteria3 {

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
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria3
	 * IntraPositionQueryCriteria3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmModificationRequestIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryCriteria3.mmObject();
			isDerived = false;
			xmlTag = "ModReqId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::POOL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationRequestIdentification";
			definition = "Collective reference identifying a set of messages.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "InstrQryTp", required = true)
	protected InstructionQueryType1Code instructionQueryType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionQueryType1Code
	 * InstructionQueryType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria3
	 * IntraPositionQueryCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrQryTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionQueryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of underlying transaction to be modified, such as an settlement instruction or an intra-position movement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionQueryType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryCriteria3.mmObject();
			isDerived = false;
			xmlTag = "InstrQryTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionQueryType";
			definition = "Type of underlying transaction to be modified, such as an settlement instruction or an intra-position movement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstructionQueryType1Code.mmObject();
		}
	};
	@XmlElement(name = "PrcgSts")
	protected List<ModificationProcessingStatus1Choice> processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ModificationProcessingStatus1Choice
	 * ModificationProcessingStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria3
	 * IntraPositionQueryCriteria3}</li>
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
	public static final MMMessageAssociationEnd mmProcessingStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryCriteria3.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Provides the status of settlement of a transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ModificationProcessingStatus1Choice.mmObject();
		}
	};
	@XmlElement(name = "SfkpgAcct")
	protected List<com.tools20022.repository.msg.SecuritiesAccount13> safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria3
	 * IntraPositionQueryCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSafekeepingAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryCriteria3.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount13.mmObject();
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected List<com.tools20022.repository.msg.SystemPartyIdentification5> accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification5
	 * SystemPartyIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria3
	 * IntraPositionQueryCriteria3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountOwner = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryCriteria3.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that owns the account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemPartyIdentification5.mmObject();
		}
	};
	@XmlElement(name = "MsgOrgtr")
	protected List<com.tools20022.repository.msg.SystemPartyIdentification5> messageOriginator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification5
	 * SystemPartyIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria3
	 * IntraPositionQueryCriteria3}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryCriteria3.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria3
	 * IntraPositionQueryCriteria3}</li>
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
	 * "Specifies the creation date/time of the intra-position movement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionQueryCriteria3.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::TRAD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Specifies the creation date/time of the intra-position movement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearch2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraPositionQueryCriteria3.mmModificationRequestIdentification, com.tools20022.repository.msg.IntraPositionQueryCriteria3.mmInstructionQueryType,
						com.tools20022.repository.msg.IntraPositionQueryCriteria3.mmProcessingStatus, com.tools20022.repository.msg.IntraPositionQueryCriteria3.mmSafekeepingAccount,
						com.tools20022.repository.msg.IntraPositionQueryCriteria3.mmAccountOwner, com.tools20022.repository.msg.IntraPositionQueryCriteria3.mmMessageOriginator,
						com.tools20022.repository.msg.IntraPositionQueryCriteria3.mmCreationDateTime);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IntraPositionQueryCriteria3";
				definition = "Defines the criteria based on which information is included.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<Max35Text> getModificationRequestIdentification() {
		return modificationRequestIdentification == null ? modificationRequestIdentification = new ArrayList<>() : modificationRequestIdentification;
	}

	public IntraPositionQueryCriteria3 setModificationRequestIdentification(List<Max35Text> modificationRequestIdentification) {
		this.modificationRequestIdentification = Objects.requireNonNull(modificationRequestIdentification);
		return this;
	}

	public InstructionQueryType1Code getInstructionQueryType() {
		return instructionQueryType;
	}

	public IntraPositionQueryCriteria3 setInstructionQueryType(InstructionQueryType1Code instructionQueryType) {
		this.instructionQueryType = Objects.requireNonNull(instructionQueryType);
		return this;
	}

	public List<ModificationProcessingStatus1Choice> getProcessingStatus() {
		return processingStatus == null ? processingStatus = new ArrayList<>() : processingStatus;
	}

	public IntraPositionQueryCriteria3 setProcessingStatus(List<ModificationProcessingStatus1Choice> processingStatus) {
		this.processingStatus = Objects.requireNonNull(processingStatus);
		return this;
	}

	public List<SecuritiesAccount13> getSafekeepingAccount() {
		return safekeepingAccount == null ? safekeepingAccount = new ArrayList<>() : safekeepingAccount;
	}

	public IntraPositionQueryCriteria3 setSafekeepingAccount(List<com.tools20022.repository.msg.SecuritiesAccount13> safekeepingAccount) {
		this.safekeepingAccount = Objects.requireNonNull(safekeepingAccount);
		return this;
	}

	public List<SystemPartyIdentification5> getAccountOwner() {
		return accountOwner == null ? accountOwner = new ArrayList<>() : accountOwner;
	}

	public IntraPositionQueryCriteria3 setAccountOwner(List<com.tools20022.repository.msg.SystemPartyIdentification5> accountOwner) {
		this.accountOwner = Objects.requireNonNull(accountOwner);
		return this;
	}

	public List<SystemPartyIdentification5> getMessageOriginator() {
		return messageOriginator == null ? messageOriginator = new ArrayList<>() : messageOriginator;
	}

	public IntraPositionQueryCriteria3 setMessageOriginator(List<com.tools20022.repository.msg.SystemPartyIdentification5> messageOriginator) {
		this.messageOriginator = Objects.requireNonNull(messageOriginator);
		return this;
	}

	public Optional<DateAndDateTimeSearch2Choice> getCreationDateTime() {
		return creationDateTime == null ? Optional.empty() : Optional.of(creationDateTime);
	}

	public IntraPositionQueryCriteria3 setCreationDateTime(DateAndDateTimeSearch2Choice creationDateTime) {
		this.creationDateTime = creationDateTime;
		return this;
	}
}