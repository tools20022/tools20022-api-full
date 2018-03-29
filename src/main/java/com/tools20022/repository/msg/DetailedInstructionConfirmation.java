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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.MeetingStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MeetingInstructionStatusDetails;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Contains information relative to the status of a detailed instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedInstructionConfirmation#mmIdentification
 * DetailedInstructionConfirmation.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedInstructionConfirmation#mmStandingInstruction
 * DetailedInstructionConfirmation.mmStandingInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedInstructionConfirmation#mmStatus
 * DetailedInstructionConfirmation.mmStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MeetingStatus
 * MeetingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DetailedInstructionConfirmation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Contains information relative to the status of a detailed instruction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DetailedInstructionConfirmation", propOrder = {"identification", "standingInstruction", "status"})
public class DetailedInstructionConfirmation {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionConfirmation
	 * DetailedInstructionConfirmation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the instruction for which a status is confirmed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DetailedInstructionConfirmation, Max35Text> mmIdentification = new MMMessageAttribute<DetailedInstructionConfirmation, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedInstructionConfirmation.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identifies the instruction for which a status is confirmed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(DetailedInstructionConfirmation obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(DetailedInstructionConfirmation obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "StgInstr")
	protected YesNoIndicator standingInstruction;
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
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionConfirmation
	 * DetailedInstructionConfirmation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether standing instruction have been applied or not."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DetailedInstructionConfirmation, Optional<YesNoIndicator>> mmStandingInstruction = new MMMessageAttribute<DetailedInstructionConfirmation, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedInstructionConfirmation.mmObject();
			isDerived = false;
			xmlTag = "StgInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingInstruction";
			definition = "Indicates whether standing instruction have been applied or not.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(DetailedInstructionConfirmation obj) {
			return obj.getStandingInstruction();
		}

		@Override
		public void setValue(DetailedInstructionConfirmation obj, Optional<YesNoIndicator> value) {
			obj.setStandingInstruction(value.orElse(null));
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected MeetingInstructionStatusDetails status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionStatusDetails
	 * MeetingInstructionStatusDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionConfirmation
	 * DetailedInstructionConfirmation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the status of the instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DetailedInstructionConfirmation, MeetingInstructionStatusDetails> mmStatus = new MMMessageAssociationEnd<DetailedInstructionConfirmation, MeetingInstructionStatusDetails>() {
		{
			businessComponentTrace_lazy = () -> MeetingStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedInstructionConfirmation.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Defines the status of the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MeetingInstructionStatusDetails.mmObject();
		}

		@Override
		public MeetingInstructionStatusDetails getValue(DetailedInstructionConfirmation obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(DetailedInstructionConfirmation obj, MeetingInstructionStatusDetails value) {
			obj.setStatus(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DetailedInstructionConfirmation.mmIdentification, com.tools20022.repository.msg.DetailedInstructionConfirmation.mmStandingInstruction,
						com.tools20022.repository.msg.DetailedInstructionConfirmation.mmStatus);
				trace_lazy = () -> MeetingStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DetailedInstructionConfirmation";
				definition = "Contains information relative to the status of a detailed instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public DetailedInstructionConfirmation setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<YesNoIndicator> getStandingInstruction() {
		return standingInstruction == null ? Optional.empty() : Optional.of(standingInstruction);
	}

	public DetailedInstructionConfirmation setStandingInstruction(YesNoIndicator standingInstruction) {
		this.standingInstruction = standingInstruction;
		return this;
	}

	public MeetingInstructionStatusDetails getStatus() {
		return status;
	}

	public DetailedInstructionConfirmation setStatus(MeetingInstructionStatusDetails status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}
}