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
import com.tools20022.repository.choice.BalanceFormat5Choice;
import com.tools20022.repository.entity.ChoiceCorporateAction;
import com.tools20022.repository.entity.CorporateActionEntitlement;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Provides information about total instructed balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails5#mmTotalInstructedBalance
 * InstructedBalanceDetails5.mmTotalInstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails5#mmOptionDetails
 * InstructedBalanceDetails5.mmOptionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
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
 * "InstructedBalanceDetails5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about total instructed balance."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails3
 * InstructedBalanceDetails3}</li>
 * </ul>
 */
public class InstructedBalanceDetails5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected BalanceFormat5Choice totalInstructedBalance;
	/**
	 * Provides information about the total instructed balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat5Choice
	 * BalanceFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmInstructedBalance
	 * CorporateActionEntitlement.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails5
	 * InstructedBalanceDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlInstdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the total instructed balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails3#mmTotalInstructedBalance
	 * InstructedBalanceDetails3.mmTotalInstructedBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalInstructedBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmInstructedBalance;
			componentContext_lazy = () -> InstructedBalanceDetails5.mmObject();
			isDerived = false;
			xmlTag = "TtlInstdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInstructedBalance";
			definition = "Provides information about the total instructed balance.";
			previousVersion_lazy = () -> InstructedBalanceDetails3.mmTotalInstructedBalance;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BalanceFormat5Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InstructedCorporateActionOption6> optionDetails;
	/**
	 * Provide instructed balance breakdown information per option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption6
	 * InstructedCorporateActionOption6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChoiceCorporateAction#mmCorporateActionOptionDefinition
	 * ChoiceCorporateAction.mmCorporateActionOptionDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails5
	 * InstructedBalanceDetails5}</li>
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
	 * "Provide instructed balance breakdown information per option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails3#mmOptionDetails
	 * InstructedBalanceDetails3.mmOptionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOptionDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ChoiceCorporateAction.mmCorporateActionOptionDefinition;
			componentContext_lazy = () -> InstructedBalanceDetails5.mmObject();
			isDerived = false;
			xmlTag = "OptnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionDetails";
			definition = "Provide instructed balance breakdown information per option.";
			previousVersion_lazy = () -> InstructedBalanceDetails3.mmOptionDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InstructedCorporateActionOption6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InstructedBalanceDetails5.mmTotalInstructedBalance, InstructedBalanceDetails5.mmOptionDetails);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructedBalanceDetails5";
				definition = "Provides information about total instructed balance.";
				previousVersion_lazy = () -> InstructedBalanceDetails3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public BalanceFormat5Choice getTotalInstructedBalance() {
		return totalInstructedBalance;
	}

	public void setTotalInstructedBalance(BalanceFormat5Choice totalInstructedBalance) {
		this.totalInstructedBalance = totalInstructedBalance;
	}

	public List<InstructedCorporateActionOption6> getOptionDetails() {
		return optionDetails;
	}

	public void setOptionDetails(List<com.tools20022.repository.msg.InstructedCorporateActionOption6> optionDetails) {
		this.optionDetails = optionDetails;
	}
}