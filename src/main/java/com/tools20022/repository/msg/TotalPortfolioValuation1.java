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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TotalPortfolioValuation1", propOrder = {"totalPortfolioValue", "previousTotalPortfolioValue", "totalPortfolioValueChange", "totalBookValue", "previousTotalBookValue", "totalBookValueChange", "totalReceipts",
		"totalDisbursements", "incomeReceived", "expensesPaid", "unrealisedGainOrLoss", "realisedGainOrLoss", "accruedIncome", "investmentFundDetails"})
public class TotalPortfolioValuation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AmountAndDirection30 totalPortfolioValue;
	/**
	 * Total value of the portfolio (sum of the assets, liabilities and
	 * unrealised gain/loss) calculated according to the accounting rules.
	 * <p>
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
	public static final MMMessageAttribute mmTotalPortfolioValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PortfolioValuation.mmTotalPortfolioValue;
			componentContext_lazy = () -> TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "TtlPrtflVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalPortfolioValue";
			definition = "Total value of the portfolio (sum of the assets, liabilities and unrealised gain/loss) calculated according to the accounting rules.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection30.mmObject();
		}
	};
	protected AmountAndDirection30 previousTotalPortfolioValue;
	/**
	 * Previous total value of the portfolio.
	 * <p>
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
	public static final MMMessageAttribute mmPreviousTotalPortfolioValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PortfolioValuation.mmTotalPortfolioValue;
			componentContext_lazy = () -> TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "PrvsTtlPrtflVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousTotalPortfolioValue";
			definition = "Previous total value of the portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection30.mmObject();
		}
	};
	protected AmountAndRate2 totalPortfolioValueChange;
	/**
	 * Difference or change between the previous total portfolio value and the
	 * current total portfolio value.
	 * <p>
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
	public static final MMMessageAttribute mmTotalPortfolioValueChange = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "TtlPrtflValChng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalPortfolioValueChange";
			definition = "Difference or change between the previous total portfolio value and the current total portfolio value.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndRate2.mmObject();
		}
	};
	protected AmountAndDirection30 totalBookValue;
	/**
	 * Net asset on balance sheet - total portfolio value minus or plus the
	 * unrealised gain or loss.
	 * <p>
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
	public static final MMMessageAttribute mmTotalBookValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PortfolioValuation.mmTotalBookValue;
			componentContext_lazy = () -> TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "TtlBookVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalBookValue";
			definition = "Net asset on balance sheet - total portfolio value minus or plus the unrealised gain or loss.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection30.mmObject();
		}
	};
	protected AmountAndDirection30 previousTotalBookValue;
	/**
	 * Previous net asset on balance sheet.
	 * <p>
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
	public static final MMMessageAttribute mmPreviousTotalBookValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PortfolioValuation.mmTotalBookValue;
			componentContext_lazy = () -> TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "PrvsTtlBookVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousTotalBookValue";
			definition = "Previous net asset on balance sheet.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection30.mmObject();
		}
	};
	protected AmountAndRate2 totalBookValueChange;
	/**
	 * Difference or change between the previous net asset on balance sheet and
	 * the current net asset on balance sheet.
	 * <p>
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
	public static final MMMessageAttribute mmTotalBookValueChange = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "TtlBookValChng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalBookValueChange";
			definition = "Difference or change between the previous net asset on balance sheet and the current net asset on balance sheet.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndRate2.mmObject();
		}
	};
	protected AmountAndDirection30 totalReceipts;
	/**
	 * Total receipts attributable to the portfolio.
	 * <p>
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
	public static final MMMessageAttribute mmTotalReceipts = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PortfolioValuation.mmTotalReceipts;
			componentContext_lazy = () -> TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "TtlRcts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalReceipts";
			definition = "Total receipts attributable to the portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection30.mmObject();
		}
	};
	protected AmountAndDirection30 totalDisbursements;
	/**
	 * Total disbursements attributable to the portfolio.
	 * <p>
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
	public static final MMMessageAttribute mmTotalDisbursements = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PortfolioValuation.mmTotalDisbursements;
			componentContext_lazy = () -> TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "TtlDsbrsmnts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalDisbursements";
			definition = "Total disbursements attributable to the portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection30.mmObject();
		}
	};
	protected AmountAndDirection30 incomeReceived;
	/**
	 * Income attributable to the portfolio.
	 * <p>
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
	public static final MMMessageAttribute mmIncomeReceived = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PortfolioValuation.mmIncomeReceived;
			componentContext_lazy = () -> TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "IncmRcvd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeReceived";
			definition = "Income attributable to the portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection30.mmObject();
		}
	};
	protected AmountAndDirection30 expensesPaid;
	/**
	 * Expenses attributable to the portfolio
	 * <p>
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
	 * definition} = "Expenses attributable to the portfolio"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpensesPaid = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PortfolioValuation.mmExpensesPaid;
			componentContext_lazy = () -> TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "ExpnssPd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpensesPaid";
			definition = "Expenses attributable to the portfolio";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection30.mmObject();
		}
	};
	protected AmountAndDirection31 unrealisedGainOrLoss;
	/**
	 * Difference between the holding value and the book value of the portfolio.
	 * <p>
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
	public static final MMMessageAttribute mmUnrealisedGainOrLoss = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmUnrealisedGainOrLoss;
			componentContext_lazy = () -> TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "UrlsdGnOrLoss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrealisedGainOrLoss";
			definition = "Difference between the holding value and the book value of the portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection31.mmObject();
		}
	};
	protected AmountAndDirection31 realisedGainOrLoss;
	/**
	 * Difference between the realised value caused by the actual
	 * trade/re-evaluation and the book value of the portfolio.
	 * <p>
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
	public static final MMMessageAttribute mmRealisedGainOrLoss = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmRealisedGainOrLoss;
			componentContext_lazy = () -> TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "RealsdGnOrLoss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealisedGainOrLoss";
			definition = "Difference between the realised value caused by the actual trade/re-evaluation and the book value of the portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection31.mmObject();
		}
	};
	protected AmountAndDirection30 accruedIncome;
	/**
	 * Accrued income.
	 * <p>
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
	public static final MMMessageAttribute mmAccruedIncome = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "AcrdIncm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedIncome";
			definition = "Accrued income.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection30.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InvestmentFund1> investmentFundDetails;
	/**
	 * Valuation information of the investment fund or investment fund share
	 * class.
	 * <p>
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
	public static final MMMessageAssociationEnd mmInvestmentFundDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> TotalPortfolioValuation1.mmObject();
			isDerived = false;
			xmlTag = "InvstmtFndDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFundDetails";
			definition = "Valuation information of the investment fund or investment fund share class.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentFund1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TotalPortfolioValuation1.mmTotalPortfolioValue, TotalPortfolioValuation1.mmPreviousTotalPortfolioValue, TotalPortfolioValuation1.mmTotalPortfolioValueChange,
						TotalPortfolioValuation1.mmTotalBookValue, TotalPortfolioValuation1.mmPreviousTotalBookValue, TotalPortfolioValuation1.mmTotalBookValueChange, TotalPortfolioValuation1.mmTotalReceipts,
						TotalPortfolioValuation1.mmTotalDisbursements, TotalPortfolioValuation1.mmIncomeReceived, TotalPortfolioValuation1.mmExpensesPaid, TotalPortfolioValuation1.mmUnrealisedGainOrLoss,
						TotalPortfolioValuation1.mmRealisedGainOrLoss, TotalPortfolioValuation1.mmAccruedIncome, TotalPortfolioValuation1.mmInvestmentFundDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(TotalPortfolioValuationReportV01.mmTotalPortfolioValuation);
				trace_lazy = () -> PortfolioValuation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TotalPortfolioValuation1";
				definition = "Valuation information of the portfolio.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TtlPrtflVal", required = true)
	public AmountAndDirection30 getTotalPortfolioValue() {
		return totalPortfolioValue;
	}

	public void setTotalPortfolioValue(com.tools20022.repository.msg.AmountAndDirection30 totalPortfolioValue) {
		this.totalPortfolioValue = totalPortfolioValue;
	}

	@XmlElement(name = "PrvsTtlPrtflVal")
	public AmountAndDirection30 getPreviousTotalPortfolioValue() {
		return previousTotalPortfolioValue;
	}

	public void setPreviousTotalPortfolioValue(com.tools20022.repository.msg.AmountAndDirection30 previousTotalPortfolioValue) {
		this.previousTotalPortfolioValue = previousTotalPortfolioValue;
	}

	@XmlElement(name = "TtlPrtflValChng")
	public AmountAndRate2 getTotalPortfolioValueChange() {
		return totalPortfolioValueChange;
	}

	public void setTotalPortfolioValueChange(com.tools20022.repository.msg.AmountAndRate2 totalPortfolioValueChange) {
		this.totalPortfolioValueChange = totalPortfolioValueChange;
	}

	@XmlElement(name = "TtlBookVal", required = true)
	public AmountAndDirection30 getTotalBookValue() {
		return totalBookValue;
	}

	public void setTotalBookValue(com.tools20022.repository.msg.AmountAndDirection30 totalBookValue) {
		this.totalBookValue = totalBookValue;
	}

	@XmlElement(name = "PrvsTtlBookVal")
	public AmountAndDirection30 getPreviousTotalBookValue() {
		return previousTotalBookValue;
	}

	public void setPreviousTotalBookValue(com.tools20022.repository.msg.AmountAndDirection30 previousTotalBookValue) {
		this.previousTotalBookValue = previousTotalBookValue;
	}

	@XmlElement(name = "TtlBookValChng")
	public AmountAndRate2 getTotalBookValueChange() {
		return totalBookValueChange;
	}

	public void setTotalBookValueChange(com.tools20022.repository.msg.AmountAndRate2 totalBookValueChange) {
		this.totalBookValueChange = totalBookValueChange;
	}

	@XmlElement(name = "TtlRcts")
	public AmountAndDirection30 getTotalReceipts() {
		return totalReceipts;
	}

	public void setTotalReceipts(com.tools20022.repository.msg.AmountAndDirection30 totalReceipts) {
		this.totalReceipts = totalReceipts;
	}

	@XmlElement(name = "TtlDsbrsmnts")
	public AmountAndDirection30 getTotalDisbursements() {
		return totalDisbursements;
	}

	public void setTotalDisbursements(com.tools20022.repository.msg.AmountAndDirection30 totalDisbursements) {
		this.totalDisbursements = totalDisbursements;
	}

	@XmlElement(name = "IncmRcvd")
	public AmountAndDirection30 getIncomeReceived() {
		return incomeReceived;
	}

	public void setIncomeReceived(com.tools20022.repository.msg.AmountAndDirection30 incomeReceived) {
		this.incomeReceived = incomeReceived;
	}

	@XmlElement(name = "ExpnssPd")
	public AmountAndDirection30 getExpensesPaid() {
		return expensesPaid;
	}

	public void setExpensesPaid(com.tools20022.repository.msg.AmountAndDirection30 expensesPaid) {
		this.expensesPaid = expensesPaid;
	}

	@XmlElement(name = "UrlsdGnOrLoss")
	public AmountAndDirection31 getUnrealisedGainOrLoss() {
		return unrealisedGainOrLoss;
	}

	public void setUnrealisedGainOrLoss(com.tools20022.repository.msg.AmountAndDirection31 unrealisedGainOrLoss) {
		this.unrealisedGainOrLoss = unrealisedGainOrLoss;
	}

	@XmlElement(name = "RealsdGnOrLoss")
	public AmountAndDirection31 getRealisedGainOrLoss() {
		return realisedGainOrLoss;
	}

	public void setRealisedGainOrLoss(com.tools20022.repository.msg.AmountAndDirection31 realisedGainOrLoss) {
		this.realisedGainOrLoss = realisedGainOrLoss;
	}

	@XmlElement(name = "AcrdIncm")
	public AmountAndDirection30 getAccruedIncome() {
		return accruedIncome;
	}

	public void setAccruedIncome(com.tools20022.repository.msg.AmountAndDirection30 accruedIncome) {
		this.accruedIncome = accruedIncome;
	}

	@XmlElement(name = "InvstmtFndDtls")
	public List<InvestmentFund1> getInvestmentFundDetails() {
		return investmentFundDetails;
	}

	public void setInvestmentFundDetails(List<com.tools20022.repository.msg.InvestmentFund1> investmentFundDetails) {
		this.investmentFundDetails = investmentFundDetails;
	}
}