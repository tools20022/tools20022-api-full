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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.Collateral;
import com.tools20022.repository.entity.CollateralManagement;
import com.tools20022.repository.entity.CollateralValuation;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the collateral valuation such as the collateral
 * amount, the market value.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralAmount1#mmCollateralAmount
 * CollateralAmount1.mmCollateralAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralAmount1#mmReportedCurrencyAndAmount
 * CollateralAmount1.mmReportedCurrencyAndAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralAmount1#mmMarketValueAmount
 * CollateralAmount1.mmMarketValueAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralAmount1#mmAccruedInterestAmount
 * CollateralAmount1.mmAccruedInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralAmount1#mmFeesAndCommissions
 * CollateralAmount1.mmFeesAndCommissions}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
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
 * "CollateralAmount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the collateral valuation such as the collateral amount, the market value."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralAmount1", propOrder = {"collateralAmount", "reportedCurrencyAndAmount", "marketValueAmount", "accruedInterestAmount", "feesAndCommissions"})
public class CollateralAmount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CollAmt", required = true)
	protected ActiveCurrencyAndAmount collateralAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAmount
	 * Collateral.mmCollateralAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralAmount1
	 * CollateralAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total amount of the collateral in the collateral currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralAmount1, ActiveCurrencyAndAmount> mmCollateralAmount = new MMMessageAttribute<CollateralAmount1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralAmount1.mmObject();
			isDerived = false;
			xmlTag = "CollAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralAmount";
			definition = "Specifies the total amount of the collateral in the collateral currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(CollateralAmount1 obj) {
			return obj.getCollateralAmount();
		}

		@Override
		public void setValue(CollateralAmount1 obj, ActiveCurrencyAndAmount value) {
			obj.setCollateralAmount(value);
		}
	};
	@XmlElement(name = "RptdCcyAndAmt", required = true)
	protected ActiveCurrencyAndAmount reportedCurrencyAndAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmReportedCurrencyAndAmount
	 * CollateralValuation.mmReportedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralAmount1
	 * CollateralAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptdCcyAndAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedCurrencyAndAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total amount of the collateral in the reporting currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralAmount1, ActiveCurrencyAndAmount> mmReportedCurrencyAndAmount = new MMMessageAttribute<CollateralAmount1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CollateralValuation.mmReportedCurrencyAndAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralAmount1.mmObject();
			isDerived = false;
			xmlTag = "RptdCcyAndAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedCurrencyAndAmount";
			definition = "Specifies the total amount of the collateral in the reporting currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(CollateralAmount1 obj) {
			return obj.getReportedCurrencyAndAmount();
		}

		@Override
		public void setValue(CollateralAmount1 obj, ActiveCurrencyAndAmount value) {
			obj.setReportedCurrencyAndAmount(value);
		}
	};
	@XmlElement(name = "MktValAmt", required = true)
	protected ActiveCurrencyAndAmount marketValueAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmMarketValueAmount
	 * CollateralValuation.mmMarketValueAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralAmount1
	 * CollateralAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktValAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketValueAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total market to market value of the collateral in the reporting currency. It is the dirty price, that is, the accrued interest is included if any."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralAmount1, ActiveCurrencyAndAmount> mmMarketValueAmount = new MMMessageAttribute<CollateralAmount1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CollateralValuation.mmMarketValueAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralAmount1.mmObject();
			isDerived = false;
			xmlTag = "MktValAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketValueAmount";
			definition = "Specifies the total market to market value of the collateral in the reporting currency. It is the dirty price, that is, the accrued interest is included if any.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(CollateralAmount1 obj) {
			return obj.getMarketValueAmount();
		}

		@Override
		public void setValue(CollateralAmount1 obj, ActiveCurrencyAndAmount value) {
			obj.setMarketValueAmount(value);
		}
	};
	@XmlElement(name = "AcrdIntrstAmt")
	protected ActiveCurrencyAndAmount accruedInterestAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralAmount1
	 * CollateralAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the accrued interest on the value of the collateral in the currency of the collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralAmount1, Optional<ActiveCurrencyAndAmount>> mmAccruedInterestAmount = new MMMessageAttribute<CollateralAmount1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralAmount1.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Specifies the accrued interest on the value of the collateral in the currency of the collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CollateralAmount1 obj) {
			return obj.getAccruedInterestAmount();
		}

		@Override
		public void setValue(CollateralAmount1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setAccruedInterestAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "FeesAndComssns")
	protected ActiveCurrencyAndAmount feesAndCommissions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmFeesAndCommissions
	 * CollateralManagement.mmFeesAndCommissions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralAmount1
	 * CollateralAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FeesAndComssns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FeesAndCommissions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amount of money paid for the provision of financial services."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralAmount1, Optional<ActiveCurrencyAndAmount>> mmFeesAndCommissions = new MMMessageAttribute<CollateralAmount1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CollateralManagement.mmFeesAndCommissions;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralAmount1.mmObject();
			isDerived = false;
			xmlTag = "FeesAndComssns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeesAndCommissions";
			definition = "Specifies the amount of money paid for the provision of financial services.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CollateralAmount1 obj) {
			return obj.getFeesAndCommissions();
		}

		@Override
		public void setValue(CollateralAmount1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setFeesAndCommissions(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralAmount1.mmCollateralAmount, com.tools20022.repository.msg.CollateralAmount1.mmReportedCurrencyAndAmount,
						com.tools20022.repository.msg.CollateralAmount1.mmMarketValueAmount, com.tools20022.repository.msg.CollateralAmount1.mmAccruedInterestAmount, com.tools20022.repository.msg.CollateralAmount1.mmFeesAndCommissions);
				trace_lazy = () -> Collateral.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralAmount1";
				definition = "Provides information about the collateral valuation such as the collateral amount, the market value.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getCollateralAmount() {
		return collateralAmount;
	}

	public CollateralAmount1 setCollateralAmount(ActiveCurrencyAndAmount collateralAmount) {
		this.collateralAmount = Objects.requireNonNull(collateralAmount);
		return this;
	}

	public ActiveCurrencyAndAmount getReportedCurrencyAndAmount() {
		return reportedCurrencyAndAmount;
	}

	public CollateralAmount1 setReportedCurrencyAndAmount(ActiveCurrencyAndAmount reportedCurrencyAndAmount) {
		this.reportedCurrencyAndAmount = Objects.requireNonNull(reportedCurrencyAndAmount);
		return this;
	}

	public ActiveCurrencyAndAmount getMarketValueAmount() {
		return marketValueAmount;
	}

	public CollateralAmount1 setMarketValueAmount(ActiveCurrencyAndAmount marketValueAmount) {
		this.marketValueAmount = Objects.requireNonNull(marketValueAmount);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getAccruedInterestAmount() {
		return accruedInterestAmount == null ? Optional.empty() : Optional.of(accruedInterestAmount);
	}

	public CollateralAmount1 setAccruedInterestAmount(ActiveCurrencyAndAmount accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getFeesAndCommissions() {
		return feesAndCommissions == null ? Optional.empty() : Optional.of(feesAndCommissions);
	}

	public CollateralAmount1 setFeesAndCommissions(ActiveCurrencyAndAmount feesAndCommissions) {
		this.feesAndCommissions = feesAndCommissions;
		return this;
	}
}