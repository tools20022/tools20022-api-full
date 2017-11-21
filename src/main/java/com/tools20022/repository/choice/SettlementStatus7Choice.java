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
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV03;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV04;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV05;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV06;
import com.tools20022.repository.entity.SecuritiesTradeStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ProprietaryStatusAndReason1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of format for the settlement status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus7Choice#mmPending
 * SettlementStatus7Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus7Choice#mmFailing
 * SettlementStatus7Choice.mmFailing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus7Choice#mmProprietary
 * SettlementStatus7Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
 * SecuritiesTradeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV03#mmSettlementStatus
 * SecuritiesSettlementTransactionStatusAdviceV03.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV04#mmSettlementStatus
 * SecuritiesSettlementTransactionStatusAdviceV04.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV05#mmSettlementStatus
 * SecuritiesSettlementTransactionStatusAdviceV05.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV06#mmSettlementStatus
 * SecuritiesSettlementTransactionStatusAdviceV06.mmSettlementStatus}</li>
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
 * "SettlementStatus7Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for the settlement status."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.SettlementStatus17Choice
 * SettlementStatus17Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.SettlementStatus2Choice
 * SettlementStatus2Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SettlementStatus7Choice", propOrder = {"pending", "failing", "proprietary"})
public class SettlementStatus7Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected PendingStatus9Choice pending;
	/**
	 * Instruction is pending. Settlement at the instructed settlement date is
	 * still possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingStatus9Choice
	 * PendingStatus9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus7Choice
	 * SettlementStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pdg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction is pending. Settlement at the instructed settlement date is still possible."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus17Choice#mmPending
	 * SettlementStatus17Choice.mmPending}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPending = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatus.mmObject();
			componentContext_lazy = () -> SettlementStatus7Choice.mmObject();
			isDerived = false;
			xmlTag = "Pdg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Instruction is pending. Settlement at the instructed settlement date is still possible.";
			nextVersions_lazy = () -> Arrays.asList(SettlementStatus17Choice.mmPending);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingStatus9Choice.mmObject();
		}
	};
	protected FailingStatus3Choice failing;
	/**
	 * Instruction is failing. Settlement at the instructed settlement date is
	 * no longer possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FailingStatus3Choice
	 * FailingStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus7Choice
	 * SettlementStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Flng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Failing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction is failing. Settlement at the instructed settlement date is no longer possible."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus17Choice#mmFailing
	 * SettlementStatus17Choice.mmFailing}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFailing = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatus.mmObject();
			componentContext_lazy = () -> SettlementStatus7Choice.mmObject();
			isDerived = false;
			xmlTag = "Flng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Failing";
			definition = "Instruction is failing. Settlement at the instructed settlement date is no longer possible.";
			nextVersions_lazy = () -> Arrays.asList(SettlementStatus17Choice.mmFailing);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.FailingStatus3Choice.mmObject();
		}
	};
	protected ProprietaryStatusAndReason1 proprietary;
	/**
	 * Proprietary status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1
	 * ProprietaryStatusAndReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus7Choice
	 * SettlementStatus7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proprietary status."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus17Choice#mmProprietary
	 * SettlementStatus17Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietary = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatus.mmObject();
			componentContext_lazy = () -> SettlementStatus7Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary status.";
			nextVersions_lazy = () -> Arrays.asList(SettlementStatus17Choice.mmProprietary);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryStatusAndReason1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SettlementStatus7Choice.mmPending, SettlementStatus7Choice.mmFailing, SettlementStatus7Choice.mmProprietary);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionStatusAdviceV03.mmSettlementStatus, SecuritiesSettlementTransactionStatusAdviceV04.mmSettlementStatus,
						SecuritiesSettlementTransactionStatusAdviceV05.mmSettlementStatus, SecuritiesSettlementTransactionStatusAdviceV06.mmSettlementStatus);
				trace_lazy = () -> SecuritiesTradeStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementStatus7Choice";
				definition = "Choice of format for the settlement status.";
				nextVersions_lazy = () -> Arrays.asList(SettlementStatus17Choice.mmObject());
				previousVersion_lazy = () -> SettlementStatus2Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Pdg", required = true)
	public PendingStatus9Choice getPending() {
		return pending;
	}

	public void setPending(com.tools20022.repository.choice.PendingStatus9Choice pending) {
		this.pending = pending;
	}

	@XmlElement(name = "Flng", required = true)
	public FailingStatus3Choice getFailing() {
		return failing;
	}

	public void setFailing(com.tools20022.repository.choice.FailingStatus3Choice failing) {
		this.failing = failing;
	}

	@XmlElement(name = "Prtry", required = true)
	public ProprietaryStatusAndReason1 getProprietary() {
		return proprietary;
	}

	public void setProprietary(ProprietaryStatusAndReason1 proprietary) {
		this.proprietary = proprietary;
	}
}