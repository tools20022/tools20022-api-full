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
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01;
import com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.choice.SecurityIdentification11Choice;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of a security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification11#mmIdentification
 * SecurityIdentification11.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification11#mmDescription
 * SecurityIdentification11.mmDescription}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
 * SecuritiesIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV01#mmFinancialInstrumentIdentification
 * IntraPositionMovementConfirmationV01.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmationV01#mmFinancialInstrumentIdentification
 * SecuritiesFinancingConfirmationV01.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV01#mmFinancialInstrumentIdentification
 * SecuritiesFinancingInstructionV01.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV01#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionConfirmationV01.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV01#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionGenerationNotificationV01.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV01#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionInstructionV01.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionV03#mmSecurityIdentification
 * MeetingInstructionV03.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionV04#mmSecurityIdentification
 * MeetingInstructionV04.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV03#mmSecurityIdentification
 * MeetingInstructionCancellationRequestV03.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04#mmSecurityIdentification
 * MeetingInstructionCancellationRequestV04.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV03#mmSecurityIdentification
 * MeetingInstructionStatusV03.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV04#mmSecurityIdentification
 * MeetingInstructionStatusV04.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV03#mmSecurityIdentification
 * MeetingVoteExecutionConfirmationV03.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingVoteExecutionConfirmationV04#mmSecurityIdentification
 * MeetingVoteExecutionConfirmationV04.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstructionV01#mmFinancialInstrumentIdentification
 * IntraPositionMovementInstructionV01.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstructionV01#mmFinancialInstrumentIdentification
 * SecuritiesFinancingModificationInstructionV01.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV01#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionAllegementNotificationV01.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV01#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionReversalAdviceV01.
 * mmFinancialInstrumentIdentification}</li>
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
 * "SecurityIdentification11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a security."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecurityIdentification11", propOrder = {"identification", "description"})
public class SecurityIdentification11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SecurityIdentification11Choice identification;
	/**
	 * Identification of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification11Choice
	 * SecurityIdentification11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification11
	 * SecurityIdentification11}</li>
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
	 * definition} = "Identification of a security."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesIdentification.mmObject();
			componentContext_lazy = () -> SecurityIdentification11.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityIdentification11Choice.mmObject();
		}
	};
	protected Max140Text description;
	/**
	 * Textual description of a security instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification11
	 * SecurityIdentification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Textual description of a security instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDescription = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesIdentification.mmObject();
			componentContext_lazy = () -> SecurityIdentification11.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Textual description of a security instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecurityIdentification11.mmIdentification, SecurityIdentification11.mmDescription);
				messageBuildingBlock_lazy = () -> Arrays.asList(IntraPositionMovementConfirmationV01.mmFinancialInstrumentIdentification, SecuritiesFinancingConfirmationV01.mmFinancialInstrumentIdentification,
						SecuritiesFinancingInstructionV01.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionConfirmationV01.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionGenerationNotificationV01.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionInstructionV01.mmFinancialInstrumentIdentification,
						MeetingInstructionV03.mmSecurityIdentification, MeetingInstructionV04.mmSecurityIdentification, MeetingInstructionCancellationRequestV03.mmSecurityIdentification,
						MeetingInstructionCancellationRequestV04.mmSecurityIdentification, MeetingInstructionStatusV03.mmSecurityIdentification, MeetingInstructionStatusV04.mmSecurityIdentification,
						MeetingVoteExecutionConfirmationV03.mmSecurityIdentification, MeetingVoteExecutionConfirmationV04.mmSecurityIdentification, IntraPositionMovementInstructionV01.mmFinancialInstrumentIdentification,
						SecuritiesFinancingModificationInstructionV01.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionAllegementNotificationV01.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionReversalAdviceV01.mmFinancialInstrumentIdentification);
				trace_lazy = () -> SecuritiesIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityIdentification11";
				definition = "Identification of a security.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public SecurityIdentification11Choice getIdentification() {
		return identification;
	}

	public void setIdentification(SecurityIdentification11Choice identification) {
		this.identification = identification;
	}

	@XmlElement(name = "Desc")
	public Max140Text getDescription() {
		return description;
	}

	public void setDescription(Max140Text description) {
		this.description = description;
	}
}