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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CollateralAmount1", propOrder = {"collateralAmount", "reportedCurrencyAndAmount", "marketValueAmount", "accruedInterestAmount", "feesAndCommissions"})
public class CollateralAmount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount collateralAmount;
	/**
	 * Specifies the total amount of the collateral in the collateral currency.
	 * <p>
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
	public static final MMMessageAttribute mmCollateralAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralAmount;
			componentContext_lazy = () -> CollateralAmount1.mmObject();
			isDerived = false;
			xmlTag = "CollAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralAmount";
			definition = "Specifies the total amount of the collateral in the collateral currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount reportedCurrencyAndAmount;
	/**
	 * Specifies the total amount of the collateral in the reporting currency.
	 * <p>
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
	public static final MMMessageAttribute mmReportedCurrencyAndAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CollateralValuation.mmReportedCurrencyAndAmount;
			componentContext_lazy = () -> CollateralAmount1.mmObject();
			isDerived = false;
			xmlTag = "RptdCcyAndAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedCurrencyAndAmount";
			definition = "Specifies the total amount of the collateral in the reporting currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount marketValueAmount;
	/**
	 * Specifies the total market to market value of the collateral in the
	 * reporting currency. It is the dirty price, that is, the accrued interest
	 * is included if any.
	 * <p>
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
	public static final MMMessageAttribute mmMarketValueAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CollateralValuation.mmMarketValueAmount;
			componentContext_lazy = () -> CollateralAmount1.mmObject();
			isDerived = false;
			xmlTag = "MktValAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketValueAmount";
			definition = "Specifies the total market to market value of the collateral in the reporting currency. It is the dirty price, that is, the accrued interest is included if any.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount accruedInterestAmount;
	/**
	 * Specifies the accrued interest on the value of the collateral in the
	 * currency of the collateral.
	 * <p>
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
	public static final MMMessageAttribute mmAccruedInterestAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> CollateralAmount1.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Specifies the accrued interest on the value of the collateral in the currency of the collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount feesAndCommissions;
	/**
	 * Specifies the amount of money paid for the provision of financial
	 * services.
	 * <p>
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
	public static final MMMessageAttribute mmFeesAndCommissions = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CollateralManagement.mmFeesAndCommissions;
			componentContext_lazy = () -> CollateralAmount1.mmObject();
			isDerived = false;
			xmlTag = "FeesAndComssns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeesAndCommissions";
			definition = "Specifies the amount of money paid for the provision of financial services.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CollateralAmount1.mmCollateralAmount, CollateralAmount1.mmReportedCurrencyAndAmount, CollateralAmount1.mmMarketValueAmount, CollateralAmount1.mmAccruedInterestAmount,
						CollateralAmount1.mmFeesAndCommissions);
				trace_lazy = () -> Collateral.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralAmount1";
				definition = "Provides information about the collateral valuation such as the collateral amount, the market value.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CollAmt", required = true)
	public ActiveCurrencyAndAmount getCollateralAmount() {
		return collateralAmount;
	}

	public void setCollateralAmount(ActiveCurrencyAndAmount collateralAmount) {
		this.collateralAmount = collateralAmount;
	}

	@XmlElement(name = "RptdCcyAndAmt", required = true)
	public ActiveCurrencyAndAmount getReportedCurrencyAndAmount() {
		return reportedCurrencyAndAmount;
	}

	public void setReportedCurrencyAndAmount(ActiveCurrencyAndAmount reportedCurrencyAndAmount) {
		this.reportedCurrencyAndAmount = reportedCurrencyAndAmount;
	}

	@XmlElement(name = "MktValAmt", required = true)
	public ActiveCurrencyAndAmount getMarketValueAmount() {
		return marketValueAmount;
	}

	public void setMarketValueAmount(ActiveCurrencyAndAmount marketValueAmount) {
		this.marketValueAmount = marketValueAmount;
	}

	@XmlElement(name = "AcrdIntrstAmt")
	public ActiveCurrencyAndAmount getAccruedInterestAmount() {
		return accruedInterestAmount;
	}

	public void setAccruedInterestAmount(ActiveCurrencyAndAmount accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
	}

	@XmlElement(name = "FeesAndComssns")
	public ActiveCurrencyAndAmount getFeesAndCommissions() {
		return feesAndCommissions;
	}

	public void setFeesAndCommissions(ActiveCurrencyAndAmount feesAndCommissions) {
		this.feesAndCommissions = feesAndCommissions;
	}
}