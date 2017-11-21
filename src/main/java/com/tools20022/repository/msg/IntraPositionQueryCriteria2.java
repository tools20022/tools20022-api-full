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
import com.tools20022.repository.choice.CancellationProcessingStatus3Choice;
import com.tools20022.repository.choice.DateAndDateTimeSearch2Choice;
import com.tools20022.repository.codeset.InstructionQueryType1Code;
import com.tools20022.repository.datatype.Max35Text;
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
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria2#mmCancellationRequestIdentification
 * IntraPositionQueryCriteria2.mmCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria2#mmInstructionQueryType
 * IntraPositionQueryCriteria2.mmInstructionQueryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria2#mmProcessingStatus
 * IntraPositionQueryCriteria2.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria2#mmSafekeepingAccount
 * IntraPositionQueryCriteria2.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria2#mmAccountOwner
 * IntraPositionQueryCriteria2.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria2#mmMessageOriginator
 * IntraPositionQueryCriteria2.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria2#mmCreationDateTime
 * IntraPositionQueryCriteria2.mmCreationDateTime}</li>
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
 * "IntraPositionQueryCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria based on which information is included."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "IntraPositionQueryCriteria2", propOrder = {"cancellationRequestIdentification", "instructionQueryType", "processingStatus", "safekeepingAccount", "accountOwner", "messageOriginator", "creationDateTime"})
public class IntraPositionQueryCriteria2 {

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
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria2
	 * IntraPositionQueryCriteria2}</li>
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
			componentContext_lazy = () -> IntraPositionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "CxlReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequestIdentification";
			definition = "Collective reference identifying a set of messages.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected InstructionQueryType1Code instructionQueryType;
	/**
	 * Type of underlying transaction to be cancelled, such as an settlement
	 * instruction or an intra-position movement.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria2
	 * IntraPositionQueryCriteria2}</li>
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
	 * "Type of underlying transaction to be cancelled, such as an settlement instruction or an intra-position movement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionQueryType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IntraPositionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "InstrQryTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionQueryType";
			definition = "Type of underlying transaction to be cancelled, such as an settlement instruction or an intra-position movement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstructionQueryType1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria2
	 * IntraPositionQueryCriteria2}</li>
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
			componentContext_lazy = () -> IntraPositionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Provides the status of settlement of a transaction.";
			minOccurs = 0;
			complexType_lazy = () -> CancellationProcessingStatus3Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SecuritiesAccount13> safekeepingAccount;
	/**
	 * Account to or from which a securities entry is made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria2
	 * IntraPositionQueryCriteria2}</li>
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
			componentContext_lazy = () -> IntraPositionQueryCriteria2.mmObject();
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
	protected List<com.tools20022.repository.msg.SystemPartyIdentification5> accountOwner;
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
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria2
	 * IntraPositionQueryCriteria2}</li>
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
			componentContext_lazy = () -> IntraPositionQueryCriteria2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria2
	 * IntraPositionQueryCriteria2}</li>
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
			componentContext_lazy = () -> IntraPositionQueryCriteria2.mmObject();
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
	 * Specifies the creation date/time of the settlement instruction or the
	 * intra-position movement.
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
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria2
	 * IntraPositionQueryCriteria2}</li>
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
	 * "Specifies the creation date/time of the settlement instruction or the intra-position movement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IntraPositionQueryCriteria2.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Specifies the creation date/time of the settlement instruction or the intra-position movement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearch2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(IntraPositionQueryCriteria2.mmCancellationRequestIdentification, IntraPositionQueryCriteria2.mmInstructionQueryType, IntraPositionQueryCriteria2.mmProcessingStatus,
						IntraPositionQueryCriteria2.mmSafekeepingAccount, IntraPositionQueryCriteria2.mmAccountOwner, IntraPositionQueryCriteria2.mmMessageOriginator, IntraPositionQueryCriteria2.mmCreationDateTime);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IntraPositionQueryCriteria2";
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

	@XmlElement(name = "InstrQryTp", required = true)
	public InstructionQueryType1Code getInstructionQueryType() {
		return instructionQueryType;
	}

	public void setInstructionQueryType(InstructionQueryType1Code instructionQueryType) {
		this.instructionQueryType = instructionQueryType;
	}

	@XmlElement(name = "PrcgSts")
	public List<CancellationProcessingStatus3Choice> getProcessingStatus() {
		return processingStatus;
	}

	public void setProcessingStatus(List<CancellationProcessingStatus3Choice> processingStatus) {
		this.processingStatus = processingStatus;
	}

	@XmlElement(name = "SfkpgAcct")
	public List<SecuritiesAccount13> getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public void setSafekeepingAccount(List<com.tools20022.repository.msg.SecuritiesAccount13> safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
	}

	@XmlElement(name = "AcctOwnr")
	public List<SystemPartyIdentification5> getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(List<com.tools20022.repository.msg.SystemPartyIdentification5> accountOwner) {
		this.accountOwner = accountOwner;
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