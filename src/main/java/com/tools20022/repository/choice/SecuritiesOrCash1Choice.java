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
import com.tools20022.repository.area.reda.StandingSettlementInstructionV01;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashParties24;
import com.tools20022.repository.msg.SettlementParties35;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of securities or cash parties.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesOrCash1Choice#mmSecuritiesDetails
 * SecuritiesOrCash1Choice.mmSecuritiesDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesOrCash1Choice#mmCashPartiesDetails
 * SecuritiesOrCash1Choice.mmCashPartiesDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionV01#mmSettlementDetails
 * StandingSettlementInstructionV01.mmSettlementDetails}</li>
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
 * "SecuritiesOrCash1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of securities or cash parties."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesOrCash1Choice", propOrder = {"securitiesDetails", "cashPartiesDetails"})
public class SecuritiesOrCash1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected SettlementParties35 securitiesDetails;
	/**
	 * Securities settlement chain parties, accounts and other details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties35
	 * SettlementParties35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesOrCash1Choice
	 * SecuritiesOrCash1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities settlement chain parties, accounts and other details."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesOrCash1Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesDetails";
			definition = "Securities settlement chain parties, accounts and other details.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementParties35.mmObject();
		}
	};
	protected CashParties24 cashPartiesDetails;
	/**
	 * Cash settlement chain parties and accounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashParties24
	 * CashParties24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesOrCash1Choice
	 * SecuritiesOrCash1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshPtiesDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashPartiesDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash settlement chain parties and accounts."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashPartiesDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesOrCash1Choice.mmObject();
			isDerived = false;
			xmlTag = "CshPtiesDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashPartiesDetails";
			definition = "Cash settlement chain parties and accounts.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashParties24.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecuritiesOrCash1Choice.mmSecuritiesDetails, SecuritiesOrCash1Choice.mmCashPartiesDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(StandingSettlementInstructionV01.mmSettlementDetails);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesOrCash1Choice";
				definition = "Choice of securities or cash parties.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SctiesDtls", required = true)
	public SettlementParties35 getSecuritiesDetails() {
		return securitiesDetails;
	}

	public void setSecuritiesDetails(SettlementParties35 securitiesDetails) {
		this.securitiesDetails = securitiesDetails;
	}

	@XmlElement(name = "CshPtiesDtls", required = true)
	public CashParties24 getCashPartiesDetails() {
		return cashPartiesDetails;
	}

	public void setCashPartiesDetails(CashParties24 cashPartiesDetails) {
		this.cashPartiesDetails = cashPartiesDetails;
	}
}