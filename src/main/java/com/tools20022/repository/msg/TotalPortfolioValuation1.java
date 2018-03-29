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
import com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01;
import com.tools20022.repository.entity.AssetHolding;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.PortfolioValuation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection30;
import com.tools20022.repository.msg.AmountAndDirection31;
import com.tools20022.repository.msg.AmountAndRate2;
import com.tools20022.repository.msg.InvestmentFund1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Valuation information of the portfolio.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#mmTotalPortfolioValue
 * TotalPortfolioValuation1.mmTotalPortfolioValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#mmPreviousTotalPortfolioValue
 * TotalPortfolioValuation1.mmPreviousTotalPortfolioValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#mmTotalPortfolioValueChange
 * TotalPortfolioValuation1.mmTotalPortfolioValueChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#mmTotalBookValue
 * TotalPortfolioValuation1.mmTotalBookValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#mmPreviousTotalBookValue
 * TotalPortfolioValuation1.mmPreviousTotalBookValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#mmTotalBookValueChange
 * TotalPortfolioValuation1.mmTotalBookValueChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#mmTotalReceipts
 * TotalPortfolioValuation1.mmTotalReceipts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#mmTotalDisbursements
 * TotalPortfolioValuation1.mmTotalDisbursements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#mmIncomeReceived
 * TotalPortfolioValuation1.mmIncomeReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#mmExpensesPaid
 * TotalPortfolioValuation1.mmExpensesPaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#mmUnrealisedGainOrLoss
 * TotalPortfolioValuation1.mmUnrealisedGainOrLoss}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#mmRealisedGainOrLoss
 * TotalPortfolioValuation1.mmRealisedGainOrLoss}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#mmAccruedIncome
 * TotalPortfolioValuation1.mmAccruedIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1#mmInvestmentFundDetails
 * TotalPortfolioValuation1.mmInvestmentFundDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PortfolioValuation
 * PortfolioValuation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.TotalPortfolioValuationReportV01#mmTotalPortfolioValuation
 * TotalPortfolioValuationReportV01.mmTotalPortfolioValuation}</li>
 * </ul>
 * </li>
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
 * "TotalPortfolioValuation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Valuation information of the portfolio."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TotalPortfolioValuation1", propOrder = {"totalPortfolioValue", "previousTotalPortfolioValue", "totalPortfolioValueChange", "totalBookValue", "previousTotalBookValue", "totalBookValueChange", "totalReceipts",
		"totalDisbursements", "incomeReceived", "expensesPaid", "unrealisedGainOrLoss", "realisedGainOrLoss", "accruedIncome", "investmentFundDetails"})
public class TotalPortfolioValuation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlPrtflVal", required = true)
	protected AmountAndDirection30 totalPortfolioValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection30
	 * AmountAndDirection30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#mmTotalPortfolioValue
	 * PortfolioValuation.mmTotalPortfolioValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1
	 * TotalPortfolioValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlPrtflVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalPortfolioValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total value of the portfolio (sum of the assets, liabilities and unrealised gain/loss) calculated according to the accounting rules."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalPortfolioValuation1, AmountAndDirection30> mmTotalPortfolioValue = new MMMessageAttribute<TotalPortfolioValuation1, AmountAndDirection30>() {
		{
			businessElementTrace_lazy = () -> PortfolioValuation.mmTotalPortfolioValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "TtlPrtflVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalPortfolioValue";
			definition = "Total value of the portfolio (sum of the assets, liabilities and unrealised gain/loss) calculated according to the accounting rules.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountAndDirection30.mmObject();
		}

		@Override
		public AmountAndDirection30 getValue(TotalPortfolioValuation1 obj) {
			return obj.getTotalPortfolioValue();
		}

		@Override
		public void setValue(TotalPortfolioValuation1 obj, AmountAndDirection30 value) {
			obj.setTotalPortfolioValue(value);
		}
	};
	@XmlElement(name = "PrvsTtlPrtflVal")
	protected AmountAndDirection30 previousTotalPortfolioValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection30
	 * AmountAndDirection30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#mmTotalPortfolioValue
	 * PortfolioValuation.mmTotalPortfolioValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1
	 * TotalPortfolioValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsTtlPrtflVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousTotalPortfolioValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Previous total value of the portfolio."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalPortfolioValuation1, Optional<AmountAndDirection30>> mmPreviousTotalPortfolioValue = new MMMessageAttribute<TotalPortfolioValuation1, Optional<AmountAndDirection30>>() {
		{
			businessElementTrace_lazy = () -> PortfolioValuation.mmTotalPortfolioValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "PrvsTtlPrtflVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousTotalPortfolioValue";
			definition = "Previous total value of the portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection30.mmObject();
		}

		@Override
		public Optional<AmountAndDirection30> getValue(TotalPortfolioValuation1 obj) {
			return obj.getPreviousTotalPortfolioValue();
		}

		@Override
		public void setValue(TotalPortfolioValuation1 obj, Optional<AmountAndDirection30> value) {
			obj.setPreviousTotalPortfolioValue(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlPrtflValChng")
	protected AmountAndRate2 totalPortfolioValueChange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.AmountAndRate2
	 * AmountAndRate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1
	 * TotalPortfolioValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlPrtflValChng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalPortfolioValueChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference or change between the previous total portfolio value and the current total portfolio value."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalPortfolioValuation1, Optional<AmountAndRate2>> mmTotalPortfolioValueChange = new MMMessageAttribute<TotalPortfolioValuation1, Optional<AmountAndRate2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "TtlPrtflValChng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalPortfolioValueChange";
			definition = "Difference or change between the previous total portfolio value and the current total portfolio value.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndRate2.mmObject();
		}

		@Override
		public Optional<AmountAndRate2> getValue(TotalPortfolioValuation1 obj) {
			return obj.getTotalPortfolioValueChange();
		}

		@Override
		public void setValue(TotalPortfolioValuation1 obj, Optional<AmountAndRate2> value) {
			obj.setTotalPortfolioValueChange(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlBookVal", required = true)
	protected AmountAndDirection30 totalBookValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection30
	 * AmountAndDirection30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#mmTotalBookValue
	 * PortfolioValuation.mmTotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1
	 * TotalPortfolioValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlBookVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalBookValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net asset on balance sheet - total portfolio value minus or plus the unrealised gain or loss."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalPortfolioValuation1, AmountAndDirection30> mmTotalBookValue = new MMMessageAttribute<TotalPortfolioValuation1, AmountAndDirection30>() {
		{
			businessElementTrace_lazy = () -> PortfolioValuation.mmTotalBookValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "TtlBookVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalBookValue";
			definition = "Net asset on balance sheet - total portfolio value minus or plus the unrealised gain or loss.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountAndDirection30.mmObject();
		}

		@Override
		public AmountAndDirection30 getValue(TotalPortfolioValuation1 obj) {
			return obj.getTotalBookValue();
		}

		@Override
		public void setValue(TotalPortfolioValuation1 obj, AmountAndDirection30 value) {
			obj.setTotalBookValue(value);
		}
	};
	@XmlElement(name = "PrvsTtlBookVal")
	protected AmountAndDirection30 previousTotalBookValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection30
	 * AmountAndDirection30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#mmTotalBookValue
	 * PortfolioValuation.mmTotalBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1
	 * TotalPortfolioValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsTtlBookVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousTotalBookValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Previous net asset on balance sheet."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalPortfolioValuation1, Optional<AmountAndDirection30>> mmPreviousTotalBookValue = new MMMessageAttribute<TotalPortfolioValuation1, Optional<AmountAndDirection30>>() {
		{
			businessElementTrace_lazy = () -> PortfolioValuation.mmTotalBookValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "PrvsTtlBookVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousTotalBookValue";
			definition = "Previous net asset on balance sheet.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection30.mmObject();
		}

		@Override
		public Optional<AmountAndDirection30> getValue(TotalPortfolioValuation1 obj) {
			return obj.getPreviousTotalBookValue();
		}

		@Override
		public void setValue(TotalPortfolioValuation1 obj, Optional<AmountAndDirection30> value) {
			obj.setPreviousTotalBookValue(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlBookValChng")
	protected AmountAndRate2 totalBookValueChange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.AmountAndRate2
	 * AmountAndRate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1
	 * TotalPortfolioValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlBookValChng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalBookValueChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference or change between the previous net asset on balance sheet and the current net asset on balance sheet."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalPortfolioValuation1, Optional<AmountAndRate2>> mmTotalBookValueChange = new MMMessageAttribute<TotalPortfolioValuation1, Optional<AmountAndRate2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "TtlBookValChng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalBookValueChange";
			definition = "Difference or change between the previous net asset on balance sheet and the current net asset on balance sheet.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndRate2.mmObject();
		}

		@Override
		public Optional<AmountAndRate2> getValue(TotalPortfolioValuation1 obj) {
			return obj.getTotalBookValueChange();
		}

		@Override
		public void setValue(TotalPortfolioValuation1 obj, Optional<AmountAndRate2> value) {
			obj.setTotalBookValueChange(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlRcts")
	protected AmountAndDirection30 totalReceipts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection30
	 * AmountAndDirection30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#mmTotalReceipts
	 * PortfolioValuation.mmTotalReceipts}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1
	 * TotalPortfolioValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlRcts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalReceipts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total receipts attributable to the portfolio."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalPortfolioValuation1, Optional<AmountAndDirection30>> mmTotalReceipts = new MMMessageAttribute<TotalPortfolioValuation1, Optional<AmountAndDirection30>>() {
		{
			businessElementTrace_lazy = () -> PortfolioValuation.mmTotalReceipts;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "TtlRcts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReceipts";
			definition = "Total receipts attributable to the portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection30.mmObject();
		}

		@Override
		public Optional<AmountAndDirection30> getValue(TotalPortfolioValuation1 obj) {
			return obj.getTotalReceipts();
		}

		@Override
		public void setValue(TotalPortfolioValuation1 obj, Optional<AmountAndDirection30> value) {
			obj.setTotalReceipts(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlDsbrsmnts")
	protected AmountAndDirection30 totalDisbursements;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection30
	 * AmountAndDirection30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#mmTotalDisbursements
	 * PortfolioValuation.mmTotalDisbursements}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1
	 * TotalPortfolioValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlDsbrsmnts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalDisbursements"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total disbursements attributable to the portfolio."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalPortfolioValuation1, Optional<AmountAndDirection30>> mmTotalDisbursements = new MMMessageAttribute<TotalPortfolioValuation1, Optional<AmountAndDirection30>>() {
		{
			businessElementTrace_lazy = () -> PortfolioValuation.mmTotalDisbursements;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "TtlDsbrsmnts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalDisbursements";
			definition = "Total disbursements attributable to the portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection30.mmObject();
		}

		@Override
		public Optional<AmountAndDirection30> getValue(TotalPortfolioValuation1 obj) {
			return obj.getTotalDisbursements();
		}

		@Override
		public void setValue(TotalPortfolioValuation1 obj, Optional<AmountAndDirection30> value) {
			obj.setTotalDisbursements(value.orElse(null));
		}
	};
	@XmlElement(name = "IncmRcvd")
	protected AmountAndDirection30 incomeReceived;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection30
	 * AmountAndDirection30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#mmIncomeReceived
	 * PortfolioValuation.mmIncomeReceived}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1
	 * TotalPortfolioValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmRcvd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeReceived"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Income attributable to the portfolio."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalPortfolioValuation1, Optional<AmountAndDirection30>> mmIncomeReceived = new MMMessageAttribute<TotalPortfolioValuation1, Optional<AmountAndDirection30>>() {
		{
			businessElementTrace_lazy = () -> PortfolioValuation.mmIncomeReceived;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "IncmRcvd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeReceived";
			definition = "Income attributable to the portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection30.mmObject();
		}

		@Override
		public Optional<AmountAndDirection30> getValue(TotalPortfolioValuation1 obj) {
			return obj.getIncomeReceived();
		}

		@Override
		public void setValue(TotalPortfolioValuation1 obj, Optional<AmountAndDirection30> value) {
			obj.setIncomeReceived(value.orElse(null));
		}
	};
	@XmlElement(name = "ExpnssPd")
	protected AmountAndDirection30 expensesPaid;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection30
	 * AmountAndDirection30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioValuation#mmExpensesPaid
	 * PortfolioValuation.mmExpensesPaid}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1
	 * TotalPortfolioValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExpnssPd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpensesPaid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Expenses attributable to the portfolio."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalPortfolioValuation1, Optional<AmountAndDirection30>> mmExpensesPaid = new MMMessageAttribute<TotalPortfolioValuation1, Optional<AmountAndDirection30>>() {
		{
			businessElementTrace_lazy = () -> PortfolioValuation.mmExpensesPaid;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "ExpnssPd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpensesPaid";
			definition = "Expenses attributable to the portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection30.mmObject();
		}

		@Override
		public Optional<AmountAndDirection30> getValue(TotalPortfolioValuation1 obj) {
			return obj.getExpensesPaid();
		}

		@Override
		public void setValue(TotalPortfolioValuation1 obj, Optional<AmountAndDirection30> value) {
			obj.setExpensesPaid(value.orElse(null));
		}
	};
	@XmlElement(name = "UrlsdGnOrLoss")
	protected AmountAndDirection31 unrealisedGainOrLoss;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection31
	 * AmountAndDirection31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmUnrealisedGainOrLoss
	 * AssetHolding.mmUnrealisedGainOrLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1
	 * TotalPortfolioValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UrlsdGnOrLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrealisedGainOrLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the holding value and the book value of the portfolio."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalPortfolioValuation1, Optional<AmountAndDirection31>> mmUnrealisedGainOrLoss = new MMMessageAttribute<TotalPortfolioValuation1, Optional<AmountAndDirection31>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmUnrealisedGainOrLoss;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "UrlsdGnOrLoss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrealisedGainOrLoss";
			definition = "Difference between the holding value and the book value of the portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection31.mmObject();
		}

		@Override
		public Optional<AmountAndDirection31> getValue(TotalPortfolioValuation1 obj) {
			return obj.getUnrealisedGainOrLoss();
		}

		@Override
		public void setValue(TotalPortfolioValuation1 obj, Optional<AmountAndDirection31> value) {
			obj.setUnrealisedGainOrLoss(value.orElse(null));
		}
	};
	@XmlElement(name = "RealsdGnOrLoss")
	protected AmountAndDirection31 realisedGainOrLoss;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection31
	 * AmountAndDirection31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmRealisedGainOrLoss
	 * AssetHolding.mmRealisedGainOrLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1
	 * TotalPortfolioValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RealsdGnOrLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealisedGainOrLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the realised value caused by the actual trade/re-evaluation and the book value of the portfolio."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalPortfolioValuation1, Optional<AmountAndDirection31>> mmRealisedGainOrLoss = new MMMessageAttribute<TotalPortfolioValuation1, Optional<AmountAndDirection31>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmRealisedGainOrLoss;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "RealsdGnOrLoss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealisedGainOrLoss";
			definition = "Difference between the realised value caused by the actual trade/re-evaluation and the book value of the portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection31.mmObject();
		}

		@Override
		public Optional<AmountAndDirection31> getValue(TotalPortfolioValuation1 obj) {
			return obj.getRealisedGainOrLoss();
		}

		@Override
		public void setValue(TotalPortfolioValuation1 obj, Optional<AmountAndDirection31> value) {
			obj.setRealisedGainOrLoss(value.orElse(null));
		}
	};
	@XmlElement(name = "AcrdIncm")
	protected AmountAndDirection30 accruedIncome;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection30
	 * AmountAndDirection30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1
	 * TotalPortfolioValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIncm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Accrued income."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalPortfolioValuation1, Optional<AmountAndDirection30>> mmAccruedIncome = new MMMessageAttribute<TotalPortfolioValuation1, Optional<AmountAndDirection30>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "AcrdIncm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedIncome";
			definition = "Accrued income.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection30.mmObject();
		}

		@Override
		public Optional<AmountAndDirection30> getValue(TotalPortfolioValuation1 obj) {
			return obj.getAccruedIncome();
		}

		@Override
		public void setValue(TotalPortfolioValuation1 obj, Optional<AmountAndDirection30> value) {
			obj.setAccruedIncome(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtFndDtls")
	protected List<InvestmentFund1> investmentFundDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentFund1
	 * InvestmentFund1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalPortfolioValuation1
	 * TotalPortfolioValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtFndDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation information of the investment fund or investment fund share class."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TotalPortfolioValuation1, List<InvestmentFund1>> mmInvestmentFundDetails = new MMMessageAssociationEnd<TotalPortfolioValuation1, List<InvestmentFund1>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "InvstmtFndDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFundDetails";
			definition = "Valuation information of the investment fund or investment fund share class.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentFund1.mmObject();
		}

		@Override
		public List<InvestmentFund1> getValue(TotalPortfolioValuation1 obj) {
			return obj.getInvestmentFundDetails();
		}

		@Override
		public void setValue(TotalPortfolioValuation1 obj, List<InvestmentFund1> value) {
			obj.setInvestmentFundDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalPortfolioValuation1.mmTotalPortfolioValue, com.tools20022.repository.msg.TotalPortfolioValuation1.mmPreviousTotalPortfolioValue,
						com.tools20022.repository.msg.TotalPortfolioValuation1.mmTotalPortfolioValueChange, com.tools20022.repository.msg.TotalPortfolioValuation1.mmTotalBookValue,
						com.tools20022.repository.msg.TotalPortfolioValuation1.mmPreviousTotalBookValue, com.tools20022.repository.msg.TotalPortfolioValuation1.mmTotalBookValueChange,
						com.tools20022.repository.msg.TotalPortfolioValuation1.mmTotalReceipts, com.tools20022.repository.msg.TotalPortfolioValuation1.mmTotalDisbursements,
						com.tools20022.repository.msg.TotalPortfolioValuation1.mmIncomeReceived, com.tools20022.repository.msg.TotalPortfolioValuation1.mmExpensesPaid,
						com.tools20022.repository.msg.TotalPortfolioValuation1.mmUnrealisedGainOrLoss, com.tools20022.repository.msg.TotalPortfolioValuation1.mmRealisedGainOrLoss,
						com.tools20022.repository.msg.TotalPortfolioValuation1.mmAccruedIncome, com.tools20022.repository.msg.TotalPortfolioValuation1.mmInvestmentFundDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(TotalPortfolioValuationReportV01.mmTotalPortfolioValuation);
				trace_lazy = () -> PortfolioValuation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TotalPortfolioValuation1";
				definition = "Valuation information of the portfolio.";
			}
		});
		return mmObject_lazy.get();
	}

	public AmountAndDirection30 getTotalPortfolioValue() {
		return totalPortfolioValue;
	}

	public TotalPortfolioValuation1 setTotalPortfolioValue(AmountAndDirection30 totalPortfolioValue) {
		this.totalPortfolioValue = Objects.requireNonNull(totalPortfolioValue);
		return this;
	}

	public Optional<AmountAndDirection30> getPreviousTotalPortfolioValue() {
		return previousTotalPortfolioValue == null ? Optional.empty() : Optional.of(previousTotalPortfolioValue);
	}

	public TotalPortfolioValuation1 setPreviousTotalPortfolioValue(AmountAndDirection30 previousTotalPortfolioValue) {
		this.previousTotalPortfolioValue = previousTotalPortfolioValue;
		return this;
	}

	public Optional<AmountAndRate2> getTotalPortfolioValueChange() {
		return totalPortfolioValueChange == null ? Optional.empty() : Optional.of(totalPortfolioValueChange);
	}

	public TotalPortfolioValuation1 setTotalPortfolioValueChange(AmountAndRate2 totalPortfolioValueChange) {
		this.totalPortfolioValueChange = totalPortfolioValueChange;
		return this;
	}

	public AmountAndDirection30 getTotalBookValue() {
		return totalBookValue;
	}

	public TotalPortfolioValuation1 setTotalBookValue(AmountAndDirection30 totalBookValue) {
		this.totalBookValue = Objects.requireNonNull(totalBookValue);
		return this;
	}

	public Optional<AmountAndDirection30> getPreviousTotalBookValue() {
		return previousTotalBookValue == null ? Optional.empty() : Optional.of(previousTotalBookValue);
	}

	public TotalPortfolioValuation1 setPreviousTotalBookValue(AmountAndDirection30 previousTotalBookValue) {
		this.previousTotalBookValue = previousTotalBookValue;
		return this;
	}

	public Optional<AmountAndRate2> getTotalBookValueChange() {
		return totalBookValueChange == null ? Optional.empty() : Optional.of(totalBookValueChange);
	}

	public TotalPortfolioValuation1 setTotalBookValueChange(AmountAndRate2 totalBookValueChange) {
		this.totalBookValueChange = totalBookValueChange;
		return this;
	}

	public Optional<AmountAndDirection30> getTotalReceipts() {
		return totalReceipts == null ? Optional.empty() : Optional.of(totalReceipts);
	}

	public TotalPortfolioValuation1 setTotalReceipts(AmountAndDirection30 totalReceipts) {
		this.totalReceipts = totalReceipts;
		return this;
	}

	public Optional<AmountAndDirection30> getTotalDisbursements() {
		return totalDisbursements == null ? Optional.empty() : Optional.of(totalDisbursements);
	}

	public TotalPortfolioValuation1 setTotalDisbursements(AmountAndDirection30 totalDisbursements) {
		this.totalDisbursements = totalDisbursements;
		return this;
	}

	public Optional<AmountAndDirection30> getIncomeReceived() {
		return incomeReceived == null ? Optional.empty() : Optional.of(incomeReceived);
	}

	public TotalPortfolioValuation1 setIncomeReceived(AmountAndDirection30 incomeReceived) {
		this.incomeReceived = incomeReceived;
		return this;
	}

	public Optional<AmountAndDirection30> getExpensesPaid() {
		return expensesPaid == null ? Optional.empty() : Optional.of(expensesPaid);
	}

	public TotalPortfolioValuation1 setExpensesPaid(AmountAndDirection30 expensesPaid) {
		this.expensesPaid = expensesPaid;
		return this;
	}

	public Optional<AmountAndDirection31> getUnrealisedGainOrLoss() {
		return unrealisedGainOrLoss == null ? Optional.empty() : Optional.of(unrealisedGainOrLoss);
	}

	public TotalPortfolioValuation1 setUnrealisedGainOrLoss(AmountAndDirection31 unrealisedGainOrLoss) {
		this.unrealisedGainOrLoss = unrealisedGainOrLoss;
		return this;
	}

	public Optional<AmountAndDirection31> getRealisedGainOrLoss() {
		return realisedGainOrLoss == null ? Optional.empty() : Optional.of(realisedGainOrLoss);
	}

	public TotalPortfolioValuation1 setRealisedGainOrLoss(AmountAndDirection31 realisedGainOrLoss) {
		this.realisedGainOrLoss = realisedGainOrLoss;
		return this;
	}

	public Optional<AmountAndDirection30> getAccruedIncome() {
		return accruedIncome == null ? Optional.empty() : Optional.of(accruedIncome);
	}

	public TotalPortfolioValuation1 setAccruedIncome(AmountAndDirection30 accruedIncome) {
		this.accruedIncome = accruedIncome;
		return this;
	}

	public List<InvestmentFund1> getInvestmentFundDetails() {
		return investmentFundDetails == null ? investmentFundDetails = new ArrayList<>() : investmentFundDetails;
	}

	public TotalPortfolioValuation1 setInvestmentFundDetails(List<InvestmentFund1> investmentFundDetails) {
		this.investmentFundDetails = Objects.requireNonNull(investmentFundDetails);
		return this;
	}
}