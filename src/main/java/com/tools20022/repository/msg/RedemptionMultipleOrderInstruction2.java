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
import com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV03;
import com.tools20022.repository.entity.RedemptionOrder;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Extension1;
import com.tools20022.repository.msg.Intermediary8;
import com.tools20022.repository.msg.RedemptionMultipleOrder3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction2#mmMultipleOrderDetails
 * RedemptionMultipleOrderInstruction2.mmMultipleOrderDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction2#mmRelatedPartyDetails
 * RedemptionMultipleOrderInstruction2.mmRelatedPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction2#mmExtension
 * RedemptionMultipleOrderInstruction2.mmExtension}</li>
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
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV03#mmCancellationByOrderDetails
 * RedemptionOrderCancellationRequestV03.mmCancellationByOrderDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RedemptionMultipleOrderInstruction2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about a redemption multiple order."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedPartiesDetailsRule#forRedemptionMultipleOrderInstruction2
 * ConstraintRelatedPartiesDetailsRule.forRedemptionMultipleOrderInstruction2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RedemptionMultipleOrderInstruction2", propOrder = {"multipleOrderDetails", "relatedPartyDetails", "extension"})
public class RedemptionMultipleOrderInstruction2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MltplOrdrDtls", required = true)
	protected RedemptionMultipleOrder3 multipleOrderDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrder3
	 * RedemptionMultipleOrder3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionOrder
	 * RedemptionOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction2
	 * RedemptionMultipleOrderInstruction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MltplOrdrDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleOrderDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information related to the order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionMultipleOrderInstruction2, RedemptionMultipleOrder3> mmMultipleOrderDetails = new MMMessageAssociationEnd<RedemptionMultipleOrderInstruction2, RedemptionMultipleOrder3>() {
		{
			businessComponentTrace_lazy = () -> RedemptionOrder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleOrderInstruction2.mmObject();
			isDerived = false;
			xmlTag = "MltplOrdrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleOrderDetails";
			definition = "General information related to the order.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RedemptionMultipleOrder3.mmObject();
		}

		@Override
		public RedemptionMultipleOrder3 getValue(RedemptionMultipleOrderInstruction2 obj) {
			return obj.getMultipleOrderDetails();
		}

		@Override
		public void setValue(RedemptionMultipleOrderInstruction2 obj, RedemptionMultipleOrder3 value) {
			obj.setMultipleOrderDetails(value);
		}
	};
	@XmlElement(name = "RltdPtyDtls")
	protected List<Intermediary8> relatedPartyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary8
	 * Intermediary8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradePartyRole
	 * Trade.mmTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction2
	 * RedemptionMultipleOrderInstruction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPtyDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about parties related to the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionMultipleOrderInstruction2, List<Intermediary8>> mmRelatedPartyDetails = new MMMessageAssociationEnd<RedemptionMultipleOrderInstruction2, List<Intermediary8>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradePartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleOrderInstruction2.mmObject();
			isDerived = false;
			xmlTag = "RltdPtyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartyDetails";
			definition = "Information about parties related to the transaction.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Intermediary8.mmObject();
		}

		@Override
		public List<Intermediary8> getValue(RedemptionMultipleOrderInstruction2 obj) {
			return obj.getRelatedPartyDetails();
		}

		@Override
		public void setValue(RedemptionMultipleOrderInstruction2 obj, List<Intermediary8> value) {
			obj.setRelatedPartyDetails(value);
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension1> extension;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleOrderInstruction2
	 * RedemptionMultipleOrderInstruction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionMultipleOrderInstruction2, List<Extension1>> mmExtension = new MMMessageAssociationEnd<RedemptionMultipleOrderInstruction2, List<Extension1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleOrderInstruction2.mmObject();
			isDerived = false;
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(RedemptionMultipleOrderInstruction2 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(RedemptionMultipleOrderInstruction2 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionMultipleOrderInstruction2.mmMultipleOrderDetails, com.tools20022.repository.msg.RedemptionMultipleOrderInstruction2.mmRelatedPartyDetails,
						com.tools20022.repository.msg.RedemptionMultipleOrderInstruction2.mmExtension);
				messageBuildingBlock_lazy = () -> Arrays.asList(RedemptionOrderCancellationRequestV03.mmCancellationByOrderDetails);
				trace_lazy = () -> RedemptionOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRelatedPartiesDetailsRule.forRedemptionMultipleOrderInstruction2);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RedemptionMultipleOrderInstruction2";
				definition = "Information about a redemption multiple order.";
			}
		});
		return mmObject_lazy.get();
	}

	public RedemptionMultipleOrder3 getMultipleOrderDetails() {
		return multipleOrderDetails;
	}

	public RedemptionMultipleOrderInstruction2 setMultipleOrderDetails(RedemptionMultipleOrder3 multipleOrderDetails) {
		this.multipleOrderDetails = Objects.requireNonNull(multipleOrderDetails);
		return this;
	}

	public List<Intermediary8> getRelatedPartyDetails() {
		return relatedPartyDetails == null ? relatedPartyDetails = new ArrayList<>() : relatedPartyDetails;
	}

	public RedemptionMultipleOrderInstruction2 setRelatedPartyDetails(List<Intermediary8> relatedPartyDetails) {
		this.relatedPartyDetails = Objects.requireNonNull(relatedPartyDetails);
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public RedemptionMultipleOrderInstruction2 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}
}