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
import com.tools20022.repository.area.setr.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * References a related message or provides another reference, such as a pool
 * reference, linking a set of messages. The party which issued the related
 * reference may be the Sender of the referenced message or a party other than
 * the Sender.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference9#mmReference
 * AdditionalReference9.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference9#mmReferenceIssuer
 * AdditionalReference9.mmReferenceIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference9#mmMessageName
 * AdditionalReference9.mmMessageName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.GenericIdentification
 * GenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04#mmPoolReference
 * SubscriptionBulkOrderConfirmationV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV04#mmPoolReference
 * RedemptionBulkOrderV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV04#mmPoolReference
 * SubscriptionBulkOrderCancellationRequestV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV04#mmPoolReference
 * RedemptionOrderV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV04#mmPoolReference
 * SubscriptionOrderCancellationRequestV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV02#mmPoolReference
 * RedemptionBulkOrderConfirmationCancellationInstructionV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV04#mmPoolReference
 * RedemptionBulkOrderConfirmationV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV04#mmPoolReference
 * RedemptionBulkOrderCancellationRequestV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV04#mmPoolReference
 * SwitchOrderConfirmationV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04#mmPoolReference
 * SubscriptionOrderConfirmationV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV02#mmPoolReference
 * SubscriptionOrderConfirmationCancellationInstructionV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV04#mmPoolReference
 * SwitchOrderCancellationRequestV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#mmPoolReference
 * SwitchOrderV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV02#mmPoolReference
 * RedemptionOrderConfirmationCancellationInstructionV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04#mmPoolReference
 * RedemptionOrderConfirmationV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02#mmPoolReference
 * SubscriptionBulkOrderConfirmationCancellationInstructionV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV04#mmPoolReference
 * RedemptionOrderCancellationRequestV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV04#mmPoolReference
 * SubscriptionBulkOrderV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02#mmPoolReference
 * SwitchOrderConfirmationCancellationInstructionV02.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV04#mmPoolReference
 * SubscriptionOrderV04.mmPoolReference}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditionalReference9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "References a related message or provides another reference, such as a pool reference, linking a set of messages. The party which issued the related reference may be the Sender of the referenced message or a party other than the Sender."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AdditionalReference8
 * AdditionalReference8}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AdditionalReference9", propOrder = {"reference", "referenceIssuer", "messageName"})
public class AdditionalReference9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text reference;
	/**
	 * Reference identifying a set of messages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference9
	 * AdditionalReference9}</li>
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
	 * definition} = "Reference identifying a set of messages."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8#mmReference
	 * AdditionalReference8.mmReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> AdditionalReference9.mmObject();
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Reference identifying a set of messages.";
			previousVersion_lazy = () -> AdditionalReference8.mmReference;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PartyIdentification113 referenceIssuer;
	/**
	 * Issuer of the reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification113
	 * PartyIdentification113}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference9
	 * AdditionalReference9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefIssr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer of the reference."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8#mmReferenceIssuer
	 * AdditionalReference8.mmReferenceIssuer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferenceIssuer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> AdditionalReference9.mmObject();
			isDerived = false;
			xmlTag = "RefIssr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceIssuer";
			definition = "Issuer of the reference.";
			previousVersion_lazy = () -> AdditionalReference8.mmReferenceIssuer;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentification113.mmObject();
		}
	};
	protected Max35Text messageName;
	/**
	 * Name of the message.
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference9
	 * AdditionalReference9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8#mmMessageName
	 * AdditionalReference8.mmMessageName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessageName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AdditionalReference9.mmObject();
			isDerived = false;
			xmlTag = "MsgNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageName";
			definition = "Name of the message.";
			previousVersion_lazy = () -> AdditionalReference8.mmMessageName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AdditionalReference9.mmReference, AdditionalReference9.mmReferenceIssuer, AdditionalReference9.mmMessageName);
				messageBuildingBlock_lazy = () -> Arrays.asList(SubscriptionBulkOrderConfirmationV04.mmPoolReference, RedemptionBulkOrderV04.mmPoolReference, SubscriptionBulkOrderCancellationRequestV04.mmPoolReference,
						RedemptionOrderV04.mmPoolReference, SubscriptionOrderCancellationRequestV04.mmPoolReference, RedemptionBulkOrderConfirmationCancellationInstructionV02.mmPoolReference,
						RedemptionBulkOrderConfirmationV04.mmPoolReference, RedemptionBulkOrderCancellationRequestV04.mmPoolReference, SwitchOrderConfirmationV04.mmPoolReference, SubscriptionOrderConfirmationV04.mmPoolReference,
						SubscriptionOrderConfirmationCancellationInstructionV02.mmPoolReference, SwitchOrderCancellationRequestV04.mmPoolReference, SwitchOrderV04.mmPoolReference,
						RedemptionOrderConfirmationCancellationInstructionV02.mmPoolReference, RedemptionOrderConfirmationV04.mmPoolReference, SubscriptionBulkOrderConfirmationCancellationInstructionV02.mmPoolReference,
						RedemptionOrderCancellationRequestV04.mmPoolReference, SubscriptionBulkOrderV04.mmPoolReference, SwitchOrderConfirmationCancellationInstructionV02.mmPoolReference, SubscriptionOrderV04.mmPoolReference);
				trace_lazy = () -> GenericIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalReference9";
				definition = "References a related message or provides another reference, such as a pool reference, linking a set of messages. The party which issued the related reference may be the Sender of the referenced message or a party other than the Sender.";
				previousVersion_lazy = () -> AdditionalReference8.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Ref", required = true)
	public Max35Text getReference() {
		return reference;
	}

	public void setReference(Max35Text reference) {
		this.reference = reference;
	}

	@XmlElement(name = "RefIssr")
	public PartyIdentification113 getReferenceIssuer() {
		return referenceIssuer;
	}

	public void setReferenceIssuer(com.tools20022.repository.msg.PartyIdentification113 referenceIssuer) {
		this.referenceIssuer = referenceIssuer;
	}

	@XmlElement(name = "MsgNm")
	public Max35Text getMessageName() {
		return messageName;
	}

	public void setMessageName(Max35Text messageName) {
		this.messageName = messageName;
	}
}