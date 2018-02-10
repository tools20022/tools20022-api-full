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
import com.tools20022.repository.area.setr.RedemptionMultipleOrderCancellationInstructionV02;
import com.tools20022.repository.entity.RedemptionOrder;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about a redemption multiple order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1#mmMultipleOrderDetails
 * RedemptionMultipleOrderInstruction1.mmMultipleOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1#mmIntermediaryDetails
 * RedemptionMultipleOrderInstruction1.mmIntermediaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1#mmCopyDetails
 * RedemptionMultipleOrderInstruction1.mmCopyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1#mmExtension
 * RedemptionMultipleOrderInstruction1.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RedemptionOrder
 * RedemptionOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionMultipleOrderCancellationInstructionV02#mmOrderToBeCancelled
 * RedemptionMultipleOrderCancellationInstructionV02.mmOrderToBeCancelled}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RedemptionMultipleOrderInstruction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about a redemption multiple order."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RedemptionMultipleOrderInstruction1", propOrder = {"multipleOrderDetails", "intermediaryDetails", "copyDetails", "extension"})
public class RedemptionMultipleOrderInstruction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MltplOrdrDtls", required = true)
	protected RedemptionMultipleOrder2 multipleOrderDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder2
	 * RedemptionMultipleOrder2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionOrder
	 * RedemptionOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1
	 * RedemptionMultipleOrderInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MltplOrdrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleOrderDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information related to the order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMultipleOrderDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RedemptionOrder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1.mmObject();
			isDerived = false;
			xmlTag = "MltplOrdrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleOrderDetails";
			definition = "General information related to the order.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleOrder2.mmObject();
		}
	};
	@XmlElement(name = "IntrmyDtls")
	protected List<com.tools20022.repository.msg.Intermediary4> intermediaryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary4
	 * Intermediary4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradePartyRole
	 * Trade.mmTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1
	 * RedemptionMultipleOrderInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to an intermediary."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediaryDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradePartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1.mmObject();
			isDerived = false;
			xmlTag = "IntrmyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryDetails";
			definition = "Information related to an intermediary.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Intermediary4.mmObject();
		}
	};
	@XmlElement(name = "CpyDtls")
	protected CopyInformation1 copyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CopyInformation1
	 * CopyInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1
	 * RedemptionMultipleOrderInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message is a copy."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCopyDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1.mmObject();
			isDerived = false;
			xmlTag = "CpyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDetails";
			definition = "Message is a copy.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CopyInformation1.mmObject();
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<com.tools20022.repository.msg.Extension1> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Extension1 Extension1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1
	 * RedemptionMultipleOrderInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExtension = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1.mmObject();
			isDerived = false;
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Extension1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1.mmMultipleOrderDetails, com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1.mmIntermediaryDetails,
						com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1.mmCopyDetails, com.tools20022.repository.msg.RedemptionMultipleOrderInstruction1.mmExtension);
				messageBuildingBlock_lazy = () -> Arrays.asList(RedemptionMultipleOrderCancellationInstructionV02.mmOrderToBeCancelled);
				trace_lazy = () -> RedemptionOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RedemptionMultipleOrderInstruction1";
				definition = "Information about a redemption multiple order.";
			}
		});
		return mmObject_lazy.get();
	}

	public RedemptionMultipleOrder2 getMultipleOrderDetails() {
		return multipleOrderDetails;
	}

	public RedemptionMultipleOrderInstruction1 setMultipleOrderDetails(com.tools20022.repository.msg.RedemptionMultipleOrder2 multipleOrderDetails) {
		this.multipleOrderDetails = Objects.requireNonNull(multipleOrderDetails);
		return this;
	}

	public List<Intermediary4> getIntermediaryDetails() {
		return intermediaryDetails == null ? intermediaryDetails = new ArrayList<>() : intermediaryDetails;
	}

	public RedemptionMultipleOrderInstruction1 setIntermediaryDetails(List<com.tools20022.repository.msg.Intermediary4> intermediaryDetails) {
		this.intermediaryDetails = Objects.requireNonNull(intermediaryDetails);
		return this;
	}

	public Optional<CopyInformation1> getCopyDetails() {
		return copyDetails == null ? Optional.empty() : Optional.of(copyDetails);
	}

	public RedemptionMultipleOrderInstruction1 setCopyDetails(com.tools20022.repository.msg.CopyInformation1 copyDetails) {
		this.copyDetails = copyDetails;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public RedemptionMultipleOrderInstruction1 setExtension(List<com.tools20022.repository.msg.Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}
}