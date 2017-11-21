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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01;
import com.tools20022.repository.choice.CorporateActionOption1FormatChoice;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.entity.CorporateActionOption;
import com.tools20022.repository.entity.CorporateActionStatus;
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
 * Provides status of the deactivation instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1#mmProcessedStatusOrRejectedStatusRule
 * CorporateActionDeactivationInstructionStatus1.
 * mmProcessedStatusOrRejectedStatusRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1#mmOptionType
 * CorporateActionDeactivationInstructionStatus1.mmOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1#mmOptionNumber
 * CorporateActionDeactivationInstructionStatus1.mmOptionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1#mmProcessedStatus
 * CorporateActionDeactivationInstructionStatus1.mmProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1#mmRejectedStatus
 * CorporateActionDeactivationInstructionStatus1.mmRejectedStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionStatus
 * CorporateActionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationStatusAdviceV01#mmDeactivationInstructionStatus
 * AgentCADeactivationStatusAdviceV01.mmDeactivationInstructionStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionDeactivationInstructionStatus1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides status of the deactivation instruction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionDeactivationInstructionStatus1", propOrder = {"optionType", "optionNumber", "processedStatus", "rejectedStatus"})
public class CorporateActionDeactivationInstructionStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionOption1FormatChoice optionType;
	/**
	 * Specifies the corporate action options available to the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionOption1FormatChoice
	 * CorporateActionOption1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionType
	 * CorporateActionOption.mmOptionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1
	 * CorporateActionDeactivationInstructionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the corporate action options available to the account owner."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOptionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionType;
			componentContext_lazy = () -> CorporateActionDeactivationInstructionStatus1.mmObject();
			isDerived = false;
			xmlTag = "OptnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionType";
			definition = "Specifies the corporate action options available to the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionOption1FormatChoice.mmObject();
		}
	};
	protected Exact3NumericText optionNumber;
	/**
	 * Number identifying the available corporate action options.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmOptionNumber
	 * CorporateActionOption.mmOptionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1
	 * CorporateActionDeactivationInstructionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying the available corporate action options."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOptionNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmOptionNumber;
			componentContext_lazy = () -> CorporateActionDeactivationInstructionStatus1.mmObject();
			isDerived = false;
			xmlTag = "OptnNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumber";
			definition = "Number identifying the available corporate action options.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	protected CorporateActionDeactivationInstructionProcessingStatus1 processedStatus;
	/**
	 * Provides information about the processing status of the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionProcessingStatus1
	 * CorporateActionDeactivationInstructionProcessingStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1
	 * CorporateActionDeactivationInstructionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcdSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the processing status of the instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProcessedStatus = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatus.mmObject();
			componentContext_lazy = () -> CorporateActionDeactivationInstructionStatus1.mmObject();
			isDerived = false;
			xmlTag = "PrcdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessedStatus";
			definition = "Provides information about the processing status of the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionDeactivationInstructionProcessingStatus1.mmObject();
		}
	};
	protected CorporateActionDeactivationInstructionRejectionStatus1 rejectedStatus;
	/**
	 * Provides information about the rejection status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionRejectionStatus1
	 * CorporateActionDeactivationInstructionRejectionStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1
	 * CorporateActionDeactivationInstructionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctdSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the rejection status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRejectedStatus = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatus.mmObject();
			componentContext_lazy = () -> CorporateActionDeactivationInstructionStatus1.mmObject();
			isDerived = false;
			xmlTag = "RjctdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedStatus";
			definition = "Provides information about the rejection status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionDeactivationInstructionRejectionStatus1.mmObject();
		}
	};
	/**
	 * Either ProcessedStatus or RejectedStatus must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1
	 * CorporateActionDeactivationInstructionStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1#mmProcessedStatus
	 * CorporateActionDeactivationInstructionStatus1.mmProcessedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstructionStatus1#mmRejectedStatus
	 * CorporateActionDeactivationInstructionStatus1.mmRejectedStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessedStatusOrRejectedStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Either ProcessedStatus or RejectedStatus must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmProcessedStatusOrRejectedStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessedStatusOrRejectedStatusRule";
			definition = "Either ProcessedStatus or RejectedStatus must be present.";
			messageComponent_lazy = () -> CorporateActionDeactivationInstructionStatus1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(CorporateActionDeactivationInstructionStatus1.mmProcessedStatus, CorporateActionDeactivationInstructionStatus1.mmRejectedStatus);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionDeactivationInstructionStatus1.mmOptionType, CorporateActionDeactivationInstructionStatus1.mmOptionNumber,
						CorporateActionDeactivationInstructionStatus1.mmProcessedStatus, CorporateActionDeactivationInstructionStatus1.mmRejectedStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCADeactivationStatusAdviceV01.mmDeactivationInstructionStatus);
				trace_lazy = () -> CorporateActionStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CorporateActionDeactivationInstructionStatus1";
				definition = "Provides status of the deactivation instruction.";
				xors_lazy = () -> Arrays.asList(CorporateActionDeactivationInstructionStatus1.mmProcessedStatusOrRejectedStatusRule);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "OptnTp")
	public CorporateActionOption1FormatChoice getOptionType() {
		return optionType;
	}

	public void setOptionType(CorporateActionOption1FormatChoice optionType) {
		this.optionType = optionType;
	}

	@XmlElement(name = "OptnNb")
	public Exact3NumericText getOptionNumber() {
		return optionNumber;
	}

	public void setOptionNumber(Exact3NumericText optionNumber) {
		this.optionNumber = optionNumber;
	}

	@XmlElement(name = "PrcdSts", required = true)
	public CorporateActionDeactivationInstructionProcessingStatus1 getProcessedStatus() {
		return processedStatus;
	}

	public void setProcessedStatus(com.tools20022.repository.msg.CorporateActionDeactivationInstructionProcessingStatus1 processedStatus) {
		this.processedStatus = processedStatus;
	}

	@XmlElement(name = "RjctdSts", required = true)
	public CorporateActionDeactivationInstructionRejectionStatus1 getRejectedStatus() {
		return rejectedStatus;
	}

	public void setRejectedStatus(com.tools20022.repository.msg.CorporateActionDeactivationInstructionRejectionStatus1 rejectedStatus) {
		this.rejectedStatus = rejectedStatus;
	}
}