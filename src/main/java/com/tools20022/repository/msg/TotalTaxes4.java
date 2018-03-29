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
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.InvestmentFundTax;
import com.tools20022.repository.entity.SecuritiesTax;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Tax18;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information regarding the total amount of taxes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalTaxes4#mmTotalAmountOfTaxes
 * TotalTaxes4.mmTotalAmountOfTaxes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalTaxes4#mmTaxableIncomePerDividend
 * TotalTaxes4.mmTaxableIncomePerDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalTaxes4#mmPercentageOfDebtClaim
 * TotalTaxes4.mmPercentageOfDebtClaim}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes4#mmTaxDetails
 * TotalTaxes4.mmTaxDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundTax
 * InvestmentFundTax}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TotalTaxes4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information regarding the total amount of taxes."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TotalTaxes4", propOrder = {"totalAmountOfTaxes", "taxableIncomePerDividend", "percentageOfDebtClaim", "taxDetails"})
public class TotalTaxes4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlAmtOfTaxs")
	protected ActiveCurrencyAnd13DecimalAmount totalAmountOfTaxes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes4 TotalTaxes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAmtOfTaxs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmountOfTaxes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total value of the taxes for a specific order."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalTaxes4, Optional<ActiveCurrencyAnd13DecimalAmount>> mmTotalAmountOfTaxes = new MMMessageAttribute<TotalTaxes4, Optional<ActiveCurrencyAnd13DecimalAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalTaxes4.mmObject();
			isDerived = false;
			xmlTag = "TtlAmtOfTaxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountOfTaxes";
			definition = "Total value of the taxes for a specific order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAnd13DecimalAmount> getValue(TotalTaxes4 obj) {
			return obj.getTotalAmountOfTaxes();
		}

		@Override
		public void setValue(TotalTaxes4 obj, Optional<ActiveCurrencyAnd13DecimalAmount> value) {
			obj.setTotalAmountOfTaxes(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxblIncmPerDvdd")
	protected ActiveCurrencyAndAmount taxableIncomePerDividend;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerDividend
	 * SecuritiesTax.mmTaxableIncomePerDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes4 TotalTaxes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxblIncmPerDvdd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount included in the dividend that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalTaxes4, Optional<ActiveCurrencyAndAmount>> mmTaxableIncomePerDividend = new MMMessageAttribute<TotalTaxes4, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerDividend;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalTaxes4.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerDvdd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerDividend";
			definition = "Amount included in the dividend that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(TotalTaxes4 obj) {
			return obj.getTaxableIncomePerDividend();
		}

		@Override
		public void setValue(TotalTaxes4 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTaxableIncomePerDividend(value.orElse(null));
		}
	};
	@XmlElement(name = "PctgOfDebtClm")
	protected PercentageRate percentageOfDebtClaim;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmPercentageOfDebtClaim
	 * InvestmentFundTax.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes4 TotalTaxes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PctgOfDebtClm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfDebtClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the underlying assets of the funds that represents a debt and is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalTaxes4, Optional<PercentageRate>> mmPercentageOfDebtClaim = new MMMessageAttribute<TotalTaxes4, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTax.mmPercentageOfDebtClaim;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalTaxes4.mmObject();
			isDerived = false;
			xmlTag = "PctgOfDebtClm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageOfDebtClaim";
			definition = "Percentage of the underlying assets of the funds that represents a debt and is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(TotalTaxes4 obj) {
			return obj.getPercentageOfDebtClaim();
		}

		@Override
		public void setValue(TotalTaxes4 obj, Optional<PercentageRate> value) {
			obj.setPercentageOfDebtClaim(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxDtls")
	protected List<Tax18> taxDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Tax18 Tax18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes4 TotalTaxes4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to a specific tax."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TotalTaxes4, List<Tax18>> mmTaxDetails = new MMMessageAssociationEnd<TotalTaxes4, List<Tax18>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalTaxes4.mmObject();
			isDerived = false;
			xmlTag = "TaxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDetails";
			definition = "Information related to a specific tax.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Tax18.mmObject();
		}

		@Override
		public List<Tax18> getValue(TotalTaxes4 obj) {
			return obj.getTaxDetails();
		}

		@Override
		public void setValue(TotalTaxes4 obj, List<Tax18> value) {
			obj.setTaxDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalTaxes4.mmTotalAmountOfTaxes, com.tools20022.repository.msg.TotalTaxes4.mmTaxableIncomePerDividend,
						com.tools20022.repository.msg.TotalTaxes4.mmPercentageOfDebtClaim, com.tools20022.repository.msg.TotalTaxes4.mmTaxDetails);
				trace_lazy = () -> InvestmentFundTax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TotalTaxes4";
				definition = "Information regarding the total amount of taxes.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveCurrencyAnd13DecimalAmount> getTotalAmountOfTaxes() {
		return totalAmountOfTaxes == null ? Optional.empty() : Optional.of(totalAmountOfTaxes);
	}

	public TotalTaxes4 setTotalAmountOfTaxes(ActiveCurrencyAnd13DecimalAmount totalAmountOfTaxes) {
		this.totalAmountOfTaxes = totalAmountOfTaxes;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTaxableIncomePerDividend() {
		return taxableIncomePerDividend == null ? Optional.empty() : Optional.of(taxableIncomePerDividend);
	}

	public TotalTaxes4 setTaxableIncomePerDividend(ActiveCurrencyAndAmount taxableIncomePerDividend) {
		this.taxableIncomePerDividend = taxableIncomePerDividend;
		return this;
	}

	public Optional<PercentageRate> getPercentageOfDebtClaim() {
		return percentageOfDebtClaim == null ? Optional.empty() : Optional.of(percentageOfDebtClaim);
	}

	public TotalTaxes4 setPercentageOfDebtClaim(PercentageRate percentageOfDebtClaim) {
		this.percentageOfDebtClaim = percentageOfDebtClaim;
		return this;
	}

	public List<Tax18> getTaxDetails() {
		return taxDetails == null ? taxDetails = new ArrayList<>() : taxDetails;
	}

	public TotalTaxes4 setTaxDetails(List<Tax18> taxDetails) {
		this.taxDetails = Objects.requireNonNull(taxDetails);
		return this;
	}
}