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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.PartyIdentification71Choice;
import com.tools20022.repository.codeset.CopyDuplicate1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Transaction and document identification details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAndDocumentIdentification5#mmTransactionIdentification
 * TransactionAndDocumentIdentification5.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAndDocumentIdentification5#mmDocumentIdentification
 * TransactionAndDocumentIdentification5.mmDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAndDocumentIdentification5#mmCreationDateTime
 * TransactionAndDocumentIdentification5.mmCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAndDocumentIdentification5#mmCopyDuplicate
 * TransactionAndDocumentIdentification5.mmCopyDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAndDocumentIdentification5#mmMessageOriginator
 * TransactionAndDocumentIdentification5.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionAndDocumentIdentification5#mmMessageRecipient
 * TransactionAndDocumentIdentification5.mmMessageRecipient}</li>
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
 * "TransactionAndDocumentIdentification5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Transaction and document identification details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TransactionAndDocumentIdentification5", propOrder = {"transactionIdentification", "documentIdentification", "creationDateTime", "copyDuplicate", "messageOriginator", "messageRecipient"})
public class TransactionAndDocumentIdentification5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text transactionIdentification;
	/**
	 * Unambiguous identification of the transaction as known by the instructing
	 * party.
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
	 * {@linkplain com.tools20022.repository.msg.TransactionAndDocumentIdentification5
	 * TransactionAndDocumentIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as known by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionAndDocumentIdentification5.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text documentIdentification;
	/**
	 * Unique identifier of the document (message) assigned by the sender of the
	 * document.
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
	 * {@linkplain com.tools20022.repository.msg.TransactionAndDocumentIdentification5
	 * TransactionAndDocumentIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DocId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier of the document (message) assigned by the sender of the document."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDocumentIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionAndDocumentIdentification5.mmObject();
			isDerived = false;
			xmlTag = "DocId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentIdentification";
			definition = "Unique identifier of the document (message) assigned by the sender of the document.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DateAndDateTimeChoice creationDateTime;
	/**
	 * Date and time at which the transaction was created by the instructing
	 * party in its business application.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAndDocumentIdentification5
	 * TransactionAndDocumentIdentification5}</li>
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
	 * "Date and time at which the transaction was created by the instructing party in its business application."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionAndDocumentIdentification5.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the transaction was created by the instructing party in its business application.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected CopyDuplicate1Code copyDuplicate;
	/**
	 * Specifies if this document is a copy, a duplicate, or a duplicate of a
	 * copy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CopyDuplicate1Code
	 * CopyDuplicate1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAndDocumentIdentification5
	 * TransactionAndDocumentIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyDplct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDuplicate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if this document is a copy, a duplicate, or a duplicate of a copy."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCopyDuplicate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransactionAndDocumentIdentification5.mmObject();
			isDerived = false;
			xmlTag = "CpyDplct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDuplicate";
			definition = "Specifies if this document is a copy, a duplicate, or a duplicate of a copy.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CopyDuplicate1Code.mmObject();
		}
	};
	protected PartyIdentification71Choice messageOriginator;
	/**
	 * Party that originated the message, if other than the sender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAndDocumentIdentification5
	 * TransactionAndDocumentIdentification5}</li>
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
			componentContext_lazy = () -> TransactionAndDocumentIdentification5.mmObject();
			isDerived = false;
			xmlTag = "MsgOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOriginator";
			definition = "Party that originated the message, if other than the sender.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification71Choice.mmObject();
		}
	};
	protected PartyIdentification71Choice messageRecipient;
	/**
	 * Party that is the final destination of the message, if other than the
	 * receiver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionAndDocumentIdentification5
	 * TransactionAndDocumentIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgRcpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageRecipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that is the final destination of the message, if other than the receiver."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMessageRecipient = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransactionAndDocumentIdentification5.mmObject();
			isDerived = false;
			xmlTag = "MsgRcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageRecipient";
			definition = "Party that is the final destination of the message, if other than the receiver.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification71Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TransactionAndDocumentIdentification5.mmTransactionIdentification, TransactionAndDocumentIdentification5.mmDocumentIdentification,
						TransactionAndDocumentIdentification5.mmCreationDateTime, TransactionAndDocumentIdentification5.mmCopyDuplicate, TransactionAndDocumentIdentification5.mmMessageOriginator,
						TransactionAndDocumentIdentification5.mmMessageRecipient);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TransactionAndDocumentIdentification5";
				definition = "Transaction and document identification details.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TxId", required = true)
	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	@XmlElement(name = "DocId")
	public Max35Text getDocumentIdentification() {
		return documentIdentification;
	}

	public void setDocumentIdentification(Max35Text documentIdentification) {
		this.documentIdentification = documentIdentification;
	}

	@XmlElement(name = "CreDtTm")
	public DateAndDateTimeChoice getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(DateAndDateTimeChoice creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	@XmlElement(name = "CpyDplct")
	public CopyDuplicate1Code getCopyDuplicate() {
		return copyDuplicate;
	}

	public void setCopyDuplicate(CopyDuplicate1Code copyDuplicate) {
		this.copyDuplicate = copyDuplicate;
	}

	@XmlElement(name = "MsgOrgtr")
	public PartyIdentification71Choice getMessageOriginator() {
		return messageOriginator;
	}

	public void setMessageOriginator(PartyIdentification71Choice messageOriginator) {
		this.messageOriginator = messageOriginator;
	}

	@XmlElement(name = "MsgRcpt")
	public PartyIdentification71Choice getMessageRecipient() {
		return messageRecipient;
	}

	public void setMessageRecipient(PartyIdentification71Choice messageRecipient) {
		this.messageRecipient = messageRecipient;
	}
}