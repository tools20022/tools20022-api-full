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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.MeetingInstructionStatusV03;
import com.tools20022.repository.area.seev.MeetingInstructionStatusV04;
import com.tools20022.repository.area.seev.MeetingInstructionStatusV05;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MessageIdentification;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Type of instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionType1Choice#mmInstructionIdentification
 * InstructionType1Choice.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionType1Choice#mmInstructionCancellationIdentification
 * InstructionType1Choice.mmInstructionCancellationIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV03#mmInstructionType
 * MeetingInstructionStatusV03.mmInstructionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV04#mmInstructionType
 * MeetingInstructionStatusV04.mmInstructionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV05#mmInstructionType
 * MeetingInstructionStatusV05.mmInstructionType}</li>
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
 * "InstructionType1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of instruction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InstructionType1Choice", propOrder = {"instructionIdentification", "instructionCancellationIdentification"})
public class InstructionType1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InstrId", required = true)
	protected MessageIdentification instructionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageIdentification
	 * MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionType1Choice
	 * InstructionType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the meeting instruction message for which the status is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionType1Choice, MessageIdentification> mmInstructionIdentification = new MMMessageAssociationEnd<InstructionType1Choice, MessageIdentification>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionType1Choice.mmObject();
			isDerived = false;
			xmlTag = "InstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIdentification";
			definition = "Identifies the meeting instruction message for which the status is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MessageIdentification.mmObject();
		}

		@Override
		public MessageIdentification getValue(InstructionType1Choice obj) {
			return obj.getInstructionIdentification();
		}

		@Override
		public void setValue(InstructionType1Choice obj, MessageIdentification value) {
			obj.setInstructionIdentification(value);
		}
	};
	@XmlElement(name = "InstrCxlId", required = true)
	protected MessageIdentification instructionCancellationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageIdentification
	 * MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionType1Choice
	 * InstructionType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrCxlId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCancellationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the meeting instruction cancellation request message for which the status is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionType1Choice, MessageIdentification> mmInstructionCancellationIdentification = new MMMessageAssociationEnd<InstructionType1Choice, MessageIdentification>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionType1Choice.mmObject();
			isDerived = false;
			xmlTag = "InstrCxlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCancellationIdentification";
			definition = "Identifies the meeting instruction cancellation request message for which the status is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MessageIdentification.mmObject();
		}

		@Override
		public MessageIdentification getValue(InstructionType1Choice obj) {
			return obj.getInstructionCancellationIdentification();
		}

		@Override
		public void setValue(InstructionType1Choice obj, MessageIdentification value) {
			obj.setInstructionCancellationIdentification(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InstructionType1Choice.mmInstructionIdentification, com.tools20022.repository.choice.InstructionType1Choice.mmInstructionCancellationIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingInstructionStatusV03.mmInstructionType, MeetingInstructionStatusV04.mmInstructionType, MeetingInstructionStatusV05.mmInstructionType);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionType1Choice";
				definition = "Type of instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification getInstructionIdentification() {
		return instructionIdentification;
	}

	public InstructionType1Choice setInstructionIdentification(MessageIdentification instructionIdentification) {
		this.instructionIdentification = Objects.requireNonNull(instructionIdentification);
		return this;
	}

	public MessageIdentification getInstructionCancellationIdentification() {
		return instructionCancellationIdentification;
	}

	public InstructionType1Choice setInstructionCancellationIdentification(MessageIdentification instructionCancellationIdentification) {
		this.instructionCancellationIdentification = Objects.requireNonNull(instructionCancellationIdentification);
		return this;
	}
}