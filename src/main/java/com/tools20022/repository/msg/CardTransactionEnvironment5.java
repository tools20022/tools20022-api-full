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
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Environment of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment5#mmSendingInstitution
 * CardTransactionEnvironment5.mmSendingInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment5#mmReceivingInstitution
 * CardTransactionEnvironment5.mmReceivingInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment5#mmSettlementInstitution
 * CardTransactionEnvironment5.mmSettlementInstitution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
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
 * "CardTransactionEnvironment5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransactionEnvironment6
 * CardTransactionEnvironment6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment4
 * CardTransactionEnvironment4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CardTransactionEnvironment5", propOrder = {"sendingInstitution", "receivingInstitution", "settlementInstitution"})
public class CardTransactionEnvironment5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected GenericIdentification73 sendingInstitution;
	/**
	 * Institution initiator of the reconciliation.<br>
	 * It corresponds to the ISO 8583 field number 94.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification73
	 * GenericIdentification73}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment5
	 * CardTransactionEnvironment5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndgInstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SendingInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institution initiator of the reconciliation.\r\nIt corresponds to the ISO 8583 field number 94."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment6#mmSendingInstitution
	 * CardTransactionEnvironment6.mmSendingInstitution}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSendingInstitution = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> CardTransactionEnvironment5.mmObject();
			isDerived = false;
			xmlTag = "SndgInstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendingInstitution";
			definition = "Institution initiator of the reconciliation.\r\nIt corresponds to the ISO 8583 field number 94.";
			nextVersions_lazy = () -> Arrays.asList(CardTransactionEnvironment6.mmSendingInstitution);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification73.mmObject();
		}
	};
	protected GenericIdentification73 receivingInstitution;
	/**
	 * Institution destination of the reconciliation.<br>
	 * It corresponds to the ISO 8583 field number 93.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification73
	 * GenericIdentification73}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment5
	 * CardTransactionEnvironment5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgInstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institution destination of the reconciliation.\r\nIt corresponds to the ISO 8583 field number 93."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment6#mmReceivingInstitution
	 * CardTransactionEnvironment6.mmReceivingInstitution}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceivingInstitution = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> CardTransactionEnvironment5.mmObject();
			isDerived = false;
			xmlTag = "RcvgInstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingInstitution";
			definition = "Institution destination of the reconciliation.\r\nIt corresponds to the ISO 8583 field number 93.";
			nextVersions_lazy = () -> Arrays.asList(CardTransactionEnvironment6.mmReceivingInstitution);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification73.mmObject();
		}
	};
	protected GenericIdentification73 settlementInstitution;
	/**
	 * Institution in charge of the settlement of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification73
	 * GenericIdentification73}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment5
	 * CardTransactionEnvironment5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmInstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institution in charge of the settlement of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementInstitution = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> CardTransactionEnvironment5.mmObject();
			isDerived = false;
			xmlTag = "SttlmInstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInstitution";
			definition = "Institution in charge of the settlement of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification73.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardTransactionEnvironment5.mmSendingInstitution, CardTransactionEnvironment5.mmReceivingInstitution, CardTransactionEnvironment5.mmSettlementInstitution);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardTransactionEnvironment5";
				definition = "Environment of the transaction.";
				nextVersions_lazy = () -> Arrays.asList(CardTransactionEnvironment6.mmObject());
				previousVersion_lazy = () -> CardTransactionEnvironment4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SndgInstn", required = true)
	public GenericIdentification73 getSendingInstitution() {
		return sendingInstitution;
	}

	public void setSendingInstitution(com.tools20022.repository.msg.GenericIdentification73 sendingInstitution) {
		this.sendingInstitution = sendingInstitution;
	}

	@XmlElement(name = "RcvgInstn", required = true)
	public GenericIdentification73 getReceivingInstitution() {
		return receivingInstitution;
	}

	public void setReceivingInstitution(com.tools20022.repository.msg.GenericIdentification73 receivingInstitution) {
		this.receivingInstitution = receivingInstitution;
	}

	@XmlElement(name = "SttlmInstn", required = true)
	public GenericIdentification73 getSettlementInstitution() {
		return settlementInstitution;
	}

	public void setSettlementInstitution(com.tools20022.repository.msg.GenericIdentification73 settlementInstitution) {
		this.settlementInstitution = settlementInstitution;
	}
}