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
import com.tools20022.repository.area.seev.AgentCADeactivationCancellationRequestV01;
import com.tools20022.repository.area.seev.AgentCADeactivationInstructionV01;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.ChoiceCorporateAction;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.CorporateActionStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the deactivation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstruction1#mmDeactivationDateAndTime
 * CorporateActionDeactivationInstruction1.mmDeactivationDateAndTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstruction1#mmOptionDetails
 * CorporateActionDeactivationInstruction1.mmOptionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationInstructionV01#mmDeactivationDetails
 * AgentCADeactivationInstructionV01.mmDeactivationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCADeactivationCancellationRequestV01#mmDeactivationInstructionDetails
 * AgentCADeactivationCancellationRequestV01.mmDeactivationInstructionDetails}</li>
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
 * "CorporateActionDeactivationInstruction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the deactivation."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionDeactivationInstruction1", propOrder = {"deactivationDateAndTime", "optionDetails"})
public class CorporateActionDeactivationInstruction1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime deactivationDateAndTime;
	/**
	 * Date and time at which the CSD must deactivate the corporate action event
	 * or the option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmDeactivationDateAndTime
	 * CorporateActionStatus.mmDeactivationDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstruction1
	 * CorporateActionDeactivationInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DeactvtnDtAndTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeactivationDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the CSD must deactivate the corporate action event or the option."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeactivationDateAndTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatus.mmDeactivationDateAndTime;
			componentContext_lazy = () -> CorporateActionDeactivationInstruction1.mmObject();
			isDerived = false;
			xmlTag = "DeactvtnDtAndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeactivationDateAndTime";
			definition = "Date and time at which the CSD must deactivate the corporate action event or the option.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CorporateActionOption2> optionDetails;
	/**
	 * Provides information about the option, when the deactivation instruction
	 * applies at the level of a corporate action option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionOption2
	 * CorporateActionOption2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChoiceCorporateAction#mmCorporateActionOptionDefinition
	 * ChoiceCorporateAction.mmCorporateActionOptionDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDeactivationInstruction1
	 * CorporateActionDeactivationInstruction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the option, when the deactivation instruction applies at the level of a corporate action option."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ChoiceCorporateAction.mmCorporateActionOptionDefinition;
			componentContext_lazy = () -> CorporateActionDeactivationInstruction1.mmObject();
			isDerived = false;
			xmlTag = "OptnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionDetails";
			definition = "Provides information about the option, when the deactivation instruction applies at the level of a corporate action option.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionOption2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionDeactivationInstruction1.mmDeactivationDateAndTime, CorporateActionDeactivationInstruction1.mmOptionDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCADeactivationInstructionV01.mmDeactivationDetails, AgentCADeactivationCancellationRequestV01.mmDeactivationInstructionDetails);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionDeactivationInstruction1";
				definition = "Provides information about the deactivation.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DeactvtnDtAndTm", required = true)
	public ISODateTime getDeactivationDateAndTime() {
		return deactivationDateAndTime;
	}

	public void setDeactivationDateAndTime(ISODateTime deactivationDateAndTime) {
		this.deactivationDateAndTime = deactivationDateAndTime;
	}

	@XmlElement(name = "OptnDtls")
	public List<CorporateActionOption2> getOptionDetails() {
		return optionDetails;
	}

	public void setOptionDetails(List<com.tools20022.repository.msg.CorporateActionOption2> optionDetails) {
		this.optionDetails = optionDetails;
	}
}