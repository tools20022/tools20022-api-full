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
import com.tools20022.repository.choice.BalanceFormat2Choice;
import com.tools20022.repository.entity.ChoiceCorporateAction;
import com.tools20022.repository.entity.CorporateActionEntitlement;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.InstructedCorporateActionOption2;
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
 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails2#mmTotalInstructedBalance
 * InstructedBalanceDetails2.mmTotalInstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails2#mmOptionDetails
 * InstructedBalanceDetails2.mmOptionDetails}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructedBalanceDetails2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about total instructed balance."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InstructedBalanceDetails2", propOrder = {"totalInstructedBalance", "optionDetails"})
public class InstructedBalanceDetails2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlInstdBal", required = true)
	protected BalanceFormat2Choice totalInstructedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat2Choice
	 * BalanceFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmInstructedBalance
	 * CorporateActionEntitlement.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails2
	 * InstructedBalanceDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlInstdBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the total instructed balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructedBalanceDetails2, BalanceFormat2Choice> mmTotalInstructedBalance = new MMMessageAssociationEnd<InstructedBalanceDetails2, BalanceFormat2Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmInstructedBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstructedBalanceDetails2.mmObject();
			isDerived = false;
			xmlTag = "TtlInstdBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInstructedBalance";
			definition = "Provides information about the total instructed balance.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BalanceFormat2Choice.mmObject();
		}

		@Override
		public BalanceFormat2Choice getValue(InstructedBalanceDetails2 obj) {
			return obj.getTotalInstructedBalance();
		}

		@Override
		public void setValue(InstructedBalanceDetails2 obj, BalanceFormat2Choice value) {
			obj.setTotalInstructedBalance(value);
		}
	};
	@XmlElement(name = "OptnDtls")
	protected List<InstructedCorporateActionOption2> optionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InstructedCorporateActionOption2
	 * InstructedCorporateActionOption2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChoiceCorporateAction#mmCorporateActionOptionDefinition
	 * ChoiceCorporateAction.mmCorporateActionOptionDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructedBalanceDetails2
	 * InstructedBalanceDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provide instructed balance breakdown information per option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructedBalanceDetails2, List<InstructedCorporateActionOption2>> mmOptionDetails = new MMMessageAssociationEnd<InstructedBalanceDetails2, List<InstructedCorporateActionOption2>>() {
		{
			businessElementTrace_lazy = () -> ChoiceCorporateAction.mmCorporateActionOptionDefinition;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstructedBalanceDetails2.mmObject();
			isDerived = false;
			xmlTag = "OptnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionDetails";
			definition = "Provide instructed balance breakdown information per option.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InstructedCorporateActionOption2.mmObject();
		}

		@Override
		public List<InstructedCorporateActionOption2> getValue(InstructedBalanceDetails2 obj) {
			return obj.getOptionDetails();
		}

		@Override
		public void setValue(InstructedBalanceDetails2 obj, List<InstructedCorporateActionOption2> value) {
			obj.setOptionDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstructedBalanceDetails2.mmTotalInstructedBalance, com.tools20022.repository.msg.InstructedBalanceDetails2.mmOptionDetails);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructedBalanceDetails2";
				definition = "Provides information about total instructed balance.";
			}
		});
		return mmObject_lazy.get();
	}

	public BalanceFormat2Choice getTotalInstructedBalance() {
		return totalInstructedBalance;
	}

	public InstructedBalanceDetails2 setTotalInstructedBalance(BalanceFormat2Choice totalInstructedBalance) {
		this.totalInstructedBalance = Objects.requireNonNull(totalInstructedBalance);
		return this;
	}

	public List<InstructedCorporateActionOption2> getOptionDetails() {
		return optionDetails == null ? optionDetails = new ArrayList<>() : optionDetails;
	}

	public InstructedBalanceDetails2 setOptionDetails(List<InstructedCorporateActionOption2> optionDetails) {
		this.optionDetails = Objects.requireNonNull(optionDetails);
		return this;
	}
}