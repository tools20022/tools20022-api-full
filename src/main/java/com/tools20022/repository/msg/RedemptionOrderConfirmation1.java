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
import com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV01;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.RedemptionExecution;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
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
 * Order confirmation details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrderConfirmation1#mmAmendmentIndicator
 * RedemptionOrderConfirmation1.mmAmendmentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrderConfirmation1#mmMultipleExecutionDetails
 * RedemptionOrderConfirmation1.mmMultipleExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrderConfirmation1#mmRelatedPartyDetails
 * RedemptionOrderConfirmation1.mmRelatedPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionOrderConfirmation1#mmExtension
 * RedemptionOrderConfirmation1.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RedemptionExecution
 * RedemptionExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV01#mmCancellationByOrderConfirmationDetails
 * RedemptionOrderConfirmationCancellationInstructionV01.
 * mmCancellationByOrderConfirmationDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderReferenceRule#forRedemptionOrderConfirmation1
 * ConstraintOrderReferenceRule.forRedemptionOrderConfirmation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedPartiesDetailsRule#forRedemptionOrderConfirmation1
 * ConstraintRelatedPartiesDetailsRule.forRedemptionOrderConfirmation1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RedemptionOrderConfirmation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Order confirmation details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RedemptionOrderConfirmation1", propOrder = {"amendmentIndicator", "multipleExecutionDetails", "relatedPartyDetails", "extension"})
public class RedemptionOrderConfirmation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AmdmntInd", required = true)
	protected YesNoIndicator amendmentIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrderConfirmation1
	 * RedemptionOrderConfirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmdmntInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a confirmation amendment message will follow the confirmation cancellation instruction or not."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmendmentIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionOrderConfirmation1.mmObject();
			isDerived = false;
			xmlTag = "AmdmntInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentIndicator";
			definition = "Indicates whether a confirmation amendment message will follow the confirmation cancellation instruction or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "MltplExctnDtls", required = true)
	protected RedemptionMultipleExecution3 multipleExecutionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3
	 * RedemptionMultipleExecution3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionExecution
	 * RedemptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrderConfirmation1
	 * RedemptionOrderConfirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MltplExctnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleExecutionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information related to the execution of investment fund orders."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMultipleExecutionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RedemptionExecution.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionOrderConfirmation1.mmObject();
			isDerived = false;
			xmlTag = "MltplExctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleExecutionDetails";
			definition = "General information related to the execution of investment fund orders.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution3.mmObject();
		}
	};
	@XmlElement(name = "RltdPtyDtls")
	protected List<com.tools20022.repository.msg.Intermediary9> relatedPartyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary9
	 * Intermediary9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradePartyRole
	 * Trade.mmTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrderConfirmation1
	 * RedemptionOrderConfirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPtyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about parties related to the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedPartyDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradePartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionOrderConfirmation1.mmObject();
			isDerived = false;
			xmlTag = "RltdPtyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartyDetails";
			definition = "Information about parties related to the transaction.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Intermediary9.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionOrderConfirmation1
	 * RedemptionOrderConfirmation1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionOrderConfirmation1.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionOrderConfirmation1.mmAmendmentIndicator, com.tools20022.repository.msg.RedemptionOrderConfirmation1.mmMultipleExecutionDetails,
						com.tools20022.repository.msg.RedemptionOrderConfirmation1.mmRelatedPartyDetails, com.tools20022.repository.msg.RedemptionOrderConfirmation1.mmExtension);
				messageBuildingBlock_lazy = () -> Arrays.asList(RedemptionOrderConfirmationCancellationInstructionV01.mmCancellationByOrderConfirmationDetails);
				trace_lazy = () -> RedemptionExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOrderReferenceRule.forRedemptionOrderConfirmation1,
						com.tools20022.repository.constraints.ConstraintRelatedPartiesDetailsRule.forRedemptionOrderConfirmation1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RedemptionOrderConfirmation1";
				definition = "Order confirmation details.";
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getAmendmentIndicator() {
		return amendmentIndicator;
	}

	public RedemptionOrderConfirmation1 setAmendmentIndicator(YesNoIndicator amendmentIndicator) {
		this.amendmentIndicator = Objects.requireNonNull(amendmentIndicator);
		return this;
	}

	public RedemptionMultipleExecution3 getMultipleExecutionDetails() {
		return multipleExecutionDetails;
	}

	public RedemptionOrderConfirmation1 setMultipleExecutionDetails(com.tools20022.repository.msg.RedemptionMultipleExecution3 multipleExecutionDetails) {
		this.multipleExecutionDetails = Objects.requireNonNull(multipleExecutionDetails);
		return this;
	}

	public List<Intermediary9> getRelatedPartyDetails() {
		return relatedPartyDetails == null ? relatedPartyDetails = new ArrayList<>() : relatedPartyDetails;
	}

	public RedemptionOrderConfirmation1 setRelatedPartyDetails(List<com.tools20022.repository.msg.Intermediary9> relatedPartyDetails) {
		this.relatedPartyDetails = Objects.requireNonNull(relatedPartyDetails);
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public RedemptionOrderConfirmation1 setExtension(List<com.tools20022.repository.msg.Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}
}