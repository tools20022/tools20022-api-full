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
import com.tools20022.repository.choice.BalanceFormat7Choice;
import com.tools20022.repository.entity.ChoiceCorporateAction;
import com.tools20022.repository.entity.CorporateActionEntitlement;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.InstructedCorporateActionOption9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails8#mmTotalInstructedBalance
 * InstructedBalanceDetails8.mmTotalInstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails8#mmOptionDetails
 * InstructedBalanceDetails8.mmOptionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
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
 * "InstructedBalanceDetails8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about total instructed balance."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InstructedBalanceDetails8", propOrder = {"totalInstructedBalance", "optionDetails"})
public class InstructedBalanceDetails8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlInstdBal", required = true)
	protected BalanceFormat7Choice totalInstructedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat7Choice
	 * BalanceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmInstructedBalance
	 * CorporateActionEntitlement.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails8
	 * InstructedBalanceDetails8}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<InstructedBalanceDetails8, BalanceFormat7Choice> mmTotalInstructedBalance = new MMMessageAttribute<InstructedBalanceDetails8, BalanceFormat7Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmInstructedBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstructedBalanceDetails8.mmObject();
			isDerived = false;
			xmlTag = "TtlInstdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInstructedBalance";
			definition = "Provides information about the total instructed balance.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BalanceFormat7Choice.mmObject();
		}

		@Override
		public BalanceFormat7Choice getValue(InstructedBalanceDetails8 obj) {
			return obj.getTotalInstructedBalance();
		}

		@Override
		public void setValue(InstructedBalanceDetails8 obj, BalanceFormat7Choice value) {
			obj.setTotalInstructedBalance(value);
		}
	};
	@XmlElement(name = "OptnDtls")
	protected List<InstructedCorporateActionOption9> optionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption9
	 * InstructedCorporateActionOption9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChoiceCorporateAction#mmCorporateActionOptionDefinition
	 * ChoiceCorporateAction.mmCorporateActionOptionDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails8
	 * InstructedBalanceDetails8}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructedBalanceDetails8, List<InstructedCorporateActionOption9>> mmOptionDetails = new MMMessageAssociationEnd<InstructedBalanceDetails8, List<InstructedCorporateActionOption9>>() {
		{
			businessElementTrace_lazy = () -> ChoiceCorporateAction.mmCorporateActionOptionDefinition;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstructedBalanceDetails8.mmObject();
			isDerived = false;
			xmlTag = "OptnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionDetails";
			definition = "Provide instructed balance breakdown information per option.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InstructedCorporateActionOption9.mmObject();
		}

		@Override
		public List<InstructedCorporateActionOption9> getValue(InstructedBalanceDetails8 obj) {
			return obj.getOptionDetails();
		}

		@Override
		public void setValue(InstructedBalanceDetails8 obj, List<InstructedCorporateActionOption9> value) {
			obj.setOptionDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstructedBalanceDetails8.mmTotalInstructedBalance, com.tools20022.repository.msg.InstructedBalanceDetails8.mmOptionDetails);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructedBalanceDetails8";
				definition = "Provides information about total instructed balance.";
			}
		});
		return mmObject_lazy.get();
	}

	public BalanceFormat7Choice getTotalInstructedBalance() {
		return totalInstructedBalance;
	}

	public InstructedBalanceDetails8 setTotalInstructedBalance(BalanceFormat7Choice totalInstructedBalance) {
		this.totalInstructedBalance = Objects.requireNonNull(totalInstructedBalance);
		return this;
	}

	public List<InstructedCorporateActionOption9> getOptionDetails() {
		return optionDetails == null ? optionDetails = new ArrayList<>() : optionDetails;
	}

	public InstructedBalanceDetails8 setOptionDetails(List<InstructedCorporateActionOption9> optionDetails) {
		this.optionDetails = Objects.requireNonNull(optionDetails);
		return this;
	}
}