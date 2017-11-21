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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesTradeExecution;
import com.tools20022.repository.entity.SecuritiesTradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to a linked transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Linkages14#mmProcessingPosition
 * Linkages14.mmProcessingPosition}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages14#mmMessageNumber
 * Linkages14.mmMessageNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages14#mmReference
 * Linkages14.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages14#mmLinkedQuantity
 * Linkages14.mmLinkedQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages14#mmReferenceOwner
 * Linkages14.mmReferenceOwner}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
 * SecuritiesTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Linkages14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to a linked transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Linkages14", propOrder = {"processingPosition", "messageNumber", "reference", "linkedQuantity", "referenceOwner"})
public class Linkages14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ProcessingPosition3Choice processingPosition;
	/**
	 * When the transaction is to be executed relative to a linked transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition3Choice
	 * ProcessingPosition3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Linkages14
	 * Linkages14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgPos"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When the transaction is to be executed relative to a linked transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProcessingPosition = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Linkages14.mmObject();
			isDerived = false;
			xmlTag = "PrcgPos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingPosition";
			definition = "When the transaction is to be executed relative to a linked transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingPosition3Choice.mmObject();
		}
	};
	protected DocumentNumber2Choice messageNumber;
	/**
	 * Message type number/message identifier of the message referenced in the
	 * linkage sequence.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DocumentNumber2Choice
	 * DocumentNumber2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Linkages14
	 * Linkages14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message type number/message identifier of the message referenced in the linkage sequence."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMessageNumber = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Linkages14.mmObject();
			isDerived = false;
			xmlTag = "MsgNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageNumber";
			definition = "Message type number/message identifier of the message referenced in the linkage sequence.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DocumentNumber2Choice.mmObject();
		}
	};
	protected References16Choice reference;
	/**
	 * Reference to the linked transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.References16Choice
	 * References16Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Linkages14
	 * Linkages14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to the linked transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReference = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeIdentification.mmObject();
			componentContext_lazy = () -> Linkages14.mmObject();
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Reference to the linked transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> References16Choice.mmObject();
		}
	};
	protected PairedOrTurnedQuantity2Choice linkedQuantity;
	/**
	 * Quantity of financial instruments of the linked transaction to be
	 * paired-off or turned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PairedOrTurnedQuantity2Choice
	 * PairedOrTurnedQuantity2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Linkages14
	 * Linkages14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instruments of the linked transaction to be paired-off or turned."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLinkedQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> Linkages14.mmObject();
			isDerived = false;
			xmlTag = "LkdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedQuantity";
			definition = "Quantity of financial instruments of the linked transaction to be paired-off or turned.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PairedOrTurnedQuantity2Choice.mmObject();
		}
	};
	protected PartyIdentification64Choice referenceOwner;
	/**
	 * Party that generates the reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification64Choice
	 * PartyIdentification64Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Linkages14
	 * Linkages14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that generates the reference."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReferenceOwner = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Linkages14.mmObject();
			isDerived = false;
			xmlTag = "RefOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceOwner";
			definition = "Party that generates the reference.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification64Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Linkages14.mmProcessingPosition, Linkages14.mmMessageNumber, Linkages14.mmReference, Linkages14.mmLinkedQuantity, Linkages14.mmReferenceOwner);
				trace_lazy = () -> SecuritiesTradeIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Linkages14";
				definition = "Information related to a linked transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PrcgPos")
	public ProcessingPosition3Choice getProcessingPosition() {
		return processingPosition;
	}

	public void setProcessingPosition(ProcessingPosition3Choice processingPosition) {
		this.processingPosition = processingPosition;
	}

	@XmlElement(name = "MsgNb")
	public DocumentNumber2Choice getMessageNumber() {
		return messageNumber;
	}

	public void setMessageNumber(DocumentNumber2Choice messageNumber) {
		this.messageNumber = messageNumber;
	}

	@XmlElement(name = "Ref", required = true)
	public References16Choice getReference() {
		return reference;
	}

	public void setReference(References16Choice reference) {
		this.reference = reference;
	}

	@XmlElement(name = "LkdQty")
	public PairedOrTurnedQuantity2Choice getLinkedQuantity() {
		return linkedQuantity;
	}

	public void setLinkedQuantity(PairedOrTurnedQuantity2Choice linkedQuantity) {
		this.linkedQuantity = linkedQuantity;
	}

	@XmlElement(name = "RefOwnr")
	public PartyIdentification64Choice getReferenceOwner() {
		return referenceOwner;
	}

	public void setReferenceOwner(PartyIdentification64Choice referenceOwner) {
		this.referenceOwner = referenceOwner;
	}
}