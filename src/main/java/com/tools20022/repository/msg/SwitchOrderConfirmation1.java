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
import com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SwitchExecution;
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
 * Switch order confirmation details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderConfirmation1#mmAmendmentIndicator
 * SwitchOrderConfirmation1.mmAmendmentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderConfirmation1#mmSwitchExecutionDetails
 * SwitchOrderConfirmation1.mmSwitchExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderConfirmation1#mmExtension
 * SwitchOrderConfirmation1.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SwitchExecution
 * SwitchExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#mmCancellationByOrderConfirmationDetails
 * SwitchOrderConfirmationCancellationInstructionV01.
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility4Rule#forSwitchOrderConfirmation1
 * ConstraintOrderOriginatorEligibility4Rule.forSwitchOrderConfirmation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMultipleSwitchExecutionRule#forSwitchOrderConfirmation1
 * ConstraintMultipleSwitchExecutionRule.forSwitchOrderConfirmation1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SwitchOrderConfirmation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Switch order confirmation details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SwitchOrderConfirmation1", propOrder = {"amendmentIndicator", "switchExecutionDetails", "extension"})
public class SwitchOrderConfirmation1 {

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
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderConfirmation1
	 * SwitchOrderConfirmation1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchOrderConfirmation1.mmObject();
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
	@XmlElement(name = "SwtchExctnDtls", required = true)
	protected List<com.tools20022.repository.msg.SwitchExecution4> switchExecutionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SwitchExecution4
	 * SwitchExecution4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecution
	 * SwitchExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderConfirmation1
	 * SwitchOrderConfirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SwtchExctnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchExecutionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to a switch execution."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSwitchExecutionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SwitchExecution.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchOrderConfirmation1.mmObject();
			isDerived = false;
			xmlTag = "SwtchExctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchExecutionDetails";
			definition = "Information related to a switch execution.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SwitchExecution4.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderConfirmation1
	 * SwitchOrderConfirmation1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchOrderConfirmation1.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchOrderConfirmation1.mmAmendmentIndicator, com.tools20022.repository.msg.SwitchOrderConfirmation1.mmSwitchExecutionDetails,
						com.tools20022.repository.msg.SwitchOrderConfirmation1.mmExtension);
				messageBuildingBlock_lazy = () -> Arrays.asList(SwitchOrderConfirmationCancellationInstructionV01.mmCancellationByOrderConfirmationDetails);
				trace_lazy = () -> SwitchExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility4Rule.forSwitchOrderConfirmation1,
						com.tools20022.repository.constraints.ConstraintMultipleSwitchExecutionRule.forSwitchOrderConfirmation1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SwitchOrderConfirmation1";
				definition = "Switch order confirmation details.";
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getAmendmentIndicator() {
		return amendmentIndicator;
	}

	public SwitchOrderConfirmation1 setAmendmentIndicator(YesNoIndicator amendmentIndicator) {
		this.amendmentIndicator = Objects.requireNonNull(amendmentIndicator);
		return this;
	}

	public List<SwitchExecution4> getSwitchExecutionDetails() {
		return switchExecutionDetails == null ? switchExecutionDetails = new ArrayList<>() : switchExecutionDetails;
	}

	public SwitchOrderConfirmation1 setSwitchExecutionDetails(List<com.tools20022.repository.msg.SwitchExecution4> switchExecutionDetails) {
		this.switchExecutionDetails = Objects.requireNonNull(switchExecutionDetails);
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public SwitchOrderConfirmation1 setExtension(List<com.tools20022.repository.msg.Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}
}