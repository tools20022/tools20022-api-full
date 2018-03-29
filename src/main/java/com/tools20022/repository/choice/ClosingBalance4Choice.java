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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.BalanceQuantity8Choice;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of closing balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClosingBalance4Choice#mmFinal
 * ClosingBalance4Choice.mmFinal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ClosingBalance4Choice#mmIntermediary
 * ClosingBalance4Choice.mmIntermediary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
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
 * "ClosingBalance4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of closing balance."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.ClosingBalance1Choice
 * ClosingBalance1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ClosingBalance4Choice", propOrder = {"final_", "intermediary"})
public class ClosingBalance4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Fnl", required = true)
	protected BalanceQuantity8Choice final_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity8Choice
	 * BalanceQuantity8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAggregateQuantity
	 * SecuritiesBalance.mmAggregateQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance4Choice
	 * ClosingBalance4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fnl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93B::FICL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Final"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of the opening balance and all entries booked to the account at the close of the statement period."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance1Choice#mmFinal
	 * ClosingBalance1Choice.mmFinal}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClosingBalance4Choice, BalanceQuantity8Choice> mmFinal = new MMMessageAttribute<ClosingBalance4Choice, BalanceQuantity8Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmAggregateQuantity;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClosingBalance4Choice.mmObject();
			isDerived = false;
			xmlTag = "Fnl";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::FICL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Final";
			definition = "Sum of the opening balance and all entries booked to the account at the close of the statement period.";
			previousVersion_lazy = () -> ClosingBalance1Choice.mmFinal;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BalanceQuantity8Choice.mmObject();
		}

		@Override
		public BalanceQuantity8Choice getValue(ClosingBalance4Choice obj) {
			return obj.getFinal();
		}

		@Override
		public void setValue(ClosingBalance4Choice obj, BalanceQuantity8Choice value) {
			obj.setFinal(value);
		}
	};
	@XmlElement(name = "Intrmy", required = true)
	protected BalanceQuantity8Choice intermediary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity8Choice
	 * BalanceQuantity8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAggregateQuantity
	 * SecuritiesBalance.mmAggregateQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance4Choice
	 * ClosingBalance4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrmy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93B::INCL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing balance of this page only. This balance must be the intermediary opening balance of the next page of the same statement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ClosingBalance1Choice#mmIntermediary
	 * ClosingBalance1Choice.mmIntermediary}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ClosingBalance4Choice, BalanceQuantity8Choice> mmIntermediary = new MMMessageAttribute<ClosingBalance4Choice, BalanceQuantity8Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmAggregateQuantity;
			componentContext_lazy = () -> com.tools20022.repository.choice.ClosingBalance4Choice.mmObject();
			isDerived = false;
			xmlTag = "Intrmy";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93B::INCL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary";
			definition = "Closing balance of this page only. This balance must be the intermediary opening balance of the next page of the same statement.";
			previousVersion_lazy = () -> ClosingBalance1Choice.mmIntermediary;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BalanceQuantity8Choice.mmObject();
		}

		@Override
		public BalanceQuantity8Choice getValue(ClosingBalance4Choice obj) {
			return obj.getIntermediary();
		}

		@Override
		public void setValue(ClosingBalance4Choice obj, BalanceQuantity8Choice value) {
			obj.setIntermediary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClosingBalance4Choice.mmFinal, com.tools20022.repository.choice.ClosingBalance4Choice.mmIntermediary);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClosingBalance4Choice";
				definition = "Choice of closing balance.";
				previousVersion_lazy = () -> ClosingBalance1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public BalanceQuantity8Choice getFinal() {
		return final_;
	}

	public ClosingBalance4Choice setFinal(BalanceQuantity8Choice final_) {
		this.final_ = Objects.requireNonNull(final_);
		return this;
	}

	public BalanceQuantity8Choice getIntermediary() {
		return intermediary;
	}

	public ClosingBalance4Choice setIntermediary(BalanceQuantity8Choice intermediary) {
		this.intermediary = Objects.requireNonNull(intermediary);
		return this;
	}
}