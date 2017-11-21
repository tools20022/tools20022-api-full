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
import com.tools20022.repository.choice.UnitsOrAmountOrPercentage1Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Indicates how the amount of the investment plan is split amongst the funds.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Repartition5#mmQuantity
 * Repartition5.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Repartition5#mmFinancialInstrument
 * Repartition5.mmFinancialInstrument}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Repartition5#mmCurrencyOfPlan
 * Repartition5.mmCurrencyOfPlan}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
 * InvestmentFundClass}</li>
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
 * "Repartition5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates how the amount of the investment plan is split amongst the funds."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Repartition4
 * Repartition4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Repartition5", propOrder = {"quantity", "financialInstrument", "currencyOfPlan"})
public class Repartition5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected UnitsOrAmountOrPercentage1Choice quantity;
	/**
	 * Amount, units or percentage of financial instrument invested or
	 * withdrawn.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitsOrAmountOrPercentage1Choice
	 * UnitsOrAmountOrPercentage1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Repartition5 Repartition5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount, units or percentage of financial instrument invested or withdrawn."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Repartition4#mmQuantity
	 * Repartition4.mmQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuantity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Repartition5.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Amount, units or percentage of financial instrument invested or withdrawn.";
			previousVersion_lazy = () -> Repartition4.mmQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnitsOrAmountOrPercentage1Choice.mmObject();
		}
	};
	protected FinancialInstrument56 financialInstrument;
	/**
	 * Detailed information about the security or investment fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument56
	 * FinancialInstrument56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Repartition5 Repartition5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detailed information about the security or investment fund."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Repartition4#mmFinancialInstrument
	 * Repartition4.mmFinancialInstrument}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrument = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> Repartition5.mmObject();
			isDerived = false;
			xmlTag = "FinInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrument";
			definition = "Detailed information about the security or investment fund.";
			previousVersion_lazy = () -> Repartition4.mmFinancialInstrument;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument56.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyCode currencyOfPlan;
	/**
	 * When a fund has multiple currencies within same ISIN, this indicates the
	 * currency of the savings or withdrawal plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Repartition5 Repartition5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyOfPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyOfPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When a fund has multiple currencies within same ISIN, this indicates the currency of the savings or withdrawal plan."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Repartition4#mmCurrencyOfPlan
	 * Repartition4.mmCurrencyOfPlan}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrencyOfPlan = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Repartition5.mmObject();
			isDerived = false;
			xmlTag = "CcyOfPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyOfPlan";
			definition = "When a fund has multiple currencies within same ISIN, this indicates the currency of the savings or withdrawal plan.";
			previousVersion_lazy = () -> Repartition4.mmCurrencyOfPlan;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Repartition5.mmQuantity, Repartition5.mmFinancialInstrument, Repartition5.mmCurrencyOfPlan);
				trace_lazy = () -> InvestmentFundClass.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Repartition5";
				definition = "Indicates how the amount of the investment plan is split amongst the funds.";
				previousVersion_lazy = () -> Repartition4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Qty", required = true)
	public UnitsOrAmountOrPercentage1Choice getQuantity() {
		return quantity;
	}

	public void setQuantity(UnitsOrAmountOrPercentage1Choice quantity) {
		this.quantity = quantity;
	}

	@XmlElement(name = "FinInstrm", required = true)
	public FinancialInstrument56 getFinancialInstrument() {
		return financialInstrument;
	}

	public void setFinancialInstrument(com.tools20022.repository.msg.FinancialInstrument56 financialInstrument) {
		this.financialInstrument = financialInstrument;
	}

	@XmlElement(name = "CcyOfPlan")
	public ActiveOrHistoricCurrencyCode getCurrencyOfPlan() {
		return currencyOfPlan;
	}

	public void setCurrencyOfPlan(ActiveOrHistoricCurrencyCode currencyOfPlan) {
		this.currencyOfPlan = currencyOfPlan;
	}
}