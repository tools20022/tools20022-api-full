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
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InstructionForMeeting;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Request to execute specific instructions, such as participation registration,
 * securities registration or blocking of securities.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SpecificInstructionRequest1#mmParticipationRegistration
 * SpecificInstructionRequest1.mmParticipationRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SpecificInstructionRequest1#mmBlockingSecurities
 * SpecificInstructionRequest1.mmBlockingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SpecificInstructionRequest1#mmSecuritiesRegistration
 * SpecificInstructionRequest1.mmSecuritiesRegistration}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InstructionForMeeting
 * InstructionForMeeting}</li>
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
 * "SpecificInstructionRequest1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Request to execute specific instructions, such as participation registration, securities registration or blocking of securities."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SpecificInstructionRequest1", propOrder = {"participationRegistration", "blockingSecurities", "securitiesRegistration"})
public class SpecificInstructionRequest1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator participationRegistration;
	/**
	 * Request to register for participation to the meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmParticipationRegistration
	 * InstructionForMeeting.mmParticipationRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SpecificInstructionRequest1
	 * SpecificInstructionRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtcptnRegn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipationRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to register for participation to the meeting."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParticipationRegistration = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InstructionForMeeting.mmParticipationRegistration;
			componentContext_lazy = () -> SpecificInstructionRequest1.mmObject();
			isDerived = false;
			xmlTag = "PrtcptnRegn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipationRegistration";
			definition = "Request to register for participation to the meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator blockingSecurities;
	/**
	 * Request to block the securities
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmBlockingSecurities
	 * InstructionForMeeting.mmBlockingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SpecificInstructionRequest1
	 * SpecificInstructionRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckgScties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockingSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to block the securities"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBlockingSecurities = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InstructionForMeeting.mmBlockingSecurities;
			componentContext_lazy = () -> SpecificInstructionRequest1.mmObject();
			isDerived = false;
			xmlTag = "BlckgScties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockingSecurities";
			definition = "Request to block the securities";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator securitiesRegistration;
	/**
	 * Request to register the securities for the meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InstructionForMeeting#mmSecuritiesRegistration
	 * InstructionForMeeting.mmSecuritiesRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SpecificInstructionRequest1
	 * SpecificInstructionRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesRegn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request to register the securities for the meeting."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesRegistration = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InstructionForMeeting.mmSecuritiesRegistration;
			componentContext_lazy = () -> SpecificInstructionRequest1.mmObject();
			isDerived = false;
			xmlTag = "SctiesRegn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesRegistration";
			definition = "Request to register the securities for the meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SpecificInstructionRequest1.mmParticipationRegistration, SpecificInstructionRequest1.mmBlockingSecurities, SpecificInstructionRequest1.mmSecuritiesRegistration);
				trace_lazy = () -> InstructionForMeeting.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SpecificInstructionRequest1";
				definition = "Request to execute specific instructions, such as participation registration, securities registration or blocking of securities.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PrtcptnRegn")
	public YesNoIndicator getParticipationRegistration() {
		return participationRegistration;
	}

	public void setParticipationRegistration(YesNoIndicator participationRegistration) {
		this.participationRegistration = participationRegistration;
	}

	@XmlElement(name = "BlckgScties")
	public YesNoIndicator getBlockingSecurities() {
		return blockingSecurities;
	}

	public void setBlockingSecurities(YesNoIndicator blockingSecurities) {
		this.blockingSecurities = blockingSecurities;
	}

	@XmlElement(name = "SctiesRegn")
	public YesNoIndicator getSecuritiesRegistration() {
		return securitiesRegistration;
	}

	public void setSecuritiesRegistration(YesNoIndicator securitiesRegistration) {
		this.securitiesRegistration = securitiesRegistration;
	}
}