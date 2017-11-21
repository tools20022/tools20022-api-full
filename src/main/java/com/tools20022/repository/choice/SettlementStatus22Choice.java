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
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V08;
import com.tools20022.repository.entity.SecuritiesTradeStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ProprietaryStatusAndReason7;
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
 * {@linkplain com.tools20022.repository.choice.SettlementStatus22Choice#mmPending
 * SettlementStatus22Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus22Choice#mmFailing
 * SettlementStatus22Choice.mmFailing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementStatus22Choice#mmProprietary
 * SettlementStatus22Choice.mmProprietary}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07#mmSettlementStatus
 * SecuritiesSettlementTransactionStatusAdvice002V07.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V08#mmSettlementStatus
 * SecuritiesSettlementTransactionStatusAdvice002V08.mmSettlementStatus}</li>
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
 * "SettlementStatus22Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for the settlement status."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SettlementStatus22Choice", propOrder = {"pending", "failing", "proprietary"})
public class SettlementStatus22Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected PendingStatus50Choice pending;
	/**
	 * Instruction is pending. Settlement at the instructed settlement date is
	 * still possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingStatus50Choice
	 * PendingStatus50Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus22Choice
	 * SettlementStatus22Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPending = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatus.mmObject();
			componentContext_lazy = () -> SettlementStatus22Choice.mmObject();
			isDerived = false;
			xmlTag = "Pdg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Instruction is pending. Settlement at the instructed settlement date is still possible.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingStatus50Choice.mmObject();
		}
	};
	protected FailingStatus12Choice failing;
	/**
	 * Instruction is failing. Settlement at the instructed settlement date is
	 * no longer possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FailingStatus12Choice
	 * FailingStatus12Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus22Choice
	 * SettlementStatus22Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFailing = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatus.mmObject();
			componentContext_lazy = () -> SettlementStatus22Choice.mmObject();
			isDerived = false;
			xmlTag = "Flng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Failing";
			definition = "Instruction is failing. Settlement at the instructed settlement date is no longer possible.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.FailingStatus12Choice.mmObject();
		}
	};
	protected ProprietaryStatusAndReason7 proprietary;
	/**
	 * Proprietary status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason7
	 * ProprietaryStatusAndReason7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus22Choice
	 * SettlementStatus22Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietary = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatus.mmObject();
			componentContext_lazy = () -> SettlementStatus22Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryStatusAndReason7.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SettlementStatus22Choice.mmPending, SettlementStatus22Choice.mmFailing, SettlementStatus22Choice.mmProprietary);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionStatusAdvice002V07.mmSettlementStatus, SecuritiesSettlementTransactionStatusAdvice002V08.mmSettlementStatus);
				trace_lazy = () -> SecuritiesTradeStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementStatus22Choice";
				definition = "Choice of format for the settlement status.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Pdg", required = true)
	public PendingStatus50Choice getPending() {
		return pending;
	}

	public void setPending(com.tools20022.repository.choice.PendingStatus50Choice pending) {
		this.pending = pending;
	}

	@XmlElement(name = "Flng", required = true)
	public FailingStatus12Choice getFailing() {
		return failing;
	}

	public void setFailing(com.tools20022.repository.choice.FailingStatus12Choice failing) {
		this.failing = failing;
	}

	@XmlElement(name = "Prtry", required = true)
	public ProprietaryStatusAndReason7 getProprietary() {
		return proprietary;
	}

	public void setProprietary(ProprietaryStatusAndReason7 proprietary) {
		this.proprietary = proprietary;
	}
}