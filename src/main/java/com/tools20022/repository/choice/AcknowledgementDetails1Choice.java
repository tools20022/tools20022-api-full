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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.PayInEventAcknowledgementV02;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ConfirmationDetails1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Reference of the PayInSchedule or the PayInCall being acknowledged. This is
 * the Message Identification element from the Report Data sequence of the Pay
 * In Schedule message or the Pay In Call message.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcknowledgementDetails1Choice#mmPayInScheduleReference
 * AcknowledgementDetails1Choice.mmPayInScheduleReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AcknowledgementDetails1Choice#mmPayInCallReference
 * AcknowledgementDetails1Choice.mmPayInCallReference}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.PayInEventAcknowledgementV02#mmAcknowledgementDetails
 * PayInEventAcknowledgementV02.mmAcknowledgementDetails}</li>
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
 * "AcknowledgementDetails1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reference of the PayInSchedule or the PayInCall being acknowledged. This is the Message Identification element from the Report Data sequence of the Pay In Schedule message or the Pay In Call message.\r\n"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ConfirmationDetails1
 * ConfirmationDetails1}</li>
 * </ul>
 */
public class AcknowledgementDetails1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text payInScheduleReference;
	/**
	 * Reference to the pay in schedule that is being acknowledged.
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
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementDetails1Choice
	 * AcknowledgementDetails1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PayInSchdlRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayInScheduleReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the pay in schedule that is being acknowledged."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPayInScheduleReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcknowledgementDetails1Choice.mmObject();
			isDerived = false;
			xmlTag = "PayInSchdlRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayInScheduleReference";
			definition = "Reference to the pay in schedule that is being acknowledged.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text payInCallReference;
	/**
	 * Reference to the pay in call that is being acknowledged.
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
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementDetails1Choice
	 * AcknowledgementDetails1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PayInCallRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayInCallReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to the pay in call that is being acknowledged."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPayInCallReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcknowledgementDetails1Choice.mmObject();
			isDerived = false;
			xmlTag = "PayInCallRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayInCallReference";
			definition = "Reference to the pay in call that is being acknowledged.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AcknowledgementDetails1Choice.mmPayInScheduleReference, AcknowledgementDetails1Choice.mmPayInCallReference);
				messageBuildingBlock_lazy = () -> Arrays.asList(PayInEventAcknowledgementV02.mmAcknowledgementDetails);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcknowledgementDetails1Choice";
				definition = "Reference of the PayInSchedule or the PayInCall being acknowledged. This is the Message Identification element from the Report Data sequence of the Pay In Schedule message or the Pay In Call message.\r\n";
				previousVersion_lazy = () -> ConfirmationDetails1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getPayInScheduleReference() {
		return payInScheduleReference;
	}

	public void setPayInScheduleReference(Max35Text payInScheduleReference) {
		this.payInScheduleReference = payInScheduleReference;
	}

	public Max35Text getPayInCallReference() {
		return payInCallReference;
	}

	public void setPayInCallReference(Max35Text payInCallReference) {
		this.payInCallReference = payInCallReference;
	}
}